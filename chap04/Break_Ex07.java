package chap04;

public class Break_Ex07 {

	public static void main(String[] args) {
		//1.���� loop�� ����� ������ break�� Ż��
		for(int i = 0;i<10;i++) {
			System.out.println(i);
			break;
		}
		
		System.out.println("=================");
		
		//2. for�� ������ if������ ����Ͽ� break
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" ");
		}
		
		System.out.println("=================");
		
		//3. ���� loop���� �� break Ż��
		for(int i=0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				if(i==2) {
					break;
				}
				System.out.println(i+","+j);
			}
		}
		
		System.out.println("=================");
		//4. ���� loop���� �� ���� Ż��
		//	4-1.�� �̸��� �̿��Ͽ� Ż��
POS1:		for(int i =0; i<5; i++) {
			for(int j=0;j<5;j++) {
				
				if(i==2) {
					break POS1;
				}
				System.out.println(i+","+j);
				
			}
		}

		System.out.println("=================");
		//  4-2. ���� ������ false�� ����� Ż��
		for(int i=0;i<5;i++) {
			for(int j =0;j<5;j++) {
				if(i==2) {
					i=100;	//���� ���� �����Ͽ� false�� �����!
					break;
				}
				System.out.println(i+","+j);
			}
		}
		
		
		
	}

}
