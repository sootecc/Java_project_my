package chap17.Ex06;
/*
	Set<E>: �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	
	- HashSet		: �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
	- LinkedHashSet	: �ߺ��� ���� ���� �� ����. ��½� ������� ���.
	- TreeSet		: ����� �� ���� ���ĵǾ� ����. ��µ� ���ĵǾ� ���. ascending(�������� ���ĵǾ� �����) 0 -> 9, a -> z, �� ->�� 

	
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {

	public static void main(String[] args) {

		Set<String> hSet1 = new HashSet();		//Set�� Interface�̹Ƿ� Ÿ�����θ� ����
		
		
		//1. add(E element) : Set�� ���� �߰�
		System.out.println("=====1=====");
		hSet1.add("��");
		hSet1.add("��");
		hSet1.add("��");
		System.out.println(hSet1);					//�ߺ� ���� �Ұ� 
		System.out.println(hSet1.toString());		//toString �޼ҵ尡 ������ �� �ִ�.
		
		
		//2. addAll(�ٸ� Set ��ü) : �ڽ��� Set�� �ٸ� Set�� ���� �߰�, �ߺ��� ���� ���ŵǾ� ��
		System.out.println("=====2=====");
		Set<String> hSet2 = new HashSet();
		hSet2.add("��");
		hSet2.add("��");
		hSet2.addAll(hSet1);
		System.out.println(hSet2);
		
		
		//3. remove(Object o) : ������ ����, (List�� ��� �� ��ȣ�� ����)
		System.out.println("=====3=====");
		hSet2.remove("��");
		System.out.println(hSet2);
		
		
		//4. clear() : ��� ����
		System.out.println("=====4=====");
		hSet2.clear();
		
		
		//5. isEmpty() : ��������� true, �׷��� ������ false
		System.out.println("=====5=====");
		System.out.println(hSet2.isEmpty());
		
		
		//6. contains(Object o) : ���� Set�� �����ϸ� true, �׷��� ������ false
		System.out.println("=====6=====");
		Set<String> hSet3 = new HashSet();
		hSet3.add("��");
		hSet3.add("��");
		hSet3.add("��");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("��"));	//true
		System.out.println(hSet3.contains("��"));	//false
		
		
		//7. size() : Set�� ���Ե� ���� ����
		System.out.println("\n=====7=====");
		System.out.println(hSet3.size());
		
		
		//8. iterator() : Set�� index�� ������ �ʴ´�. for���� �� ��ȣ�� ���� ���, enhanced for���� ��� ����
					// ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ���
					// hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
					// next() : ���� ���� ����ϰ� ���� ������ �̵�
		
		System.out.println("\n=====8=====");
		Iterator<String> iterator = hSet3.iterator();
			//Ŭ����<E> ������ü = Set��ü.iterator(); 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +" ");
		}
		System.out.println();
		
		
		
		for(String k : hSet3) {
			System.out.print(k+" ");
		}
		
		
		//9. toArray() : Set�� ������ �迭�� ������. Object Ÿ������ ����, �ٿ�ĳ������ �ʿ���.
		System.out.println("\n=====9=====");
		Object[] objArray = hSet3.toArray();
		System.out.println(Arrays.toString(objArray));
		
		for(int i = 0; i< objArray.length;i++) {
			System.out.print(objArray[i]+ " ");
		}
		System.out.println();
		for(Object k : objArray) {
			System.out.print(k+ " ");
		}
		
		
		//10. toArray(T[] t) : �ٿ�ĳ������ �� �� ���
		System.out.println("\n=====10=====");
		String[] strArray1 = hSet3.toArray(new String[0]);		//0: ���� ũ�� ����
																//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ �������ش�.
		System.out.println(Arrays.toString(strArray1));
	

		//11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� null�� �� �� �ִ�. ĳ���� �ؾ���. Set�� null�� �ߺ� �Ұ�
		System.out.println("\n=====11=====");
		String[] strArray2= hSet3.toArray(new String[5]);		//���� ���� ������ null
		System.out.println(Arrays.toString(strArray2));
		
		
		
		//12. Q
		Set<Integer> intSet1 = new HashSet();
		intSet1.add(30);
		intSet1.add(50);
		intSet1.add(100);
		intSet1.add(10);		
		
		Iterator<Integer> it = intSet1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		for(int k : intSet1 ) {
			System.out.print(k+ " ");
		}
		
	}

}
