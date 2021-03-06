package chap14.Ex08;

//메소드의 throws를 이용하여 main 메소드까지 전가
	//main까지 전가가 된 경우 예외의 결과 창을 띄우고 프로그램 종료
	//main 메소드는 예외 처리 하지 않는다.

class AA {
	
	
	public void abc() throws NumberFormatException{bcd();}
	public void bcd() throws NumberFormatException{cde();}
	public void cde() throws NumberFormatException{
		int num = Integer.parseInt("10A");		//Exception 발생, NumberFormatException
	}
	
}



public class ExceptionMethod {

	public static void main(String[] args) {
		
		//1. 객체 생성
		AA aa = new AA();
		
		//2. 메소드 호출
		try {
			aa.abc();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();		//예외의 자세한 정보를 출력
		}
		
		System.out.println("프로그램 종료");
		
		
	}

}
