package chap15.Ex16;
 
/*
	Thread.sleep(1000) -> TimedWaiting 상태로 이동 -> 특정 시간(1초)이 경과되면 RUNNABLE 상태로 이동
												=> 인터럽트가 발생되면 예외를 발생시키고 RUNNABLE
	
	인스턴스명(객체명)[a].join(1000) => TimedWaiting 상태로 이동 ->	특정 시간(1초)이 경과되면 RUNNABLE 상태로 이동
		a.join(1000): 자신의 스레드는 1초를 기다리고 a 객체에게 CPU 할당(RUNNABLE), 
					 1초 뒤에는 자신의 스레드도 RUNNABLE상태로 간다.

	참고) 인스턴스명(객체명)[a].join() -> Waiting 상태로 이동
								자신의 스레드는 잠시 Waiting 상태로 가고 a 객체에게 CPU(RUNNABLE) 사용하도록 할당
								a 객체가 모두 완료된 경우 자신의 스레드도 RUNNABLE
	
 */

class MyThread extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(3000);		// 3초동안 TimedWaiting 상태로 진입, 3초후에는 runnable 상태로 이동
									// interrupt가 발생되면 예외를 발생시키고 runnable 상태로 이동
		} 
		catch (InterruptedException e) {
			System.out.println("----sleep() 진행중 Interrupt 발생");
			for(long i=0;i<1000000000L;i++) {}
		}
	};
}

public class TimedWaiting_Sleep {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		thread1.start();		//runnable
								
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}	//스레드 시작 준비 시간
		System.out.println("Thread1 State: "+thread1.getState());	//TimedWaiting
		
		//3초 이전에 인터럽트 강제 발생.
		thread1.interrupt();//TimedWaiting 상태
		try {Thread.sleep(1);} catch (InterruptedException e) {}	
		System.out.println("Thread1 State2 : "+thread1.getState());
			
	}
}
