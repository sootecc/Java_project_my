package chap10.Ex06.Ex01;


//�ڽ� ��ü�� ������ �� �θ�Ŭ������ �⺻ �����ڸ� ���� ȣ��: super()
//��� �ڽ� ��ü�� �����ڿ��� super(); �� �����Ǿ� ����

class A{
	A(){
		System.out.println("A Ŭ������ �⺻ ������");
	}
	A(int a){
		System.out.println("A class�� �Ű����� ���� 1 ������: "+a);
	}
	A(int a, int b){
		System.out.println("A class�� �Ű����� ���� 2 ������: "+ a + ", " + b);
	}
}
class B extends A{
	B(){
		//super(); 
		System.out.println("B Ŭ������ �⺻ ������");
	}
	B(String a){
		super(3, 5);
		System.out.println("B Ŭ������ ���ڿ� 1 ������: "+ a);
	}
	
}
class C extends B{
	C(){
		super("c���� ȣ��");	//super(); �� ��������
		System.out.println("C Ŭ������ �⺻ ������");
	}
	
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C();
	
	}

}
