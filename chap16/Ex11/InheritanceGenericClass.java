package chap16.Ex11;

//���׸� Ŭ������ ���: �ڽ� Ŭ������ �θ� Ŭ������ ���׸� ����(K, V, T, E)�� ��� �����ϰ� �־�� �Ѵ�. �� ������ ������

class Parent<T>{
	
	T t;	//default

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Child1<T> extends Parent<T>{	//<���׸�>�θ� Ŭ������ �ʵ�� �޼ҵ尡 ��ӵȴ�.	
	
}
class Child2<T, V> extends Parent<T>{	//�ڽ� Ŭ������ ���׸� ������ �θ� Ŭ������ ���׸� ���� �������� ���Ƶ� �ȴ�.
	
		V v ;

		public V getV() {
			return v;
		}

		public void setV(V v) {
			this.v = v;
		}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		//1. �θ� ���׸� Ŭ���� ����
		
		Parent<String> p = new Parent<String>();   //��ü �ϼ��� ����
		//Parent<String> p = new Parent();	���� ������ ȣ���� ���� ���� ����
		//Parent<String> p = new Parent<>();
		//�׷����� �������� ����
		//�̷��� ���ȴٴ� ���� �˾Ƶ���
		//��� ���̸� ������ ����
	
		p.setT("�θ� ���׸� Ŭ����");
		System.out.println(p.getT());
		
		Parent<Integer> i1 = new Parent<Integer>();
		i1.setT(1);
		System.out.println(i1.getT());				
		
		
		
		//2. �ڽ� ���׸� Ŭ����1 ����
		Child1<String> c1 = new Child1<String>();
		c1.setT("�ڽ�1 ���׸� Ŭ����");		//�θ𿡼� ��ӵ� �޼ҵ�
		System.out.println(c1.getT());	//�θ𿡼� ��ӵ� �޼ҵ�
		
		//3. �ڽ� ���׸� Ŭ����2 ����
		Child2<String, Integer> c2 = new Child2<String, Integer>();
		c2.setT("�ڽ�2 ���׸� Ŭ����");		//�θ𿡼� ��ӵ� �޼ҵ�
		c2.setV(100);					//�ڽ� Ŭ������ �޼ҵ�
		System.out.println(c2.getT());	//�θ𿡼� ��ӵ� �޼ҵ�
		System.out.println(c2.getV());	//�ڽ� Ŭ������ �޼ҵ�
		
		
		
	}
	
}
