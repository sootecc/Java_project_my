package chap15.Ex16;
 
/*
	Thread.sleep(1000) -> TimedWaiting ���·� �̵� -> Ư�� �ð�(1��)�� ����Ǹ� RUNNABLE ���·� �̵�
												=> ���ͷ�Ʈ�� �߻��Ǹ� ���ܸ� �߻���Ű�� RUNNABLE
	
	�ν��Ͻ���(��ü��)[a].join(1000) => TimedWaiting ���·� �̵� ->	Ư�� �ð�(1��)�� ����Ǹ� RUNNABLE ���·� �̵�
		a.join(1000): �ڽ��� ������� 1�ʸ� ��ٸ��� a ��ü���� CPU �Ҵ�(RUNNABLE), 
					 1�� �ڿ��� �ڽ��� �����嵵 RUNNABLE���·� ����.

	����) �ν��Ͻ���(��ü��)[a].join() -> Waiting ���·� �̵�
								�ڽ��� ������� ��� Waiting ���·� ���� a ��ü���� CPU(RUNNABLE) ����ϵ��� �Ҵ�
								a ��ü�� ��� �Ϸ�� ��� �ڽ��� �����嵵 RUNNABLE
	
 */

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		// 3�ʵ��� TimedWaiting ���·� ����, 3���Ŀ��� runnable ���·� �̵�
									// interrupt�� �߻��Ǹ� ���ܸ� �߻���Ű�� runnable ���·� �̵�
		} 
		catch (InterruptedException e) {
			System.out.println("----sleep() ������ Interrupt �߻�");
			for(long i=0;i<1000000000L;i++) {}
		}
	};
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.start();		//runnable
								
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//������ ���� �غ� �ð�
		System.out.println("Thread1 State: "+thread1.getState());	//TimedWaiting
		
		//3�� ������ ���ͷ�Ʈ ���� �߻�.
		thread1.interrupt();//TimedWaiting ����
		try {Thread.sleep(1);} catch (InterruptedException e) {}	
		System.out.println("Thread1 State2 : "+thread1.getState());
			
	}
}
