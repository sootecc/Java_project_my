package chap14.Ex03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		//1. catch block�� ������ �߸��� ���
			//��� ���ܴ� Exception�� ��� �޴´�.
		
		try{
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e) {
			//try{} block���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ó��
			System.out.println("���� ó�� (Exception)");
		}
		
		//2. catch block�� ������ �߸��� ���
/*
		try{
			System.out.println(10/0);
			int num1 = Integer.parseInt("10A");
		}
		catch(Exception e) {
			//try{} block���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ó��
			System.out.println("���� ó�� (Exception)");
		}
		catch(ArithmeticException e) {
			//try{} block���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ó��
			System.out.println("���� ó�� (ArithmeticException)");
		}
		catch(NumberFormatException e) {
			//try{} block���� �߻��ϴ� ��� ���ܴ� Exception Ŭ������ ó��
			System.out.println("���� ó�� (NumberFormatException)");
		}
	*/
		
		//3. catch block�� �ùٸ� ����: �ֻ��� Exception�� catch block�� �������� ��ġ�ؾ��Ѵ�.
		try{
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("���� ó�� (ArithmeticException)");
		}
		catch(NumberFormatException e) {
			System.out.println("���� ó�� (NumberFormatException)");
		}
		catch(Exception e) {		//�ֻ��� �θ��� Exception�� �������� ��ġ
			System.out.println("���� ó�� (Exception)");
		}
		
		
		
		//4. �������� exception�� �����ؼ� ����
		try{
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("���� ó�� ");
		}
		catch(Exception e) {
			
		}
		System.out.println("���α׷� ����");
	}

}
