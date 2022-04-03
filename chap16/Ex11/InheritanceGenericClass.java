package chap16.Ex11;

//제네릭 클래스의 상속: 자식 클래스는 부모 클래스의 제네릭 변수(K, V, T, E)를 모두 포함하고 있어야 한다. 더 많은건 괜찮음

class Parent<T>{
	
	T t;	//default

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

class Child1<T> extends Parent<T>{	//<제네릭>부모 클래스의 필드와 메소드가 상속된다.	
	
}
class Child2<T, V> extends Parent<T>{	//자식 클래스의 제네릭 변수는 부모 클래스의 제네릭 변수 개수보다 많아도 된다.
	
		V v ;

		public V getV() {
			return v;
		}

		public void setV(V v) {
			this.v = v;
		}
}

public class InheritanceGenericClass {

	public static void main(String[] args) {
		//1. 부모 제네릭 클래스 생성
		
		Parent<String> p = new Parent<String>();   //전체 완성된 구문
		//Parent<String> p = new Parent();	뒤의 생성자 호출할 때는 생략 가능
		//Parent<String> p = new Parent<>();
		//그렇지만 생략하지 말자
		//이렇게 사용된다는 것을 알아두자
		//경고가 쌓이면 언젠간 터짐
	
		p.setT("부모 제네릭 클래스");
		System.out.println(p.getT());
		
		Parent<Integer> i1 = new Parent<Integer>();
		i1.setT(1);
		System.out.println(i1.getT());				
		
		
		
		//2. 자식 제네릭 클래스1 생성
		Child1<String> c1 = new Child1<String>();
		c1.setT("자식1 제네릭 클래스");		//부모에서 상속된 메소드
		System.out.println(c1.getT());	//부모에서 상속된 메소드
		
		//3. 자식 제네릭 클래스2 생성
		Child2<String, Integer> c2 = new Child2<String, Integer>();
		c2.setT("자식2 제네릭 클래스");		//부모에서 상속된 메소드
		c2.setV(100);					//자식 클래스의 메소드
		System.out.println(c2.getT());	//부모에서 상속된 메소드
		System.out.println(c2.getV());	//자식 클래스의 메소드
		
		
		
	}
	
}
