package chap14.Ex08;

//ID의 값이 NULL일 경우 Exception 발생
//userID가 8자 이상 20자가 아닌 경우 Exception

class IDFormatException extends Exception{
	
	public IDFormatException(){
		super();
	}
	IDFormatException(String message){		//예외 발생시 예외 메시지가 출력
		super(message);
	}
}




public class IDFormatTest {

	private String userID;	//null, 8자 이상 check
		//userID 캡슐화됨. private을 통해 외부나 다른 클래스에서 접근 차단
		//생성자, setter를 사용해서 값을 할당
		
	
	public String getUserID() {			//getter
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {			//setter
		
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");			//생성자로 throw시켜주면 된다.
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용 가능합니다.");
		}
		else {
			System.out.println("정상적으로 입력되었습니다.");
		}
		
		this.userID = userID;
	}
	

	
	
	public static void main(String[] args) {
		
		IDFormatTest id = new IDFormatTest();
		
		//1. userID가 null인 경우
		//2. userID가 7자인 경우
		//3. null이 아니고 8자 이상 20자 미만
		String userID = null;
		String[] IDs = {null, "1234567","abcdef1234"};
	
				
		
		for(int i = 0; i<IDs.length;i++) {
			try {
				id.setUserID(IDs[i]);
			} catch (IDFormatException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("저장된ID: "+id.getUserID()); 
			System.out.println("========================");

		}
		
	}

}
