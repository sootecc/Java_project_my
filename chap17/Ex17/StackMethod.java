package chap17.Ex17;

import java.util.Stack;

//Stack 자료구조 : LIFO(Last In First Out) 마지막에 들어간 값이 처음으로 나온다. 

public class StackMethod {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack =new Stack<Integer>();
		
		//1. E push(E element) : 스택에 값을 넣을 때 사용
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		//2. E peek() : 가져올 값을 위에서 쳐다봄
		System.out.println(stack.peek());	//7
		System.out.println(stack.size());	//4
		System.out.printf("%s",System.lineSeparator());
		
		//3. search(Object o) : 검색(값을 넣었을 때 index 번호를 출력, 주의: 방 번호는 1번부터 위에서 할당된다.)
	
		System.out.println(stack.search(7));	//1
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(5));	//3
		System.out.println(stack.search(2));	//4
		System.out.println(stack.search(9));	//값이 존재하지 않을 경우: -1을 리턴
		
	
		//4. E pop() : 스택에 있는 값을 가져오기, 제일 마지막에 넣은 값부터 가져올 수 있다.
		System.out.println(stack.pop());	//7
		System.out.println(stack.pop());	//3
		System.out.println(stack.pop());	//5
		System.out.println(stack.pop());	//2
		
		
		//5. boolean empty() : 비어있을 때 true를 리턴
		System.out.println(stack.empty());
		
	
	
	
	
	}
}
