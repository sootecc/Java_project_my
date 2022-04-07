package chap18.Ex05;

//�޼ҵ� ���� (���� �޼ҵ� ǥ��)
	//�޼ҵ� ����: ���� �������� �ʰ�, �����Ǿ� �ִ� �޼ҵ带 �����ؼ� ���
	//���� �޼ҵ� ����
@FunctionalInterface

interface A{
	void abc();
}

class B{
	static void bcd() {					//static method: Ŭ���� �̸����� ȣ�� ����
		System.out.printf("%s%s","�޼ҵ�",System.lineSeparator());
	}
}


public class RefOfInstanceMethod_Type_2 {

	public static void main(String[] args) {

		// ���� �޼ҵ� ����
		A a = new A() {
			
			@Override
			public void abc() {
				B.bcd();		//static�� ����� ���� �޼ҵ� ȣ��, ��ü ���� ���� Ŭ���������� ȣ��
			}
		};
		// ���ٽ� ǥ��
		A a2 = ()-> B.bcd();
		
		// ���� �޼ҵ� ����
		A a3 = B::bcd;
		
		
		a.abc();
		a2.abc();
		a3.abc();
	}

}
