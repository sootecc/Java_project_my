package Ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		String course[] = {"Java", "C++", "HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		while(true) {
			System.out.print("���� �̸� >> ");
			name = sc.next();
			
			for(int i =0;i<5;i++) {
				if(course[i].equals(name)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
					count = 1;
				}
			}
			
			if(name.equals("�׸�")) {		//����. name�� ���������̹Ƿ� ==�� ������� �ʰ� equals
				break;
			}
			else if(count == 0) {
				System.out.println("���� �����Դϴ�.");
			}
			
			count = 0;
			
		}
	}

}
