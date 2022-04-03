package chap15.Ex14;

//스레드 상태
	//1. NEW			: 스레드 객체 생성 후 start() 메소드가 호출되기 전까지의 상태
	//2. RUNNABLE		: .start() 메소드가 호출되면 run() 메소드 내부의 코드가 CPU에서 실행되고 있는 상태
	//3. TERMINATED		: run()의 모든 코드가 실행되고 나면 스레드 종료 상태
	//4. TIMED_WAITING	: 특정 시간 동안 대기상태, Thread.sleep(1000);,시간이 종료되거나 인터럽트가 발생되면 실행상태로 돌아간다.
																	//인터럽트 발생시 예외 발생 후 실행 상태
																	//a.join(1000) <= 현재 실행되던 스레드는 1초 대기 상태로 들어가고, a 객체를 실행 상태로 먼저 처리함(양보)
	//5. BLOCKED		: 동기화 처리에서 Lock이 걸려 접근이 잠시 차단된 상태, 키가 반납되면 키를 획득하여 실행상태로 간다. 
	//6. WAITING		: 무한정 대기 상태, 깨워줘야 실행상태로 갈 수 있다.



public class NewRunnableTerminated {

	public static void main(String[] args) {

		//스레드의 상태를 저장해놓은 클래스이다. 총 6개의 상태를 저장할 수 있다.
		Thread.State state;		//state 변수에는 6가지 상수만 저장 가능
		
		//1. 객체 생성 (NEW)		--- 익명 내부 클래스 생성
			
		Thread myThread = new Thread()  {
			// NEW			: 스레드 객체 생성 후 start() 메소드가 호출되기 전까지의 상태

			@Override
			public void run() {
				for(int i = 0;i<100000000;i++) {}	//약 0.5초 시간 지연, CPU마다 상이
					//객체 생성시 메모리를 할당할 약간의 시간이 필요
			}
		};
		
		
		state = myThread.getState();		//스레드의 상태를 가져와서 state 변수에 할당.
		System.out.println("myThread state: "+state);
		
		
		//2. myThread 시작 
		myThread.start();					//스레드를 시작 시 CPU에서 실행
		state = myThread.getState();
		System.out.println("myThread state: "+state);		//RUNNABLE
		
		
		
		//3. myThread 종료
		
			//myThread.join(); 내 스레드{main}는 대기하고 myThread를 처리하라 
		try {myThread.join();} catch (InterruptedException e) {}	
		state = myThread.getState();
		System.out.println("myThread state: "+state);	//TERMINATED
	}

}
