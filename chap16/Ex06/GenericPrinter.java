package chap16.Ex06;




public class GenericPrinter <T>{ 	//�پ��� ���� �������ϴ� ������(�Ŀ��, �ö�ƽ, ��)

	private T material;			//�ν��Ͻ�, ��ü, ��������

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	public String toString() {
		return material.toString();		//�ش� ��ü�� toString() �޼ҵ� ȣ��
	}
	
	public void printing() {//�޼ҵ常 ����
		//material.doPrinting();
	}
	
}


