package chap16.Ex05;

class Apple{			//��� Ŭ����
	String name;
	int price;
	
	Apple (String name, int price){
		this.name  = name;
		this.price = price;
	}
	void abc() {
		System.out.println("abc�޼ҵ�");
	}
	@Override
		public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
			return "�̸�: "+name+" ����: "+price;
		}
}


class Pencil{			//���� Ŭ����
	String name;
	int price;
	
	Pencil(String name, int price){			//�����ڸ� ���ؼ� �ʵ� �� �Ҵ�
		this.name = name;
		this.price = price;
	}
	void bcd() {
		System.out.println("bcd �޼ҵ�");
	}
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return "�̸�: "+name+" ����: "+price;
	}
}


//���׸��� ����ؼ� ��ü�� ���� �� �� �о����

//���׸� Ŭ����
class Goods<T>{
	
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	
}

public class Object_Generic {
	public static void main(String[] args) {
		
		Goods<Apple> goods1 = new Goods<Apple>();	//goods1�� Apple ������ Ÿ���̴�.
		goods1.set(new Apple("���",3000));
		System.out.println(goods1.get());			//���׸������� �ٿ�ĳ������ �� �ʿ䰡 ����.
		goods1.get().abc();		//�ٿ�ĳ���þ��� Apple ��ü�� abc �޼ҵ� ȣ��
		 
		Goods<Pencil> goods2 = new Goods();
		goods2.set(new Pencil("����",1000));
		System.out.println(goods2.get());
		goods2.get().bcd();
		
		
		
		
	}

}
