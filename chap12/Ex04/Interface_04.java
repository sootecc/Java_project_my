package chap12.Ex04;

//�������̽� ��ӽ� �ڽ� Ŭ���� ���� ������ ���� <<�߿�>>
//�������̽��� �޼ҵ带 ������ �� �ݵ�� public�� �־���� �Ѵ�.
//�ڽ��� �θ𺸴� ������������ ������ ���ų� �� �о�� �Ѵ�.
interface A{
	public abstract void abc();
}

class F implements A{				//FŬ������ �ϼ��� �޼ҵ尡 �����Ǿ� �־�� �Ѵ�.

	@Override
	public void abc() {
		
	}
	
	
}

interface B{
	void abc();		//public abstract�� ���� �Ǿ��ִ�.
}

class C implements A{
	public void abc() {	//A �������̽��� abc()�� �������̵��Ͽ� ������ �޼ҵ�
					//�ڽ��� �θ𺸴� ������������ ������ ���ų� �� �о�� �Ѵ�.
	}
}

class D implements B{
	public void abc() {	//�������̽��� �޼ҵ带 ������ ���� �ݵ�� public ���� �����ڸ� ����ؾ� �Ѵ�.
		
	}
}

class E implements B{

	@Override
	public void abc() {
		
	}
	
}

public class Interface_04 {

	public static void main(String[] args) {
		
		
		
	}

}
