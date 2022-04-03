package chap16.Ex07;

//���׸� Ŭ����: Ŭ������ ������ �� Ÿ�Ժ����� ���� <T> <<����>> ,  ��ü�� ������ T�� ������ Ÿ���� ����
//���׸� �޼ҵ�: �Ϲ� Ŭ���� ������ �޼ҵ� ����� ���׸� ���� ������ ���

class Genericmethod2{		//�Ϲ� Ŭ����
	
	public <T> T method1 (T t) {				//���׸� �޼ҵ�: 1��
		return t;
	}
	public <T> boolean method2 (T t1, T t2) {	//���׸� �޼ҵ�: 1��
		return t1.equals(t2);					//�� ���� ���ؼ� true, false ����
												//�⺻ �ڷ����϶��� ���� ���ϰ� �����ڷ����� ���� �ּҸ� ���Ѵ�.
												//String�� equals�� ������ �Ǿ��־ ���� ���Ѵ�.
		
	}
	
	public <K, V> void method3(K k, V v) {		//���׸� �޼ҵ�: 2��
		System.out.println(k+ " : "+v);
	}
	
	public <K, V> void method4() {
		System.out.println("dd");
	}
}



public class GenericMethod {

	public static void main(String[] args) {
		
		//1. �Ϲ� Ŭ���� ��ü ���� �� ���׸� �޼ҵ� ȣ��
		Genericmethod2 gm = new Genericmethod2();
		String str1 = gm.<String>method1("�ȳ�");
		String str2 = gm.method1("�ȳ�");		//Ÿ���� �� �� �ִ� ��� ���� ����
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("============");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		System.out.println("============");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("============");
		
		Boolean d1 = gm.<Double>method2(2.55,255.0);		//���� ���� Ÿ���� Boolean
		Boolean d2 = gm.<Double>method2(250.5,255.0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("============");
		
		
		gm.<String, Integer>method3("����", 90);
		gm.method3("����", 80);					//�Ű������� ��ǲ �Ǵ� ������ Ÿ���� ������ �� �ִ� ��� ���� ����
		gm.<Integer, String>method3(500,"���� �����Դϴ�.");
		gm.method3(402,"������ ã�� �� �����ϴ�.");
		System.out.println("============");
		
		gm.method4();
	}

}
