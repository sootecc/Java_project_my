package chap06_07.Ex05;

public class C {		//�ٸ� ��Ű������ import ����
		
	//�ʵ忡 �ο� �Ǵ� ���� ������
	private String company = "�����ڵ���";	//ȸ���
	String model;						//��, default 
	protected String color;				//��
	public int maxspeed; 				//�ִ� �ӵ�
	
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
