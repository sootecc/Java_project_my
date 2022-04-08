package chap19.Ex01;

import java.io.File;	//파일과 폴더를 다루는 객체 
import java.io.IOException;

//주의 : 이클립스에서 파일을 생성시 C:\에 생성하면 권한 문제로 인한 오류가 발생될 수 있다. 
	//1. 이클립스를 관리자 권한으로 실행
	//2. 폴더 내부에 파일을 생성

//File 객체 내의 폴더 식별자를 적용할 경우 
	//C:\abc\abc.txt  

	//1. Windows인 경우: String path = "C:\\abc\\abc.txt"		""내의 특수문자를 처리하기 위해 \를 한 개 더 넣어준다.
	//	Windows 10	 : String path = "C:/abc/abc.txt"

	//2. MAC인 경우:	String path = "C:/abc/abc.txt"			

	//호환을 위해서 공통적으로 사용할 수 있는 코드 작성
	//String path = "C:"+ File.separator + "abc"+File.separator + "abc.txt"
	
	
public class CreateFileObject {

	public static void main(String[] args) throws IOException {

		//1. File 객체를 사용해서 폴더 생성. 해당 파일이나 폴더가 존재하지 않는 경우 
		File tempDir = new File("C:\\temp001");
		if(!tempDir.exists()) {		//해당 경로에 파일이나 폴더가 존재하면 exist가 true
			tempDir.mkdir();		//폴더 생성 명령어
		}
		
		System.out.printf("%b%s",tempDir.exists(),System.lineSeparator());
		
		//2. File 객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newfile.txt");		//C:\에 파일을 생성할 경우 권한 문제로 파일 생성 예외가 발생될 수 있다. <=이클립스를 관리자 권한으로 실행
		if(!newFile.exists()) {
			newFile.createNewFile();		//파일을 생성할 때 예외가 발생될 수 있다. 예외처리가 필요
		}
		System.out.printf("%b%s",newFile.exists(),System.lineSeparator());
		System.out.printf("%s",System.lineSeparator());
		
		//3. 파일 구분자
		File newFile2 = new File("C:\\temp001\\newFile01.txt");		//Windows 10 하위 버전용
		File newFile3 = new File("C:/temp001/newFile02.txt");		//Windows 10 or MAC
		
		if(!newFile2.exists()) {
			newFile2.createNewFile();
		}
		if(!newFile3.exists()) {
			newFile3.createNewFile();
		}
		
		System.out.printf("%b%s",newFile2.exists(),System.lineSeparator());
		System.out.printf("%b%s",newFile3.exists(),System.lineSeparator());
		
		
		//모든 OS에서 공통으로 식별 가능한 코드
		File newFile4 = new File("C:"+File.separator+"temp001"+File.separator+"newFile03.txt");
		if(!newFile4.exists()) {
			newFile4.createNewFile();
		}
		System.out.printf("%b%s",newFile4.exists(),System.lineSeparator());
		
		//4. 절대 경로로 처리 : 다른 시스템으로 이동된 경우, 그 시스템 환경에 맞도록 세팅이 필요함
		File newFile5 = new File("C:/temp001/newfile05.txt");							//절대 경로로 처리
		System.out.printf("%s%s",newFile5.getAbsolutePath(),System.lineSeparator());	//file 객체에 저장된 파일의 절대 경로를 출력 
		
		//5. 상대 경로로 처리 <-- 권장
		//현재 나의 작업 폴더 위치를 알아야한다.
		System.out.printf("%s%s",System.getProperty("user.dir"),System.lineSeparator());	//현재 작업 폴더의 위치
				//이클립스 실행 폴더 위치
		File newFile6 = new File("newFile06.txt");		
		System.out.printf("%s%s",newFile6.getAbsolutePath(),System.lineSeparator());
	}
}
