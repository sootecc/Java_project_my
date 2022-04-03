package chap15.Ex10;

// 블록 동기화: 메소드 내부 일부분만 동기화한다.
//	- 구문 형식: synchronized(임의의 객체){}

class A{}
class B{}
class C{}

class MyData{	//스레드가 공유하는 객체
	
	int data = 3; //데이터 가져오기
	public void plusData() {	
		
		synchronized (new MyData()) {	//블록 동기화: 메소드의 일부분만 동기화, this가 매개변수로 들어갈 수 있다. 임의의 객체가 들어가면 됨 
										//this: 자신의 객체를 뜻하고, 동기화 블록에 접근하는 Key이다.
										// 모든 스레드는 Key를 가져야 동기화 블록에 접근할 수 있다.
										// Key는 임의의 객체를 Key로 사용할 수 있다.
			int mydata = data;
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		
			data = mydata + 1;	
		}
	}
}

class PlusThread extends Thread{	//1씩 증가하면서 두 개의 스레드
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+"실행 결과: "+myData.data);
	}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		
		
		MyData myData = new MyData();
		
		//1. PlusThread 1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		
		try{Thread.sleep(1000);}catch (Exception e) {}
		
		
		//2. PlusThread 2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
	}
}
