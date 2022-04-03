package chap05;

public class PlusOperationOfString {

	public static void main(String[] args) {
		
		//1. 문자열 + 문자열
		String str1 = "안녕"+"하세요"+"!";
		System.out.println(str1);
		
		String str2 = "반갑";
		str2+="습니다.";				//str2 = str2(기존) + str2(새로운)
		str2+="!";
		System.out.println(str2);
		
		System.out.println("-------------");
		//2. 문자열 + 기본자료형 
		//기본자료형이 문자열로 변환
		String str3 = "안녕" + 1; //안녕1
		String str4 = "안녕" + String.valueOf(1);	//안녕1
		String str5 = "안녕" + "1";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println("------------");
		
		//3. 문자열과 기본자료형을 혼용해서 사용하는 경우
		System.out.println(1+"안녕");
		System.out.println(1+"안녕"+2);
		System.out.println("안녕"+1+2);	//뒤에 숫자가 오면 앞의 String 따라감
		System.out.println("안녕"+(1+2));//괄호는 연산 우선순위가 가장 높기 때문에 먼저 계산
		System.out.println(1+2+"안녕");	//앞쪽에 숫자들이 오면 int계산이 된다.
		
		
	}

}
