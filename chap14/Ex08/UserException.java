package chap14.Ex08;

//1. Exception을 상속 받는 사용자예외 - 일반 예외
	//1-1. 점수가 음수인 경우 예외
	//1-2. 점수가 100점을 초과하는 경우 예외

class MinusException extends Exception{	//음수가 들어올 경우 강제 발생
	
	public MinusException() {
		super();		//부모의 생성자 호출
	}
	public MinusException(String message) {	//예외 메시지 출력, e.getMessage();
		super(message);
	}
}

class OverException extends Exception {		//100 이상의 값이 들어오면 호출
	public OverException() {
		super();
	}
	public OverException(String message) {	//예외 메시지 출력, e.getMessage();
		super(message);
	}
}

class AAA{
	
	int score;
	
	void checkScore(int score) throws MinusException, OverException {		
		if(score < 0) {
			throw new MinusException("예외 발생: 음수는 넣을 수 없습니다.");
		}
		else if(score > 100) {
			throw new OverException("예외 발생: 100보다 클 수 없습니다.");
		}
		else {
			System.out.println("정상적인 입력입니다.");
			this.score = score;
			System.out.println("점수: "+this.score);
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
