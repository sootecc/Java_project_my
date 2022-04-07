package chap18.Ex07;

@FunctionalInterface
interface A{
	int abc(String str);
}



public class RefOfInstanceMethod_Type_2_2 {

	public static void main(String[] args) {

		//�ν��Ͻ� �޼ҵ� ���� Type2 : ���� �޼ҵ� ����
		//1. �͸��̳�Ŭ����
		A a1 = new A() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		

		//2. ���� ǥ����
		A a2 = (str) -> str.length();
		
		//3. �ν��Ͻ� �޼ҵ� ���� Type2
		A a3 = String::length;		//String::length	��ü��::�޼ҵ� 
		
		
		System.out.printf("%d%s",a1.abc("�ȳ�"),System.lineSeparator());
		System.out.printf("%d%s",a2.abc("�ȳ��ϼ���"),System.lineSeparator());
		System.out.printf("%d%s",a3.abc("�ȳ��ϼ��� �ݰ����ϴ�"),System.lineSeparator());
		
		
		
	}

}
