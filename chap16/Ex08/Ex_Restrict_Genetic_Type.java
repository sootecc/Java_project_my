package chap16.Ex08;

//���׸� Ŭ������ �����ؼ� , Ÿ�� ����(Apple, Strawberry, Banana), Pencil�� Ÿ������ ���� ���ϵ���
abstract class Fruit1{
	public abstract void printing();	//�߻� �޼ҵ�
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
	
	//�����ڷ� �ޱ�
	Apple1(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+", ������ "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"��(��) Fruit�� ���� Ŭ�����Դϴ�.");
	}
}

class Strawberry1 extends Fruit1{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Strawberry1(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+", ������ "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"��(��) Fruit�� ���� Ŭ�����Դϴ�.");
	}
	
}
class Banana1 extends Fruit1{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Banana1(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+", ������ "+price;
	}
	@Override
	public void printing() {
		System.out.println(name+"��(��) Fruit�� ���� Ŭ�����Դϴ�.");
	}
}


class Pencil1{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Pencil1(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+", ������ "+price;
	}
}


public class Ex_Restrict_Genetic_Type {
	public static void main(String[] args) {
	
		PrintFruit1 <Apple1> f1 = new PrintFruit1<Apple1>();
		f1.set(new Apple1("���1", 2000));
		Apple1 apple = f1.get();
		
		System.out.println(apple);
		apple.printing();
		
	}
}
