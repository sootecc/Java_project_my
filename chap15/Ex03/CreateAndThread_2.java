package chap15.Ex03;


// �� ��° ������
class SMIFileThread extends Thread{		//�ڸ� ���� ó���ϴ� ������
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

// �� ��° ������
class VideoFileThread extends Thread{	//���� �������� ó���ϴ� ������
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


public class CreateAndThread_2 {

	// main ������
	public static void main(String[] args) {
		
		//SMIFileThread ��ü ����
		Thread smi = new SMIFileThread();
		smi.start();
		
		
		//VideoFileThread ��ü ����
		Thread video = new VideoFileThread();
		video.start();
	}

}
