package chap03;

public class OperatorEx02 {
	public static void main(String[] args) {
		//#ũ�� �� ( <, >, <=, >=) �񱳰� ����� True , False
		System.out.println( 5 < 2 );
		System.out.println(-5 < 5);
		System.out.println(5 <= 5);
		
		//� ��( ==(����) , !=(���� �ʴ�) )
		
		int a = 5;
		int b = 2;
		int c = 5;
		
		System.out.println(a == b);		//false
		System.out.println(a != b);		//true
		System.out.println(a == c);		//true
		System.out.println(a != c);		//false
		
		//���� �ڷ��� � �� (��ü �޸��� �ּҸ� ��)
		String str1 = new String("�ȳ�");
		String str2 = new String("�ȳ�");
		
		System.out.println(str1 == str2);		//��ü�� �޸� �ּҸ� ��
	}
}
