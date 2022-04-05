package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// 이름과 나이를 입력했을 때 이름을 오름차순으로 출력하도록 구현하라. TreeSet에 name 컬럼을 기준으로
// 1. Comparable<E> 의 compareTo() 메소드 재정의
	//기존의 객체 수정이 필요
// 2. Comparator<E> 의 compare() 구현
	//기존의 객체 수정 없이 


class Abc{
	String name;	//<<정렬 컬럼 오름차순 가나다라...하,
					//홍길동, 이순신, 강감찬 -> 강감찬, 이순신, 홍길동 순으로 정렬되어야 함
	int age;		//나이
	Abc(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {

		
		return name +" "+ age+" ";
	}
}


class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	
	Abc_T(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		if(this.name.compareTo(o.name)>0) {	//비교법?
			return 1;
		}
		else if(this.name.compareTo(o.name) == 0) {
			return 0;
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {

		
		return name +" "+ age+" ";
	}
}

public class Ex_TreeSetMethod_3 {

	public static void main(String[] args) {
		
		TreeSet<Abc_T> treeSet = new TreeSet();
		
		Abc_T m1 = new Abc_T("이순신", 50);		//TreeSet에 저장될 때 Comparable<E> 인터페이스의 compareTo() 재정의
		Abc_T m2 = new Abc_T("강감찬", 30);
		Abc_T m3 = new Abc_T("홍길동", 23);
		
		treeSet.add(m1);
		treeSet.add(m2);
		treeSet.add(m3);
		System.out.println("방법 1");
		System.out.println(treeSet);
		
		
		TreeSet<Abc_T> treeSet2 = new TreeSet<Abc_T>(new Comparator<Abc_T>() {
			@Override
			public int compare(Abc_T o1, Abc_T o2) {
				if(o1.name.compareTo(o2.name)>0) {
					return 1;
				}
				else if(o1.name.compareTo(o2.name) == 0) {
					return 0;
				}
				else {
					return -1;
				}
			}
		});
		
		System.out.println("방법 2");
		Abc_T n1 = new Abc_T("이순신",50);
		Abc_T n2 = new Abc_T("강감찬",30);
		Abc_T n3 = new Abc_T("홍길동",23);
		treeSet2.add(n1);
		treeSet2.add(n2);
		treeSet2.add(n3);
		
		System.out.println(treeSet2);
		
	}

}
