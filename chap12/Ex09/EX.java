package chap12.Ex09;

public class EX {

	public static void main(String[] args) {
		
		//1. SamsungPhone Ÿ������ ����
		SamsungPhone galaxy = new SamsungPhone();
		galaxy.printLogo();		//interface���� default �޼ҵ尡 ��ӵǾ� ������ ���
		galaxy.sendCall();		//
		galaxy.receiveCall();
		galaxy.flash();
		
		System.out.println("====================");
		
		//2. PhoneInterface�� ��ĳ����
		PhoneInterface galaxy2 = new SamsungPhone();
		galaxy2.printLogo();
		galaxy2.sendCall();
		galaxy2.receiveCall();
		((SamsungPhone)galaxy2).flash();	
		
		SamsungPhone ss = (SamsungPhone) galaxy2;
		//�̷��� �ٿ�ĳ���� �ؼ� flash ����ص� ��
		
		
	}

}
