package chap14.Ex09;



class StringException extends Exception{
	
	public StringException () {
		super();
	}
	public StringException (String message) {
		super(message);
	}
}


class ScoreException extends Exception{
	
	public ScoreException() {
		super();
	}
	public ScoreException(String message) {
		super(message);
	}
}

class A{
	//private: ĸ��ȭ, ��ü������ �ٷ� �������� ���ϵ��� ����
		//������, setter <== ������ �ʵ��� ���� �Ҵ�.
	
	private String season ; //�� ���� ���� �ܿ︸ �� (���� �߻�: ��, ����, ����, �ܿ︸ �Է��ϼ���)
	private String week;	//��, ��, ȭ, ��, ��, ��, �� (���� �߻�:��, ��, ȭ, ��, ��, ��, �丸 �Է��ϼ���)
	private int scoreKor; 	// 0 ~ 100 ���� �Է� (���� �߻�: 0 ~ 100 ���� ������ �Է��ϼ���)
	private int scoreEng;	// 0 ~ 100 ���� �Է� (���� �߻�: 0 ~ 100 ���� ������ �Է��ϼ���)
	private String userID;	//12�� �̻� 20�� ������ ����(���� �߻�: 12�� �̻� 20�� ������ ���ڸ� ��������)
	
	public void checkSeason(String season) throws StringException{
		if(season.equals("��") ||season.equals("����") ||season.equals("����") ||season.equals("�ܿ�") ) {
			System.out.println("�������� ���� �Է��Դϴ�.");
			this.season = season;
		}
		else {
			throw new StringException("���� �߻�: ��, ����, ����, �ܿ︸ �Է��ϼ���");
		}
	}
	
	public void checkWeek(String week) throws StringException {
		if(week.equals("��") ||week.equals("ȭ") ||week.equals("��") ||week.equals("��") ||week.equals("��") ||week.equals("��") ||week.equals("��")) {
			System.out.println("�������� ���� �Է��Դϴ�.");
			this.week = week;
		} 
		else {
			throw new StringException("���� �߻�: ��, ��, ȭ, ��, ��, ��, �丸 �Է��ϼ���");
		}
	}
	
	public void checkKorScore(int scoreKor) throws ScoreException {
		if(scoreKor < 0 || scoreKor > 100) {
			throw new ScoreException("�ѱ��� ���� ���� �߻�: 0 ~ 100 ���� ������ �Է��ϼ���");
		}
		else {
			System.out.println("�������� �ѱ��� ���� �Է��Դϴ�.");
			this.scoreKor = scoreKor;
		}
	}
	
	public void checkEngScore(int scoreEng) throws ScoreException {
		if(scoreEng < 0 || scoreEng > 100) {
			throw new ScoreException("���� ���� ���� �߻�: 0 ~ 100 ���� ������ �Է��ϼ���");
		}
		else {
			System.out.println("�������� ���� ���� �Է��Դϴ�.");
			this.scoreEng = scoreEng;
		}
	}
	
	public void checkStudentID(String userID) throws StringException {
		if(userID.length() >20 || userID.length()<12) {
			throw new StringException("���� �߻�: 12�� �̻� 20�� ������ ���ڸ� ��������");
		}
		else {
			System.out.println("�������� ID�Է��Դϴ�.");
			this.userID = userID;
		}
	}
	
	
}


public class UserException_Ex {

	public static void main(String[] args) {

		A a = new A();
		
		try {
			a.checkSeason("��");
		} catch (StringException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkWeek("��");
		} catch (StringException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkKorScore(54);
		} catch (ScoreException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkEngScore(111);
		} catch (ScoreException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkStudentID("�����ٶ󸶹ٻ������īŸ����");
		} catch (StringException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
