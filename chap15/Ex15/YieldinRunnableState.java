package chap15.Ex15;

//Thread.yield(): 스레드의 실행상태(RUNNABLE)에 있는 특정 스레드에게 자신의 스레드는 일시 양보
	//실행상태 내부에서 다른 스레드를 먼저 실행하도록 양보
	//동기화에서 Key를 서로 점유하는 현상이 발생된다. 키를 양보하여 균등하게 실행


class MyThread extends Thread{
	boolean yieldFlag;
	@Override
	public void run() {
		while(true) {
			if(yieldFlag) {			//yieldFlag가 True일 떄 스레드를 양보해줌
				Thread.yield();		//스레드 양보
			}
			else{					//yieldFlag가 False일 떄 스레드 정보를 출력해줌
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
