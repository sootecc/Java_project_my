package chap15.Ex08;


//동기화 (Synchronized) : 여러 스레드가 하나의 공유된 필드를 접근할 경우
//						한 작업을 완전히 완료 후 다음작업을 처리하도록 설정
//		내가 작업할 때 lock을 걸고 작업을 마치면 lock 해제


//1. 동기화를 처리하지 않았을 때
class MyData{	//스레드가 공유하는 객체
	
	int data = 3; //데이터 가져오기
	public void plusData() {
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

public class TheNeedsForSynchronized {

	public static void main(String[] args) {
		
		//공유 객체 생성
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
