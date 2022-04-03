package chap15.Ex09;

//�޼ҵ� ����ȭ: �޼ҵ� ��ü�� ����ȭ �ϴ� ��
	//key ���� this �� �Ҵ��.


class MyData{	//�����尡 �����ϴ� ��ü
	
	int data = 3; //������ ��������
	public synchronized void plusData() {	//����ȭ ó�� �޼ҵ� : �޼ҵ��� ��ü�� ����ȭ
		//�ϳ��� ������ �۾��� �Ϸ�Ǿ�� ���� �����尡 �۾��� �� �ִ�.
		int mydata = data;
		try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		data = mydata + 1;
	}
}

class PlusThread extends Thread{	//1�� �����ϸ鼭 �� ���� ������
	MyData myData;
	public PlusThread(MyData myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName()+"���� ���: "+myData.data);
	}
}
public class SynchronizedMethod {

	public static void main(String[] args) {
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
