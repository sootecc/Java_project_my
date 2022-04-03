package chap13.Ex10;

class Abc{		
				
	Def d;		
	
	Abc(){}
	Abc(Def d){
		this.d = d;
	}
	
	void setAbc(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void ghi() {
		d.run();
		d.fly();
		
	}
}



public class InnerInterface_1_2 {

	public static void main(String[] args) {
		//1. ��ü ���� �� �ʵ忡 ���� �� �Ҵ�(d1)
		Abc d1 = new Abc();
		d1.d = (Abc.Def) new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d1 �޸���");
			}
			
			@Override
			public void fly() {
				System.out.println("d1 ����");
			}
		};
		d1.ghi();
		
		//2. �����ڸ� ���ؼ� �� �Ҵ�(d2)
		Abc d2 = new Abc(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d2 �޸���");
			}
			
			@Override
			public void fly() {
				System.out.println("d2 ����");
			}
		});
		d2.ghi();
		
		
		//3. setter�� ���ؼ� �� �Ҵ�(d3)
		Abc d3 = new Abc();
		d3.setAbc(new Abc.Def() {
			
			@Override
			public void run() {
				System.out.println("d3 �޸���");
			}
			
			@Override
			public void fly() {
				System.out.println("d3 ����");
			}
		});
		d3.ghi();
		
		
	}

}
