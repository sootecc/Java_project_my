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
	//private: 캡슐화, 객체생성후 바로 접근하지 못하도록 설정
		//생성자, setter <== 제어후 필드으 값을 할당.
	
	private String season ; //봄 여름 가을 겨울만 들어감 (예외 발생: 봄, 여름, 가을, 겨울만 입력하세요)
	private String week;	//일, 월, 화, 수, 목, 금, 토 (예외 발생:일, 월, 화, 수, 목, 금, 토만 입력하세요)
	private int scoreKor; 	// 0 ~ 100 값만 입력 (예외 발생: 0 ~ 100 까지 정수만 입력하세요)
	private int scoreEng;	// 0 ~ 100 값만 입력 (예외 발생: 0 ~ 100 까지 정수만 입력하세요)
	private String userID;	//12자 이상 20자 사이의 문자(예외 발생: 12자 이상 20자 사이의 문자만 넣으세요)
	
	public void checkSeason(String season) throws StringException{
		if(season.equals("봄") ||season.equals("여름") ||season.equals("가을") ||season.equals("겨울") ) {
			System.out.println("정상적인 계절 입력입니다.");
			this.season = season;
		}
		else {
			throw new StringException("예외 발생: 봄, 여름, 가을, 겨울만 입력하세요");
		}
	}
	
	public void checkWeek(String week) throws StringException {
		if(week.equals("월") ||week.equals("화") ||week.equals("수") ||week.equals("목") ||week.equals("금") ||week.equals("토") ||week.equals("일")) {
			System.out.println("정상적인 요일 입력입니다.");
			this.week = week;
		} 
		else {
			throw new StringException("예외 발생: 일, 월, 화, 수, 목, 금, 토만 입력하세요");
		}
	}
	
	public void checkKorScore(int scoreKor) throws ScoreException {
		if(scoreKor < 0 || scoreKor > 100) {
			throw new ScoreException("한국어 점수 예외 발생: 0 ~ 100 까지 정수만 입력하세요");
		}
		else {
			System.out.println("정상적인 한국어 점수 입력입니다.");
			this.scoreKor = scoreKor;
		}
	}
	
	public void checkEngScore(int scoreEng) throws ScoreException {
		if(scoreEng < 0 || scoreEng > 100) {
			throw new ScoreException("영어 점수 예외 발생: 0 ~ 100 까지 정수만 입력하세요");
		}
		else {
			System.out.println("정상적인 영어 점수 입력입니다.");
			this.scoreEng = scoreEng;
		}
	}
	
	public void checkStudentID(String userID) throws StringException {
		if(userID.length() >20 || userID.length()<12) {
			throw new StringException("예외 발생: 12자 이상 20자 사이의 문자만 넣으세요");
		}
		else {
			System.out.println("정상적인 ID입력입니다.");
			this.userID = userID;
		}
	}
	
	
}


public class UserException_Ex {

	public static void main(String[] args) {

		A a = new A();
		
		try {
			a.checkSeason("봄");
		} catch (StringException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			a.checkWeek("웰");
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
			a.checkStudentID("가나다라마바사아자차카타파하");
		} catch (StringException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
