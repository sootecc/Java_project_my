package chap15.Ex20;

class DataBox{
	
	boolean isEmpty = true;		//�⺻�� ����
	int data;						//���� �ʵ�
	synchronized void inputData(int data) {	//����ȭ �޼ҵ�
		if(!isEmpty) {	//false�� �� wait(); ����ȭ ���̳� ����ȭ �޼ҵ忡�� WAITING���·� ��ȯ
						//data �ʵ��� ���� ������� ���� �� ��� ���
			try {wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		isEmpty = false;		//data �ʵ忡 ���� �ְ� �ڽ��� false
		this.data = data;
		System.out.println("�Է� ������"+data); //data: �Ű����� ������ ���� ������
		notify();
	}
	
	synchronized void outputData() {		//����ȭ �޼ҵ�
		if(isEmpty) {
			try {wait();} catch (InterruptedException e) {}
		}
		
		isEmpty = true;
		System.out.println("��� ������"+data);	// data: �޸��� data, this  �����Ǿ� ����
		notify();			//inputData() �޼ҵ��� wait()�� �����带 �����ش�.
	}
}

public class Waiting_WateNotify {

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
