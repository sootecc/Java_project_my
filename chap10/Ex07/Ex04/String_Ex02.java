package chap10.Ex07.Ex04;

class AA{
	String name;
	AA(String name){
		this.name = name;
	}
}
class BB{
	String name;
	BB(String name){
		this.name = name;
	}
	@Override
	public String toString() {	//��Ű����.Ŭ������@�ؽ��ڵ� (������)=> name�ʵ��� �� ����
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((BB)obj).name) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class String_Ex02 {
	public static void main(String[] args) {
		String s1 = new String("�ȳ�");
		String s2 = "�ȳ�";
									//String Ŭ������
		System.out.println(s1);		//toString() �޼ҵ尡 ������ �Ǿ��ִ�.
		System.out.println(s1.equals(s2));	//equals�� ������ �Ǿ��ִ�.
			//���� ���ϵ��� ������
		
		AA aa1 = new AA("�ȳ�");
		AA aa2 = new AA("�ȳ�");
		
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));	//��ü �ּҸ� ��
		
		BB bb1 = new BB("�ȳ�");
		BB bb2 = new BB("�ȳ�");
		
		System.out.println(bb1);
		System.out.println(bb1.equals(bb2));
		
		
		
	}
}
