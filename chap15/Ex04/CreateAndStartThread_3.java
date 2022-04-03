package chap15.Ex04;

// Runnable 인터페이스의 run()을 구현해서 스레드 생성
class SMIFileRunnable implements Runnable{		//인터페이스

	@Override
	public void run() {
		//1 자막 번호 출력
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for(int i =0; i<strArray.length; i++) {
			System.out.println(" - 자막 번호 "+strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class VideoFileRunnable implements Runnable{	//비디오 프레임을 처리하는 쓰레드
	@Override
	public void run() {
		//2. 비디오 프레임 출력
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i = 0; i<intArray.length;i++) {
				System.out.println("(비디오 프레임)"+intArray[i]);
				try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}


public class CreateAndStartThread_3 {

	public static void main(String[] args) {
		
		//첫 번째 객체 생성 후 시작
		Runnable smi = new SMIFileRunnable();
		
		//smi.start()    .. start()메소드는 runnable 인터페이스 내에 존재하지 않는다.
		
		Thread thread = new Thread(smi);		//Thread는 그냥 무조건 필요하네 / Runnable 객체를 Thread 생성자 내부에 넣는다.
		thread.start();		//
		
		//두 번째 객체 생성 후 쓰레드 시작
		Runnable video = new VideoFileRunnable();
		Thread thread2 = new Thread(video);
		thread2.start();
	
		
	
	}

}
