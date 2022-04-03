package chap15.Ex06;



public class ThreadProperties_1 {

	public static void main(String[] args) {
		
		//1. ��ü �������� (currentThread()) //������ �� (activeCount())
			//static 
		Thread curThread = Thread.currentThread();	//main Thread
		//Ŭ����(Ÿ��) �������� = Ŭ������.�޼ҵ��
		System.out.println("���� �������� �̸�: " + curThread.getName());
		System.out.println("�����ϴ� ������ ��: "+Thread.activeCount());
		
		System.out.println("======================================");
		//2. Thread �̸� ���� (�ڵ� ���) - JVM�� ������ �̸��� �ڵ����� �Ҵ� - Thread-0 ,,, Thread-9
		for(int i = 0; i<= 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());	//������ �̸� ���
			thread.start();
		}
		
		System.out.println("======================================");
		//3. Thread �̸� ���� ���� : ��ü��.setName()
		for(int i = 0; i<10;i++) {
			Thread thread = new Thread();
			thread.setName(i + "��° ������");
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("======================================");
		//4. Thread �̸� ���� (�ڵ� ���) - JVM�� ������ �̸��� �ڵ����� �Ҵ� - Thread-0 ,,, Thread-9
		for(int i = 0; i< 10; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());	//������ �̸� ���
			thread.start();
			
		}
		
		
		//5. ������ �� ����ϱ�
		System.out.println("�����ϴ� ������ ��: " + Thread.activeCount());
		
		
		
		
		
		
		
	}

}
