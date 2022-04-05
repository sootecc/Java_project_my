package chap17.Ex11;

//Map<K,V>	: Key�� �ߺ� ���� �ʴ´�.	<= Set���� �����ȴ�. 

//HashMap vs LinkedHashMap
	//HashMap<K,V>	: �Է°� ����� �ٸ� �� �ִ�. ����� �����ϰ� ���. 
	//LinkedHashMap<K,V> : Key�� ��ũ �Ǿ� �ִ�. ���� ���� ���� �� ������ ������.
		//�Է� ������� ��µȴ�.



import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer,String>();
		
		//1. put(K key, V value): ���� ���� ��
		System.out.println("=====1. put=====");
		lhMap1.put(2, "���ٶ�");
		lhMap1.put(1, "������");
		lhMap1.put(3, "�ٶ�");
		lhMap1.put(3, "������");		//�ߺ��� Ű�� ���� ���� ��� ���� ���� ���� 
		System.out.println(lhMap1);
		
		
		//2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����Ͽ� ���
		System.out.println();
		System.out.println("=====2. putAll=====");
		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
		lhMap2.putAll(lhMap1);
		System.out.println(lhMap2);
		
		
		//3. replace(K key, V value) : key�� ����Ǿ� �ִ� ���� value�� ����
		System.out.println();
		System.out.println("=====3. replace=====");
		lhMap2.replace(1, "������");
		lhMap2.replace(4, "����");	//key 4�� �������� �ʱ� ������ �۵����� �ʴ´�. ���ܹ߻��� �ƴ�
		System.out.println(lhMap2);
		
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ����
		System.out.println();
		System.out.println("=====4. replace=====");
		lhMap2.replace(1, "������", "������");
		lhMap2.replace(2, "�ٴٴ�", "����");	//key�� value�� ��Ȯ�� ��ġ�ؾ� �����ȴ�.
		System.out.println(lhMap2);
		
		
		
		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println();
		System.out.println("=====5. get=====");
		System.out.println(lhMap2.get(1));	//1�� �ε����� �ƴ϶� key
		System.out.println(lhMap2.get(2));	
		System.out.println(lhMap2.get(3));	
		
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====6. containsKey=====");
		System.out.println(lhMap1.containsKey(1));	//true
		System.out.println(lhMap1.containsKey(5));	//false
		
		
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====7. containsValue=====");
		System.out.println(lhMap2.containsValue("������"));		//t
		System.out.println(lhMap2.containsValue("�ٴٴ�"));		//f
		System.out.println(lhMap2.containsValue("������"));		//f
		
		
		//8. Set<K> keySet() : Ű�� ����
		System.out.println();
		System.out.println("=====8. keySet=====");
		Set<Integer> keySet = lhMap2.keySet();		//lhMap2�� ����� keySet�� ����
		System.out.println(keySet);
		
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ���� 
		System.out.println();
		System.out.println("=====9. entrySet=====");
		Set<Map.Entry<Integer, String>> entrySet = lhMap2.entrySet();
		System.out.println(entrySet);
		
		
		//10. size() : �� ����
		System.out.println();
		System.out.println("=====10. size=====");
		System.out.println(lhMap2.size());		//3
		
		//11. remove(Object key) : Ű�� �־ value�� ����
		System.out.println();
		System.out.println("=====11. remove=====");
		lhMap2.remove(1);		//1�� ����
		lhMap2.remove(4);		//�������� ����
		System.out.println(lhMap2);
	
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		System.out.println();
		System.out.println("=====12. remove=====");
		lhMap2.remove(2,"���ٶ�");	//����
		lhMap2.remove(3,"�ٴٴ�");	//���� ����.
		System.out.println(lhMap2);
		
		
		//13. clear() : ��� ����
		System.out.println();
		System.out.println("=====13. clear=====");
		lhMap2.clear();
		System.out.println(lhMap2);
		
		
	}

}
