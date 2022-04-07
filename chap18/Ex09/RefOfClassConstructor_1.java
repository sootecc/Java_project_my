package chap18.Ex09;

@FunctionalInterface
interface A{
	B abc();		//����Ÿ���� B ��ü
}

class B {
	B(){
		System.out.printf("%s%s","ù ��° ������",System.lineSeparator());
	}
	B(int k){
		System.out.printf("%s%s","�� ��° ������",System.lineSeparator());
	}
}



public class RefOfClassConstructor_1 {

	public static void main(String[] args) {

		//Ŭ���� ������ ����
		A a1 = new A() {
			@Override
			public B abc() {		//abc()�޼ҵ� ȣ�� �� B ��ü�� �⺻ ������ ȣ�� -> ������ ����
				return new B();		
			}
		};
		
		//���ٽ� ǥ��
		
		A a2 = () -> new B();
		
		
		//Ŭ���� ������ ����
		A a3 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		System.out.printf("%s%s","=======================",System.lineSeparator());
		
		
		
	}

}
