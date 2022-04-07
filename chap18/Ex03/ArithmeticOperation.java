package chap18.Ex03;

import java.util.Scanner;

//1. ��ĳ�ʸ� ����ؼ� double �� ���� �Է� �޴´�.
//2. ���1. ���ٽ��� ����ؼ� ��ǲ���� �� ���� + , -, *, / ��Ģ���� �����ؼ� ���.
//3. ���2. �������̽��� ������ �ڽ� ��ü�� ����ؼ� ��ǲ���� �� ���� + , -, *, / ��Ģ���� �����ؼ� ���.
//4. ���3. �͸� �̳�Ŭ������ �����Ͽ� ��ǲ���� �� ���� + , -, *, / ��Ģ���� �����ؼ� ���.
//5. 0���� ������ ���� �߻�



@FunctionalInterface
interface Arithmetic{
	void arithmeticOpr(double a, double b);
}

class A implements Arithmetic{
	@Override
	public void arithmeticOpr(double aa, double bb) {
		double c = aa/bb;
		if(Double.isInfinite(c)){System.out.println("0���� ���� �� �����ϴ�.");}
		else{System.out.printf("��: %f, ��: %f, ��: %f, ������: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
	}
}

public class ArithmeticOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ���.: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("��� 1");
		Arithmetic one = (double aa,double bb) -> {
			double c = aa/bb;
			if(Double.isInfinite(c)){System.out.println("0���� ���� �� �����ϴ�.");}
			else{System.out.printf("��: %f, ��: %f, ��: %f, ������: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
			};
		one.arithmeticOpr(a, b);
		System.out.println("��� 2");
		Arithmetic two = new A();
		two.arithmeticOpr(a, b);
		
		System.out.println("��� 3");
		Arithmetic three = new Arithmetic() {
			
			@Override
		public void arithmeticOpr(double aa, double bb) {
			double c = aa/bb;
			if(Double.isInfinite(c)){System.out.println("0���� ���� �� �����ϴ�.");}
			else{System.out.printf("��: %f, ��: %f, ��: %f, ������: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
			}
		};
		three.arithmeticOpr(a, b);
		
	}
}
