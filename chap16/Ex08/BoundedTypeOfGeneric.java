package chap16.Ex08;

class A{}
class B extends A{}
class C extends B{}

//제네릭 타입의 클래스: 제네릭 타입에 들어오는 객체 제한을 둠
class D <T extends B>{		//T : class B, class C만 올 수 있다.
							//<T extends B> 의미: T 타입 접근을 제한
							
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class BoundedTypeOfGeneric {

	public static void main(String[] args) {
//		D<A> d1 = new D<A>();		//A는 B의 하위클래스가 아니기 때문에 <T>에 들어갈 수 없다.
		D<B> d2 = new D<B>();		//B, C를 타입으로 설정 가능
		D<C> d3 = new D<C>();		//C 타입으로 설정 가능
		
		D d4 = new D();		// => D(B) D(C) 타입을 지정하지 않고 객체를 만들면 최상위 타입으로 설정된다.
							// => D<B> d4 = new D<B>();	
		
		d2.setT(new B());	//B 객체 저장
		d2.setT(new C());	//C 객체 저장
//		d2.setT(new A());	A는 저장 불가. 오류
		
		
		//d3는 C타입만 넣을 수 있다.
//		d3.setT(new B());	//B 저장 불가. 오류
		d3.setT(new C());	//C 객체 저장
//		d3.setT(new A());	//A 저장 불가. 오류
	
//		d4.setT(new A());	//오류 발생
		d4.setT(new B());
		d4.setT(new C());
	
	}

}
