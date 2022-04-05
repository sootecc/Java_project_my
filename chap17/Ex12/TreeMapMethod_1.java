package chap17.Ex12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : 저장시에 Key를 기준으로 오름차순 정렬되어 저장됨
	//출력시에 오름차순 정렬되어 출력된다.
	//Key에 일반 객체를 저장할 때 Comparable<E> compareTo() 재정의 <==객체 수정 및 재컴파일 
						// Comparator<E> compare() 재정의	<== 객체 수정 없이 사용

//Map<K,V>    			^	-상속-
//SortedMap<K,V>		|	정렬 메소드 정의
//NavigableMap<K,V>		|	검색 메소드 정의
//TreeMap<K,V>			|	TreeMap 타입으로 사용해야 검색, 정렬의 메소드를 사용할 수 있다.


public class TreeMapMethod_1 {
	public static void main(String[] args) {
		
		//TreeMap<K,V>은 Map<K,V> 메소드를 모두 사용
		//추가적으로 SortedMap, NavigableMap의 추가적인 메소드를 사용
		
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();		//오름차순으로 정렬되어 입력됨.
		
		for(int i =20;i>0;i-=2) {
			treeMap.put(i, i+" 번째 데이터");
		}
		System.out.println(treeMap); 	//Key, Value : Key를 기준으로 오름차순 정렬됨.
		
		
		//0-1. firstKey(): 첫 번째 값을 출력
		System.out.println("\n=====0-1. firstKey()=====");
		System.out.println(treeMap.firstKey());		//2
		
		
		//0-2. firstEntry() : entry = Key + Value 쌍
		System.out.println("\n=====0-2. firstEntry()=====");
		System.out.println(treeMap.firstEntry());
		
		
		//0-3. lastKey() : 마지막 키
		System.out.println("\n=====0-3. lastKey()=====");
		System.out.println(treeMap.lastKey());
		
		//0-4. lastEntry() : 마지막 Key + Value
		System.out.println("\n=====0-4. lastEntry()=====");
		System.out.println(treeMap.lastEntry());
		
		//0-5. lowerKey() : 입력 받은 Key보다 낮은 키 				
		System.out.println("\n=====0-5. lowerKey()=====");
		System.out.println(treeMap.lowerKey(10));	//8
		
		//0-6. higherKey() : 입력 받은 Key보다 높은 키 
		System.out.println("\n=====0-6. higherKey()=====");
		System.out.println(treeMap.higherKey(10));	//12
			
		
		//0-7. pollFirstEntry() : 첫 번째 키와 값을 꺼낸다.
		System.out.println("\n=====0-7. pollFirstEntry()=====");
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//0-8. pollLastEntry() : 마지막 번째 키와 값을 꺼내온다.
		System.out.println("\n=====0-8. pollLastEntry()=====");
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		//0-9. SortedMap<K,V> headMap(K toKey): 인풋 받은 키의 head쪽으로 처리
		System.out.println("\n=====0-9. SortedMap<K,V> headMap(K toKey)=====");
		SortedMap<Integer,String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
				
		//0-10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		System.out.println("\n=====0-10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)=====");
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);		//key 8 을 포함하면서 Head쪽으로 출력		boolean이 있냐 없냐
		System.out.println(nMap);
		
		
		//0-11. SortedMap<K,V> tailMap (K toKey)
		System.out.println("\n=====0-11. SortedMap<K,V> tailMap (K toKey)=====");
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		
		//0-12. NavigableMap<K,V> tailMap (K toKey, boolean inclusive)
		System.out.println("\n=====0-12. NavigableMap<K,V> tailMap (K toKey, boolean inclusive)=====");		
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);		//시작은 포함이 기본, 끝은 미포함이 기본
		System.out.println(nMap2);
		
		
		//0-13. SortedMap<K,V> subMap(K fromKey, K toKey) : 특정 범위의 값을 저장
		System.out.println("\n=====0-13. SortedMap<K,V> subMap(K formKey, K toKey)=====");		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);		//시작은 포함, 끝은 미포함이 기본
		System.out.println(subMap);
		
		//0-14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		System.out.println("\n=====0-14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)=====");
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		
		//0-15. NavigableSet<K> descendingKeySet(): 현재 키 정렬을 반대로 출력
		System.out.println("\n=====0-15. NavigableSet<K> descendingKeySet()=====");
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		//0-16. NavigableMap<K,V> descendingMap(): 현재 정렬을 반대로 정렬
		System.out.println("\n=====0-16. NavigableMap<K,V> descendingMap()=====");
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
		
				
		
		
		TreeMap<Integer,String> treeMap1 = new TreeMap<Integer,String>();
		
		//1. put(K key, V value): 값을 넣을 때
		System.out.println();
		System.out.println("=====1. put=====");
		treeMap1.put(2, "나다라");
		treeMap1.put(1, "가나다");
		treeMap1.put(3, "다라마");
		treeMap1.put(3, "가가가");		//중복된 키에 값을 넣을 경우 기존 값이 수정 
		System.out.println(treeMap1);
		
		
		//2. putAll(다른 맵 객체) : 다른 맵을 복사하여 사용
		System.out.println();
		System.out.println("=====2. putAll=====");
		Map<Integer, String> treeMap2 = new LinkedHashMap<Integer, String>();
		treeMap2.putAll(treeMap1);
		System.out.println(treeMap2);
		
		
		//3. replace(K key, V value) : key에 저장되어 있던 값을 value로 수정
		System.out.println();
		System.out.println("=====3. replace=====");
		treeMap2.replace(1, "가가가");
		treeMap2.replace(4, "라라라");	//key 4는 존재하지 않기 때문에 작동되지 않는다. 예외발생은 아님
		System.out.println(treeMap2);
		
		
		//4. replace(K key, V oldValue, V newValue) : oldValue를 newValue로 수정
		System.out.println();
		System.out.println("=====4. replace=====");
		treeMap2.replace(1, "가가가", "나나나");
		treeMap2.replace(2, "다다다", "라라라");	//key와 value가 정확히 일치해야 수정된다.
		System.out.println(treeMap2);
		
		
		
		//5. get(Object key) : Map의 값을 가져올 때, Key를 넣어줘야 Key에 할당된 Value를 출력
		System.out.println();
		System.out.println("=====5. get=====");
		System.out.println(treeMap2.get(1));	//1은 인덱스가 아니라 key
		System.out.println(treeMap2.get(2));	
		System.out.println(treeMap2.get(3));	
		
		
		//6. containsKey(Object key) : 맵에 해당 키가 존재하는지 확인, true, false
		System.out.println();
		System.out.println("=====6. containsKey=====");
		System.out.println(treeMap1.containsKey(1));	//true
		System.out.println(treeMap1.containsKey(5));	//false
		
		
		
		//7. containsValue(Object value) : 맵에 해당 값이 존재하는지 확인, true, false
		System.out.println();
		System.out.println("=====7. containsValue=====");
		System.out.println(treeMap2.containsValue("나나나"));		//t
		System.out.println(treeMap2.containsValue("다다다"));		//f
		System.out.println(treeMap2.containsValue("하하하"));		//f
		
		
		//8. Set<K> keySet() : 키만 추출
		System.out.println();
		System.out.println("=====8. keySet=====");
		Set<Integer> keySet = treeMap2.keySet();		//treeMap2의 저장된 keySet을 추출
		System.out.println(keySet);
		
		
		//9. Set<Map.Entry<K,V>> entrySet() : 키와 값의 셋(Set)을 추출 
		System.out.println();
		System.out.println("=====9. entrySet=====");
		Set<Map.Entry<Integer, String>> entrySet = treeMap2.entrySet();
		System.out.println(entrySet);
		
		
		//10. size() : 총 개수
		System.out.println();
		System.out.println("=====10. size=====");
		System.out.println(treeMap2.size());		//3
		
		//11. remove(Object key) : 키를 넣어서 value를 삭제
		System.out.println();
		System.out.println("=====11. remove=====");
		treeMap2.remove(1);		//1번 삭제
		treeMap2.remove(4);		//동작하지 않음
		System.out.println(treeMap2);
	
		
		//12. remove(Object key, Object value) : key와 value가 정확하게 일치할 때 삭제
		System.out.println();
		System.out.println("=====12. remove=====");
		treeMap2.remove(2,"나다라");	//삭제
		treeMap2.remove(3,"다다다");	//동작 안함.
		System.out.println(treeMap2);
		
		
		//13. clear() : 모두 삭제
		System.out.println();
		System.out.println("=====13. clear=====");
		treeMap2.clear();
		System.out.println(treeMap2);
		
		
	}

}
