package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*	����� �ٷ�� ����
	
 
 
 */
class Fruit{
	
	String fruitName;		//���� �̸�
	String color;			//���� ����
	int size;				//���� ũ��
	
	Fruit(String fruitName, String color, int size){
		this.fruitName = fruitName;
		this.color = color;
		this.size = size;
	}
	
	public String showInfo() {		//������ ������ ����ϴ� �޼ҵ�
		return "������ �̸�: <"+fruitName+">�̰�, ������ <"+color+">�̰�, ũ��� <"+size+"> �Դϴ�.";
	}
	//������ �̸�: <���>�̰�, ������ <������> �̰�, ũ��� <10> �Դϴ�.
}

class Apple extends Fruit{
	Apple(String fruitName, String color, int size){
		super(fruitName, color, size);
	}
	
}

class Orange extends Fruit{
	Orange(String fruitName, String color, int size){
		super(fruitName, color, size);
	}
}

class Banana extends Fruit{
	Banana(String fruitName, String color, int size){
		super(fruitName, color, size);
	}
}

public class Fruit_Test {
	
	public static ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
	public static Scanner sc = new Scanner(System.in);
	
	public static void addApple() {
		System.out.println("���� �̸�:");
		String fruitName = sc.next();
		System.out.println("���� ����:");
		String color = sc.next();
		System.out.println("���� ũ��:");
		int size = sc.nextInt();
		Fruit apple = new Apple(fruitName, color, size);
		
		fruitList.add(apple);
		System.out.println("���������� ������ �����ϴ�.");
	}
	public static void addOrange() {
		System.out.println("���� �̸�:");
		String fruitName = sc.next();
		System.out.println("���� ����:");
		String color = sc.next();
		System.out.println("���� ũ��:");
		int size = sc.nextInt();
		Fruit orange = new Orange(fruitName, color, size);
		
		fruitList.add(orange);
		System.out.println("���������� ������ �����ϴ�.");
	}
	public static void addBanana() {
		System.out.println("���� �̸�:");
		String fruitName = sc.next();
		System.out.println("���� ����:");
		String color = sc.next();
		System.out.println("���� ũ��:");
		int size = sc.nextInt();
		Fruit apple = new Apple(fruitName, color, size);
		
		fruitList.add(apple);
		System.out.println("���������� ������ �����ϴ�.");
	}
	
	public static void fruitLists() {
		String a;
		for(Fruit k : fruitList) {
			a = k.showInfo();
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("���� ���� ���α׷�");
		
			
		
		
		/*
		 * ����>>1
		 * ���ϸ�:
		 * ����:
		 * ũ��:
		 * 
		 */
		//��ĳ�ʷ� ��ǲ ���� ������ ������ ��ü�� �����ؼ� ArrayList�� ����
		//4�� ����: ��ü�� �����ͼ� ��ü�� ������� �� ArrayList�� ��� ��ü�� �����ͼ� ���� ���
		
		//��� ���:
		//������ �̸�: <���>�̰�, ������ <������> �̰�, ũ��� <10> �Դϴ�.
		//enhanced for���� ����ؼ� ���
		
		while(true) {
			System.out.println("===========================================================");
			System.out.println("1. ���	| 2. ������ 	| 3. �ٳ���	| 4. ���� ���	 | 5. ���α׷� ����");
			System.out.println("===========================================================");
			System.out.println("����>> ");
			int select = sc.nextInt();
			if(select == 1) {
				addApple();
			}else if(select == 2) {
				addOrange();
			}else if(select == 3) {
				addBanana();
			}else if(select == 4) {
				fruitLists();
			}else if(select == 5) {
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	
	}
	
	
	

}
