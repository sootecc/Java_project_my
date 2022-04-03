package chap16.Ex01;

//Generic 사용 전 문제점
//객체를 담을 클래스를 만들 경우, 매번 객체를 생성할 때 마다 그 객체를 담을 클래스를 만들어 줘야 한다.
//새로운 상품이 추가될 때 마다 그 상품을 담을 클래스를 생성해줘야한다.
//-> 코드가 복잡해진다


class Apple{			//사과 클래스
	String name;
	int price;
	
	Apple (String name, int price){
		this.name  = name;
		this.price = price;
	}
	
	@Override
		public String toString() {		//객체 자체를 출력시 객체의 주소가 아니라 필드의 정보를 출력
			return "이름: "+name+" 가격: "+price;
		}
}
//1. Apple을 담을 수 있는 클래스 생성
class Goods1{	//상품에 사과를 담은 클래스
	private Apple apple = new Apple("사과", 1000);

	public Apple getApple() {	//getter: 객체 필드의 정보를 출력하는 것
		return apple;
	}

	public void setApple(Apple apple) {	//setter
		this.apple = apple;
	}
	
}

class Pencil{			//연필 클래스
	String name;
	int price;
	
	Pencil(String name, int price){			//생성자를 통해서 필드 값 할당
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {		//객체 자체를 출력시 객체의 주소가 아니라 필드의 정보를 출력
		return "이름: "+name+" 가격: "+price;
	}
}

//2. Pencil을 담을 수 있는 클래스 생성
class Goods2{	
	private Pencil pencil = new Pencil("사과", 1000);

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

	
	
}




public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		
		//1. Goods1 상품이 저장되어 있다. Apple 객체 추가 및 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple("사과2", 2000));
		System.out.println(goods1.getApple());
		
		//2. Goods2 상품이 저장되어 있다. Pencil 객체 추가 및 가져오기
			Goods2 goods2 = new Goods2();
			goods2.setPencil(new Pencil("연필2", 2000));
			System.out.println(goods2.getPencil());
			
	}

}
