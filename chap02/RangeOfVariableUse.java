package chap02;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		// ������ �Ҹ� �ñ� - ���� ����, ���� ����
		
		int value1 = 3;		// ���� ����: ��� �ۿ��� ����� ���� ��� ��, �ۿ��� ���ȴ�.
		
		{
			int value2 = 5;		// ���� ����: ��� �ȿ��� ����� ����, ��� �������� ���ȴ�.	
			System.out.println(value1);
			System.out.println(value2);
		}
		
		System.out.println(value1);
		// System.out.println(value2); ���� ������ ����� ��� �ۿ��� ��� �Ұ���
		
	}

}
