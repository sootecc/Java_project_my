package chap14.Ex06;

//�Ϲ� ���� (Checked Exception): ������ �ܰ迡�� ����, 
		//1. ���� ó�� 
		//2. throws�� ����

		//main �޼ҵ忡 throws�� ������ų ��, Exception�� �߻��Ǹ� ������ ������ְ� ����

public class ThrowsException_2 {

	public static void main(String[] args) throws ClassNotFoundException {
	
		//���������� ������ ����. ClassNotFoundException �� �߻����� �ʴ´�.
		Class cls = Class.forName("java.lang.Object");
		
		//������ �������� ����. ClassNotFoundException �� �߻��ȴ�.
		Class cls2 = Class.forName("java.lang.Object00");
		
		
		
	}

}
