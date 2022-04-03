package chap15.Ex08;

class A {
	 int myData = 3;
	 
	 public void plusMyData(){
		 int number = myData;
		 number += 1;
	 }
}

class Plus_Thread extends Thread{	//스레드
	
	A my ;
	public void Plus_Thread(A my) {//생성자
		this.my = my;
	}
	@Override
	public void run() {
		my.plusMyData();
		System.out.println(my.myData);
	}
	
}


public class TheNeedsForSynchronized2 {

	A a1 = new A();
	Thread thread =  new Plus_Thread();
	
	
	
}
