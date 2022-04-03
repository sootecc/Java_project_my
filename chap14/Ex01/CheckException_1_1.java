package chap14.Ex01;



public class CheckException_1_1 {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 0);				//프로그램이 비정상 종료된다.
													//예외에 대한 처리를 해줘야 한다.
		}
		catch(ArithmeticException e){
			//try block에서 오류가 발생할 경우 작동
			e.printStackTrace();		//오류에 대한 자세한 정보를 출력
			System.out.println("0을 넣을 수 없습니다.");
			
			
			//catch block의 설정을 하지 않아도 예외처리가 된다.
		}
		finally {
			//try block에서 오류가 있든, 없든 작동된다.
			//try block이 작동되면 항상 작동
			//객체를 사용 후 메모리를 해제할 때 사용된다.
			//ex) sc.close();
			System.out.println("finally block은 항상 호출됩니다.");
		}
		
		
		
		System.out.println("프로그램을 정상 종료합니다.");		//정상 종료
		
		
	}
}
