package chap01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();	//���ڿ��� ��ǲ�޵��� ��
		System.out.println("�̸��� "+ name + ", ");
		
		String city = scanner.next();	
		System.out.println("���ô� " + city + ", ");
		
		int age = scanner.nextInt();	//�������� ��ǲ
		System.out.println("���̴� " + age + ", ");
		
		double weight = scanner.nextDouble();	//�Ǽ��� ��ǲ
		System.out.println("ü���� " + weight + ", ");
		
		boolean single  = scanner.nextBoolean();	//���� ��ǲ
		System.out.println("���ſ��δ� " + single + ", ");
		scanner.close();
	}

}
