package chap05;

public class ArgumentOfMainMethod_2 {
	public static void main(String[] args) {
		
		//main method�� ��ǲ �Ű������� ������ �迭�� ���̸� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//�Է� �Ű������� for������ ��� 
		for(int i = 0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("====================");
		
		
		//�Էµ� �Ű������� enhanced for������ ���
		for(String k : args) {
			System.out.println(k);
		}
		
		
			
		
		
	}
}
