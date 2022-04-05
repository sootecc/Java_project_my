package chap17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
  	Map: Key�� �ߺ����� �ʾƾ� �� equals(), hashCode() ������ ���Ѿ� �Ѵ�.
  	 	 Value�� �ߺ� ����
	
*/

//equals(), hashCode()�� ���������� �ʴ� Ŭ����
class A {
	int data;
	public A(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return data +" ";
	}
}

//equals()�� ������
class B {
	int data;
	public B(int data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {	//obj�� Object Ÿ������ ��ĳ����
		if(obj instanceof B) {				//obj�� B Ÿ���� ������ �� true
			if(this.data == ((B)obj).data)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return data +" ";
	}
}

//equals(), hashCode()�� ������ : Map�� Key�� ����� �� �ִ�.
class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			if(this.data == ((C)obj).data)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(data);	//���� ���
		//return data;              
	}
	
	@Override
	public String toString() {
		return data +" ";
	}
}

public class HashMapMechanism {

	public static void main(String[] args) {

		//1. �� �޼ҵ� ��� �������̵� ���� �ʴ� ���, �� ��ü ��� Map�� Key�� ���
		Map<A, String> hashMap1 = new HashMap();
		
		
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1 == a2);		//Stack �ּҸ� ��, false
		System.out.println(a1.equals(a2));	// == , false
											
		hashMap1.put(a1, "ù ��°");
		hashMap1.put(a2, "�� ��°");
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		System.out.println("====================");
		
		
		//2. equals()�� �������̵� �� ���
		Map<B, String> hashMap2 = new HashMap();
		
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1 == b2);		//Stack �ּҸ� ��, false �ּҴ� �ٸ�
		System.out.println(b1.equals(b2));	// true		
											
		hashMap2.put(b1, "ù ��°");
		hashMap2.put(b2, "�� ��°");
		System.out.println(hashMap2.size());
		System.out.println(hashMap2);
		System.out.println("====================");
		
	
		//3. equals(), hashCode() ��� �������̵� �� ���
		
		Map<C, String> hashMap3 = new HashMap();
		
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1 == c2);		//Stack �ּҸ� ��, false �ּҴ� �ٸ�
		System.out.println(c1.equals(c2));	// true
		System.out.println(c1.hashCode()+" "+c2.hashCode());	//34: 10����
											
		hashMap3.put(c1, "ù ��°");
		hashMap3.put(c2, "�� ��°");
		System.out.println(hashMap3.size());	
		System.out.println(hashMap3);		
		System.out.println("====================");
		
		
	}

}
