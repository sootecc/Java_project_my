package chap16.Ex08;

class A{}
class B extends A{}
class C extends B{}

//���׸� Ÿ���� Ŭ����: ���׸� Ÿ�Կ� ������ ��ü ������ ��
class D <T extends B>{		//T : class B, class C�� �� �� �ִ�.
							//<T extends B> �ǹ�: T Ÿ�� ������ ����
							
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
//		D<A> d1 = new D<A>();		//A�� B�� ����Ŭ������ �ƴϱ� ������ <T>�� �� �� ����.
		D<B> d2 = new D<B>();		//B, C�� Ÿ������ ���� ����
		D<C> d3 = new D<C>();		//C Ÿ������ ���� ����
		
		D d4 = new D();		// => D(B) D(C) Ÿ���� �������� �ʰ� ��ü�� ����� �ֻ��� Ÿ������ �����ȴ�.
							// => D<B> d4 = new D<B>();	
		
		d2.setT(new B());	//B ��ü ����
		d2.setT(new C());	//C ��ü ����
//		d2.setT(new A());	A�� ���� �Ұ�. ����
		
		
		//d3�� CŸ�Ը� ���� �� �ִ�.
//		d3.setT(new B());	//B ���� �Ұ�. ����
		d3.setT(new C());	//C ��ü ����
//		d3.setT(new A());	//A ���� �Ұ�. ����
	
//		d4.setT(new A());	//���� �߻�
		d4.setT(new B());
		d4.setT(new C());
	
	}

}
