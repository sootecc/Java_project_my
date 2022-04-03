package chap15.Ex12;



/*
 
 	���� �����尡 ������ �ʵ忡 ������ �� ���ü��� ������ �߻��ȴ�. ���ÿ� �����Ͽ� ���� �ع����� ����� ����� �ٸ��� ���� �� ����

 	-�ذ� ���-
 	����ȭ: ���� �����尡 ������ �ʵ带 ������ �� �� �����尡 �۾��� �Ϸ��ϸ� �ٸ� �����忡�� �ʵ� ������ ������ ��
 	�ϳ��� �����尡 ������� ��� lock�� �ɰ� �۾��� �Ϸ�Ǹ� Ǯ���ش�.

 	- ��� ����ȭ�� �޼ҵ�� this��� Ű�� ������.
 	- ���� �޼ҵ尡 ����ȭ�� �޼ҵ��� ���: �ϳ��� �����常 ������ ����
 	
 	
 	
 */
class A{}
class B{}
class C{}


class MyData{//���� ��ü: ���� �����尡 ����
	
		//����ȭ�� �޼ҵ�� Key���� ��� this�� �ڵ����� ���, ���� �Ұ�
			//����ȭ �޼ҵ�� Key ���� ���� �� ����.
			//�ϳ��� �����尡 ������ �� Key�� ������ ����ȭ�� �޼ҵ带 ���� �����ϴ�.
			//��ü�� Key�� ����� �� �ִ�.
		
		//����ȭ ����� Key���� ���Ƿ� �Ҵ� �����ϴ�.
	
	synchronized void abc() {	//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���Ͽ� ����ȭ ó��
		
		for(int i=0;i<3;i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}	
			System.out.println(i+"sec");
			try {Thread.sleep(999);} catch (InterruptedException e) {}	//1�� ������ 
			
		}
	}
	synchronized void bcd() {	//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���Ͽ� ����ȭ ó��
		for(int i=0;i<3;i++) {
			try {Thread.sleep(20);} catch (InterruptedException e) {}	
			System.out.println(i+"��");
			try {Thread.sleep(999);} catch (InterruptedException e) {}	//1�� ������ 
			
		}
	}
	 void cde() {	//���� �����尡 ������ �� ���ü� ������ �����ϱ� ���Ͽ� ����ȭ ó��
		 synchronized (new Object()) {		//���� �� ���� �޼ҵ尡 ���� this Key �� �ٸ� Key ���� -> ���� �� �޼ҵ�ʹ� Ű�� �����̱� ������ ���� ������ �����ϴ�.
			 for(int i=0;i<3;i++) {
				try {Thread.sleep(30);} catch (InterruptedException e) {}	
				System.out.println(i+"��°");
				try {Thread.sleep(999);} catch (InterruptedException e) {}	//1�� ������ 
				
			 }
		 }
	}
}


public class KeyObject_2 {

	public static void main(String[] args) {
		
		//������ü
		MyData myData = new MyData();
		
		//�� ���� �����尡 ������ �޼ҵ� ȣ��
		new Thread() {		//�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.abc();		//ù ��° abc() �޼ҵ� ȣ��
			}
		}.start();
		
		new Thread() {		//�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.bcd();		//�� ��° bcd() �޼ҵ� ȣ��
			}
		}.start();
		
		new Thread() {		//�͸�Ŭ����: ������ Ŭ������ �����ϴ� �ڽ� �͸�Ŭ����
			public void run() {
				myData.cde();		//�� ��° cde() �޼ҵ� ȣ��
			}
		}.start();
		
	}

}
