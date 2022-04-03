package chap16.Ex08.Ex06;




public class GenericPrinter <T extends Material>{ 	//T에 타입 제한을 뒀기 때문에 Material의 하위 클래스만 저장 가능하다.

	private T material;			//인스턴스, 객체, 참조변수
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();		//해당 객체의 toString() 메소드 호출
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}


