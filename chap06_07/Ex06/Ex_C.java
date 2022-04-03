package chap06_07.Ex06;

import chap06_07.Ex05.C;

public class Ex_C {

	public static void main(String[] args) {
		
		
		// 다른 클래스에 존재함. public만 접근. model,color메모리로 접근 불가
		// model과 color는 setter를 통해 할당 후 출력(setter는 자동 public)
		
		C c = new C();
		c.maxspeed = 300;
		c.setColor("yellow");
		c.setModel("tico");
		
		c.print();
	}
}
