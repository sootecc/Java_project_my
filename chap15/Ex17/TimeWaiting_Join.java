package chap15.Ex17;

//a.join(1000): a 객체에게 CPU를 할당하고 자신은 TimedWaiting 상태로 대기

class MyThread1 extends Thread{
	@Override
	public void run() {
		
		for (long i =0 ;i<100000000;i++){}		//시간 지연 약 0.5초
		
	}
}


class MyThread2 extends Thread{

	MyThread1 myThread1;	//클래스타입 참조변수;
	
	
	//생성자를 통해서 참조변수에 값 할당
	public MyThread2 (MyThread1 myThread1) {
		this.myThread1 = myThread1;
	}
	
	@Override
	public void run() {
		
		try {
			myThread1.join(3000);
		} 
		catch (InterruptedException e) {
			System.out.println("---join(...) 진행중 interrupt 발생");
			for (long i =0 ;i<100000000;i++){}		//시간 지연 약 0.5초
		
		}
		
	}
	
	


}

public class TimeWaiting_Join {
	public static void main(String[] args) {
		
		
		//1. 객체 생성
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2(mt1);
		
		mt1.start();
		mt2.start();
		try {mt2.sleep(1);} catch (InterruptedException e) {}
		System.out.println(mt1.getState());			//Runnable
		System.out.println(mt2.getState());			//TIMED_WAITING
		
		mt2.interrupt();// 3초 대기중 interrput가 발생되면 예외를 발생시키고 Runnable로 이동
		try {mt2.sleep(3);} catch (InterruptedException e) {}
		System.out.println(mt1.getState());			//Runnable
		System.out.println(mt2.getState());			//TIMED_WAITING
		
	}
	
}
