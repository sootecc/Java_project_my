package chap05;

public class ArgumentOfMainMethod {
		
	public static void main(String[] args) {		//���� �޼ҵ�[�Լ�]
		//method�� �⺻ ����
		/*
		 * void main(String[] args){		void: ���ϰ��� ������ ����
		  		�޼ҵ带 ȣ��� ������ �ڵ�;		main: �޼ҵ��
		   }								(��ǲ �Ű�����) 
		 */									
		 
		String a = args[0];		//"�ȳ��ϼ���": ���ڿ� ����
		String b = args[1];		//3: ����
		String c = args[2];		//3.8: �Ǽ�
								//������ String type���� input �޾ұ� ������ String���� �޾�����Ѵ�.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("--------------------------------------------");
		
		//main method�� ���ڰ����� ������ �Ǽ��� �Ѱ��� �� String���� ��ȯ
		System.out.println(b+1);		//31
		System.out.println(c+1);		//3.81
		System.out.println();
		
		//String�� ������ ���������� ��ȯ�Ͽ� ����
		int d = Integer.parseInt(b);		//b(String) => integer Ÿ������ ��ȯ
		double e = Double.parseDouble(c);	//c(String) => double Ÿ������ ��ȯ
		
		System.out.println(d+1);			//4
		System.out.println(e+1);			//4.8
		
		
		
		
		
	}
	
	
	
	
	

}
