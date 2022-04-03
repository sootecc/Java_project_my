package chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		
		//1. SamsungPhone 타입으로 지정
		SamsungPhone galaxy = new SamsungPhone();
		galaxy.printLogo();		//interface에서 default 메소드가 상속되어 내려온 기능
		galaxy.sendCall();		//
		galaxy.receiveCall();
		galaxy.flash();
		
		System.out.println("====================");
		
		//2. PhoneInterface로 업캐스팅
		PhoneInterface galaxy2 = new SamsungPhone();
		galaxy2.printLogo();
		galaxy2.sendCall();
		galaxy2.receiveCall();
		((SamsungPhone)galaxy2).flash();	
		
		SamsungPhone ss = (SamsungPhone) galaxy2;
		//이렇게 다운캐스팅 해서 flash 출력해도 됨
		
		
	}

}
