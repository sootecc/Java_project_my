package chap14.Ex01;



public class CheckException_1_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);				//���α׷��� ������ ����ȴ�.
													//���ܿ� ���� ó���� ����� �Ѵ�.
		}
		catch(ArithmeticException e){
			//try block���� ������ �߻��� ��� �۵�
			e.printStackTrace();		//������ ���� �ڼ��� ������ ���
			System.out.println("0�� ���� �� �����ϴ�.");
			
			
			//catch block�� ������ ���� �ʾƵ� ����ó���� �ȴ�.
		}
		finally {
			//try block���� ������ �ֵ�, ���� �۵��ȴ�.
			//try block�� �۵��Ǹ� �׻� �۵�
			//��ü�� ��� �� �޸𸮸� ������ �� ���ȴ�.
			//ex) sc.close();
			System.out.println("finally block�� �׻� ȣ��˴ϴ�.");
		}
		
		
		
		System.out.println("���α׷��� ���� �����մϴ�.");		//���� ����
		
		
	}
}
