package chap16.Ex07;

//���׸� �޼ҵ� ���ο��� ��� ������ �޼ҵ�: Object Ŭ������ �޼ҵ常 ��� �����ϴ�.

class A{
	public <T> void method(T t) {
		//System.out.println(t.length());			//t.length(): String Ŭ�������� ���� ���� ��������, ��� �Ұ�
		System.out.println(t.equals("�ȳ�"));		//t.equals: Object Ŭ������ �޼ҵ�� ��� ����
	}
	public <T extends Object> void method2 (T t){	//extends Object�� �����Ǿ� �ִ�. <T> == <T extends Object>
		System.out.println(t.equals("�ݰ����ϴ�."));	//Object Ŭ������ �޼ҵ�� ��� ����
	}
	
	public <T extends String> void method3(T t){	//String�� ��� ���� T�̱� ������ String Ŭ������ �޼ҵ� ��� ����
		System.out.println(t.length());
		
	} 
}


public class AvailableMethodinGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("�ȳ�");
		
		
		
		 
	}

}
