package chap03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ++ �� 1 ����, 
		int a = 3;
		++a;
		System.out.println(a);
		
		int b = 3;
		b++;
		System.out.println(b);
		
		System.out.println("=======================");
		
		int a1 = 3;
		int b1 = ++a1;			//++�� �տ� ���� ��. a1�� ������Ų �� b1�� ����
		System.out.println(a1);
		System.out.println(b1);
		
		System.out.println("=======================");
		
		int a2 = 3;
		int b2 = a2++;			// ++�� �ڿ� ���� ��. a2�� b2�� ���� �� a2���� 
		System.out.println(a2);
		System.out.println(b2);
			
		//a2�� ���� b2�� ���� �� a2�� �����Ǳ� ������ 
		//a2�� 4, b2�� 3�� ���´�.
	
		//���� �� �����̳�, ���� �� ������
	
		System.out.println("======================");
		
		//��� ������
		System.out.println( 2 + 3 );	
		System.out.println( 8 - 5 );
		System.out.println( 7 * 2 );
		System.out.println( 7 / 2 );	// �� ��Ÿ����.
		System.out.println( 8 % 5 );	// �������� ��Ÿ����.

		System.out.println("2" + "3");	// �� ���ڿ��� �����ϴ� ������
	
	
		/**/
		
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
		
		
		
		
		
	
	
	}

}