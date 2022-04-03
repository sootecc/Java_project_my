package chap15;

/*
 	쓰레드 4개 생성: 1. Thread를 상속, 2. Runnable 구현,  3. 익명 내부클래스를 생성해서 구현
 	
 	각 값을 String 배열에 넣는다.
 	
 	1	2		3		4	
 	이름	홍길동	이순신	신사임당
 	나이	40		50		60
 	국어	100		90		80
 	영어	70		60		100
 	수학	50		70		80
 	
 */

class Number_1 extends Thread{
	
	
	@Override
	public void run() {
		String[] strArray = {"1","이름","나이","국어","영어","수학"};
		
		for(int i = 0 ; i< strArray.length;i++) {
			System.out.print(strArray[i]+"\t");
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}
}

class Number_2 implements Runnable{
	
	@Override
	public void run() {
		String[] strArray = {"2","홍길동","40","100","70","50"};
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
				String[] strArray = {"3","이순신","50","90","60","70"};
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
				String[] strArray = {"4","신사임당","60","80","100","80"};
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
