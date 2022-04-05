package chap17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 	Set: �ߺ����� �ʴ� ���� ����(equals(), hashCode() �޼ҵ带 ������, wrapper Ŭ�������� ��� ������ �Ǿ� �ִ�.)
  		1. HashSet			: ��µǴ� ���� �����ϰ� ���
  		2. LinkedHashSet	: �ԷµǴ� ������� ���
  		3. TreeSet			: �Է°��� ������ ���������� �������� ���ĵǾ� ���. 
  
  
 */



public class SetSummary {

	public static void main(String[] args) {
		
		//1. HashSet
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		hashSet.add("��");
		
		System.out.println(hashSet);
		
		//2. LinkedHashSet
		Set<String> LinkedhashSet = new LinkedHashSet<String>();
		LinkedhashSet.add("��");
		LinkedhashSet.add("��");
		LinkedhashSet.add("��");
		LinkedhashSet.add("��");
		
		System.out.println(LinkedhashSet);
		
		//3. TreeSet  <= ���� �ϱ� ���� Comparable<E>�� compareTo() ������, Comparator<E>�� compare() ����
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		treeSet.add("��");
		
		System.out.println(treeSet);
	}

}
