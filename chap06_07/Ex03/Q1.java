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
	
	void work() {		//�޼ҵ�(�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����, static�� ������ static �޼ҵ�� �θ�
		System.out.println("ȸ��: "+company + "\n��:"+model+"\n����: "+color+"\n�ִ�ӵ�: "+maxspeed);
	}//�޼ҵ��� ��ü ������ Ŭ���� �������� �޼ҵ� ������ ����

  
}

public class Q1 {

	public static void main(String[] args) {
		
		//�����ڸ� ���ؼ� �⺻ ���� �Ҵ� �� �޸��� ������ work �޼ҵ带 ����ؼ� ���
		
		Car car = new Car("Hyundai", "grandeur","black", 321.5);
		car.work();
		
		
		
	}

}
