package chap06_07.EX02;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		//�迭�� ���̰� �������� ���
		//1.method1 (int...value) => �������̸� ó���ϴ� input �Ű����� ����
		
		method1();
		method1(1,2);
		method1(1,2,3);
		method1(1,2,3,4);
		method1(1,2,3,4,5);
		method1(1,2,3,4,5,6,7,8,9,10);
		
		method2("�ȳ�","�氡");
		method2("��","ȭ","��","��","��","��","��");
		method2("�䳢","ȣ����","����","��");
		
	}
	
	static void method1(int...values) {
		System.out.println(values.length);
		System.out.println("====Arrays.toString()====");
		System.out.println(Arrays.toString(values));
		
		for(int i=0; i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		for(int i:values) {
			System.out.print(i+ " ");
		}
		
	}
	
	static void method2(String...content) {

		System.out.println(Arrays.toString(content));
		for(int i= 0; i< content.length;i++) {
			System.out.print(content[i]+" ");
		}
		System.out.println();
		for(String k : content) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	
	
	
	
	/*
	static void method1() {
		System.out.println("�Ű������� ���� �޼ҵ� ȣ��");
	}
	static void method1(int a, int b) {
		System.out.println(a+ " , "+b);
	}
	static void method1(int a, int b, int c) {
		System.out.println(a+ " , "+b+" , "+c);
	}
	static void method1(int a, int b, int c, int d) {
		System.out.println(a+ " , "+b+" , "+c+" , "+d);
	}
	static void method1(int a, int b, int c, int d, int e) {
		System.out.println(a+ " , "+b+" , "+c+" , "+d+" , "+e);
	}
	*/
}
