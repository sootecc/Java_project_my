package chap15.Ex07;

//�Ϲ� ������: setDaemon(false) default off: ������ �����尡 ����Ǵ��� �ڽ��� ���� ��� ��ġ�� �����Ѵ�.
//���� ������: setDaemon(true), �����带 start�� �� ����, ���� ������ �Ұ�
//	- ������ �����尡 ����Ǵ� ������ ����
// 	- �Ϲ������� �ٸ� �������� �۾��� ���� ���� ������
//	- ���� ������ ������ �Ϲ� ������ ����� �� ������ �ܿ��� �Ϲݽ������ ����
//	- ������ �÷���(�޸��� ������ �ʴ� ��ü�� ������ �÷��Ͱ� �ڵ����� ��ü�� ����)
//		- ���μ����� ��������� �ڵ�����, ȭ�� �ڵ� ����..
//	- ���� ������ ����Ͽ� �׽� ����ϰ� �ִٰ� Ư�� ������ �����Ǹ� �۾��� �����ϰ� �ٽ� ��� ���¿� ����.


class MyThread extends Thread{		//�����带 �۵���ų Ŭ����
	@Override
	public void run() {
		System.out.println(getName()+" : "+ (isDaemon()?"���󽺷���":"�Ϲݽ�����"));
		for(int i=0;i<6;i++) {
			System.out.println(getName()+": "+i+"��");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
	}
}
public class ThreadProperties_3 {
//���� ������:
	/*
	 * false(default) : �Ϲ� ������, �ٸ� ������ ���� ���ο� ��� ���� �ڽ��� �����尡 ����Ǿ�� ���μ��� ����
	 * 
	 * true: ���󽺷���, �Ϲݽ�����(����ڽ�����)�� ��� ����Ǹ� �۾��� �Ϸ���� �ʾƵ� ����
	 */
	
	
	public static void main(String[] args) {
		
		//1. �Ϲ� ������
		/*Thread thread1 = new MyThread();
		thread1.setDaemon(false);	//����Ʈ(default)
		thread1.setName("thread1");
		thread1.start();
		*/
		
		//2. Daemon ������: ������ �����尡 ����Ǵ� ������ ����
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);	
		thread2.setName("thread2");
		thread2.start();
		
		//2. 3.5�� �Ŀ� main Thread�� ����
		try {Thread.sleep(3500);} catch (InterruptedException e) {}
		System.out.println("���� ������ ����");
		
		
		
	}

}
