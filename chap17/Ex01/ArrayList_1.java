package chap17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * java.lang 패키지의 클래스들은 import가 필요하지 않다.
 * 
 	컬렉션(collection): 동일한 자료형을 저장. 방의 크기가 동적으로 변화.
 	배열(array)		: 동일한 자료형을 저장. 방의 크기가 고정되어 있다. 배열 생성시 방의 크기를 지정, 크기는 수정 불가
 	
 	List<E>: 인터페이스, 제네릭 인터페이스 -> 다양한 데이터 타입을 사용 가능
  		특징: 인덱스(index)를 가지고 있다. 크기는 동적으로 변화한다.
  		
  		- ArrayList<E>	: 싱글 쓰레드 환경에서 사용.	검색은 빠르나 값의 추가 삭제가 비교적 느리다.
  		- Vector<E>		: 멀티 쓰레드 환경에서 사용.	모든 메소드가 동기화 되어 있다.
  		- LinkedList	: 검색은 느리지만 값의 추가 삭제가 빠르다.
  
 */

public class ArrayList_1 {

	public static void main(String[] args) {

		//1. 배열
		String[] array = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		System.out.println(array.length);		//7
		array[2] = null;
		array[5] = null;
		System.out.println(array.length);		//7
		
		// Arrays.toString(배열변수)
		System.out.println(Arrays.toString(array));		//Arrays.toString(배열변수)
		
		// for문 사용해서 출력
		for(int i = 0; i<array.length;i++) {
			if(i == array.length-1 ) {System.out.println(array[i]);}
			else {System.out.print(array[i] + ", ");}
			
		}
		
		
		// Enhanced For문을 사용해서 출력
		for(String k : array) {
			System.out.print(k + ", ");
		}
		
		
		//2. List: 인터페이스, 객체 생성을 할 수 없음, 타입은 지정 가능
		
		List<String> aList = new ArrayList<String>();
		List<String> aList2 = new ArrayList<>();
		List<String> aList3 = new ArrayList();
		
		
		//List에서 방의 갯수 출력: aList.size();  <<==List, length(): 배열
		System.out.println(aList.size());
	
	
	
		//List에 값 할당하기: aList.add("값 할당"); 제일 마지막에 값을 추가함.
		aList.add("가");aList.add("나");aList.add("다");aList.add("라");aList.add("마");aList.add("바");aList.add("사");
		
		
		//List에 저장된 데이터의 갯수 구하기: aList.size();
		System.out.println(aList.size());
	
		//List에 저장된 값을 제거: aList.remove("삭제할 내용")
		aList.remove("다");
		aList.remove("바");
		System.out.println(aList.size()); //5
		
		//List는 index를 가지고 있다. (for)
		for(int i = 0; i<aList.size();i++) {		//aList.size(0): 방의 개수 출력
			System.out.print(aList.get(i)+" , ");
		}
		
		System.out.println();
		//Enhanced for문을 사용하여 출력
		for(String k : aList) {
			System.out.print(k + " , ");
		}
		System.out.println("=================");
		
		//객체의 toString()을 호출해서 출력
		System.out.println(aList);		//List는 toString메소드가 재정의 되어있다.
		System.out.println(aList.toString());
		
		
		
	}

}
