package chap12.Ex09;

public class SamsungPhone implements PhoneInterface{

	//�������̽����� ������ �޼ҵ带 �����ߴ�.
	@Override
	public void sendCall() {
		System.out.println("�츮���� ~~~ ");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ� ~~~ ");
	}
	
	// �߰����� SamsungPhone ���� ���
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
	
}



