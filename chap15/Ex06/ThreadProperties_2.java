package chap15.Ex06;

//Thread 우선순위
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<1000000000;i++ ) {}		//시간 지연용
		System.out.println(getName() + "우선 순위" + getPriority());
	}
}


public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		//1. 참고: CPU코어 확인하기 
		System.out.println("코어수: "+Runtime.getRuntime().availableProcessors());
		
		//2. 기본(default: 5) 우선순위
			// 0 ~ 10 (높음)
		for(int i=0; i<3;i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");
			System.out.println(thread.getPriority());
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			
		//우선순위 직접 지정
		for(int i =0;i<10;i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 스레드");
			//System.out.print(thread.getName()+"\t");
			//System.out.println(thread.getPriority());
			thread.start();
			if(i == 9) {					//마지막 스레드의 우선 순위를 10으로 할당
				thread.setPriority(10);
				
			}
		}
		
	}

}
