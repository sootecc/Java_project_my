package chap17.Ex17;

import java.util.Stack;

//Stack �ڷᱸ�� : LIFO(Last In First Out) �������� �� ���� ó������ ���´�. 

public class StackMethod {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack =new Stack<Integer>();
		
		//1. E push(E element) : ���ÿ� ���� ���� �� ���
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		
		//2. E peek() : ������ ���� ������ �Ĵٺ�
		System.out.println(stack.peek());	//7
		System.out.println(stack.size());	//4
		System.out.printf("%s",System.lineSeparator());
		
		//3. search(Object o) : �˻�(���� �־��� �� index ��ȣ�� ���, ����: �� ��ȣ�� 1������ ������ �Ҵ�ȴ�.)
	
		System.out.println(stack.search(7));	//1
		System.out.println(stack.search(3));	//2
		System.out.println(stack.search(5));	//3
		System.out.println(stack.search(2));	//4
		System.out.println(stack.search(9));	//���� �������� ���� ���: -1�� ����
		
	
		//4. E pop() : ���ÿ� �ִ� ���� ��������, ���� �������� ���� ������ ������ �� �ִ�.
		System.out.println(stack.pop());	//7
		System.out.println(stack.pop());	//3
		System.out.println(stack.pop());	//5
		System.out.println(stack.pop());	//2
		
		
		//5. boolean empty() : ������� �� true�� ����
		System.out.println(stack.empty());
		
	
	
	
	
	}
}
