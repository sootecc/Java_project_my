package chap16.Ex08.Ex06;




public class GenericPrinter <T extends Material>{ 	//T�� Ÿ�� ������ �ױ� ������ Material�� ���� Ŭ������ ���� �����ϴ�.

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
	
	public void printing() {
		material.doPrinting();
	}
	
}


