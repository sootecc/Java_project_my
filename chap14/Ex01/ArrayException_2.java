package chap14.Ex01;

//Exception이 예외의 최상위 클래스입니다.
//ArrayIndexOutOfBoundsException도 Exception을 상속하고 있다.
public class ArrayException_2 {

	public static void main(String[] args) {

		int[] arr = new int[5];		//arr 배열에 index 5개를 생성, index: 0, 1, 2, 3, 4
		
		try {
			for(int i = 0;i <= 5;i++) {
				arr[i] = i;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("배열의 인덱스 번호를 넘겼습니다.");
			
		}
		finally {
			System.out.println("출력(finally)");
		}
		
		System.out.println("프로그램 종료");
		}
	}

