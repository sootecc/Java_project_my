package chap06_07.EX02;


public class Example_Car {


	
	public static void main(String[] args) {
		//Car Class�� ��üȭ�ؼ� 5���� ��ü�� �����ϰ� ���� �Ҵ��Ͽ� ���

		Car Car = new Car();
		
		
		//������ ���� ���� �Ҵ� ���������� ��������� �ƴ�. ������ �ʴ� ���� ���� �� ����
		//private �������� ĸ��ȭ, ���� ������ ���� �Ҵ����� ���ϵ��� �Ѵ�.
		//setter�� �̿��Ͽ� ���� �ο�: ������ �ԷµǴ� ���� ������ �� �ִ�.
		
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
