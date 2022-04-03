package chap14.Ex07;

// Exception - Checked Exception : ������ �ܰ迡�� ���� �߻�, �ݵ�� ���� ó��
//			 - unChecked Exception (runtime exception) : ����� ���� �߻�

// ���� ó�� ��� - try catch : �ڽ��� ���� ���ܸ� ó��
//			  - throws : ���� ó���� �̷�� ��, �޼ҵ� ��� �ȿ� �ִ� ���ܸ� ȣ���ϴ� ������ �����ϴ� ��

// * throw : ������ ���ܸ� �߻���Ű�� ��

// ���� �޼ҵ忡 ���ܸ� ó���ϴ� ���
//1. Exception�� �߻��Ǵ� �޼ҵ� ���ο��� �ڽ��� ���� ���ܸ� ó���ϴ� ���
class A {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (ClassNotFoundException | InterruptedException e) {
		}		
		//�Ϲ� ���� ClassNotFoundException, InterruptedException
			//Class.forname: ���� �ε� - �����Ͻÿ� üũ���� �ʰ� ������ �� ��ü�� �����ϴ��� Ȯ��
			//����� Ŭ���� ������ ���� �� ���� �ְ� �ƴ� ���� �ֱ� ������ ���� ó���� ����� �Ѵ�.
	}
}		

//2. throws�� ����Ͽ� exceptionó���� �̷�� ���
class B{
	void abc() {
		try {
			bcd();
		} catch (ClassNotFoundException | InterruptedException e) {
		}
	}
	void bcd() throws ClassNotFoundException, InterruptedException{
		//���ܸ� ����
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
	
	}
	
}


public class ThrowsException_3 {

	public static void main(String[] args) {

		
		
		
		
	}

}
