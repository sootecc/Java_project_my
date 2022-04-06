package chap17.Ex12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map<K,V> ���� : K(Key)�� �ߺ��� �� ����.  Value�� �ߺ� ����

	//1. HashMap		: Key�� �������� �����ϰ� ��µȴ�. �޼ҵ� ����ȭ(Synchronized)�� �ȵ�. �̱۾����� ȯ�濡 ���
	//2. Hashtable		: ��� �޼ҵ尡 ����ȭ �Ǿ��ִ�. ��Ƽ������ ȯ�濡�� ����.
	//3. LinkedHashMap	: �Է��� ������� ��µȴ�.
	//4. TreeMap		: �������� ���ĵǾ� �Է�, Comparable<E>, Comparator<E> �� ������ �Ǿ� �־�� �Ѵ�.


public class MapSummary {

	public static void main(String[] args) {

		//1. HashMap: �Է� ������ ��� ������ �ٸ���.
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("��", 30);
		hashMap.put("��", 40);
		hashMap.put("��", 50);
		hashMap.put("��", 60);
		System.out.println(hashMap);
		
		
		//2. Hashtable : �Է� ������ ��� ������ �ٸ���. <����ȭ �Ǿ� �ִ�><��Ƽ������ ȯ��>
		Map<String, Integer> hashTable = new Hashtable<>();
		hashTable.put("��", 30);
		hashTable.put("��", 40);
		hashTable.put("��", 50);
		hashTable.put("��", 60);
		System.out.println(hashTable);
		
		
		//3. LinkedHashMap : �Է� ������ ��� ������ ����.
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("��", 30);
		linkedHashMap.put("��", 40);
		linkedHashMap.put("��", 50);
		linkedHashMap.put("��", 60);
		System.out.println(linkedHashMap);
		
		
		
		//4. TreeMap : key�� �������� �������� ���� �Ǿ ���
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("��", 30);
		treeMap.put("��", 40);
		treeMap.put("��", 50);
		treeMap.put("��", 60);
		System.out.println(treeMap);
		
	}

}
