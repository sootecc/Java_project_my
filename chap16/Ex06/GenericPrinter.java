package chap16.Ex06;




public class GenericPrinter <T>{ 	//다양한 재료로 프린팅하는 프린터(파우더, 플라스틱, 물)

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
	
	public void printing() {//메소드만 정의
		//material.doPrinting();
	}
	
}


