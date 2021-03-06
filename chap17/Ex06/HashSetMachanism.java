package chap17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set : 중복된 값을 넣을 수 없다.
	// equals() 메소드, hashCode() 메소드가 정의되어 있어야 한다.
	// String, Integer 클래스들은 equals()메소드와 hashCode()가 재정의 되어 있다.
	// 특정 객체를 set에 저장할 경우 중복 저장을 막기 위해 equals()와 hashCode() 메소드를 재정의해야 한다.
	//Object 클래스의 equals()와 hashCode()
		//Object 클래스의 equals() 메소드는 == 과 같다.
			// == 은 Stack 메모리의 값을 비교.

//equals(), hashCode 메소드가 재정의 되지 않은 상태

class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

class B{					//두 개의 객체가 data 필드 값이 같을 때 동일하다라고 식별자를 넣어줘야 한다.
							//equals(), hashCode()
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {	//객체의 주소를 비교하는 것이 아니라 객체 내부의 특정 필드의 값을 비교하도록 설정
		if(obj instanceof B) {		//주의: 다운캐스팅을 잘못 하는 경우 예외가 발생됨
			this.data = ((B)obj).data;
			return true;
		}
		else
			return false;
	}
}

class C{					//두 개의 객체가 data 필드 값이 같을 때 동일하다라고 식별자를 넣어줘야 한다.
	//equals(), hashCode()
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {		
			this.data = ((C)obj).data;
			return true;
		}
		else
		return false;
	}
	
	@Override
	public int hashCode() {
		//return Objects.hash(data);
		
		return data;		//data 필드의 값이 같으면 hashCode를 동일하게 생성
	}
}

public class HashSetMachanism {

	public static void main(String[] args) {
		
		//1. equals(), hashCode 메소드가 재정의 되지 않은 상태
		
		Set<A> hashSet1 = new HashSet();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);	//false
			// == : 스택 메모리의 값을 비교
		System.out.println(a1);		//객체명을 출력: 패키지명.클래스명@힙메모리주소의해시코드(16진수)
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));	//false,Object equals()는 == 와 같다.
		
		System.out.println(a1.hashCode() + " , "+a2.hashCode());	//10진수로 표현
		
		hashSet1.add(a1);			//Set은 중복된 값을 넣지 못한다.
		hashSet1.add(a2);
		
		System.out.println(hashSet1.size());	//2   <-- equals()와 hashCode() 메소드가 재정의 되어있지 않다.
		
		
		//2. equals() 재정의 (객체의 data 필드의 값을 비교), hashCode() 메소드가 재정의 되지 않은 상태
		Set<B> hashSet2 = new HashSet();
		
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1==b2);			//Stack 메모리의 값을 비교, false
		System.out.println(b1.equals(b2));	//데이터 필드의 값을 비교
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		
		System.out.println(hashSet2.size());	//2   	equals()만 재정의, hashCode()재정의 안됨.
		System.out.println(b1.hashCode() + "," + b2.hashCode());
		
		
		//3. equals() 재정의 (객체의 data 필드 값을 비교), hashCode() 메소드가 재정의
		Set<C> hashSet3 = new HashSet();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1==c2);			//Stack 메모리의 값을 비교, false
		System.out.println(c1.equals(c2));	//데이터 필드의 값을 비교
		
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		
		System.out.println(hashSet3.size());	//1  equals(), hashCode() 재정의 되어 있다. data 필드에 대해서.
		System.out.println(c1.hashCode() + "," + c2.hashCode());
		
	
		
	}

}
