package chap19.Ex02;

import java.io.File;

public class FileMethod {

	public static void main(String[] args) {
		
		//1. C:\에 작업 폴더 생성 (temp)
		File tempDir = new File("C:/temp");
		if(!tempDir.exists()) {
			tempDir.mkdir();
		}
		
		
		//2. 파일 객체 생성(C:/Windows)
		File file = new File("C:/Windows");
		
		//3. 파일 객체의 여러 메소드 사용
		System.out.printf("절대 경로 출력 %s%s",file.getAbsolutePath(),System.lineSeparator());
		System.out.printf("폴더의 존재 유무 %b%s",file.isDirectory(),System.lineSeparator());
		System.out.printf("파일의 존재 유무 %b%s",file.isFile(),System.lineSeparator());
		System.out.printf("파일/폴더 이름 출력:  %s%s",file.getName(),System.lineSeparator());   //파일, 폴더 이름 출력
		System.out.printf("부모 폴더 이름 출력:  %s%s",file.getParent(),System.lineSeparator());   //부모 폴더 이름 출력
		
		
		
		File newFile1 = new File("C:/temp/abc");
		System.out.printf("%b%s",newFile1.mkdir(),System.lineSeparator());	//폴더를 생성한 경우: true, 폴더가 이미 있거나 생성하지 못한 경우: false
		System.out.printf("%b%s",newFile1.exists(),System.lineSeparator());
		
		File newFile2 = new File("C:/temp/bcd/cde");	//하위의 폴더를 한꺼번에 생성하기
		System.out.printf("%b%s",newFile2.mkdir(),System.lineSeparator());		//false, 하위 폴더까지 한 번에 생성은 불가
		System.out.printf("%b%s",newFile2.mkdirs(),System.lineSeparator());		//true, 하위 폴더까지 생성 가능
		
		File newFile3 = new File("C:/temp/def/hij/klm");
		System.out.printf("%b%s",newFile3.mkdirs(),System.lineSeparator());	
		
		//4. File 객체를 사용해서 하위 폴더의 정보 추출
		
		File[] fname = file.listFiles();		//file : "C:/Windows" 하위의 모든 폴더, 파일의 이름을 파일 배열에 저장
		
		
		for(File k : fname) {
			System.out.println((k.isDirectory()? "폴더: ":"파일: ") + k.getName());
		}
		
		
		
	}

}
