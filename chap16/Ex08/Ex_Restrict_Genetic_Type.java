package chap16.Ex08;

//제네릭 클래스를 생성해서 , 타입 제한(Apple, Strawberry, Banana), Pencil은 타입으로 접근 못하도록
abstract class Fruit1{
	public abstract void printing();	//추상 메소드
} 

class PrintFruit1 <T extends Fruit1>{
	private T t;
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
	
}

class Apple1 extends Fruit1{
	String name;
	int price;
	
	//생성자로 받기
	Apple1(String name, int price){
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

class Strawberry1 extends Fruit1{
	String name;
	int price;
	
	//생성자로 받기
	Strawberry1(String name, int price){
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
class Banana1 extends Fruit1{
	String name;
	int price;
	
	//생성자로 받기
	Banana1(String name, int price){
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


class Pencil1{
	String name;
	int price;
	
	//생성자로 받기
	Pencil1(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "이름은 "+name+", 가격은 "+price;
	}
}


public class Ex_Restrict_Genetic_Type {
	public static void main(String[] args) {
	
		PrintFruit1 <Apple1> f1 = new PrintFruit1<Apple1>();
		f1.set(new Apple1("사과1", 2000));
		Apple1 apple = f1.get();
		
		System.out.println(apple);
		apple.printing();
		
	}
}
