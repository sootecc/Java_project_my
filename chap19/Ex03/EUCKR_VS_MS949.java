package chap19.Ex03;

import java.io.UnsupportedEncodingException;

//EUC-KR - 한국 표준, 한글 표현 전체 중 표기 가능한 것만으로 구성되어 있음. 약 11,000자 중 약 2200자 정도만 표기. 8000자는 표기 안됨
	//영문 : 1byte			<== UTF-8로 처리
	//한글 : 2byte
	//웹페이지로 출력 할 때

//MS-949(ANSI) - Microsoft사에서 개발한 한글 표기 방식 11,000자 모두 표기할 수 있다. Windows OS
	//영문 : 1byte			<== UTF-8로 처리
	//한글 : 2byte

//UTF-8 : 모든 서버(Web, FTP, Mail, ... ), git, Mac  -> 가변길이
	//영문 : 1byte			<== UTF-8로 처리
	//한글 : 3byte

//UTF-16 :  -> 고정길이
	//영문, 한글 : 2byte
	//BOM 2byte: 모든 나라의 식별코드


//해당 인코딩 타입 byte 스트림으로 문자를 생성한 경우, 해당 인코딩 타입으로 문자를 조합 해야 깨지지 않는다.


//이클립스에서 인코딩 타입 설정 3가지.
	//1. 전역 설정 : 
	//2. 프로젝트에서 설정:
	//3. 파일에서 설정: 

	//우선순위  (높) 파일 >>> 프로젝트 >>> 전역 (낮)


public class EUCKR_VS_MS949 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		//EUCKR vs MS949
		
			//1. 영문자를 byte로 내보내고 String으로 변환
		byte[] b1 = "a".getBytes("EUC-KR");		//문자를 byte로 변환 ==>  네트워크로 문자를 전송할 때 byte 스트림으로 변환하여 전송
		//예외가 발생됨(UnsupportedEncodingException) <= 오타가 발생할 경우 인코딩 할 수 없는 예외가 발생됨.
		byte[] b2 = "a".getBytes("MS949");		//문자열 -> byte[]
		
		System.out.println(b1.length);			//1
		System.out.println(b2.length);			//1 영문은 1byte
			
		System.out.println(new String(b1, "EUC-KR"));		//byte[] => 문자열로 바꿈
		System.out.println(new String(b2, "MS949"));		
	
		System.out.println();
	
		//2. 한글을 byte로 내보내고 String으로 가져오기
		byte[] b3 = "가".getBytes("EUC-KR");
		byte[] b4 = "가".getBytes("MS949");
		
		System.out.println(b3.length);		//1
		System.out.println(b4.length);		//2
		
		System.out.println(new String(b3, "EUC-KR"));		//?
		System.out.println(new String(b4, "MS949"));		//봵
	
		//3. EUC-KR은 현재 사용 가능한 것만 표기, 약 2000자
		// MS949는 11,000자 모두 표기됨.
		byte[] b5 = "봵".getBytes("EUC-KR");
		byte[] b6 = "봵".getBytes("MS949");
		
		System.out.println(b5.length);
		System.out.println(b6.length);
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));
		
		
	
	
	
	}
}
