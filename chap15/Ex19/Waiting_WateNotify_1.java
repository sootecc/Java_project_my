package chap15.Ex19;

//a.join() : �ڽ��� ������� waiting �����̰� a��ü���� CPU(Runnable)
//a ��ü ������ �Ϸ�Ǹ� �ڽ��� �����尡 (Runnable)�� �̵�
//�ڽ� �������� ó���� ������ �ٸ� �������� ����� �޾Ƽ� ó���ؾ� �� ���

//wait(), notify(), njotifyAll(): ����ȭ ��Ͽ����� ��밡���ϴ�.
// wait(): ����ȭ ��� ������ wait() �޼ҵ带 ������ waiting ���·� ����
// notify(),notifyAll(): wait()�޼ҵ带 ������. �ݵ�� �ٸ� �޼ҵ忡�� ������ �� �ִ�.

class DataBox{
	
	int data;						//���� �ʵ�
	synchronized void inputData(int data) {	//����ȭ �޼ҵ�
		this.data = data;
		System.out.println("�Է� ������"+data); //data: �Ű����� ������ ���� ������
	}
	synchronized void outputData() {		//����ȭ �޼ҵ�
		System.out.println("��� ������"+data);	// data: �޸��� data, this  �����Ǿ� ����
	}
}


public class Waiting_WateNotify_1 {

	public static void main(String[] args) {
		
		DataBox databox = new DataBox();
		
		//ù ��° ������: ���� ��ü�� ���� �ִ� ������
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<1000;i++) {
					databox.inputData(i);
				}
			}
		};
		
		//�� ��° ������: ���� ��ü�κ��� ���� �о� ���� �޼ҵ�
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1;i<1000;i++) {
					databox.outputData();
				}
			}
		};
		
		
		t1.start();
		t2.start();
		
	}

}
