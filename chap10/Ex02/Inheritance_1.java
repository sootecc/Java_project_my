package chap10.Ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("�θ� �޼ҵ�");
	}
}
class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("�ڽ� �޼ҵ�");
	}
}

public class Inheritance_1 {

	public static void main(String[] args) {
		//Ÿ��ĳ������ ���� �ʴ� ���
		Bb b = new Bb();		//b�� Aa, Bb ����, Aa, Bb�� �ʵ�� �޼ҵ� ��� ���� ����
		b.m = 10;			//�θ� �ʵ�
		b.n = 20;			//�ڽ� �ʵ�
		b.abc();			//�θ� �޼ҵ�
		b.bcd();			//�ڽ� �޼ҵ�
		
		//��ĳ����
		Aa a = new Bb();
		a.m = 100;
		//a.n = 200;	��ĳ���� ������ �θ��� �ʵ� �޼ҵ常 ���� ����
		
		//�ٿ�ĳ����
		Bb bb6 = (Bb) a; 
		bb6.m = 100;
		bb6.n = 200;
		
	}

}
