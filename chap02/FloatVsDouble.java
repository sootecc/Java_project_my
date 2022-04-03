package chap02;

public class FloatVsDouble {

	public static void main(String[] args) {
		//float vs double의 정밀도: float 소수점 이하 7자리까지, double 소수점 이하 15자리까지 정밀도 유지
		float f1 = 1.0000001f;	// float에는 변수의 값을 담을 때, 리터럴 뒤에 F,f를 명시하여 저장
		System.out.println(f1);
		float f2 = 1.00000012f;	// 2 잘림
		System.out.println(f2);	
		System.out.println("=================");
		
		double d1 = 1.000000000000001;
		System.out.println(d1);
		double d2 = 1.0000000000000012;	// 2 잘림
		System.out.println(d2);
	}

}
