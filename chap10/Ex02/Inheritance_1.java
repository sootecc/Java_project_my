package chap10.Ex02;

class Aa{
	int m;
	void abc() {
		System.out.println("부모 메소드");
	}
}
class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("자식 메소드");
	}
}

public class Inheritance_1 {

	public static void main(String[] args) {
		//타입캐스팅을 하지 않는 경우
		Bb b = new Bb();		//b는 Aa, Bb 포함, Aa, Bb의 필드와 메소드 모두 접근 가능
		b.m = 10;			//부모 필드
		b.n = 20;			//자식 필드
		b.abc();			//부모 메소드
		b.bcd();			//자식 메소드
		
		//업캐스팅
		Aa a = new Bb();
		a.m = 100;
		//a.n = 200;	업캐스팅 때문에 부모의 필드 메소드만 접근 가능
		
		//다운캐스팅
		Bb bb6 = (Bb) a; 
		bb6.m = 100;
		bb6.n = 200;
		
	}

}
