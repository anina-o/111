package entity;

public class Result {
	private int flag;
	private String content;
	
	public Result(int flag,String content) {
		this.flag=flag;
		this.content=content;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

}
