package Controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class uploadController {
	@RequestMapping("/upload")
	public ModelAndView upload() {
		ModelAndView mv=new ModelAndView("upload");
		return mv;
	}
	@RequestMapping("/upload_s")
	public ModelAndView upload_s(MultipartFile file,HttpServletRequest request) throws IllegalStateException, IOException {//和name相同
		//上传文件到服务器
			//获取保存文件的物理地址（项目服务器的物理地址/upload/图片文件名）
			String realPath=request.getServletContext().getRealPath("/");//项目服务器物理地址
			String filename=file.getOriginalFilename();//获取文件名
			String path=realPath+"/upload"+filename;
			System.out.println(realPath);
			File file1=new File(path);
			//传输文件内容
			file.transferTo(file1);

		//跳转页面
		ModelAndView mv=new ModelAndView("upload_ss");
		mv.addObject("filename", filename);
		return mv;
	}
	@RequestMapping("/download")
	public ResponseEntity<byte[]> download(String filename,HttpServletRequest request) throws IOException{
		//响应内容，将文件转化为字节数组
		//获取项目上下文
		ServletContext servletContext=request.getServletContext();
	InputStream inputStream=servletContext.getResourceAsStream("/upload/+filename");//文件地址
	byte[] body=new byte[inputStream.available()];
	inputStream.read(body);
	
	//设置响应头
	HttpHeaders headers=new HttpHeaders();
	headers.add("Content-Disposition", "attachment;filename=" + URLEncoder.encode(filename,"utf-8"));

	
	//设置响应码200
	HttpStatus statusCode=HttpStatus.OK;
	ResponseEntity<byte[]> response=new ResponseEntity<byte[]>(body, headers, statusCode);
	return response;
	
	}

}
