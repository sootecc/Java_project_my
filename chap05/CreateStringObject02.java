package chap05;

import java.util.Arrays;

public class CreateStringObject02 {

	public static void main(String[] args) {

		//��ü�� ���� ������ �� ������������ ��ȭ
		//1. ���ڿ� ����( ��ü�� ������ ������ �Ұ�--> ���ο� ��ü�� ����)
		String str1 = new String("�ȳ�");
		String str2 = str1;					//�����ڷ����϶��� Stack�� �ּҰ��� ����
		
		str1 = "�ȳ��ϼ���";					//������ �޸� ����(heap)�� "�ȳ��ϼ���"�� ���� . ���ο� �ּҿ� �����.
		System.out.println(str2);			//������ "�ȳ�"�� ����Ű�� �ִ�.
		System.out.println(str1);			//���ο� "�ȳ��ϼ���" �ּҸ� ����Ų��.
		
		
		//�迭�� ��� 
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		
		System.out.println(Arrays.toString(array1));		
		System.out.println(Arrays.toString(array2));
		
		//�迭�� ���ο� ���� �������� �� ������ �޸𸮰����� ����� ���� �ƴϰ�
		//���� �ּҿ� �ִ� ���� �����ȴ�.
	}

}
