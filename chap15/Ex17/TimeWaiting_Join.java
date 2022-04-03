package chap15.Ex17;

//a.join(1000): a ��ü���� CPU�� �Ҵ��ϰ� �ڽ��� TimedWaiting ���·� ���

class MyThread1 extends Thread{
	@Override
	public void run() {
		
		for (long i =0 ;i<100000000;i++){}		//�ð� ���� �� 0.5��
		
	}
}


class MyThread2 extends Thread{

	MyThread1 myThread1;	//Ŭ����Ÿ�� ��������;
	
	
	//�����ڸ� ���ؼ� ���������� �� �Ҵ�
	public MyThread2 (MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		
		try {
			myThread1.join(3000);
		} 
		catch (InterruptedException e) {
			System.out.println("---join(...) ������ interrupt �߻�");
			for (long i =0 ;i<100000000;i++){}		//�ð� ���� �� 0.5��
		
		}
		
	}
	
	


}

public class TimeWaiting_Join {
	public static void main(String[] args) {
		
		
		//1. ��ü ����
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2(mt1);
		
		mt1.start();
		mt2.start();
		try {mt2.sleep(1);} catch (InterruptedException e) {}
		System.out.println(mt1.getState());			//Runnable
		System.out.println(mt2.getState());			//TIMED_WAITING
		
		mt2.interrupt();// 3�� ����� interrput�� �߻��Ǹ� ���ܸ� �߻���Ű�� Runnable�� �̵�
		try {mt2.sleep(3);} catch (InterruptedException e) {}
		System.out.println(mt1.getState());			//Runnable
		System.out.println(mt2.getState());			//TIMED_WAITING
		
	}
	
}
