package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * java.lang ��Ű���� Ŭ�������� import�� �ʿ����� �ʴ�.
 * 
 	�÷���(collection): ������ �ڷ����� ����. ���� ũ�Ⱑ �������� ��ȭ.
 	�迭(array)		: ������ �ڷ����� ����. ���� ũ�Ⱑ �����Ǿ� �ִ�. �迭 ������ ���� ũ�⸦ ����, ũ��� ���� �Ұ�
 	
 	List<E>: �������̽�, ���׸� �������̽� -> �پ��� ������ Ÿ���� ��� ����
  		Ư¡: �ε���(index)�� ������ �ִ�. ũ��� �������� ��ȭ�Ѵ�.
  		
  		- ArrayList<E>	: �̱� ������ ȯ�濡�� ���.	�˻��� ������ ���� �߰� ������ ���� ������.
  		- Vector<E>		: ��Ƽ ������ ȯ�濡�� ���.	��� �޼ҵ尡 ����ȭ �Ǿ� �ִ�.
  		- LinkedList	: �˻��� �������� ���� �߰� ������ ������.
  
 */

public class ArrayList_1 {

	public static void main(String[] args) {

		//1. �迭
		String[] array = new String[] {"��", "��", "��", "��", "��", "��", "��"};
		System.out.println(array.length);		//7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);		//7
		
		// Arrays.toString(�迭����)
		System.out.println(Arrays.toString(array));		//Arrays.toString(�迭����)
		
		// for�� ����ؼ� ���
		for(int i = 0; i<array.length;i++) {
			if(i == array.length-1 ) {System.out.println(array[i]);}
			else {System.out.print(array[i] + ", ");}
			
		}
		
		
		// Enhanced For���� ����ؼ� ���
		for(String k : array) {
			System.out.print(k + ", ");
		}
		
		
		//2. List: �������̽�, ��ü ������ �� �� ����, Ÿ���� ���� ����
		
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		
		//List���� ���� ���� ���: aList.size();  <<==List, length(): �迭
		System.out.println(aList.size());
	
	
	
		//List�� �� �Ҵ��ϱ�: aList.add("�� �Ҵ�"); ���� �������� ���� �߰���.
		aList.add("��");aList.add("��");aList.add("��");aList.add("��");aList.add("��");aList.add("��");aList.add("��");
		
		
		//List�� ����� �������� ���� ���ϱ�: aList.size();
		System.out.println(aList.size());
	
		//List�� ����� ���� ����: aList.remove("������ ����")
		aList.remove("��");
		aList.remove("��");
		System.out.println(aList.size()); //5
		
		//List�� index�� ������ �ִ�. (for)
		for(int i = 0; i<aList.size();i++) {		//aList.size(0): ���� ���� ���
			System.out.print(aList.get(i)+" , ");
		}
		
		System.out.println();
		//Enhanced for���� ����Ͽ� ���
		for(String k : aList) {
			System.out.print(k + " , ");
		}
		System.out.println("=================");
		
		//��ü�� toString()�� ȣ���ؼ� ���
		System.out.println(aList);		//List�� toString�޼ҵ尡 ������ �Ǿ��ִ�.
		System.out.println(aList.toString());
		
		
		
	}

}
