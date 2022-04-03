package chap15.Ex02;

//새로운 스레드 생성
	//1. Thread 클래스를 상속하여 run()을 오버라이딩 구현 (run(){}: 완성된 메소드)
	//2. Runnable 인터페이스의 run()을 구현	(run();  : 미완성된 메소드)

class SMIFileThread extends Thread{
	
	@Override
	public void run() {		//생성된 스레드에서 작업할 내용을 구현
		//2번째 스레드에서 작업할 내용
		//자막을 출력하는 쓰레드
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		
		//자막 출력 구문
		for(int i= 0 ;i<strArray.length;i++) {
			System.out.println(" - (자막 번호)"+strArray[i]);
			//작업 지연(0.2초 딜레이)
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
	
}

public class CreateAndStartThread {

	public static void main(String[] args) {
		
		//0. 쓰레드 작동
		Thread sm = new SMIFileThread();	//
		sm.start();		//run(); 메소드를 실행 - 쓰레드 시작.
		
		//주의: run() 직접 호출하면 쓰레드가 작동되는게 아니고 메소드만 출력된다.
		//start(): 쓰레드를 작동하기 위한 메모리 할당 후 run() 호출. 쓰레드로 작업됨
		
		
		//1. 첫 번째 스레드(main Thread에서 작동) - 비디오 프레임 출력
		int[] intArray = {1, 2, 3, 4, 5};
		
		//비디오 프레임 출력
		for(int i = 0; i< intArray.length; i++) {
			System.out.println("(비디오 프레임)" + intArray[i]);
			
			//작업 지연(0.2초 딜레이)
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}

}
