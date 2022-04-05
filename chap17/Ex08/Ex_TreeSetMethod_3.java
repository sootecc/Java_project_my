package chap17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

// �̸��� ���̸� �Է����� �� �̸��� ������������ ����ϵ��� �����϶�. TreeSet�� name �÷��� ��������
// 1. Comparable<E> �� compareTo() �޼ҵ� ������
	//������ ��ü ������ �ʿ�
// 2. Comparator<E> �� compare() ����
	//������ ��ü ���� ���� 


class Abc{
	String name;	//<<���� �÷� �������� �����ٶ�...��,
					//ȫ�浿, �̼���, ������ -> ������, �̼���, ȫ�浿 ������ ���ĵǾ�� ��
	int age;		//����
	Abc(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {

		
		return name +" "+ age+" ";
	}
}


class Abc_T implements Comparable<Abc_T>{
	String name;
	int age;
	
	Abc_T(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Abc_T o) {
		if(this.name.compareTo(o.name)>0) {	//�񱳹�?
			return 1;
		}
		else if(this.name.compareTo(o.name) == 0) {
			return 0;
		}
		else {
			return -1;
		}
	}
	@Override
	public String toString() {

		
		return name +" "+ age+" ";
	}
}

public class Ex_TreeSetMethod_3 {

	public static void main(String[] args) {
		
		TreeSet<Abc_T> treeSet = new TreeSet();
		
		Abc_T m1 = new Abc_T("�̼���", 50);		//TreeSet�� ����� �� Comparable<E> �������̽��� compareTo() ������
		Abc_T m2 = new Abc_T("������", 30);
		Abc_T m3 = new Abc_T("ȫ�浿", 23);
		
		treeSet.add(m1);
		treeSet.add(m2);
		treeSet.add(m3);
		System.out.println("��� 1");
		System.out.println(treeSet);
		
		
		TreeSet<Abc_T> treeSet2 = new TreeSet<Abc_T>(new Comparator<Abc_T>() {
			@Override
			public int compare(Abc_T o1, Abc_T o2) {
				if(o1.name.compareTo(o2.name)>0) {
					return 1;
				}
				else if(o1.name.compareTo(o2.name) == 0) {
					return 0;
				}
				else {
					return -1;
				}
			}
		});
		
		System.out.println("��� 2");
		Abc_T n1 = new Abc_T("�̼���",50);
		Abc_T n2 = new Abc_T("������",30);
		Abc_T n3 = new Abc_T("ȫ�浿",23);
		treeSet2.add(n1);
		treeSet2.add(n2);
		treeSet2.add(n3);
		
		System.out.println(treeSet2);
		
	}

}
