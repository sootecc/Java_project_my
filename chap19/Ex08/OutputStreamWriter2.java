package chap19.Ex08;

import java.io.OutputStreamWriter;



/*

	Reader / Writer : 추상 클래스, char를 처리, 문자(O), 이미지(O).. 모든 데이터를 처리 할 수 있다.
	FileReader / FileWriter : 완성 돼 있는 클래스, default charset만 사용. 
	InputStreamReader / OutputStreamWriter : 읽을 때 encoding(MS949, UTF-8)을 지정 할 수 있다.
 
 	주의: System.in : 콘솔에서 입력, System.out: 콘솔에 출력 <== Application에서 한 번 close() 되면 재사용 불가
 	System.in, System.out	<= byte 읽기, byte 쓰기
 	
 */



public class OutputStreamWriter2 {
	
	public static void main(String[] args) {
		
		//1. 콘솔 출력 (Application Default: MS949  =>  MS949)
		OutputStreamWriter osw;
		try{
			osw = new OutputStreamWriter(System.out, "MS949");
			osw.write("OutputStreamWriter2 예제 파일입니다. \n".toCharArray()); 	//String을 char 배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다."); //String
			osw.write('\n');
			osw.write("Good Bye!!!! \n\n");		//버퍼에 쓰여진다.
			osw.flush();			//버퍼에 저장된 값을 콘솔로 출력하기 위해 필요하다.
			
		}catch(Exception e) {}
		
		
		
		//2. 콘솔 출력(Application Deafult: MS949 => UTF-8)
		try{
			osw = new OutputStreamWriter(System.out, "UTF-8");
			osw.write("OutputStreamWriter2 예제 파일입니다. \n".toCharArray()); 	//String을 char 배열에 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다."); //String
			osw.write('\n');
			osw.write("Good Bye!!!! \n\n");		//버퍼에 쓰여진다.
			osw.flush();			//버퍼에 저장된 값을 콘솔로 출력하기 위해 필요하다.
			
		}catch(Exception e) {}
		
		
		
		
		
	}
}
