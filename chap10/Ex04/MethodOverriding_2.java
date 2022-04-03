package chap10.Ex04;

class Animal2 {
	void run() {
		
	}
}

class Tiger extends Animal2{	//ȣ���̴� �� �߷� �޸��ϴ�.
	@Override
	void run() {
		System.out.println("ȣ���̴� �� �߷� �޸��ϴ�.");
	}
	void tigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Eagle extends Animal2{	//�������� �ϴ��� ���ϴ�.
	@Override
	void run() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	void eagleEat() {
		System.out.println("�������� ������ �Խ��ϴ�.");
	}
}
class Snake extends Animal2{	//���� ���ٴմϴ�.
	@Override
	void run() {
		System.out.println("���� ���ٴմϴ�.");
		}
	void snakeEat() {
		System.out.println("���� ������ �Խ��ϴ�.");
	}
	
}


public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		//1. ��� ��ü�� Animal2 Ÿ������ ��ĳ�����ؼ� ����.
		
		
		Animal2 tiger = new Tiger();
		Animal2 eagle = new Eagle();
		Animal2 snake = new Snake();
		
		
		//2. Animal2 �迭�� �� ��ü�� ����
		
		Animal2[] animals = {tiger, eagle, snake};
		
		
		//3. for������ �迭�� ��ü�� ���. run
		System.out.println("for��=======================");
		for(int i=0; i<animals.length;i++) {
			animals[i].run();
		}
		
		//4. Enhanced for���� ����ؼ� ��ü�� run() �޼ҵ� ���
		System.out.println("Enhanced for��===============");
		for(Animal2 k: animals) {
			k.run();
		
		}
		
		
		//5. �ٿ�ĳ���� (
		System.out.println("�ٿ�ĳ����===================");
		
			if(animals[0] instanceof Tiger) {
				Tiger tiger_down = (Tiger) tiger;
				tiger_down.tigerEat();
			}
			else {
				System.out.println("Tiger �ٿ�ĳ���� ����");
			}
			if(animals[1] instanceof Eagle) {
				Eagle eagle_down = (Eagle) eagle;
				eagle_down.eagleEat();
			}
			else {
				System.out.println("Eagle �ٿ�ĳ���� ����");
			}
			if(animals[2] instanceof Snake) {
				Snake snake_down = (Snake) snake;
				snake_down.snakeEat();
			}
			else {
				System.out.println("Snake �ٿ�ĳ���� ����");
			}
		}
	

}
