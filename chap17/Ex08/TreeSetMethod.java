package chap17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet: ��½� ���ĵǾ� ���(�������� ���(ascending))
			//��½� �˻��� �޼ҵ尡 ����
			//������ ���� ������ Set�� ���ĵǾ �����, ��½ÿ� ������������ ���ĵǾ ���

			//Set <= SortedSet(���� �޼ҵ�����) <= NavigableSet(�˻� �޼ҵ� ����) <= TreeSet
			//TreeSet<String> treeSet = new TreeSet<String> ();		Ÿ���� TreeSet���� ������� ����,�˻� ����� ����� �� �ִ�.
			//Set �������̽��� ��� �޼ҵ� ���. �߰������� ���� �޼ҵ�/ �˻� �޼ҵ带 ��� ����
			

public class TreeSetMethod {

	public static void main(String[] args) {
		//TreeSet�� Set�� ��� �޼ҵ� ���
		
		
		//TreeSet�� ���� �־��� ��� �������� ���ĵǾ� ���� Set�� ����, ��½� �������� ���ķ� ���.
		TreeSet<Integer> treeSet = new TreeSet();//Type�� TreeSet���� �����ؾ� ����(Sort)�� �˻��� ����� �� �ִ�.
		
		
		
		for(int i= 50; i>0;i-=2) {	//50, 48, 46, 44 ... 2
			treeSet.add(i);			//���������� ������ ���� ���� �� ������������ ���ĵǾ� ���� ����.
		}
		System.out.println(treeSet);
		
		
		
		//TreeSet������ ��� ������ �޼ҵ�(1 ~ 15)
		
		System.out.println("<<<<<<<<<<�����Ͱ˻� (��������)>>>>>>>>>>");
		
//////////1. first()			:���� ó�� ���� �������ش�.
		System.out.println("============1===== first======");
		System.out.println(treeSet.first());			//2
		
		
		
//////////2. last()				:���� ������ ���� ����
		System.out.println("============2======last=======");
		System.out.println(treeSet.last());				//50
		
		
//////////3. lower(E element): element���� ���� �� 			//���ڰ� �ƴ� ���ڸ�? ���� ���� ����� �ؾ��ϳ�?
		System.out.println("============3=====lower======");
		System.out.println(treeSet.lower(27));			//26
			
		
//////////4. higher(E element): element���� ū �� 
		System.out.println("============4====higher======");
		System.out.println(treeSet.higher(26));			//28
		
//////////5. floor(E element): element�� �����ؼ� ���� ���� ���
		System.out.println("============5====floor======");
		System.out.println(treeSet.floor(25));			//24
		System.out.println(treeSet.floor(26));			//26
		
		
//////////6. ceiling(E element): element�� �����ؼ� ū ���� ���
		System.out.println("============6====ceiling===");
		System.out.println(treeSet.ceiling(25));		//26
		System.out.println(treeSet.ceiling(26));		//26

	
		System.out.println("<<<<<<<<<<������ ������>>>>>>>>>>");		//������ ������ �����Ͱ� treeSet���� �����
//////////7. pollFirst(): ���� ù ���� ������
		System.out.println("============7====pollFirst()====");
		
		int treeSetSize = treeSet.size();		//���� ����
		System.out.println(treeSetSize);
		
		for(int i=0; i<treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());	//25�� ���� ���鼭 ù ��° ���� ������ ���
		}
		System.out.println();
		System.out.println(treeSet.size());	//0
		
//////////8. pollLast(): ������ �� ������
		System.out.println("============8====== pollLast()====");

		for (int i = 50; i> 0 ; i-=2 ) {
			treeSet.add(i);		//�̷��� �־ ������������ ���ĵǾ� ����
		}
		
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);	//25
		System.out.println(treeSet);
		
		for(int i = 0; i<treeSetSize ;i++) {
			System.out.println(treeSet.pollLast());
		}		//pollLast�� �� �����
		System.out.println();
		System.out.println(treeSet.size());		//0
		
		
//////////9. SortedSet<E> headSet(E element): ������ ����ϱ� ���ؼ� SortedSet<E> Ÿ������ ����
				//SortedSet<E> : ���ĵ� �����͸� �����ϴ� Set.
				//headSet(E element): element�� Head�������� ���� ����. (element ���� ������)
		System.out.println();
		System.out.println("============9=====headSet=====");
		for(int i =50;i>0; i-=2) {
			treeSet.add(i);		//������������ ���ĵǾ treeSet�� ����
		}	//�� �ֱ�
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);		//import �ʿ�		headSet() �޼ҵ�� SortedSet�� ���Ͻ�Ų��.
		//Set<Integer> sSet = treeSet.headSet(20);							Set���� ���� ���� �� �ֱ� ��	
		System.out.println(sSet);
		
		
//////////10. NavigableSet<E> headSet(E element, boolean inclusive)	: element�� ����(true),������(false) �Ͽ� head������ ���	
		System.out.println();
		System.out.println("============10=====headSet======");
		
		NavigableSet<Integer> nSet = treeSet.headSet(20,true);			//import �ʿ� 		true�� 20 ����, false�� ������
		System.out.println(nSet);
		//Set<Integer> nSet = treeSet.headSet(20);					Set ����		
		//�Ӹ��� 2 ~ 20����
		
/////////11. SortedSet<E> tailSet(E element)		
		System.out.println();
		System.out.println("============11=====tailSet=====");
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);		//���۰��� ������ �⺻, ������ �������� �⺻ <= ��� ���� ������ ����
		System.out.println(sSet2);							//=> head tail ���ϴ°�
		//20 ~ 50	
		
		//<<<<<Ư�� ������ �� ��������>>>>>
//////////12. NavigableSet<E> tailSet(E element, boolean inclusive) : element�� ����(true),������(false) �Ͽ� tail������ ���
		System.out.println();
		System.out.println("============12=====tailSet=====");
		//NavigableSet nSet2 = treeSet.tailSet(20, true);
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		//Set nSet2 = treeSet.tailSet(20,true);	//����
		System.out.println(nSet2);
	
		
//////////13. SortedSet<E> subSet(E element, E element) : Ư�� ������ ���� Set���� ���� ��
		System.out.println();
		System.out.println("============13====subSet=====");
		SortedSet sSet3 = treeSet.subSet(10, 20);		//10�� 20���� ������ ��
		System.out.println(sSet3);			//���۰��� ����, �� ���� ������  <== ��� ���α׷����� �⺻
		
		
//////////14. NavigableSet<E> subSet(E element, boolean inclusuve, E elementm, boolean inclusive)
		System.out.println();
		System.out.println("============14====subSet=====");
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);	//true ����, false ������
		System.out.println(nSet4);
		
		//<<<�ݴ�� �����ϱ�>>>
//////////15. �ڡڡڡڡڡڡڡڡڡ�	NavigableSet<E> descendingSet(): ���� ������ �������� �ݴ�� �����Ѵ�. descending <�������� ����>
		System.out.println();
		System.out.println("============15====descendingSet=====");
		System.out.println(treeSet);		//�������� ���� ���
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);	//�ݴ�� �����Ͽ� ���
		
		//NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		Set<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
		
	}
	
	
	

}
