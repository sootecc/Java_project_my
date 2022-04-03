package chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
		
		// 1. ���ڿ� ���� (length()): int Ÿ������ ��ȯ
		String str1 = "Hello Java!";
		String str2 = "�ȳ��ϼ���! �ݰ����ϴ�.";
		
		System.out.println(str1.length());		//11����
		System.out.println(str2.length());		//13����
		//�ڹٴ� �ѱ��� 1���ڷ� ���ش� �ٸ� ���� 2byte�� ġ�� ��찡 ����
		System.out.println();
		
		//2. ���ڿ� �˻�( charAt(), indexOf(), lastIndexOf())
		System.out.println(str1.charAt(1));			//1�� index�� ���ڸ� ���
		System.out.println(str2.charAt(1));	
		System.out.println();
		
		//indexOf(): 0��° index���� ������index���� ������ index�� ���
		//lastIndexOf(): ������index���� 0��°���� ������ index�� ���
		
		System.out.println(str1.indexOf('a'));		//�տ������� ù a�� 7��° index
		System.out.println(str1.lastIndexOf('a'));	//�ڿ������� ù a�� 9��° index
		System.out.println(str1.indexOf('a',8));	//8���濡������ ���������� �˻� ����
		System.out.println(str1.lastIndexOf('a',8));//8���濡������ �������� �˻� ����
		System.out.println(str1.indexOf("Java"));	//Java�� ���۵Ǵ� ���ڿ� index
		System.out.println(str1.lastIndexOf("Java"));//�˻��� �ں���
		System.out.println(str2.indexOf("�ϼ���"));		//
		System.out.println(str2.lastIndexOf("�ϼ���"));	//
		System.out.println(str1.lastIndexOf("bye"));	//�߿�! ���� �������� �ʴ� ��� -1
		System.out.println();
	
	
		//3. ���ڿ� ��ȯ �� ���� (String.valueOf(),concat())
		// String.valueOf(�⺻�ڷ���): �⺻�ڷ��� ==> String���� ��ȯ
		String str3 = String.valueOf(2.3);		//�Ǽ� 2.3�� String������ ��ȯ
		String str4 = String.valueOf(false);	//boolean type false�� String������ ��ȯ
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		
		//concat(): ���ڿ��� ���ڿ��� ����: + �����ڿ� ����
		String str5 = str3.concat(str4);		//2.3false
		System.out.println(str5);
		System.out.println();
		
		//concat() �޼ҵ忡�� String.valeOf() ���
		String str6 = "�ȳ�" + 3;		//�ȳ�3		+ �����ڸ� ����Ҷ��� �ڵ���ȯ
		String str7 = "�ȳ�".concat(String.valueOf(3));	//�ȳ�3
				//concat�� ����� �� String Ÿ������ ��ȯ �ʿ�
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		

		//4. ���ڿ� => byte[] ��ȯ, ����� ���� ó���� �� ���. 
			//getBytes()
			
			//���ڿ� => char[]	toCharArray()
			
		String str8 = "Hello Java";
		String str9 = "�ȳ��ϼ���";
		
		//getBytes(): ���ڿ� => byte[]
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));		//�ƽ�Ű�ڵ尡 ���  
		System.out.println(Arrays.toString(array2));
		
		
		
		//toCharArray(): ���ڿ� => char[]
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	
	}

}
