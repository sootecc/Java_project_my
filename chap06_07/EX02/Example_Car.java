package chap06_07.EX02;


public class Example_Car {


	
	public static void main(String[] args) {
		//Car Class를 객체화해서 5개의 객체를 생성하고 값을 할당하여 출력

		Car Car = new Car();
		
		
		//변수의 값을 직접 할당 가능하지만 권장사항은 아님. 원하지 않는 값이 들어올 수 있음
		//private 변수며이 캡슐화, 직접 변수의 값을 할당하지 못하도록 한다.
		//setter을 이용하여 값을 부여: 변수에 입력되는 값을 제어할 수 있다.
		
		Car_detail(Car,"blue","Hyundai",300,"grandeur");
		
			
		
	}
	
	
	
	static void Car_detail(Car car,String color,String company, int maxspeed, String model){
		
		
		
			car.setColor(color);
			car.setCompany(company);
			car.setMaxspeed(maxspeed);
			car.setModel(model);
			
			
			System.out.println(car.getColor());
			System.out.println(car.getCompany());
			System.out.println(car.getMaxspeed());
			System.out.println(car.getModel());
			
			
			System.out.println("===========");
		
		
		
		
		
	}
	
	
	

}
