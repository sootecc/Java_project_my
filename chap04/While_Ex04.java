package chap04;

public class While_Ex04 {

	public static void main(String[] args) {
		
		// while�� �⺻ ����
		int a = 0;						//�ʱⰪ
		while(a<10) {					//����
			System.out.print(a+" ");
			a++;						//����
		}
		//0 1 2 3 4 5 6 7 8 9 ���
		
		System.out.println();
		
		//for������ ��ȯ
		for (int i = 0; i<10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n-------------------------");
		
		int b=10;
		while(b>0) {
			System.out.print(b+" ");
			b--;
		}
		System.out.println();
		for(int i=10; i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println("\n-------------------------");
		
		//while���� ���� ����
		
		/*
		while(true) {
			System.out.println("while�� ���ѷ��� �߻�");
		}
		*/
		
		//while���� ���ѷ��� ����
		int stop = 0;
		while(true) {
			if(stop>100) {
				break;
			}
			System.out.println(stop+" ");
			stop++;
		}
	
	
		
	
	
	
	
	
	}

}
