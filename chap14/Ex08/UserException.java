package chap14.Ex08;

//1. Exception�� ��� �޴� ����ڿ��� - �Ϲ� ����
	//1-1. ������ ������ ��� ����
	//1-2. ������ 100���� �ʰ��ϴ� ��� ����

class MinusException extends Exception{	//������ ���� ��� ���� �߻�
	
	public MinusException() {
		super();		//�θ��� ������ ȣ��
	}
	public MinusException(String message) {	//���� �޽��� ���, e.getMessage();
		super(message);
	}
}

class OverException extends Exception {		//100 �̻��� ���� ������ ȣ��
	public OverException() {
		super();
	}
	public OverException(String message) {	//���� �޽��� ���, e.getMessage();
		super(message);
	}
}

class AAA{
	
	int score;
	
	void checkScore(int score) throws MinusException, OverException {		
		if(score < 0) {
			throw new MinusException("���� �߻�: ������ ���� �� �����ϴ�.");
		}
		else if(score > 100) {
			throw new OverException("���� �߻�: 100���� Ŭ �� �����ϴ�.");
		}
		else {
			System.out.println("�������� �Է��Դϴ�.");
			this.score = score;
			System.out.println("����: "+this.score);
		}
	}
}



public class UserException {

	public static void main(String[] args) {
		
		AAA aaa = new AAA();
		AAA bbb = new AAA();
		AAA ccc = new AAA();

			try {
				aaa.checkScore(-2);
			} catch (MinusException | OverException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("=================================");
			
			try {
				bbb.checkScore(191);
			} catch (MinusException | OverException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("=================================");
			
			try {
				ccc.checkScore(80);
			} catch (MinusException | OverException e) {
				System.out.println(e.getMessage());
			}
			
			
	}
}
