package chap14.Ex03;

public class MultiCatch_2 {

	public static void main(String[] args) {

		//1. catch block의 순서가 잘못된 경우
			//모든 예외는 Exception을 상속 받는다.
		
		try{
			System.out.println(10/0);
			int num = Integer.parseInt("10A");
		}
		catch(Exception e) {
			//try{} block에서 발생하는 모든 예외는 Exception 클래스가 처리
			System.out.println("예외 처리 (Exception)");
		}
		
		//2. catch block의 순서가 잘못된 경우
/*
		try{
			System.out.println(10/0);
			int num1 = Integer.parseInt("10A");
		}
		catch(Exception e) {
			//try{} block에서 발생하는 모든 예외는 Exception 클래스가 처리
			System.out.println("예외 처리 (Exception)");
		}
		catch(ArithmeticException e) {
			//try{} block에서 발생하는 모든 예외는 Exception 클래스가 처리
			System.out.println("예외 처리 (ArithmeticException)");
		}
		catch(NumberFormatException e) {
			//try{} block에서 발생하는 모든 예외는 Exception 클래스가 처리
			System.out.println("예외 처리 (NumberFormatException)");
		}
	*/
		
		//3. catch block의 올바른 순서: 최상위 Exception은 catch block의 마지막에 위치해야한다.
		try{
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("예외 처리 (ArithmeticException)");
		}
		catch(NumberFormatException e) {
			System.out.println("예외 처리 (NumberFormatException)");
		}
		catch(Exception e) {		//최상위 부모의 Exception은 마지막에 위치
			System.out.println("예외 처리 (Exception)");
		}
		
		
		
		//4. 여러개의 exception을 통합해서 적용
		try{
			System.out.println(10/0);
			int num2 = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			System.out.println("예외 처리 ");
		}
		catch(Exception e) {
			
		}
		System.out.println("프로그램 종료");
	}

}
