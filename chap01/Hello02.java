package chap01;

public class Hello02 {
	//�޼ҵ� ���� (C, C++���� �Լ���� �̾߱� �ϴ� ��, ��ü������� �޼ҵ�)
	
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		//���� ����
		
		int i = 20;		
		int s;
		char a;		//�� ���ڸ� ���� �� ����. (�ƽ�Ű��), '(��������ǥ�� ����ؼ� ���� �Ҵ�)
		String b;
		
		b="������ ������ �����ϴ�.";
		
		s = sum (i,10); //sum �޼ҵ� ȣ��
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	}

}
