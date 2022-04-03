package chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		
		//5. ���ڿ� ����
		//toLowerCase(): �ҹ��ڷ� ��ȯ, toUpperCase(): �빮�ڷ� ��ȯ
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());	
		System.out.println(str1.toUpperCase());
		System.out.println();
		
		//replace(old,new): old�� new�� �ٲ�
		System.out.println(str1.replace("Study", "����"));	//����(str1)�� �ٲ��� �ʳ�
		
		//subString(����index,�ڸ� ������ index): ���ڿ��� �κ��� ���
		System.out.println(str1.substring(1,6));	//������ index�� ������, 5������	ava S
		System.out.println(str1.substring(2));		//���� �ϳ��� ���� ���ۺ��� ������	va Study
		
		//split(): Ư�� ���ڸ� �������� �߶� String[] �迭�� ����
		String str11 = "abc/def-ghi jkl";
		String[] strArray = str11.split("/| |-");		//or �����ڰ� ������    '/' , '-' , ' '��� �������� �ڸ���
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "������ ������ �帳�ϴ�. ";
		String[] strArray2 = str111.split(" ");			//������ �������� �߶� strArray2 �迭�� ����
		System.out.println(Arrays.toString(strArray2));
		
		String str1111 = "�̸�, ����, ����, ��ȭ��ȣ, �����ּ�";
		String[] strArray3 = str1111.split(",");			
		System.out.println(Arrays.toString(strArray3));
		for(int i =0 ; i<strArray3.length;i++) {
			System.out.print(strArray3[i]+" ");
		}
		System.out.println();
		

		
		
		//trim(): �յ��� ������ ����
		System.out.println("      abc    d    ");
		System.out.println("      abc    d    ".trim());
		System.out.println();
	
	
	
		//6. ���ڿ��� ���� ��(equals(): ��ҹ��� �����ϸ鼭 ���� �� ,equalsIgnoreCase(): ��ҹ��� ���� ���� ���� ��)
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//�޸��� �ּ� �� �� ( == )
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		System.out.println();
		
		//���� ��(equals(), equalsIgnoreCase() )
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str2));
		System.out.println();
		
		System.out.println(str2.equalsIgnoreCase(str3));	
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str4.equalsIgnoreCase(str2));
		
	}

}
