package chap10.Ex06;


//super: �θ� Ŭ������ ��Ī, �޼ҵ� ����, ������ ���ο��� ���
//super() : ������ ���ο����� ���, �θ�����ڸ� ȣ���� �� ���
		//�ݵ�� ù ���ο� ��ġ
//this Ű����: �ڽ��� ��ü�� ��Ī, �޼ҵ� ���ο��� ���, ������ ���ο����� ���, �ʵ� �̸� ��, �޼ҵ� �̸� �� 
//this() : ������ ���ο����� ���, �ڽ��� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
		//�ݵ�� ù ���ο� ��ġ,

class AAA{
	AAA(){
		System.out.println("AAA ������");
	}
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB ������");
	}
}
class CCC{
	CCC(){}
	CCC(int a){
		System.out.println("CCC ������: "+a);
		
	}
}
class DDD extends CCC{
	DDD(){
		super();
	}
	DDD(int a){
		super(3);
		System.out.println("DDD ������ ���� 1: "+a);
	}
	
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		//1. ��ü ����
		AAA aaa = new AAA();							//�⺻ ������ ȣ��
		System.out.println("======================");
		BBB bbb = new BBB();							//�⺻ ������ ȣ��
		System.out.println("======================");
		DDD ddd = new DDD();
		System.out.println("======================");
		DDD eee = new DDD(5);
		System.out.println("======================");
		
	}

}
