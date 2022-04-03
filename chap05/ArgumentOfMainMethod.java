package chap05;

public class ArgumentOfMainMethod {
		
	public static void main(String[] args) {		//메인 메소드[함수]
		//method의 기본 구조
		/*
		 * void main(String[] args){		void: 리턴값이 없음을 뜻함
		  		메소드를 호출시 실행할 코드;		main: 메소드명
		   }								(인풋 매개변수) 
		 */									
		 
		String a = args[0];		//"안녕하세요": 문자열 전송
		String b = args[1];		//3: 정수
		String c = args[2];		//3.8: 실수
								//이지만 String type으로 input 받았기 때문에 String으로 받아줘야한다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("--------------------------------------------");
		
		//main method에 인자값으로 정수나 실수를 넘겨줄 때 String으로 변환
		System.out.println(b+1);		//31
		System.out.println(c+1);		//3.81
		System.out.println();
		
		//String을 정수나 더블형으로 변환하여 연산
		int d = Integer.parseInt(b);		//b(String) => integer 타입으로 변환
		double e = Double.parseDouble(c);	//c(String) => double 타입으로 변환
		
		System.out.println(d+1);			//4
		System.out.println(e+1);			//4.8
		
		
		
		
		
	}
	
	
	
	
	

}
