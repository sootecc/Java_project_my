package chap15.Ex01;







public class TheNeedForThread {
	public static void main(String[] args) {
		
		//1. ���� ������ 1 ~ 5 �� �ִ�.
		int[] intArray = {1, 2, 3, 4, 5};
		
		//2. �ڸ� ������: �ϳ� ~ �ټ� �� �ִ�.
		String[] strArray = {"�ϳ�", "��", "��", "��", "�ټ�"};
		
		//3. ���� ������ ���
		for(int i=0; i<intArray.length; i++) {
			System.out.println("(���� ������)"+intArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.2�� ���� �Ͻ�����
		}
		
		//4. �ڸ� ������ ���
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println("(�ڸ� ������)"+strArray[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //0.2�� ���� �Ͻ�����
		}
		
		
	}

}
