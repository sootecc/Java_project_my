package chap05;

public class CreateStringObject {

	public static void main(String[] args) {

		//1. String ��ü ���� 1: new Ű�� ����ؼ� ��ü ����, heap������ ���� ������ ����
		//RAM�� ���� ���� �������� �ʴ´�.
		String str1 = new String("�ȳ�");		//new Ű�� ��ü ����(heap �޸𸮿� ����)
		System.out.println(str1);				//String�� ��ü�� ������� �� ��ü�� ���� ���
												//String�� ������ Ư���� ���
												//��ü ��ü�� ����ϸ�, heap �޸��� �ּҳ���
												//��ü�� ���� ����Ҷ��� ��ü��.toString() ������
		
		String str11 = new String("�ȳ�");		//str1�� str11�� ������ �޸� ������ ����(Heap)
		
		// == : �����ڷ����� �� �����ϴ� �ּҸ� ��
				if(str1 == str11) {System.out.println(true);}
				else {System.out.println(false);}		//���� �ٸ� heap�����̱� ������ ������ �ּ�

		System.out.println("=============================");
				
		//2. ���ͷ��� ���� �ٷ� �Ҵ�: ���� ���� ��� RAM�� ���� �����Ѵ�.
		
		String str2 = "�ȳ��ϼ���.";
		String str22 = "�ȳ��ϼ���.";		//������ �޸� ������ ����(Heap)
		
		
		if(str2 == str22) {System.out.println(true);}
		else {System.out.println(false);}
		
	}

}
