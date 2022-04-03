package chap15.Ex14;

//������ ����
	//1. NEW			: ������ ��ü ���� �� start() �޼ҵ尡 ȣ��Ǳ� �������� ����
	//2. RUNNABLE		: .start() �޼ҵ尡 ȣ��Ǹ� run() �޼ҵ� ������ �ڵ尡 CPU���� ����ǰ� �ִ� ����
	//3. TERMINATED		: run()�� ��� �ڵ尡 ����ǰ� ���� ������ ���� ����
	//4. TIMED_WAITING	: Ư�� �ð� ���� ������, Thread.sleep(1000);,�ð��� ����ǰų� ���ͷ�Ʈ�� �߻��Ǹ� ������·� ���ư���.
																	//���ͷ�Ʈ �߻��� ���� �߻� �� ���� ����
																	//a.join(1000) <= ���� ����Ǵ� ������� 1�� ��� ���·� ����, a ��ü�� ���� ���·� ���� ó����(�纸)
	//5. BLOCKED		: ����ȭ ó������ Lock�� �ɷ� ������ ��� ���ܵ� ����, Ű�� �ݳ��Ǹ� Ű�� ȹ���Ͽ� ������·� ����. 
	//6. WAITING		: ������ ��� ����, ������� ������·� �� �� �ִ�.



public class NewRunnableTerminated {

	public static void main(String[] args) {

		//�������� ���¸� �����س��� Ŭ�����̴�. �� 6���� ���¸� ������ �� �ִ�.
		Thread.State state;		//state �������� 6���� ����� ���� ����
		
		//1. ��ü ���� (NEW)		--- �͸� ���� Ŭ���� ����
			
		Thread myThread = new Thread()  {
			// NEW			: ������ ��ü ���� �� start() �޼ҵ尡 ȣ��Ǳ� �������� ����

			@Override
			public void run() {
				for(int i = 0;i<100000000;i++) {}	//�� 0.5�� �ð� ����, CPU���� ����
					//��ü ������ �޸𸮸� �Ҵ��� �ణ�� �ð��� �ʿ�
			}
		};
		
		
		state = myThread.getState();		//�������� ���¸� �����ͼ� state ������ �Ҵ�.
		System.out.println("myThread state: "+state);
		
		
		//2. myThread ���� 
		myThread.start();					//�����带 ���� �� CPU���� ����
		state = myThread.getState();
		System.out.println("myThread state: "+state);		//RUNNABLE
		
		
		
		//3. myThread ����
		
			//myThread.join(); �� ������{main}�� ����ϰ� myThread�� ó���϶� 
		try {myThread.join();} catch (InterruptedException e) {}	
		state = myThread.getState();
		System.out.println("myThread state: "+state);	//TERMINATED
	}

}
