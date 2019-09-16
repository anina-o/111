package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ssm.entity.Department;
import ssm.entity.Employee;
import ssm.entity.ResultMsg;
import ssm.service.DepartmentService;
import ssm.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private DepartmentService deptService;
	
	@RequestMapping("/add")
	public ModelAndView add(){
		List<Department> depts=deptService.getDepts();
		ModelAndView mv=new ModelAndView("employee/add");
		mv.addObject("depts", depts);
		return mv;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
		List<Employee> employees=employeeService.getEmployees();
		ModelAndView mv=new ModelAndView("employee/list");
		mv.addObject("employees", employees);
		return mv;
	}
	
	
	@RequestMapping("/add_submit")
	@ResponseBody
	public ResultMsg add_submit(String username,Integer sex,Integer age,Integer deptid ){
		//������Ա
		Employee employee=new Employee();
		employee.setAge(age);
		employee.setDeptid(deptid);
		employee.setSex(sex);
		employee.setUsername(username);
		int i=employeeService.addEmployee(employee);
		if(i>0){
			return new ResultMsg(1,"�����ɹ�");
		}else if(i==-2){
			return new ResultMsg(2,"���û����Ѿ�����");
		}
		return new ResultMsg(0,"����ʧ��");
	}
}
