package chap17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 	Set: 중복되지 않는 값을 저장(equals(), hashCode() 메소드를 재정의, wrapper 클래스들은 모두 재정의 되어 있다.)
  		1. HashSet			: 출력되는 것이 랜덤하게 출력
  		2. LinkedHashSet	: 입력되는 순서대로 출력
  		3. TreeSet			: 입력값을 넣으면 내부적으로 오름차순 정렬되어 출력. 
  
  
 */



public class SetSummary {

	public static void main(String[] args) {
		
		//1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet
		Set<String> LinkedhashSet = new LinkedHashSet<String>();
		LinkedhashSet.add("다");
		LinkedhashSet.add("마");
		LinkedhashSet.add("나");
		LinkedhashSet.add("가");
		
		System.out.println(LinkedhashSet);
		
		//3. TreeSet  <= 정렬 하기 위해 Comparable<E>의 compareTo() 재정의, Comparator<E>의 compare() 구현
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");
		
		System.out.println(treeSet);
	}

}
