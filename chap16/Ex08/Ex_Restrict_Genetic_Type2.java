package chap16.Ex08;

//���׸� Ŭ������ �����ؼ� , Ÿ�� ����(Apple, Strawberry, Banana), Pencil�� Ÿ������ ���� ���ϵ���
abstract class Fruit{
	public abstract void printing();	//�߻� �޼ҵ�
} 

class Apple extends Fruit{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Apple(String name, int price){
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

class Strawberry extends Fruit{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Strawberry(String name, int price){
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
class Banana extends Fruit{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Banana(String name, int price){
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


class Pencil{
	String name;
	int price;
	
	//�����ڷ� �ޱ�
	Pencil(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "�̸��� "+name+", ������ "+price;
	}
}
									//DTO, VO 
class PrintFruit <T extends Fruit> { //DTO(Data Transfer Object)- getter, setter
									//VO(Value Object) - getter
									//�����͸� �޾Ƽ� �����ϴ� �߰��� ������ ��
									//�������� ���� �޾Ƽ� ����, �߰��� ����
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
		
		f1.setT(new Apple("���", 1000));
		f2.setT(new Strawberry("����", 2000));
		f3.setT(new Banana("�ٳ���", 3000));
		
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
