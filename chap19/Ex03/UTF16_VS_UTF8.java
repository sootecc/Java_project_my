package chap19.Ex03;

import java.io.UnsupportedEncodingException;

//UTF-8 : 모든 서버(Web, FTP, Mail, ... ), git, Mac  -> 가변길이
	//영문 : 1byte
	//한글 : 3byte

//UTF-16 :  -> 고정길이
	//영문, 한글 : 2byte


public class UTF16_VS_UTF8 {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
	
		byte[] b1 = "abc".getBytes("UTF-16");
		byte[] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length);	//8
		//BOM 식별 코드 2byte + abc 6byte
		
		System.out.println(b2.length);	//3
		
		for(byte b : b1) {
			System.out.printf("%02X" , b);
		}System.out.println();
		System.out.println("==========");
		for(byte b : b2) {
			System.out.printf("%02X" , b);
		}	System.out.println();
		System.out.println("==========");
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b2, "UTF-8"));
		System.out.println("==========");
		
		
		
		
		
		
		
		
		
		
		byte[] b3 = "가나다".getBytes("UTF-16");
		byte[] b4 = "가나다".getBytes("UTF-8");
		
		System.out.println(b3.length);	//BOM(2) + 6
		System.out.println(b4.length);	//한글 3byte 9
		
		for(byte b : b3) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		for(byte b : b4) {
			System.out.printf("%02X",b);
		}
		System.out.println();
		System.out.println(new String(b3, "UTF-16"));
		System.out.println(new String(b4, "UTF-8"));
	}
}
