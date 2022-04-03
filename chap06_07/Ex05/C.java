package chap06_07.Ex05;

public class C {		//다른 패키지에서 import 가능
		
	//필드에 부여 되는 접근 제어자
	private String company = "현대자동차";	//회사명
	String model;						//모델, default 
	protected String color;				//색
	public int maxspeed; 				//최대 속도
	
	public void print() {
		System.out.println("company: "+company+"\nmodel: "+model+"\ncolor: "+color+"\nmaxspeed: "+maxspeed);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
}
