package chap14.Ex01;

import java.util.Scanner;

//Error: ���α׷��Ӱ� ������ �� ���� �κ�, OS���� �߻��ϴ� Error, H/W ����
//Exception(����): ���α׷��Ӱ� ������ �� �ִ� �κ�,
	//���ܰ� �߻�  �Ǹ� ���α׷��� ����Ǿ� ������.
	//���ܰ��߻� �Ǵ��� ���α׷��� ������� �ʰ� ó��(����ó��)

//ArithmeticException: � ���� 0���� ������ �߻��ϴ� ����
	//��ǻ�ʹ� � ���� 0���� ���� ��� ��� �Ұ�.


public class CheckedException_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �ϳ��� �Է��ϼ���>>> ");
		int a = sc.nextInt();
		int b = 10;
		
		try {		//try block���� ����(Exception)�� �߻����� ��� 
			System.out.println(b/a);
		}//try block
		catch(ArithmeticException e) {	//catch block�� �۵��ȴ�.
			System.out.println("������ �߻��߽��ϴ�. 0���� ���� �� �����ϴ�. �ٸ� ���� �־��ּ���.");
		}//catch block
		finally {
			
		}
		
		System.out.println("���α׷��� �����մϴ�. ");
		
	}
}
