package chap06_07.EX02;

public class Car {

		String company;
		String model;
		String color;
		int maxspeed;
		
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {		//RAM�� ���� �ο��� �� setter
			this.company = company;						//this: �ڽ��� ��ü
		}									//�޼ҵ忡 ��ǲ�Ǵ� ������, ��ǲ�� ������ �޴� ������, �޸𸮿� �ε��� ������(this.)
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
		public int getMaxspeed() {
			return maxspeed;
		}
		public void setMaxspeed(int maxspeed) {
			this.maxspeed = maxspeed;
		}
		
		
		
		
	

}
