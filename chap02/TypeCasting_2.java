package chap02;

public class TypeCasting_2 {

	public static void main(String[] args) {
		/*
		 * Ÿ�� ĳ����:	   byte < short < char < int < long < float < double 
		 * 		- ��ĳ����: ���� �ڷ��� -> ū �ڷ���
		 * 		- �ٿ�ĳ����: ū �ڷ��� -> ���� �ڷ���
		 * 		
		 * 		�������� �⺻������ int�� ����
		 * 		�Ǽ����� �⺻������ double�� ����
		 * 
		 */
		
		//�ڵ����� Ÿ�� ��ȯ
		float value1 = 3;		//int -> float ������ Ÿ������ �ڵ� ��ĳ����
		long value2 = 5;		//int -> long ������ Ÿ������ �ڵ� ��ĳ����
		double value3 = 7;		//int -> double ������ Ÿ������ �ڵ� ��ĳ����
		byte value4 = 9;		//int -> byte ������ Ÿ������ �ڵ� �ٿ�ĳ����
		short value5 = 11;		//int -> short ������ Ÿ������ �ڵ� �ٿ�ĳ����
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println("==============================");
		
		//�������� Ÿ�� ��ȯ
		byte value6 = (byte) 128;	//int -> byte ������ Ÿ������ ���� �ٿ�ĳ����
		int value7 = (int) 3.5;		//double -> int ������ Ÿ������ ���� �ٿ�ĳ����
		float value8 = (float) 7.5; //double -> float ������ Ÿ������ ���� �ٿ�ĳ����
		float value9 = 7.7f;		//double -> float ������ Ÿ������ ���� �ٿ�ĳ����
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		
		
	}

}
