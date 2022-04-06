package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out), 먼저 들어간 것이 먼저 나온다 


public class QueueMethod {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		
		//1. 예외 처리를 미포함 메소드 (add(), element(), remove())
			//1-1. add(): Queue에 값을 추가할 때
							//System.out.println(q1.element());		//예외처리가 안 돼 있기 때문에 실행시 오류
				q1.add(3);
				q1.add(4);
				q1.add(5);
		
			//1-2. element()
				System.out.println(q1.element());
			
			//1-3. remove()
				System.out.println(q1.remove());	//3
				System.out.println(q1.remove());	//4
				System.out.println(q1.remove());	//5
				//System.out.println(q1.remove());	//값이 없으면 오류
		
		//2. 예외 처리 포함 메소드 (offer(), peek(), poll())		=> 권장사항
		Queue<Integer> q2 = new LinkedList<Integer>();
			
			System.out.println(q2.peek());
			
			//2-1. 	offer(E item) : 값을 추가
			q2.offer(3);
			q2.offer(4);
			q2.offer(5);
			
			//2-2. E peek() : 출력할 값을 미리 보는 것
			System.out.println(q2.peek());		//3
			
			//2-3. poll() : 값을 꺼내기
			System.out.println(q2.poll());
			System.out.println(q2.poll());
			System.out.println(q2.poll());
			System.out.println(q2.poll());		//값이 없지만 예외처리가 돼 있다.
		
		
		
	}

}
