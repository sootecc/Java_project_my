package chap06_07.Ex04;

//����� this Ű���� �߰�: �ݵ�� this key�� ����ؾ� �Ǵ� ���

class Aa{		//this key�� ������� ���� ���: ���������� �ν�
	int m ;
	int n ;
	void init(int m, int n) {
		m = m;					//this Ű�� ������� �ʴ� ��� m�� ���������� ���Ѵ�
		n = n;
	}
	
}

class Bb{		//this key�� ����ϴ� ���
	int m; 
	int n;
	void init(int m, int n) {
		this.m = m;		//�ݵ�� this Ű�� ��������� ����ؼ� m�� �ʵ��� m�̶� ���� �˷���� �Ѵ�. 
		this.n = n;
	}
	
	
}



public class ThisKeyword_2 {

	public static void main(String[] args) {
		
		//1. �ʵ� ������� ���� �������� ���� ��� (this Ű�� ������� ���� ���)
		Aa a = new Aa();
		a.init(2, 3);						
		System.out.println(a.m +" "+ a.n);	//0 0
		//2. �ʵ� ������� ���� �������� ���� ��� (this Ű�� ����� ���)
		Bb b = new Bb();					
		b.init(2, 3);						
		System.out.println(b.m +" "+ b.n);	//2 3
		
	}

}
