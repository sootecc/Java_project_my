package chap04;

public class Dowhile_Ex05 {

	public static void main(String[] args) {
		
		//1. while���� do while���� ��
		//�ݺ� Ƚ���� 0�� ���
		int a= 0;
		while(a<0) {
			System.out.println(a+" ");
			a++;
		}
		
		System.out.println("==================");
		
		a=0;
		do {
			System.out.println(a + " ");		//do while���� ������ �� ���� ����ȴ�.
			a++;									
		}while(a<0);	//������ false
		
		
		
		//2. �ݺ� Ƚ���� 1�� ���
		System.out.println("======�ݺ� Ƚ���� 1�� ���======");
		a=0;
		while(a<1) {
			System.out.println(a+" ");
			a++;
		}
		
			
		a=0;
		do {
			System.out.println(a + " ");		
			a++;									
		}while(a<1);	
		
		
		
		//�ݺ� Ƚ���� 10�� ���
		System.out.println("======�ݺ� Ƚ���� 10�� ���======");
		a=0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		
		System.out.println();	
		a=0;
		do {
			System.out.print(a + " ");		
			a++;									
		}while(a<10);	
		
		
	}

}
