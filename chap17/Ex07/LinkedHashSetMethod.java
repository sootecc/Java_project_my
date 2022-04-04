package chap17.Ex07;
/*
	Set<E>: �������̽�, ���ȣ(index)�� ����. �ߺ��� ���� ���� �� ����.
	
	- LinkedHaslinkedSet		: �ߺ��� ���� ���� �� ����. ���� ������ ������� �������� �ʴ´�.
	- LinkedLinkedHaslinkedSet	: �ߺ��� ���� ���� �� ����. ��½� ������� ���.
	- TreeSet		: ����� �� ���� ���ĵǾ� ����. ��µ� ���ĵǾ� ���. ascending(�������� ���ĵǾ� �����) 0 -> 9, a -> z, �� ->�� 

	
*/

/*
 	LinkedLinkedHaslinkedSet: ���� ������ �� �յ� ���� ��ġ ������ ���� �ִ�.
 	
 		LinkedHaslinkedSet�� ������: ��� �޼ҵ尡 �����ϴ�. �ߺ��� ���� �������� �ʴ´�. index ���� ������ �ʴ´�.
 						//�⺻ for������ ����� �� ����. iterator, enhanced for������ ����ؾ� �Ѵ�.
 		LinkedHaslinkedSet�� ������:	LinkedHaslinkedSet�� �Է´�� ��µ��� �ʴ´�. LinkedLinkedHaslinkedSet�� �Է��� ������� ��µȴ�.
 						
 	
 */


//����Ű ���� Ȯ�� : Ctrl + Shift + L


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {

	public static void main(String[] args) {

		Set<String> linkedSet1 = new LinkedHashSet();		//Set�� Interface�̹Ƿ� Ÿ�����θ� ����
			//Set�� ���׸� Ÿ�Ժ����� wrapper Ŭ������ ����� ���, equals(), hashCode() �޼ҵ尡 ������, toString() ������
		
		//1. add(E element) : Set�� ���� �߰�
		System.out.println("=====1=====");
		linkedSet1.add("��");
		linkedSet1.add("��");
		linkedSet1.add("��");
		System.out.println(linkedSet1);					//�ߺ� ���� �Ұ� 
		System.out.println(linkedSet1.toString());		//toString �޼ҵ尡 ������ �� �ִ�.
		
		
		//2. addAll(�ٸ� Set ��ü) : �ڽ��� Set�� �ٸ� Set�� ���� �߰�, �ߺ��� ���� ���ŵǾ� ��
		System.out.println("=====2=====");
		Set<String> linkedSet2 = new LinkedHashSet();
		linkedSet2.add("��");
		linkedSet2.add("��");
		linkedSet2.addAll(linkedSet1);
		System.out.println(linkedSet2);
		
		
		//3. remove(Object o) : ������ ����, (List�� ��� �� ��ȣ�� ����)
		System.out.println("=====3=====");
		linkedSet2.remove("��");
		System.out.println(linkedSet2);
		
		
		//4. clear() : ��� ����
		System.out.println("=====4=====");
		linkedSet2.clear();
		
		
		//5. isEmpty() : ��������� true, �׷��� ������ false
		System.out.println("=====5=====");
		System.out.println(linkedSet2.isEmpty());
		
		
		//6. contains(Object o) : ���� Set�� �����ϸ� true, �׷��� ������ false
		System.out.println("=====6=====");
		Set<String> linkedSet3 = new LinkedHashSet();
		linkedSet3.add("��");
		linkedSet3.add("��");
		linkedSet3.add("��");
		System.out.println(linkedSet3);		//�Է°� ��� ������ ����
		System.out.println(linkedSet3.contains("��"));	//true
		System.out.println(linkedSet3.contains("��"));	//false
		
		
		//7. size() : Set�� ���Ե� ���� ����
		System.out.println("\n=====7=====");
		System.out.println(linkedSet3.size());
		
		
		//8. iterator() : Set�� index�� ������ �ʴ´�. for���� �� ��ȣ�� ���� ���, enhanced for���� ��� ����
					// ��ȸ��, Set�� ������ ��ȸ�ϸ鼭 ���
					// hasNext() : Set�� ���� �����ϸ� true, �������� ������ false
					// next() : ���� ���� ����ϰ� ���� ������ �̵�
		
		System.out.println("\n=====8=====");
		Iterator<String> iterator = linkedSet3.iterator();
			//Ŭ����<E> ������ü = Set��ü.iterator(); 
		while(iterator.hasNext()) {
			System.out.print(iterator.next() +" ");
		}
		System.out.println();
		
		
		
		for(String k : linkedSet3) {
			System.out.print(k+" ");
		}
		
		
		//9. toArray() : Set�� ������ �迭�� ������. Object Ÿ������ ����, �ٿ�ĳ������ �ʿ���.
		System.out.println("\n=====9=====");
		Object[] objArray = linkedSet3.toArray();
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
		String[] strArray1 = linkedSet3.toArray(new String[0]);		//0: ���� ũ�� ����
																//���� ũ�Ⱑ ���� ������ ���� ��� �����Ϸ��� ���� ũ�⸸ŭ �������ش�.
		System.out.println(Arrays.toString(strArray1));
	

		//11. ���� Set�� ������ ���� ũ�⸦ ũ�� ���� ���� null�� �� �� �ִ�. ĳ���� �ؾ���. Set�� null�� �ߺ� �Ұ�
		System.out.println("\n=====11=====");
		String[] strArray2= linkedSet3.toArray(new String[5]);		//���� ���� ������ null
		System.out.println(Arrays.toString(strArray2));
		
		
		
		//12. Q
		System.out.println("\n=====12=====");
		Set<Integer> intSet1 = new LinkedHashSet();
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
