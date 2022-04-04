package chap17.Ex08;

import java.util.TreeSet;

//중요!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//TreeSet의 잇점: 1. 중복 저장되지 않는다.(Set)
//				2. 오름차순 정렬되어 입력
//				3. 정렬되어 출력(오름차순)
//				4. 검색기능 사용 가능
//				5. 특정 범위의 값을 추출
//				6. acsending, descending 

//TreeSet에 일반 객체를 저장할 경우, 특정 필드를 크기 비교를 위한 기준 필드로 만들어야 한다.
	//1. Comparable<E> interface의 compareTo() 메소드 : TreeSet에 일반 객체를 저장할 때 일반 객체의 특정 필드를 재정의해야 한다.  
	//2. Comparator<E> interface의 compare() 메소드를 재정의
	//3. 익명 내부 객체를 사용해서 처리하는 방법


class MyClass{

	int data1, data2;
	
	public MyClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
}


//Comparable<E> 인터페이스를 구현한 클래스 생성
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1, data2;			//<== 필드를 비교 기준으로 설정, compareTo() 재정의
	
	public MyComparableClass(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public int compareTo(MyComparableClass o) {		//얘가 핵심  //객체의 크기 비교 기준을 설정하는 메소드, <<TreeSet에서 사용>> (음수, 0, 양수)
											//오름차순 처리 방식
											//기준을 바꾸면 정렬 방식도 바뀌네~
		
		
		if(this.data1 < o.data1) {			//this.data1 기준 값이 작을 경우 -1
			return -1;
		}
		else if(this.data1 == o.data1) {	//this.data1 기준 값이 같을 경우 0
			return 0;
		}
		else {								//this.data1 기준 값이 클 경우 1
			return 11;
		}
	}
	
	@Override
	public String toString() {

		
		return data1 +" "+ data2+" ";
	}
}

public class TreeSetMehtod_2 {

	public static void main(String[] args) {

		// wrapper 클래스는 comparable<E> 인터페이스의 compareTo()메소드를 재정의 하고 있다.
		// wrapper 클래스의 값을 TreeSet에 넣으면 정렬되어 저장
		
		
		// 1. Integer wrapper 클래스의 크기 비교
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();		//TreeSet은 Set으로 두면 검색/정렬 기능을 사용하지 못함
		Integer intValue1 = new Integer(20);	//큰 값
		Integer intValue2 = new Integer(10);	//작은 값
	//	Integer intValue3 = 3;
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1);	//오름차순 정렬되어 출력
		
		// 2. String wrapper 클래스의 크기 비교
		TreeSet<String> treeSet2 = new TreeSet<String>();
		String str1 = new String("가나");		//작은 값
		
		//String str1 = "가나";
		String str2 = new String("다라");		//큰 값
		
		treeSet2.add(str1);		//treeSet2.add()를 사용해서 객체를 저장할 경우 값의 크기를 비교하는 필드가 정의되어 있어야 한다.
		treeSet2.add(str2);		// Comparable<E> 인터페이스의 compareTo() 메소드가 재정의 되어야 한다.
		
		System.out.println(treeSet2);
		
		
		
		
		
		
		
		//3. MyClass(일반객체)가 TreeSet에 저장될까? Comparable<E> 인터페이스의 compareTo()메소드가 재정의 되어야 TreeSet 컬렉션에 저장 가능
//		TreeSet<MyClass> treeSet3 = new TreeSet<MyClass>();
//		MyClass myClass1 = new MyClass(2,5);
//		MyClass myClass2 = new MyClass(3,3);
//		
//		treeSet3.add(myClass1);		//TreeSet에는 Comparable<E> 인터페이스의 compareTo() 메소드를 재정의한 클래스만 넣을 수 있다. 
//		treeSet3.add(myClass2);		//실행시 오류 발생
//		
//		System.out.println(treeSet3);	
		
		
		
		//4. MyComparableClass 객체 크기 비교
		TreeSet<MyComparableClass> treeSet4 = new TreeSet();
		
		MyComparableClass m1 = new MyComparableClass(2, 5);
		MyComparableClass m2 = new MyComparableClass(3, 3);
		MyComparableClass m3 = new MyComparableClass(4, 3);
		
		treeSet4.add(m1);
		treeSet4.add(m2);
		treeSet4.add(m3);
		
		System.out.println(treeSet4);
		
		
		
		
		
		
		
	}

}
