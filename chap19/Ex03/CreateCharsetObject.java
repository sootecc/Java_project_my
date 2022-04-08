package chap19.Ex03;

import java.nio.charset.Charset;		//Charset 클래스

public class CreateCharsetObject {

	public static void main(String[] args) {

		//문자 인코딩 설정을 적용하는 방법
		
		//1. Charset.defaultCharset(); 	<== 시스템의 기본 설정을 로드(인코딩 타입)
		Charset cs1 = Charset.defaultCharset();		//정적 메서드, 시스템의 기본 설정된 charset을 로드
		
		System.out.printf("%s%s",cs1,System.lineSeparator());	//MS949 --> x-windows 949 (MS949의 확장 버전)
									//UTF-8 
	
	
		//2. Charset.forname("MS949");	<== 직접 할당해서 사용
		Charset cs2 = Charset.forName("MS949");
		System.out.printf("%s%s",cs2,System.lineSeparator());
	
		
		Charset cs3 = Charset.forName("UTF-8");
		System.out.printf("%s%s",cs3,System.lineSeparator());
	
		Charset cs4 = Charset.forName("EUC-KR");
		System.out.printf("%s%s",cs4,System.lineSeparator());
	
		System.out.printf("%s",System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("MS949"),System.lineSeparator());	//지원하는 인코딩 셋 확인
		System.out.printf("%b%s",Charset.isSupported("UTF-8"),System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("UTF-16"),System.lineSeparator());
		System.out.printf("%b%s",Charset.isSupported("EUC-KR"),System.lineSeparator());
	
		
	
	}

}
