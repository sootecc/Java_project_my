package chap15.Ex15;

//Thread.yield(): �������� �������(RUNNABLE)�� �ִ� Ư�� �����忡�� �ڽ��� ������� �Ͻ� �纸
	//������� ���ο��� �ٸ� �����带 ���� �����ϵ��� �纸
	//����ȭ���� Key�� ���� �����ϴ� ������ �߻��ȴ�. Ű�� �纸�Ͽ� �յ��ϰ� ����


class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {			//yieldFlag�� True�� �� �����带 �纸����
				Thread.yield();		//������ �纸
			}
			else{					//yieldFlag�� False�� �� ������ ������ �������
				System.out.println(getName());
				for(long i= 0;i<1000000000L;i++) {}
			}
		}
	}
}



public class YieldinRunnableState {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		
		thread1.setName("111111111111");
		thread1.yieldFlag = false;
		thread1.setDaemon(true);
		thread1.start();
		
		MyThread thread2 = new MyThread();
		
		thread2.setName("222");
		thread2.yieldFlag = true;
		thread2.setDaemon(true);
		thread2.start();
		
	
	
		for(int i= 0; i<6; i++) {
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			thread1.yieldFlag = !thread1.yieldFlag;
			thread2.yieldFlag = !thread2.yieldFlag;
		}
		
	
	}
	
	
	
}
