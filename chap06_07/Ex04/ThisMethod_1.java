package chap06_07.Ex04;


/* 1. this�� Ű����� ���Ǵ� ���: this.m (�ʵ��� m), this.init() (��ü �ڽ��� �޼ҵ� init())
 * 2. this�� �޼ҵ�� ���Ǵ� ���: this();	������(constructor) ������ �ٸ� �����ڸ� ȣ���� �� ���
 * 										�ݵ�� ������ ������ ù �ٿ� �;� ��
 * 										�޼ҵ� ���ο����� ��� �Ұ�
 * 
 */

class Abc{
	
	Abc(){	
		System.out.println("1st constructor");
	}
	Abc(int a){
		this();		//�Ű������� ���� constructor�� ȣ��. this()�� constructor�� ù ���ο� �;� ��
		System.out.println("2nd constructor");
	}
	Abc(int a, String b){
		this(30);
		System.out.println("3rd constructor");
	}
	/*void abc() {
		//this(); method �������� ���Ұ�
		
	}
	*/
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		
		//1. ��ü ����
		Abc abc = new Abc();	//�⺻constructor
		System.out.println("=============================");
		Abc abc1 = new Abc(2);
		System.out.println("=============================");
		Abc abc2 = new Abc(2,"this");
		
	}

}
