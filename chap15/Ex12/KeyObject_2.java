package chap15.Ex12;



/*
 
 	여러 스레드가 공유된 필드에 접근할 때 동시성의 문제가 발생된다. 동시에 접근하여 연산 해버리면 결과가 예상과 다르게 나올 수 있음

 	-해결 방안-
 	동기화: 여러 스레드가 공유된 필드를 접근할 때 한 스레드가 작업을 완료하면 다른 스레드에서 필드 접근이 가능한 것
 	하나의 스레드가 사용중인 경우 lock을 걸고 작업이 완료되면 풀어준다.

 	- 모든 동기화된 메소드는 this라는 키만 가진다.
 	- 여러 메소드가 동기화된 메소드일 경우: 하나의 스레드만 접근이 가능
 	
 	
 	
 */
class A{}
class B{}
class C{}


class MyData{//공유 객체: 여러 스레드가 접근
	
		//동기화된 메소드는 Key값이 모두 this가 자동으로 등록, 수정 불가
			//동기화 메소드는 Key 값을 넣을 수 없다.
			//하나의 스레드가 접근할 때 Key를 가지고 동기화된 메소드를 접근 가능하다.
			//객체를 Key로 사용할 수 있다.
		
		//동기화 블록은 Key값을 임의로 할당 가능하다.
	
	synchronized void abc() {	//여러 스레드가 접근할 때 동시성 문제를 방지하기 위하여 동기화 처리
		
		for(int i=0;i<3;i++) {
			try {Thread.sleep(10);} catch (InterruptedException e) {}	
			System.out.println(i+"sec");
			try {Thread.sleep(999);} catch (InterruptedException e) {}	//1초 딜레이 
			
		}
	}
	synchronized void bcd() {	//여러 스레드가 접근할 때 동시성 문제를 방지하기 위하여 동기화 처리
		for(int i=0;i<3;i++) {
			try {Thread.sleep(20);} catch (InterruptedException e) {}	
			System.out.println(i+"초");
			try {Thread.sleep(999);} catch (InterruptedException e) {}	//1초 딜레이 
			
		}
	}
	 void cde() {	//여러 스레드가 접근할 때 동시성 문제를 방지하기 위하여 동기화 처리
		 synchronized (new Object()) {		//위의 두 개의 메소드가 가진 this Key 와 다른 Key 설정 -> 위의 두 메소드와는 키가 별개이기 때문에 동시 실행이 가능하다.
			 for(int i=0;i<3;i++) {
				try {Thread.sleep(30);} catch (InterruptedException e) {}	
				System.out.println(i+"번째");
				try {Thread.sleep(999);} catch (InterruptedException e) {}	//1초 딜레이 
				
			 }
		 }
	}
}


public class KeyObject_2 {

	public static void main(String[] args) {
		
		//공유객체
		MyData myData = new MyData();
		
		//세 개의 스레드가 각각의 메소드 호출
		new Thread() {		//익명클래스: 스레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.abc();		//첫 번째 abc() 메소드 호출
			}
		}.start();
		
		new Thread() {		//익명클래스: 스레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.bcd();		//두 번째 bcd() 메소드 호출
			}
		}.start();
		
		new Thread() {		//익명클래스: 스레드 클래스를 구현하는 자식 익명클래스
			public void run() {
				myData.cde();		//세 번째 cde() 메소드 호출
			}
		}.start();
		
	}

}
