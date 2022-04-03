package chap15.Ex09;

//메소드 동기화: 메소드 전체들 동기화 하는 것
	//key 값이 this 값 할당됨.


class MyData{	//스레드가 공유하는 객체
	
	int data = 3; //데이터 가져오기
	public synchronized void plusData() {	//동기화 처리 메소드 : 메소드의 전체를 동기화
		//하나의 스레드 작업이 완료되어야 다음 스레드가 작업할 수 있다.
		int mydata = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		data = mydata + 1;
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
public class SynchronizedMethod {

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
