package chap17.Ex02;

//Vector: ArrayList�� ��� �޼ҵ带 �����ϰ� ���
	//Vector �� ��� �޼���� ����ȭ ó���� �Ǿ��ִ�. ��Ƽ������ ȯ�濡 ����

//�̱� ������ ȯ��: ArrayList
//��Ƽ ������ ȯ��: Vector

import java.util.Arrays;
import java.util.Vector;

public class VectorMethod_1 {

	public static void main(String[] args) {
		
		//Vector�� �޼ҵ�: 13�� ������ �޼ҵ�
			//1. ArrayList
			//2. Vector
			//3. LinkedList
		
		Vector<Integer> aVector1 = new Vector<Integer>();
		
		//1. add(E element) : �������� ���� �߰��ϱ�.
		System.out.println("=====1=====");
		aVector1.add(3);aVector1.add(4);aVector1.add(5);
		System.out.println(aVector1);					//�� ���
		System.out.println(aVector1.size());			//���� ����
		
		
		//2. add(int index, E element)
		System.out.println("=====2=====");
		aVector1.add(1,6);		//�� ��ȣ 1���� 6�� �߰�
		System.out.println(aVector1);
		
		//3. addAll (�� �ٸ� ����Ʈ�� ��ü�� �����ؼ� �߰�)
		System.out.println("=====3=====");
		Vector<Integer> aVector2 = new Vector<Integer>();
		aVector2.add(1);
		aVector2.add(2);
		
		aVector2.addAll(aVector1);		//aVector1 ����� ���� �����ؼ� aVector2�� �߰���.
		System.out.println(aVector2);
		
		
		//4. addAll(int index, �� �ٸ� ��ü)
		System.out.println("=====4=====");
		Vector<Integer> aVector3 = new Vector<Integer>();
		aVector3.add(1);
		aVector3.add(2);
		
		aVector3.addAll(1, aVector3);		//�ڽ��� ���� �ٸ� ��ü�� �߰�
		System.out.println(aVector3);
		
		
		//5. set(int index, E element)	Ư�� �� ��ȣ�� ���� ����
		System.out.println("=====5=====");
		aVector3.set(1, 5);		//1�� �� ��ȣ�� ���� 5�� ����
		aVector3.set(3, 6);
		// aVector3.set(4, 7);  4������ ���� ������ ����
		System.out.println(aVector3);
		
		
		//6. remove (int index): Ư�� �� ��ȣ�� ���� ����
		System.out.println("=====6=====");
		aVector3.remove(1); 		//1�� �濡 �ִ� ���� ����
		System.out.println(aVector3);
		
		
		//7. remove(Object o): ������ ����
		System.out.println("=====7=====");
		aVector3.remove(new Integer(2));	//������ ���� �� �� �ִ�.
		System.out.println(aVector3);
		
		
		//8. clear(): ��� ����
		System.out.println("=====8=====");
		aVector3.clear();
		System.out.println(aVector3);
		
		
		//9.isEmpty() : ���� ��������� true, �ƴϸ� false
		System.out.println("=====9=====");
		System.out.println(aVector3.isEmpty());
		
		//10. size(): ���� ����, ���� ����
		System.out.println("=====10=====");
		System.out.println(aVector3.size());
		aVector3.add(1);aVector3.add(2);aVector3.add(3);
		System.out.println(aVector3);
		System.out.println(aVector3.size());
		
		
		//11. get(int index): �� ��ȣ�� ���� ���
		System.out.println("=====11=====");
		System.out.println(aVector3.get(0));
		System.out.println(aVector3.get(1));
		System.out.println(aVector3.get(2));
		
		
		//12. toArray(): Vector(����Ʈ) ----> Array(�迭) �� ��ȯ
		System.out.println("=====12=====");
		Object[] object = aVector3.toArray();		//�⺻������ toArray()�޼ҵ�� Object Ÿ������ ������ ��
			//�ٿ� ĳ������ �ʿ��ϴ�.
		System.out.println(Arrays.toString(object));	//�迭�� ���� Arrays.toString()
		
		System.out.println(aVector3);		//Vector�� �� ��ü�� ����ϸ� ��ü�� ���� �����
		
		
		
		//13-1. toArray(T[] t)			==> t[] :Integer�� �ٷ� ĳ����
		System.out.println("=====13-1=====");
		Integer[] integer1 = aVector3.toArray(new Integer[0]);		//0�� �ǹ�: ����Ʈ�� ����� ������ ���� ��� ����Ʈ�� ����� ���� ������ �´�.
		System.out.println(Arrays.toString(integer1));
		
		//13-2. toArray(T[] t)			==> t[] :Integer�� �ٷ� ĳ����
		System.out.println("=====13-2=====");
		Integer[] integer2 = aVector3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
	}

}
