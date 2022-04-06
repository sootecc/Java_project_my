package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> 정리 : K(Key)는 중복될 수 없다.  Value는 중복 가능

	//1. HashMap		: Key를 기준으로 랜덤하게 출력된다. 메소드 동기화(Synchronized)가 안됨. 싱글쓰레드 환경에 사용
	//2. Hashtable		: 모든 메소드가 동기화 되어있다. 멀티쓰레드 환경에서 사용됨.
	//3. LinkedHashMap	: 입력한 순서대로 출력된다.
	//4. TreeMap		: 오름차순 정렬되어 입력, Comparable<E>, Comparator<E> 가 재정의 되어 있어야 한다.


public class MapSummary {

	public static void main(String[] args) {

		//1. HashMap: 입력 순서와 출력 순서가 다르다.
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("다", 30);
		hashMap.put("마", 40);
		hashMap.put("나", 50);
		hashMap.put("가", 60);
		System.out.println(hashMap);
		
		
		//2. Hashtable : 입력 순서와 출력 순서가 다르다. <동기화 되어 있다><멀티쓰레드 환경>
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("다", 30);
		hashTable.put("마", 40);
		hashTable.put("나", 50);
		hashTable.put("가", 60);
		System.out.println(hashTable);
		
		
		//3. LinkedHashMap : 입력 순서와 출력 순서가 같다.
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("다", 30);
		linkedHashMap.put("마", 40);
		linkedHashMap.put("나", 50);
		linkedHashMap.put("가", 60);
		System.out.println(linkedHashMap);
		
		
		
		//4. TreeMap : key를 기준으로 오름차순 정렬 되어서 출력
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("다", 30);
		treeMap.put("마", 40);
		treeMap.put("나", 50);
		treeMap.put("가", 60);
		System.out.println(treeMap);
		
	}

}
