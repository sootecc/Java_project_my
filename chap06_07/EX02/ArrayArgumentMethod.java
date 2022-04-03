package chap06_07.EX02;

import java.util.Arrays;

public class ArrayArgumentMethod {

	//static �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ�
	//�ٸ� ��Ű������ ���� �����ϵ��� ����: ����������(public, protected, default, private)
	//���������ڰ� �����Ǿ� ������: default(���� ��Ű������ ���ٰ���)
	
	static void printArray(int[] a) {	
		
		System.out.println("====Arrays.toString()�� ���====");
		System.out.println(Arrays.toString(a));
		//for���� ����Ͽ� ���
		
		System.out.println("=========for������ ���=========");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.println("=====enhanced for������ ���=====");
		for(int i :a) {
			System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// �迭�� �Ű������� ������ �޼ҵ� ȣ��
		
		int[] a = new int[] {1,2,3};		//�迭������ �����ϰ� ���� ����
		
		printArray(a);		//static�̶� �긦 ��ü �������� ȣ�� ����
		printArray(new int[] {4,5,6,7,8});
		//printArray({1,2,3}); �����߻�
	}

}
