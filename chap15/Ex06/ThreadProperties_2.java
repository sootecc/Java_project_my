package chap15.Ex06;

//Thread �켱����
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<1000000000;i++ ) {}		//�ð� ������
		System.out.println(getName() + "�켱 ����" + getPriority());
	}
}


public class ThreadProperties_2 {

	public static void main(String[] args) {
		
		//1. ����: CPU�ھ� Ȯ���ϱ� 
		System.out.println("�ھ��: "+Runtime.getRuntime().availableProcessors());
		
		//2. �⺻(default: 5) �켱����
			// 0 ~ 10 (����)
		for(int i=0; i<3;i++) {
			Thread thread = new Thread();
			System.out.print(thread.getName() + "\t");
			System.out.println(thread.getPriority());
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			
		//�켱���� ���� ����
		for(int i =0;i<10;i++) {
			Thread thread = new MyThread();
			thread.setName(i + "��° ������");
			//System.out.print(thread.getName()+"\t");
			//System.out.println(thread.getPriority());
			thread.start();
			if(i == 9) {					//������ �������� �켱 ������ 10���� �Ҵ�
				thread.setPriority(10);
				
			}
		}
		
	}

}
