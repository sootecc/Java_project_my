package chap17.Ex17;

import java.util.LinkedList;
import java.util.Queue;

//Queue : FIFO(First In First Out), ���� �� ���� ���� ���´� 


public class QueueMethod {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		
		//1. ���� ó���� ������ �޼ҵ� (add(), element(), remove())
			//1-1. add(): Queue�� ���� �߰��� ��
							//System.out.println(q1.element());		//����ó���� �� �� �ֱ� ������ ����� ����
				q1.add(3);
				q1.add(4);
				q1.add(5);
		
			//1-2. element()
				System.out.println(q1.element());
			
			//1-3. remove()
				System.out.println(q1.remove());	//3
				System.out.println(q1.remove());	//4
				System.out.println(q1.remove());	//5
				//System.out.println(q1.remove());	//���� ������ ����
		
		//2. ���� ó�� ���� �޼ҵ� (offer(), peek(), poll())		=> �������
		Queue<Integer> q2 = new LinkedList<Integer>();
			
			System.out.println(q2.peek());
			
			//2-1. 	offer(E item) : ���� �߰�
			q2.offer(3);
			q2.offer(4);
			q2.offer(5);
			
			//2-2. E peek() : ����� ���� �̸� ���� ��
			System.out.println(q2.peek());		//3
			
			//2-3. poll() : ���� ������
			System.out.println(q2.poll());
			System.out.println(q2.poll());
			System.out.println(q2.poll());
			System.out.println(q2.poll());		//���� ������ ����ó���� �� �ִ�.
		
		
		
	}

}
