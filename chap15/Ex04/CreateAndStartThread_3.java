package chap15.Ex04;

// Runnable �������̽��� run()�� �����ؼ� ������ ����
class SMIFileRunnable implements Runnable{		//�������̽�

	@Override
	public void run() {
		//1 �ڸ� ��ȣ ���
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for(int i =0; i<strArray.length; i++) {
			System.out.println(" - �ڸ� ��ȣ "+strArray[i]);
			try {Thread.sleep(200);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

class VideoFileRunnable implements Runnable{	//���� �������� ó���ϴ� ������
	@Override
	public void run() {
		//2. ���� ������ ���
		int[] intArray = {1, 2, 3, 4, 5};
		for (int i = 0; i<intArray.length;i++) {
				System.out.println("(���� ������)"+intArray[i]);
				try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}
}


public class CreateAndStartThread_3 {

	public static void main(String[] args) {
		
		//ù ��° ��ü ���� �� ����
		Runnable smi = new SMIFileRunnable();
		
		//smi.start()    .. start()�޼ҵ�� runnable �������̽� ���� �������� �ʴ´�.
		
		Thread thread = new Thread(smi);		//Thread�� �׳� ������ �ʿ��ϳ� / Runnable ��ü�� Thread ������ ���ο� �ִ´�.
		thread.start();		//
		
		//�� ��° ��ü ���� �� ������ ����
		Runnable video = new VideoFileRunnable();
		Thread thread2 = new Thread(video);
		thread2.start();
	
		
	
	}

}
