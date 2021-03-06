package chap04;

public class IF_Ex01 {

	public static void main(String[] args) {

		// if문:
		/*
		 * if(조건) { 조건이 참일 때 실행될 코드; }
		 */

		int value1 = 5;
		if (value1 > 3) {
			System.out.println("실행1: true");
		}

		System.out.println("===========================");

		/*
		 * if(조건) {
		 * 		조건이 참일 때 실행될 코드;
		 *  } 
		 * else {
		 * 		그 외에 실행될 코드;
		 * }
		 */

		boolean bool1 = true;
		boolean bool2 = false;

		if (bool1) {
			System.out.println("실행2: true");
		}
		else {
			System.out.println("실행2: false");
		}

		System.out.println("===========================");

		if (bool2) {
			System.out.println("실행3: true");
		}
		else {
			System.out.println("실행3: false");
		}
		
		System.out.println("===========================");
		
		//if ~ else는 삼항 연산자로 변환 가능
	
		System.out.println((bool1)?"실행4: true":"실행4: false");
		System.out.println((bool2)?"실행5: true":"실행5: false");
		
		System.out.println("===========================");

		/*
		 * if의 조건이 여러 개 일 때
		 * 
		 * if (조건1) {
		 * 		조건1이 참일 때 실행
		 * }
		 * else if (조건2) {
		 * 		조건2가 참일 때 실행
		 * }
		 * else if (조건3) {
		 * 		조건3이 참일 때 실행
		 * }
		 * else {
		 * 		그 외의 조건일 때 실행
		 * }
		 */
		
		int value3 = 85;
		if (value3 >= 90) {
			System.out.println("A학점, 점수: " +value3);
		}
		else if (value3 >= 80) {
			System.out.println("B학점, 점수:" +value3);	//실행 후 if문을 빠져나온다
		}
		else if (value3 >= 70) {
			System.out.println("C학점, 점수: " +value3);
		}
		else {
			System.out.println("F학점, 점수: "+value3);
		}
		
		/*
		 * IF문에서 조건의 순서가 바뀌어 있을 경우
		 */
		
		value3= 85;
		if (value3 >= 90) {
			System.out.println("A학점, 점수: " +value3);
		}
		else if (value3 >= 70) {
			System.out.println("C학점, 점수:" +value3);	//실행 후 if문을 빠져나온다
		}
		else if (value3 >= 80) {
			System.out.println("B학점, 점수: " +value3);
		}
		else {
			System.out.println("F학점, 점수: "+value3);
		}
		
		//조건을 정할 때 실행 순서를 생각하며 세밀하게 설정해주어야 한다.
		
		value3= 85;
		if (value3 <= 100 && value3 >= 90) {
			System.out.println("A학점, 점수:"+value3);
		}
		else if (value3 < 80 && value3 >= 70) {
			System.out.println("C학점, 점수:"+value3);	
		}
		else if (value3 < 90 && value3 >= 80) {
			System.out.println("B학점, 점수:"+value3);
		}
		else {
			System.out.println("F학점, 점수:"+value3);
		}
		
		System.out.println("===========================");
		
		
		/*
		 * if문에서 실행문의 중괄호{}를 생략할 수 있다.
		 */
		
		if(3 < 5)
			System.out.println("안녕하세요");	//if에서 중괄호{}를 생략 가능한 경우
		
		System.out.println("===========================");
			
		if(3 > 5)
			System.out.println("안녕하세요 2");	//{}생략하면 한 줄만 실행부분 
			System.out.println("반갑습니다");
		
		//else가 들어갈 때 생략하면 안돼!
	}
	

}
