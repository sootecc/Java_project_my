package chap06_07.EX02;

import chap06_07.Ex03.AA;

//다양한 타입의 메소드



public class ExternalCallMethods {

	public static void main(String[] args) {
		//객체 생성
		AA a = new AA();
		
		//메소드 호출
		a.print();
		int k = a.data();		//3
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println(result);
		
		a.printMethod(5);
		a.printMethod(25);
		
		//주의:
		
		System.out.println(a.data());		//출력 구문에 호출 가능한 메소드(리턴이 있는 메소드)
		//System.out.println(a.print()); 	오류발생
		a.print();
		System.out.println(a.sum(4, 10.5));
		//System.out.println(a.printMethod(3)); 오류발생
		
		
	}

}
