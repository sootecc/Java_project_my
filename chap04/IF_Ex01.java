package chap04;

public class IF_Ex01 {

	public static void main(String[] args) {

		// if��:
		/*
		 * if(����) { ������ ���� �� ����� �ڵ�; }
		 */

		int value1 = 5;
		if (value1 > 3) {
			System.out.println("����1: true");
		}

		System.out.println("===========================");

		/*
		 * if(����) {
		 * 		������ ���� �� ����� �ڵ�;
		 *  } 
		 * else {
		 * 		�� �ܿ� ����� �ڵ�;
		 * }
		 */

		boolean bool1 = true;
		boolean bool2 = false;

		if (bool1) {
			System.out.println("����2: true");
		}
		else {
			System.out.println("����2: false");
		}

		System.out.println("===========================");

		if (bool2) {
			System.out.println("����3: true");
		}
		else {
			System.out.println("����3: false");
		}
		
		System.out.println("===========================");
		
		//if ~ else�� ���� �����ڷ� ��ȯ ����
	
		System.out.println((bool1)?"����4: true":"����4: false");
		System.out.println((bool2)?"����5: true":"����5: false");
		
		System.out.println("===========================");

		/*
		 * if�� ������ ���� �� �� ��
		 * 
		 * if (����1) {
		 * 		����1�� ���� �� ����
		 * }
		 * else if (����2) {
		 * 		����2�� ���� �� ����
		 * }
		 * else if (����3) {
		 * 		����3�� ���� �� ����
		 * }
		 * else {
		 * 		�� ���� ������ �� ����
		 * }
		 */
		
		int value3 = 85;
		if (value3 >= 90) {
			System.out.println("A����, ����: " +value3);
		}
		else if (value3 >= 80) {
			System.out.println("B����, ����:" +value3);	//���� �� if���� �������´�
		}
		else if (value3 >= 70) {
			System.out.println("C����, ����: " +value3);
		}
		else {
			System.out.println("F����, ����: "+value3);
		}
		
		/*
		 * IF������ ������ ������ �ٲ�� ���� ���
		 */
		
		value3= 85;
		if (value3 >= 90) {
			System.out.println("A����, ����: " +value3);
		}
		else if (value3 >= 70) {
			System.out.println("C����, ����:" +value3);	//���� �� if���� �������´�
		}
		else if (value3 >= 80) {
			System.out.println("B����, ����: " +value3);
		}
		else {
			System.out.println("F����, ����: "+value3);
		}
		
		//������ ���� �� ���� ������ �����ϸ� �����ϰ� �������־�� �Ѵ�.
		
		value3= 85;
		if (value3 <= 100 && value3 >= 90) {
			System.out.println("A����, ����:"+value3);
		}
		else if (value3 < 80 && value3 >= 70) {
			System.out.println("C����, ����:"+value3);	
		}
		else if (value3 < 90 && value3 >= 80) {
			System.out.println("B����, ����:"+value3);
		}
		else {
			System.out.println("F����, ����:"+value3);
		}
		
		System.out.println("===========================");
		
		
		/*
		 * if������ ���๮�� �߰�ȣ{}�� ������ �� �ִ�.
		 */
		
		if(3 < 5)
			System.out.println("�ȳ��ϼ���");	//if���� �߰�ȣ{}�� ���� ������ ���
		
		System.out.println("===========================");
			
		if(3 > 5)
			System.out.println("�ȳ��ϼ��� 2");	//{}�����ϸ� �� �ٸ� ����κ� 
			System.out.println("�ݰ����ϴ�");
		
		//else�� �� �� �����ϸ� �ȵ�!
	}
	

}
