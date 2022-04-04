package chap17.Ex08;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet: 출력시 정렬되어 출력(오름차순 출력(ascending))
			//출력시 검색의 메소드가 지원
			//임의의 값을 넣으면 Set에 정렬되어서 저장됨, 출력시에 오름차순으로 정렬되어서 출력

			//Set <= SortedSet(정렬 메소드정의) <= NavigableSet(검색 메소드 정의) <= TreeSet
			//TreeSet<String> treeSet = new TreeSet<String> ();		타입을 TreeSet으로 지저앻야 정렬,검색 기능을 사용할 수 있다.
			//Set 인터페이스의 모든 메소드 사용. 추가적으로 정렬 메소드/ 검색 메소드를 사용 가능
			

public class TreeSetMethod {

	public static void main(String[] args) {
		//TreeSet은 Set의 모든 메소드 사용
		
		
		//TreeSet에 값을 넣었을 경우 오름차순 정렬되어 값이 Set에 저장, 출력시 오름차순 정렬로 출력.
		TreeSet<Integer> treeSet = new TreeSet();//Type을 TreeSet으로 지정해야 정렬(Sort)과 검색을 사용할 수 있다.
		
		
		
		for(int i= 50; i>0;i-=2) {	//50, 48, 46, 44 ... 2
			treeSet.add(i);			//내부적으로 임의의 값을 넣을 때 오름차순으로 정렬되어 값이 저장.
		}
		System.out.println(treeSet);
		
		
		
		//TreeSet에서만 사용 가능한 메소드(1 ~ 15)
		
		System.out.println("<<<<<<<<<<데이터검색 (가져오기)>>>>>>>>>>");
		
//////////1. first()			:제일 처음 값을 리턴해준다.
		System.out.println("============1===== first======");
		System.out.println(treeSet.first());			//2
		
		
		
//////////2. last()				:제일 마지막 값을 리턴
		System.out.println("============2======last=======");
		System.out.println(treeSet.last());				//50
		
		
//////////3. lower(E element): element보다 작은 값 			//숫자가 아닌 문자면? 작은 것을 뭐라고 해야하나?
		System.out.println("============3=====lower======");
		System.out.println(treeSet.lower(27));			//26
			
		
//////////4. higher(E element): element보다 큰 값 
		System.out.println("============4====higher======");
		System.out.println(treeSet.higher(26));			//28
		
//////////5. floor(E element): element를 포함해서 작은 값을 출력
		System.out.println("============5====floor======");
		System.out.println(treeSet.floor(25));			//24
		System.out.println(treeSet.floor(26));			//26
		
		
//////////6. ceiling(E element): element를 포함해서 큰 값을 출력
		System.out.println("============6====ceiling===");
		System.out.println(treeSet.ceiling(25));		//26
		System.out.println(treeSet.ceiling(26));		//26

	
		System.out.println("<<<<<<<<<<데이터 꺼내기>>>>>>>>>>");		//꺼내면 꺼내온 데이터가 treeSet에서 사라짐
//////////7. pollFirst(): 제일 첫 값을 꺼내기
		System.out.println("============7====pollFirst()====");
		
		int treeSetSize = treeSet.size();		//값의 개수
		System.out.println(treeSetSize);
		
		for(int i=0; i<treeSetSize; i++) {
			System.out.println(treeSet.pollFirst());	//25번 루프 돌면서 첫 번째 값만 꺼내와 출력
		}
		System.out.println();
		System.out.println(treeSet.size());	//0
		
//////////8. pollLast(): 마지막 값 꺼내기
		System.out.println("============8====== pollLast()====");

		for (int i = 50; i> 0 ; i-=2 ) {
			treeSet.add(i);		//이렇게 넣어도 오름차순으로 정렬되어 저장
		}
		
		treeSetSize = treeSet.size();
		System.out.println(treeSetSize);	//25
		System.out.println(treeSet);
		
		for(int i = 0; i<treeSetSize ;i++) {
			System.out.println(treeSet.pollLast());
		}		//pollLast로 다 끄집어내
		System.out.println();
		System.out.println(treeSet.size());		//0
		
		
//////////9. SortedSet<E> headSet(E element): 정렬을 사용하기 위해서 SortedSet<E> 타입으로 리턴
				//SortedSet<E> : 정렬된 데이터를 저장하는 Set.
				//headSet(E element): element의 Head쪽으로의 값을 저장. (element 값은 미포함)
		System.out.println();
		System.out.println("============9=====headSet=====");
		for(int i =50;i>0; i-=2) {
			treeSet.add(i);		//오름차순으로 정렬되어서 treeSet에 저장
		}	//값 넣기
		System.out.println(treeSet);
		SortedSet<Integer> sSet = treeSet.headSet(20);		//import 필요		headSet() 메소드는 SortedSet을 리턴시킨다.
		//Set<Integer> sSet = treeSet.headSet(20);							Set으로 리턴 받을 수 있긴 함	
		System.out.println(sSet);
		
		
//////////10. NavigableSet<E> headSet(E element, boolean inclusive)	: element를 포함(true),미포함(false) 하여 head쪽으로 출력	
		System.out.println();
		System.out.println("============10=====headSet======");
		
		NavigableSet<Integer> nSet = treeSet.headSet(20,true);			//import 필요 		true면 20 포함, false면 미포함
		System.out.println(nSet);
		//Set<Integer> nSet = treeSet.headSet(20);					Set 가능		
		//머리쪽 2 ~ 20까지
		
/////////11. SortedSet<E> tailSet(E element)		
		System.out.println();
		System.out.println("============11=====tailSet=====");
		SortedSet<Integer> sSet2 = treeSet.tailSet(20);		//시작값은 포함이 기본, 끝값은 미포함이 기본 <= 모든 언어에서 동일한 내용
		System.out.println(sSet2);							//=> head tail 말하는거
		//20 ~ 50	
		
		//<<<<<특정 범위의 값 가져오기>>>>>
//////////12. NavigableSet<E> tailSet(E element, boolean inclusive) : element를 포함(true),미포함(false) 하여 tail쪽으로 출력
		System.out.println();
		System.out.println("============12=====tailSet=====");
		//NavigableSet nSet2 = treeSet.tailSet(20, true);
		NavigableSet nSet2 = treeSet.tailSet(20, false);
		//Set nSet2 = treeSet.tailSet(20,true);	//가능
		System.out.println(nSet2);
	
		
//////////13. SortedSet<E> subSet(E element, E element) : 특정 범위의 값을 Set으로 담을 때
		System.out.println();
		System.out.println("============13====subSet=====");
		SortedSet sSet3 = treeSet.subSet(10, 20);		//10과 20사이 범위의 값
		System.out.println(sSet3);			//시작값은 포함, 끝 값은 미포함  <== 모든 프로그램에서 기본
		
		
//////////14. NavigableSet<E> subSet(E element, boolean inclusuve, E elementm, boolean inclusive)
		System.out.println();
		System.out.println("============14====subSet=====");
		NavigableSet<Integer> nSet4 = treeSet.subSet(10, true, 20, true);	//true 포함, false 미포함
		System.out.println(nSet4);
		
		//<<<반대로 정렬하기>>>
//////////15. ★★★★★★★★★★	NavigableSet<E> descendingSet(): 현재 정렬을 기준으로 반대로 정렬한다. descending <내림차순 정렬>
		System.out.println();
		System.out.println("============15====descendingSet=====");
		System.out.println(treeSet);		//오름차순 정렬 방식
		NavigableSet<Integer> descendingSet = treeSet.descendingSet();
		System.out.println(descendingSet);	//반대로 정렬하여 출력
		
		//NavigableSet<Integer> descendingSet2 = descendingSet.descendingSet();
		Set<Integer> descendingSet2 = descendingSet.descendingSet();
		System.out.println(descendingSet2);
		
		
	}
	
	
	

}
