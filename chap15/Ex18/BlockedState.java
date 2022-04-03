package chap15.Ex18;

/*
 	BLOCKED 상태: 동기화 메소드나 동기화 블록에서 한 스레드가 키를 점유한 경우 대기하고 있는 스레드의 상태
 	
 	
 	
 */



class MyBlockTest {
	
	//1. 공유 객체(동기화 메소드, 동기화 블록)
	MyClass mc = new MyClass();
	
	//2. 세 개의 스레드 필드 생성
	Thread t1 = new Thread("Thread1") {
		
		public void run(){
			mc.syncMethod();
		}
	};
	Thread t2 = new Thread("Thread2") {
		
		public void run(){
			mc.syncMethod();
		}
	};
	Thread t3 = new Thread("Thread3") {
		
		public void run(){
			mc.syncMethod();
		}
	};
	
	void startALL() {
		t1.start();
		t2.start();
		t3.start();
	}




	class MyClass {//이너클래스
		
		synchronized void syncMethod() {	//동기화 메소드: 키를 가진 스레드만 접근
			try {Thread.sleep(100);}catch(InterruptedException e) {}
			System.out.println("====="+Thread.currentThread().getName()+"=====");
			System.out.println("thread1 -> "+ t1.getState());
			System.out.println("thread2 -> "+ t2.getState());
			System.out.println("thread3 -> "+ t3.getState());
	
	
		}
	}

}

public class BlockedState {

	public static void main(String[] args) {
		
		MyBlockTest mbt = new MyBlockTest();
		mbt.startALL();
		
		
	}

}
