package chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();	//문자열을 인풋받도록 함
		System.out.println("이름은 "+ name + ", ");
		
		String city = scanner.next();	
		System.out.println("도시는 " + city + ", ");
		
		int age = scanner.nextInt();	//정수값을 인풋
		System.out.println("나이는 " + age + ", ");
		
		double weight = scanner.nextDouble();	//실수값 인풋
		System.out.println("체중은 " + weight + ", ");
		
		boolean single  = scanner.nextBoolean();	//논리값 인풋
		System.out.println("독신여부는 " + single + ", ");
		scanner.close();
	}

}
