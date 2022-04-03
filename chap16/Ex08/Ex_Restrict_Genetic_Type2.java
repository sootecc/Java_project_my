package chap16.Ex08;

//제네릭 클래스를 생성해서 , 타입 제한(Apple, Strawberry, Banana), Pencil은 타입으로 접근 못하도록
abstract class Fruit{
	public abstract void printing();	//추상 메소드
} 

class Apple extends Fruit{
	String name;
	int price;
	
	//생성자로 받기
	Apple(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+", 가격은 "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"은(는) Fruit의 하위 클래스입니다.");
	}
}

class Strawberry extends Fruit{
	String name;
	int price;
	
	//생성자로 받기
	Strawberry(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+", 가격은 "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"은(는) Fruit의 하위 클래스입니다.");
	}
	
}
class Banana extends Fruit{
	String name;
	int price;
	
	//생성자로 받기
	Banana(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+", 가격은 "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"은(는) Fruit의 하위 클래스입니다.");
	}
}


class Pencil{
	String name;
	int price;
	
	//생성자로 받기
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+", 가격은 "+price;
	}
}
									//DTO, VO 
class PrintFruit <T extends Fruit> { //DTO(Data Transfer Object)- getter, setter
									//VO(Value Object) - getter
									//데이터를 받아서 전송하는 중간자 역할을 함
									//계층간에 값을 받아서 전송, 중간자 역할
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class Ex_Restrict_Genetic_Type2 {
	public static void main(String[] args) {
		
		PrintFruit<Apple> f1 = new PrintFruit<Apple>();
		PrintFruit<Strawberry> f2 = new PrintFruit<Strawberry>();
		PrintFruit<Banana> f3 = new PrintFruit<Banana>();
		//PrintFruit<Pencil> f4 = new PrintFruit();
		
		f1.setT(new Apple("사과", 1000));
		f2.setT(new Strawberry("딸기", 2000));
		f3.setT(new Banana("바나나", 3000));
		
		Apple apple = f1.getT();
		Strawberry strawberry = f2.getT();
		Banana banana = f3.getT();
		
		System.out.println(apple);
		System.out.println(strawberry);
		System.out.println(banana);
		
		apple.printing();
		strawberry.printing();
		banana.printing();
		
		
	}
}
