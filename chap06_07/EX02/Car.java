package chap06_07.EX02;

public class Car {

		String company;
		String model;
		String color;
		int maxspeed;
		
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {		//RAM의 값을 부여할 때 setter
			this.company = company;						//this: 자신의 객체
		}									//메소드에 인풋되는 변수명, 인풋된 변수를 받는 변수명, 메모리에 로드할 변수명(this.)
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
