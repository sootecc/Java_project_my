package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 * ���� ������ ( =, +=, -=, *=,	>>=, <<= >>>=)
		 * a = b;	b ������ ���� a �� �Ҵ� 
		 * a += b	a = a + b
		 * a -= b	a = a - b
		 * a *= b	a = a * b
		 * a /= b	a = a / b
		 * a &= b	a = a & b
		 * a |= b	a = a | b
		 * a <<= b	a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2;	//�⺻�ڷ����� ��� ������ ���� ���� ������ �⺻������ 0�� �Ҵ�.
		value2 = 5;	//�����ڷ����� ��� ������ ���� ���� ������ �⺻������ NULL
		//��� ǥ��
		
		System.out.println(value2 += 2);	//value2 = value2 + 2	// 5+2 = 7
		System.out.println(value2 -= 2);	//value2 = value2 - 2	// 7-2 = 5
		System.out.println(value2 /= 2);	//value2 = value2 / 2	//
		value2 = 5; System.out.println(value2 %= 2);	
		value2 = 5;	System.out.println(value2 | 2);
		value2 = 5;	System.out.println(value2 & 2);
		
		value2 = 5; System.out.println(value2 <<= 2);	// ������� 20
		value2 = 5; System.out.println(value2 >>= 2);	
		value2 = 5; System.out.println(value2 >>>= 2);	//�̰� ��ȣ��Ʈ���� ���� ������
														//�׷� �����϶� �� ���߰ڳ�.
		value2 = -128; System.out.println(value2 >>>= 2);
		
	
	}

}
