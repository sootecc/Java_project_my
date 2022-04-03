package chap16.Ex02;


//Object�� ��� ��ü�� ������ �� �ִ�.
//��ǰ�� �����ϴ� Ŭ������ Object Ÿ������ �����ϸ� ��� ��ü�� ���� �� �ִ�.
//Object�� ����: ��� ��ü�� ���� �� �ִ�.

		//����: �Ź� �ٿ� ĳ������ �ؼ� ����ؾ� �Ѵ�.
		// ���� Ÿ�� üũ: ����� Class CastException

class Apple{			//��� Ŭ����
	String name;
	int price;
	
	Apple (String name, int price){
		this.name  = name;
		this.price = price;
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
	@Override
	public String toString() {		//��ü ��ü�� ��½� ��ü�� �ּҰ� �ƴ϶� �ʵ��� ������ ���
		return "�̸�: "+name+" ����: "+price;
	}
}

class Goods{	//Object�� ����ؼ� ��� ��ǰ�� ������ �� �ִ�.
	
	private Object object ;		//��� Ŭ������ object Ÿ������ ��ȯ ����

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {	//Object Ÿ������ ��ĳ���õ�.
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		
		//1. Apple�� ���� �� ���. Object
		Goods g1 = new Goods();
		g1.setObject(new Apple("���3",4000));		//setter�� ���� �Ҵ�
		System.out.println((Apple)g1.getObject());			//getter�� ��ü�� ���: Object ---> Apple
	
		//2. Pencil�� ���� �� ���. Object
		Goods g2 = new Goods();
		g1.setObject(new Pencil("����3",4000));		//setter�� ���� �Ҵ�
		System.out.println((Pencil)g2.getObject());			//getter�� ��ü�� ���: Object ---> Apple
	
		
		//3. �߸��� ĳ������ �� �� �ִ�(���� Ÿ�� üũ): Object�� ������.
		Goods goods3 = new Goods();
		goods3.setObject(new Apple("���4",5000));
		//System.out.println((Pencil)goods3.getObject());
		//����� ���� �߻�
		
	}

}
