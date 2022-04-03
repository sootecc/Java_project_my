package chap15;

/*
 	������ 4�� ����: 1. Thread�� ���, 2. Runnable ����,  3. �͸� ����Ŭ������ �����ؼ� ����
 	
 	�� ���� String �迭�� �ִ´�.
 	
 	1	2		3		4	
 	�̸�	ȫ�浿	�̼���	�Ż��Ӵ�
 	����	40		50		60
 	����	100		90		80
 	����	70		60		100
 	����	50		70		80
 	
 */

class Number_1 extends Thread{
	
	
	@Override
	public void run() {
		String[] strArray = {"1","�̸�","����","����","����","����"};
		
		for(int i = 0 ; i< strArray.length;i++) {
			System.out.print(strArray[i]+"\t");
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}
}

class Number_2 implements Runnable{
	
	@Override
	public void run() {
		String[] strArray = {"2","ȫ�浿","40","100","70","50"};
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for(int i = 0 ; i< strArray.length;i++) {
			System.out.print(strArray[i]+"\t");
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}
}



public class Ex_CreateAndStartThread {

	public static void main(String[] args) {
		
		//1
		Thread one = new Number_1();
		one.start();
		
		//2.
		Runnable two = new Number_2();
		Thread thread = new Thread(two);
		thread.start();
	
		
		//3 & 4
		Thread three = new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"3","�̼���","50","90","60","70"};
				try {Thread.sleep(20);} catch (InterruptedException e) {}
				for(int i = 0 ; i< strArray.length;i++) {
					System.out.print(strArray[i]+"\t");
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}
			}
		});
		
		Thread four= new Thread(new Runnable() {
			
			@Override
			public void run() {
				String[] strArray = {"4","�Ż��Ӵ�","60","80","100","80"};
				try {Thread.sleep(30);} catch (InterruptedException e) {}
				for(int i = 0 ; i< strArray.length;i++) {
					System.out.println(strArray[i]+"\t");
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}
			}
		});
		
		three.start();
		four.start();
	
	
	}

}
