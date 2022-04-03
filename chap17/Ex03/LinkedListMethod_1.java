package chap17.Ex03;

//LinkedList: ArrayList와 모든 메소드를 동일하게 사용
	//LinkedList 의 모든 메서드는 동기화 처리가 되어있다. 멀티쓰레드 환경에 적합

//싱글 쓰레드 환경: ArrayList
//멀티 쓰레드 환경: LinkedList

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListMethod_1 {

	public static void main(String[] args) {
		
		//LinkedList의 메소드: 13개 정도의 메소드
			//1. ArrayList
			//2. LinkedList
			//3. LinkedList
		
		LinkedList<Integer> aLinkedList1 = new LinkedList<Integer>();
		
		//1. add(E element) : 마지막에 값을 추가하기.
		System.out.println("=====1=====");
		aLinkedList1.add(3);aLinkedList1.add(4);aLinkedList1.add(5);
		System.out.println(aLinkedList1);					//값 출력
		System.out.println(aLinkedList1.size());			//값의 개수
		
		
		//2. add(int index, E element)
		System.out.println("=====2=====");
		aLinkedList1.add(1,6);		//방 번호 1번에 6을 추가
		System.out.println(aLinkedList1);
		
		//3. addAll (또 다른 리스트의 객체를 복사해서 추가)
		System.out.println("=====3=====");
		LinkedList<Integer> aLinkedList2 = new LinkedList<Integer>();
		aLinkedList2.add(1);
		aLinkedList2.add(2);
		
		aLinkedList2.addAll(aLinkedList1);		//aLinkedList1 저장된 값을 복사해서 aLinkedList2에 추가함.
		System.out.println(aLinkedList2);
		
		
		//4. addAll(int index, 또 다른 객체)
		System.out.println("=====4=====");
		LinkedList<Integer> aLinkedList3 = new LinkedList<Integer>();
		aLinkedList3.add(1);
		aLinkedList3.add(2);
		
		aLinkedList3.addAll(1, aLinkedList3);		//자신의 값에 다른 객체를 추가
		System.out.println(aLinkedList3);
		
		
		//5. set(int index, E element)	특정 방 번호의 값을 수정
		System.out.println("=====5=====");
		aLinkedList3.set(1, 5);		//1번 방 번호에 값을 5로 수정
		aLinkedList3.set(3, 6);
		// aLinkedList3.set(4, 7);  4번방은 없기 때문에 오류
		System.out.println(aLinkedList3);
		
		
		//6. remove (int index): 특정 방 번호의 값을 삭제
		System.out.println("=====6=====");
		aLinkedList3.remove(1); 		//1번 방에 있는 값을 삭제
		System.out.println(aLinkedList3);
		
		
		//7. remove(Object o): 값으로 삭제
		System.out.println("=====7=====");
		aLinkedList3.remove(new Integer(2));	//값으로 삭제 할 수 있다.
		System.out.println(aLinkedList3);
		
		
		//8. clear(): 모두 삭제
		System.out.println("=====8=====");
		aLinkedList3.clear();
		System.out.println(aLinkedList3);
		
		
		//9.isEmpty() : 값이 비어있으면 true, 아니면 false
		System.out.println("=====9=====");
		System.out.println(aLinkedList3.isEmpty());
		
		//10. size(): 방의 개수, 값의 개수
		System.out.println("=====10=====");
		System.out.println(aLinkedList3.size());
		aLinkedList3.add(1);aLinkedList3.add(2);aLinkedList3.add(3);
		System.out.println(aLinkedList3);
		System.out.println(aLinkedList3.size());
		
		
		//11. get(int index): 방 번호의 값을 출력
		System.out.println("=====11=====");
		System.out.println(aLinkedList3.get(0));
		System.out.println(aLinkedList3.get(1));
		System.out.println(aLinkedList3.get(2));
		
		
		//12. toArray(): LinkedList(리스트) ----> Array(배열) 로 변환
		System.out.println("=====12=====");
		Object[] object = aLinkedList3.toArray();		//기본적으로 toArray()메소드는 Object 타입으로 리턴이 됨
			//다운 캐스팅이 필요하다.
		System.out.println(Arrays.toString(object));	//배열일 때는 Arrays.toString()
		
		System.out.println(aLinkedList3);		//LinkedList일 때 객체를 출력하면 객체의 값을 출력함
		
		
		
		//13-1. toArray(T[] t)			==> t[] :Integer로 바로 캐스팅
		System.out.println("=====13-1=====");
		Integer[] integer1 = aLinkedList3.toArray(new Integer[0]);		//0의 의미: 리스트에 저장된 값보다 작을 경우 리스트에 저장된 값만 가지고 온다.
		System.out.println(Arrays.toString(integer1));
		
		//13-2. toArray(T[] t)			==> t[] :Integer로 바로 캐스팅
		System.out.println("=====13-2=====");
		Integer[] integer2 = aLinkedList3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integer2));
		
		
		
		
		
		
	}

}
