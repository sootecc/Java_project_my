package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		String str[] = {"����", "����", "��"};
		String user;
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		
		
		while(true) {
			
			System.out.print("���� ���� ��! >> ");
			user = sc.next();
			n = (int)(Math.random()*3);
			
			if(user.equals("����")&&str[n].equals("����")) {
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t�����ϴ�.");
			}
			else if(user.equals("����")&&str[n].equals("����")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(user.equals("����")&&str[n].equals("��")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t����ڰ� �̰���ϴ�.");
			}
			else if(user.equals("����")&&str[n].equals("����")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t����ڰ� �̰���ϴ�.");
			}
			else if(user.equals("����")&&str[n].equals("����")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t�����ϴ�.");
			}
			else if(user.equals("����")&&str[n].equals("��")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(user.equals("��")&&str[n].equals("����")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t��ǻ�Ͱ� �̰���ϴ�.");
			}
			else if(user.equals("��")&&str[n].equals("����")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t�����ϴ�.");
			}
			else if(user.equals("��")&&str[n].equals("��")){
				System.out.println("����� = "+user+", ��ǻ�� = "+str[n]+" \t����ڰ� �̰���ϴ�.");
			}
			else if(user.equals("�׸�")) {
				break;
			}
			
			
		}
				
		
		
	}

}
