package chap17.Ex09;

//Map<K,V>: Key, Value �������� �����͸� ����
	//Key�� �ߺ��� �� ����. <= Set���� ����. Key�� ���� ���� �� �ֱ� ������ index�ʹ� �ٸ���.
	//Value�� �ߺ��� ���� ���� �� �ִ�.

	//HashMap: ����� �����ϰ� ���.


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap1 = new HashMap<Integer,String>();
		
		//1. put(K key, V value): ���� ���� ��
		System.out.println("=====1. put=====");
		hMap1.put(2, "���ٶ�");
		hMap1.put(1, "������");
		hMap1.put(3, "�ٶ�");
		hMap1.put(3, "������");		//�ߺ��� Ű�� ���� ���� ��� ���� ���� ���� 
		System.out.println(hMap1);
		
		
		//2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����Ͽ� ���
		System.out.println();
		System.out.println("=====2. putAll=====");
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2);
		
		
		//3. replace(K key, V value) : key�� ����Ǿ� �ִ� ���� value�� ����
		System.out.println();
		System.out.println("=====3. replace=====");
		hMap2.replace(1, "������");
		hMap2.replace(4, "����");	//key 4�� �������� �ʱ� ������ �۵����� �ʴ´�. ���ܹ߻��� �ƴ�
		System.out.println(hMap2);
		
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ����
		System.out.println();
		System.out.println("=====4. replace=====");
		hMap2.replace(1, "������", "������");
		hMap2.replace(2, "�ٴٴ�", "����");	//key�� value�� ��Ȯ�� ��ġ�ؾ� �����ȴ�.
		System.out.println(hMap2);
		
		
		
		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println();
		System.out.println("=====5. get=====");
		System.out.println(hMap2.get(1));	//1�� �ε����� �ƴ϶� key
		System.out.println(hMap2.get(2));	
		System.out.println(hMap2.get(3));	
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====6. containsKey=====");
		System.out.println(hMap1.containsKey(1));	//true
		System.out.println(hMap1.containsKey(5));	//false
		
		
		
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====7. containsValue=====");
		System.out.println(hMap2.containsValue("������"));		//t
		System.out.println(hMap2.containsValue("�ٴٴ�"));		//f
		System.out.println(hMap2.containsValue("������"));		//f
		
		
		//8. Set<K> keySet() : Ű�� ����
		System.out.println();
		System.out.println("=====8. keySet=====");
		Set<Integer> keySet = hMap2.keySet();		//hMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ���� 
		System.out.println();
		System.out.println("=====9. entrySet=====");
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		
		
		//10. size() : �� ����
		System.out.println();
		System.out.println("=====10. size=====");
		System.out.println(hMap2.size());		//3
		
		//11. remove(Object key) : Ű�� �־ value�� ����
		System.out.println();
		System.out.println("=====11. remove=====");
		hMap2.remove(1);		//1�� ����
		hMap2.remove(4);		//�������� ����
		System.out.println(hMap2);
	
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		System.out.println();
		System.out.println("=====12. remove=====");
		hMap2.remove(2,"���ٶ�");	//����
		hMap2.remove(3,"�ٴٴ�");	//���� ����.
		System.out.println(hMap2);
		
		
		//13. clear() : ��� ����
		System.out.println();
		System.out.println("=====13. clear=====");
		hMap2.clear();
		System.out.println(hMap2);
		
		
	}

}
