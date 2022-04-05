package chap17.Ex10;

//Map<K,V>: Key, Value �������� �����͸� ����
	//Key�� �ߺ��� �� ����. <= Set���� ����. Key�� ���� ���� �� �ֱ� ������ index�ʹ� �ٸ���.
	//Value�� �ߺ��� ���� ���� �� �ִ�.

	//HashTable: ����� �����ϰ� ���. ���� ������ ȯ�濡 ����. ��� �޼ҵ尡 ����ȭ �Ǿ� ���� �ʴ�.
	//Hashtable: ��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�. ��Ƽ������ ȯ�濡 �����ϴ�.
			//��� �޼ҵ�� HashTable�� ����
	
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableMethod {

	public static void main(String[] args) {
		
		Map<Integer, String> hTable1 = new Hashtable<Integer,String>();
		
		//1. put(K key, V value): ���� ���� ��
		System.out.println("=====1. put=====");
		hTable1.put(2, "���ٶ�");
		hTable1.put(1, "������");
		hTable1.put(3, "�ٶ�");
		hTable1.put(3, "������");		//�ߺ��� Ű�� ���� ���� ��� ���� ���� ���� 
		System.out.println(hTable1);
		
		
		//2. putAll(�ٸ� �� ��ü) : �ٸ� ���� �����Ͽ� ���
		System.out.println();
		System.out.println("=====2. putAll=====");
		Map<Integer, String> hTable2 = new Hashtable<Integer, String>();
		hTable2.putAll(hTable1);
		System.out.println(hTable2);
		
		
		//3. replace(K key, V value) : key�� ����Ǿ� �ִ� ���� value�� ����
		System.out.println();
		System.out.println("=====3. replace=====");
		hTable2.replace(1, "������");
		hTable2.replace(4, "����");	//key 4�� �������� �ʱ� ������ �۵����� �ʴ´�. ���ܹ߻��� �ƴ�
		System.out.println(hTable2);
		
		
		//4. replace(K key, V oldValue, V newValue) : oldValue�� newValue�� ����
		System.out.println();
		System.out.println("=====4. replace=====");
		hTable2.replace(1, "������", "������");
		hTable2.replace(2, "�ٴٴ�", "����");	//key�� value�� ��Ȯ�� ��ġ�ؾ� �����ȴ�.
		System.out.println(hTable2);
		
		
		
		//5. get(Object key) : Map�� ���� ������ ��, Key�� �־���� Key�� �Ҵ�� Value�� ���
		System.out.println();
		System.out.println("=====5. get=====");
		System.out.println(hTable2.get(1));	//1�� �ε����� �ƴ϶� key
		System.out.println(hTable2.get(2));	
		System.out.println(hTable2.get(3));	
		
		
		//6. containsKey(Object key) : �ʿ� �ش� Ű�� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====6. containsKey=====");
		System.out.println(hTable1.containsKey(1));	//true
		System.out.println(hTable1.containsKey(5));	//false
		
		
		
		//7. containsValue(Object value) : �ʿ� �ش� ���� �����ϴ��� Ȯ��, true, false
		System.out.println();
		System.out.println("=====7. containsValue=====");
		System.out.println(hTable2.containsValue("������"));		//t
		System.out.println(hTable2.containsValue("�ٴٴ�"));		//f
		System.out.println(hTable2.containsValue("������"));		//f
		
		
		//8. Set<K> keySet() : Ű�� ����
		System.out.println();
		System.out.println("=====8. keySet=====");
		Set<Integer> keySet = hTable2.keySet();		//hTable2�� ����� keySet�� ����
		System.out.println(keySet);
		
		
		//9. Set<Map.Entry<K,V>> entrySet() : Ű�� ���� ��(Set)�� ���� 
		System.out.println();
		System.out.println("=====9. entrySet=====");
		Set<Map.Entry<Integer, String>> entrySet = hTable2.entrySet();
		System.out.println(entrySet);
		
		
		//10. size() : �� ����
		System.out.println();
		System.out.println("=====10. size=====");
		System.out.println(hTable2.size());		//3
		
		//11. remove(Object key) : Ű�� �־ value�� ����
		System.out.println();
		System.out.println("=====11. remove=====");
		hTable2.remove(1);		//1�� ����
		hTable2.remove(4);		//�������� ����
		System.out.println(hTable2);
	
		
		//12. remove(Object key, Object value) : key�� value�� ��Ȯ�ϰ� ��ġ�� �� ����
		System.out.println();
		System.out.println("=====12. remove=====");
		hTable2.remove(2,"���ٶ�");	//����
		hTable2.remove(3,"�ٴٴ�");	//���� ����.
		System.out.println(hTable2);
		
		
		//13. clear() : ��� ����
		System.out.println();
		System.out.println("=====13. clear=====");
		hTable2.clear();
		System.out.println(hTable2);
		
		
	}

}
