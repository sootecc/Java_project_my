package chap16.Ex08.Ex06;

//GenericPrinter�� ���� ��ü [���]

public class Plastic extends Material{

	public void doPrinting() {
		System.out.println("�ö�ƽ ���� ����մϴ�.");
	}
	
	@Override
	public String toString() {
		return "���� �ö�ƽ�Դϴ�.";
	}

}
