package chap04;

public class For_Ex03 {

	public static void main(String[] args) { 

		//for �⺻ �۵�
		
		int a;	//for�� ��� �ۿ��� ����� ����, �� �Ҵ��� ����
		
		for(a=0;a<3;a++) {
			System.out.print(a+ " ");
		}
		
		System.out.println("\nfor�� �� a�� ����:"+ a);
		System.out.println("\n=========================");
		
		for (int b = 0; b <= 10; b++) {
			System.out.println(b);
		}
		System.out.println("\n=========================");
		// System.out.println(b); ���� b�� for�� �������� ��ȿ��
		
		
		int c;
		for(c=10;c>0;c--) {
			System.out.print(c + " ");
		}
		System.out.println("\n=========================");
		
		
		//2�� ����� ���
		for (int i = 0; i< 100;i+=2) {
			System.out.println(i+" ");
		}
		System.out.println("\n=========================");

		//for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ��� �� �ִ�.
		
		for (int i=0,j=0; i<10; i++,j++) {
			System.out.println(i+" * "+j+" : " +(i*j));
		} 
		System.out.println("\n=========================");
		
		// 1 ���� 10 ���� ���� ���� ����϶�.
		// 1 ���� 100���� ���� ���� ����϶�.
		int m_sum = 1;
		int p_sum = 0;
		
		for(int i = 1;i< 11;i++) {
			m_sum *= i;
		}
		for(int i=1;i<101;i++) {
			p_sum += i;
		}
		System.out.println("1~10 ������ ��: " +m_sum);
		System.out.println("1~100������ ��: " +p_sum);
		
		
		//����for�� : 1~9�� ������ ���
		System.out.println("-----�ٱ����� ��¡�-----");
		for (int i = 1; i<10; i++) {
			System.out.println("======="+i+"��=======");
			for (int j = 1; j<10; j++) {
				System.out.println(i+" * "+j+"= "+i*j);
			}
		}
		
		
		/*
		 * for������ ���� ���� �߻�, ������ ���� ���(�׻� true)
		for (int i = 0;;i++) {
			System.out.println(i+" ");
		}
		*/
		/*
		for(;;) {
			System.out.println("���ѷ���");
		}
		*/
		System.out.println("=======================");
		
		//���� ���� Ż��
		for (int i = 0;;i++) {
			
			if(i > 100) {break;}	//���ѷ����� ����
			System.out.println(i);
		}
	
		//for���� ����Ͽ� 1~1000 ������ 4�� ����� ���� ��, ��� ���� ���
		double count = 0;
		int sum = 0;
		for (int i=1;i<1001;i++) {
			if(i%4==0) {
				count +=1;
				sum +=i;
			}
		}
		System.out.println("1~1000������ 4�� ��� ��:" +sum);
		System.out.println("1~1000������ 4�� ��� ���:"+ (sum/count));
		
	}
}
