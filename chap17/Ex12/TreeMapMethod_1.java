package chap17.Ex12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : ����ÿ� Key�� �������� �������� ���ĵǾ� �����
	//��½ÿ� �������� ���ĵǾ� ��µȴ�.
	//Key�� �Ϲ� ��ü�� ������ �� Comparable<E> compareTo() ������ <==��ü ���� �� �������� 
						// Comparator<E> compare() ������	<== ��ü ���� ���� ���

//Map<K,V>    			^	-���-
//SortedMap<K,V>		|	���� �޼ҵ� ����
//NavigableMap<K,V>		|	�˻� �޼ҵ� ����
//TreeMap<K,V>			|	TreeMap Ÿ������ ����ؾ� �˻�, ������ �޼ҵ带 ����� �� �ִ�.


public class TreeMapMethod_1 {
	public static void main(String[] args) {
		
		//TreeMap<K,V>�� Map<K,V> �޼ҵ带 ��� ���
		//�߰������� SortedMap, NavigableMap�� �߰����� �޼ҵ带 ���
		
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();		//������������ ���ĵǾ� �Էµ�.
		
		for(int i =20;i>0;i-=2) {
			treeMap.put(i, i+" ��° ������");
		}
		System.out.println(treeMap); 	//Key, Value : Key�� �������� �������� ���ĵ�.
		
		
		//0-1. firstKey(): ù ��° ���� ���
		System.out.println("\n=====0-1. firstKey()=====");
		System.out.println(treeMap.firstKey());		//2
		
		
		//0-2. firstEntry() : entry = Key + Value ��
		System.out.println("\n=====0-2. firstEntry()=====");
		System.out.println(treeMap.firstEntry());
		
		
		//0-3. lastKey() : ������ Ű
		System.out.println("\n=====0-3. lastKey()=====");
		System.out.println(treeMap.lastKey());
		
		//0-4. lastEntry() : ������ Key + Value
		System.out.println("\n=====0-4. lastEntry()=====");
		System.out.println(treeMap.lastEntry());
		
		//0-5. lowerKey() : �Է� ���� Key���� ���� Ű 				
		System.out.println("\n=====0-5. lowerKey()=====");
		System.out.println(treeMap.lowerKey(10));	//8
		
		//0-6. higherKey() : �Է� ���� Key���� ���� Ű 
		System.out.println("\n=====0-6. higherKey()=====");
		System.out.println(treeMap.higherKey(10));	//12
			
		
		//0-7. pollFirstEntry() : ù ��° Ű�� ���� ������.
		System.out.println("\n=====0-7. pollFirstEntry()=====");
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//0-8. pollLastEntry() : ������ ��° Ű�� ���� �����´�.
		System.out.println("\n=====0-8. pollLastEntry()=====");
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
		
		//0-9. SortedMap<K,V> headMap(K toKey): ��ǲ ���� Ű�� head������ ó��
		System.out.println("\n=====0-9. SortedMap<K,V> headMap(K toKey)=====");
		SortedMap<Integer,String> sMap = treeMap.headMap(8);
		System.out.println(sMap);
				
		//0-10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		System.out.println("\n=====0-10. NavigableMap<K,V> headMap(K toKey, boolean inclusive)=====");
		NavigableMap<Integer, String> nMap = treeMap.headMap(8, true);		//key 8 �� �����ϸ鼭 Head������ ���		boolean�� �ֳ� ����
		System.out.println(nMap);
		
		
		//0-11. SortedMap<K,V> tailMap (K toKey)
		System.out.println("\n=====0-11. SortedMap<K,V> tailMap (K toKey)=====");
		SortedMap<Integer, String> sMap2 = treeMap.tailMap(14);
		System.out.println(sMap2);
		
		
		//0-12. NavigableMap<K,V> tailMap (K toKey, boolean inclusive)
		System.out.println("\n=====0-12. NavigableMap<K,V> tailMap (K toKey, boolean inclusive)=====");		
		NavigableMap<Integer,String> nMap2 = treeMap.tailMap(14, false);		//������ ������ �⺻, ���� �������� �⺻
		System.out.println(nMap2);
		
		
		//0-13. SortedMap<K,V> subMap(K fromKey, K toKey) : Ư�� ������ ���� ����
		System.out.println("\n=====0-13. SortedMap<K,V> subMap(K formKey, K toKey)=====");		
		SortedMap<Integer,String> subMap = treeMap.subMap(6, 10);		//������ ����, ���� �������� �⺻
		System.out.println(subMap);
		
		//0-14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		System.out.println("\n=====0-14. NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)=====");
		NavigableMap<Integer, String> nSubMap = treeMap.subMap(6, true, 10, true);
		System.out.println(nSubMap);
		
		
		//0-15. NavigableSet<K> descendingKeySet(): ���� Ű ������ �ݴ�� ���
		System.out.println("\n=====0-15. NavigableSet<K> descendingKeySet()=====");
		NavigableSet<Integer> nSet = treeMap.descendingKeySet();
		System.out.println(nSet);
		System.out.println(nSet.descendingSet());
		
		//0-16. NavigableMap<K,V> descendingMap(): ���� ������ �ݴ�� ����
		System.out.println("\n=====0-16. NavigableMap<K,V> descendingMap()=====");
		NavigableMap<Integer, String> nvMap = treeMap.descendingMap();
		System.out.println(nvMap);
		System.out.println(nvMap.descendingMap());
		
				
		
		
		TreeMap<Integer,String> treeMap1 = new TreeMap<Integer,String>();
		
		//1. put(K key, V value): ���� ���� ��
		System.out.println();
		System.out.println("=====1. put=====");
		treeMap1.put(2, "���ٶ�");
		treeMap1.put(1, "������");
		treeMap1.put(3, "�ٶ�");
		treeMap1.put(3, "������");		//�ߺ��� Ű�� ���� ���� ��� ���� ���� ���� 
		System.out.println(treeMap1);
		
		
		//2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����Ͽ� ���
		System.out.println();
		System.out.println("=====2. putAll=====");
		Map<Integer, String> treeMap2 = new LinkedHashMap<Integer, String>();
		treeMap2.putAll(treeMap1);
		System.out.println(treeMap2);
		
		
		//3. replace(K key, V value) : key�� ����Ǿ� �ִ� ���� value�� ����
		System.out.println();
		System.out.println("=====3. replace=====");
		treeMap2.replace(1, "������");
		treeMap2.replace(4, "����");	//key 4�� �������� �ʱ� ������ �۵����� �ʴ´�. ���ܹ߻��� �ƴ�
		System.out.println(treeMap2);
		
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ����
		System.out.println();
		System.out.println("=====4. replace=====");
		treeMap2.replace(1, "������", "������");
		treeMap2.replace(2, "�ٴٴ�", "����");	//key�� value�� ��Ȯ�� ��ġ�ؾ� �����ȴ�.
		System.out.println(treeMap2);
		
		
		
		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println();
		System.out.println("=====5. get=====");
		System.out.println(treeMap2.get(1));	//1�� �ε����� �ƴ϶� key
		System.out.println(treeMap2.get(2));	
		System.out.println(treeMap2.get(3));	
		
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====6. containsKey=====");
		System.out.println(treeMap1.containsKey(1));	//true
		System.out.println(treeMap1.containsKey(5));	//false
		
		
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====7. containsValue=====");
		System.out.println(treeMap2.containsValue("������"));		//t
		System.out.println(treeMap2.containsValue("�ٴٴ�"));		//f
		System.out.println(treeMap2.containsValue("������"));		//f
		
		
		//8. Set<K> keySet() : Ű�� ����
		System.out.println();
		System.out.println("=====8. keySet=====");
		Set<Integer> keySet = treeMap2.keySet();		//treeMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ���� 
		System.out.println();
		System.out.println("=====9. entrySet=====");
		Set<Map.Entry<Integer, String>> entrySet = treeMap2.entrySet();
		System.out.println(entrySet);
		
		
		//10. size() : �� ����
		System.out.println();
		System.out.println("=====10. size=====");
		System.out.println(treeMap2.size());		//3
		
		//11. remove(Object key) : Ű�� �־ value�� ����
		System.out.println();
		System.out.println("=====11. remove=====");
		treeMap2.remove(1);		//1�� ����
		treeMap2.remove(4);		//�������� ����
		System.out.println(treeMap2);
	
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		System.out.println();
		System.out.println("=====12. remove=====");
		treeMap2.remove(2,"���ٶ�");	//����
		treeMap2.remove(3,"�ٴٴ�");	//���� ����.
		System.out.println(treeMap2);
		
		
		//13. clear() : ��� ����
		System.out.println();
		System.out.println("=====13. clear=====");
		treeMap2.clear();
		System.out.println(treeMap2);
		
		
	}

}
