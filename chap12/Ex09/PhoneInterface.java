package chap12.Ex09;

public interface PhoneInterface {
	int TIMEOUT = 10000;	//public static final
	void sendCall();		//public abstract
	void receiveCall();		
	default void printLogo() {
		System.out.println("�ΰ� ����մϴ�.");
	}
}
