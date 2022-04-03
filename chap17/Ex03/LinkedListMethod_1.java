package chap17.Ex03;

//LinkedList: ArrayList�� ��� �޼ҵ带 �����ϰ� ���
	//LinkedList �� ��� �޼���� ����ȭ ó���� �Ǿ��ִ�. ��Ƽ������ ȯ�濡 ����

//�̱� ������ ȯ��: ArrayList
//��Ƽ ������ ȯ��: LinkedList

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		
		//LinkedList�� �޼ҵ�: 13�� ������ �޼ҵ�
			//1. ArrayList
			//2. LinkedList
			//3. LinkedList
		
		LinkedList<Integer> aLinkedList1 = new LinkedList<Integer>();
		
		//1. add(E element) : �������� ���� �߰��ϱ�.
		System.out.println("=====1=====");
		aLinkedList1.add(3);aLinkedList1.add(4);aLinkedList1.add(5);
		System.out.println(aLinkedList1);					//�� ���
		System.out.println(aLinkedList1.size());			//���� ����
		
		
		//2. add(int index, E element)
		System.out.println("=====2=====");
		aLinkedList1.add(1,6);		//�� ��ȣ 1���� 6�� �߰�
		System.out.println(aLinkedList1);
		
		//3. addAll (�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		System.out.println("=====3=====");
		LinkedList<Integer> aLinkedList2 = new LinkedList<Integer>();
		aLinkedList2.add(1);
		aLinkedList2.add(2);
		
		aLinkedList2.addAll(aLinkedList1);		//aLinkedList1 ����� ���� �����ؼ� aLinkedList2�� �߰���.
		System.out.println(aLinkedList2);
		
		
		//4. addAll(int index, �� �ٸ� ��ü)
		System.out.println("=====4=====");
		LinkedList<Integer> aLinkedList3 = new LinkedList<Integer>();
		aLinkedList3.add(1);
		aLinkedList3.add(2);
		
		aLinkedList3.addAll(1, aLinkedList3);		//�ڽ��� ���� �ٸ� ��ü�� �߰�
		System.out.println(aLinkedList3);
		
		
		//5. set(int index, E element)	Ư�� �� ��ȣ�� ���� ����
		System.out.println("=====5=====");
		aLinkedList3.set(1, 5);		//1�� �� ��ȣ�� ���� 5�� ����
		aLinkedList3.set(3, 6);
		// aLinkedList3.set(4, 7);  4������ ���� ������ ����
		System.out.println(aLinkedList3);
		
		
		//6. remove (int index): Ư�� �� ��ȣ�� ���� ����
		System.out.println("=====6=====");
		aLinkedList3.remove(1); 		//1�� �濡 �ִ� ���� ����
		System.out.println(aLinkedList3);
		
		
		//7. remove(Object o): ������ ����
		System.out.println("=====7=====");
		aLinkedList3.remove(new Integer(2));	//������ ���� �� �� �ִ�.
		System.out.println(aLinkedList3);
		
		
		//8. clear(): ��� ����
		System.out.println("=====8=====");
		aLinkedList3.clear();
		System.out.println(aLinkedList3);
		
		
		//9.isEmpty() : ���� ��������� true, �ƴϸ� false
		System.out.println("=====9=====");
		System.out.println(aLinkedList3.isEmpty());
		
		//10. size(): ���� ����, ���� ����
		System.out.println("=====10=====");
		System.out.println(aLinkedList3.size());
		aLinkedList3.add(1);aLinkedList3.add(2);aLinkedList3.add(3);
		System.out.println(aLinkedList3);
		System.out.println(aLinkedList3.size());
		
		
		//11. get(int index): �� ��ȣ�� ���� ���
		System.out.println("=====11=====");
		System.out.println(aLinkedList3.get(0));
		System.out.println(aLinkedList3.get(1));
		System.out.println(aLinkedList3.get(2));
		
		
		//12. toArray(): LinkedList(����Ʈ) ----> Array(�迭) �� ��ȯ
		System.out.println("=====12=====");
		Object[] object = aLinkedList3.toArray();		//�⺻������ toArray()�޼ҵ�� Object Ÿ������ ������ ��
			//�ٿ� ĳ������ �ʿ��ϴ�.
		System.out.println(Arrays.toString(object));	//�迭�� ���� Arrays.toString()
		
		System.out.println(aLinkedList3);		//LinkedList�� �� ��ü�� ����ϸ� ��ü�� ���� �����
		
		
		
		//13-1. toArray(T[] t)			==> t[] :Integer�� �ٷ� ĳ����
		System.out.println("=====13-1=====");
		Integer[] integer1 = aLinkedList3.toArray(new Integer[0]);		//0�� �ǹ�: ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�.
		System.out.println(Arrays.toString(integer1));
		
		//13-2. toArray(T[] t)			==> t[] :Integer�� �ٷ� ĳ����
		System.out.println("=====13-2=====");
		Integer[] integer2 = aLinkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
	}

}
