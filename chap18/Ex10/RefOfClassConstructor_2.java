package chap18.Ex10;

@FunctionalInterface
interface A{
	B abc(int k);	//����Ÿ���� B ��ü�� ����
}

class B {
	B(){
		System.out.printf("%s%s","ù ��° ������",System.lineSeparator());
	}
	B(int k){
		System.out.printf("%s%s","�� ��° ������",System.lineSeparator());
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		//�͸� �̳�Ŭ����
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
		}};
		
		//���ٽ� ǥ��
		A a2 = (k) -> new B(k);
		
		//Ŭ���� ������ ����
		A a3 = B::new;			//int k�� ���ֳ�		//B�� �� ��° ������ ȣ��
		
		
		a1.abc(0);
		a2.abc(0);
		a3.abc(0);
		
	}

}
