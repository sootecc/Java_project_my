package chap06_07.Ex03;

class Car{
	String company;
	String model;
	String color;
	double maxspeed;

	Car(){}
	Car(String company, String model, String color, double maxspeed){
		this.company = company;
		this.model =model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
	
	void work() {		//메소드(인스턴스 메소드) : Heap 영역의 메소드명과 포인터를 저장, static이 붙으면 static 메소드라 부름
		System.out.println("회사: "+company + "\n모델:"+model+"\n색상: "+color+"\n최대속도: "+maxspeed);
	}//메소드의 전체 구문은 클래스 영역속의 메소드 영역에 저장

  
}

public class Q1 {

	public static void main(String[] args) {
		
		//생성자를 통해서 기본 값을 할당 후 메모리의 내용을 work 메소드를 사용해서 출력
		
		Car car = new Car("Hyundai", "grandeur","black", 321.5);
		car.work();
		
		
		
	}

}
