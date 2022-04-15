package fruit_ex;

import java.util.ArrayList;
import java.util.Scanner;

/*	상속을 다루는 문제
	
 
 
 */
class Fruit{
	
	String fruitName;		//과일 이름
	String color;			//과일 색깔
	int size;				//과일 크기
	
	Fruit(String fruitName, String color, int size){
		this.fruitName = fruitName;
		this.color = color;
		this.size = size;
	}
	
	public String showInfo() {		//과일의 정보를 출력하는 메소드
		return "과일의 이름: <"+fruitName+">이고, 색깔은 <"+color+">이고, 크기는 <"+size+"> 입니다.";
	}
	//과일의 이름: <사과>이고, 색깔은 <빨간색> 이고, 크기는 <10> 입니다.
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
		System.out.println("과일 이름:");
		String fruitName = sc.next();
		System.out.println("과일 색깔:");
		String color = sc.next();
		System.out.println("과일 크기:");
		int size = sc.nextInt();
		Fruit apple = new Apple(fruitName, color, size);
		
		fruitList.add(apple);
		System.out.println("정상적으로 정보가 들어갔습니다.");
	}
	public static void addOrange() {
		System.out.println("과일 이름:");
		String fruitName = sc.next();
		System.out.println("과일 색깔:");
		String color = sc.next();
		System.out.println("과일 크기:");
		int size = sc.nextInt();
		Fruit orange = new Orange(fruitName, color, size);
		
		fruitList.add(orange);
		System.out.println("정상적으로 정보가 들어갔습니다.");
	}
	public static void addBanana() {
		System.out.println("과일 이름:");
		String fruitName = sc.next();
		System.out.println("과일 색깔:");
		String color = sc.next();
		System.out.println("과일 크기:");
		int size = sc.nextInt();
		Fruit apple = new Apple(fruitName, color, size);
		
		fruitList.add(apple);
		System.out.println("정상적으로 정보가 들어갔습니다.");
	}
	
	public static void fruitLists() {
		String a;
		for(Fruit k : fruitList) {
			a = k.showInfo();
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("과일 정보 프로그램");
		
			
		
		
		/*
		 * 선택>>1
		 * 과일명:
		 * 색깔:
		 * 크기:
		 * 
		 */
		//스캐너로 인풋 받은 값으로 각각의 객체를 생성해서 ArrayList에 저장
		//4번 선택: 객체를 가져와서 객체를 출력했을 때 ArrayList의 모든 객체를 가져와서 정보 출력
		
		//출력 결과:
		//과일의 이름: <사과>이고, 색깔은 <빨간색> 이고, 크기는 <10> 입니다.
		//enhanced for문을 사용해서 출력
		
		while(true) {
			System.out.println("===========================================================");
			System.out.println("1. 사과	| 2. 오렌지 	| 3. 바나나	| 4. 정보 출력	 | 5. 프로그램 종료");
			System.out.println("===========================================================");
			System.out.println("선택>> ");
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
		System.out.println("프로그램 종료");
	
	}
	
	
	

}
