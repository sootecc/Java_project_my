package chap13.Ex10;

class AAA{
	
	BBB b ;			// BBB : �������̽� Ÿ��, b : ���� ����
					// b => null �� ����
	
					//�� �Ҵ� ���:
					// 1. ��ü ���� �� ���� �Ҵ�.
					// 2. �����ڸ� ���ؼ� ���� �Ҵ�.
					// 3. setter�� ���ؼ� ���� �Ҵ�.
					
	AAA(){}
	AAA(BBB b){
		this.b = b;
	}
	
	
	
	public void setBBB(BBB b) {
		this.b = b;
	} 
	
	interface BBB{
		
		void play();
		void stop();
		
	}		//interface�� �������̵� �ϴ� ������ ������ �ʿ��ϴ�.
	
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_1_1 {
	public static void main(String[] args) {
	
		
		//3. setter�� ���Ͽ� ���� �Ҵ�
		AAA a = new AAA();
		a.setBBB(new AAA.BBB() {
			
			@Override
			public void stop() {
				System.out.println("����");
			}
			
			@Override
			public void play() {
				System.out.println("���");
			}
		});
	
		a.abc();
		System.out.println("===================================");
		
		
		// 1. ��ü ���� �� �ʵ��� ���� �Ҵ�
		AAA a1 = new AAA();
		a1.b = (AAA.BBB) new AAA.BBB() {
			@Override
			public void play() {
				System.out.println("±±");
			}
			@Override
			public void stop() {
				System.out.println("���� �ϴ��� ���ϴ�.");
			}
		};			//�������̽� AAA.BBB
		
		a1.abc();
		System.out.println("===================================");
		

		//2. �����ڸ� ���ؼ� �� �Ҵ�
		AAA a2 = new AAA(
			new AAA.BBB(){
			@Override
			public void stop() {
				System.out.println("���� ����");
			}
			@Override
			public void play() {
				System.out.println("���� �÷��� ����");
			}
		}		
				
		);				//������ ���ο� AAA.BBB Ÿ���� ��ü ���� �� ����
		
		
		a2.abc();
		System.out.println("===================================");
		
		
		
		
	}
}
