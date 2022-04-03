package chap13.Ex10;

class Ab{		
				
	Def d;		
	
	Ab(){}
	Ab(Def d){
		this.d = d;
	}

	void setDef(Def d) {
		this.d = d;
	}
	
	interface Def{
		void run();
		void fly();
	}
	
	void out() {
		d.run();
		d.fly();
		
	}
}



public class InnerInterface_1_3 {

	public static void main(String[] args) {
		//1. ��ü ���� �� �ʵ忡 ���� �� �Ҵ�(d1)
		Ab d1 = new Ab();
		d1.d = (Ab.Def) new Ab.Def(){
			
			public void run() {
			}
			public void fly() {
			}
		};		
		
		//2. �����ڸ� ���ؼ� �� �Ҵ�(d2)
		Ab d2 = new Ab(new Ab.Def() {
			@Override
			public void run() {
			}
			@Override
			public void fly() {
			}
		});

		
		
		//3. setter�� ���ؼ� �� �Ҵ�(d3)
		Ab d3 = new Ab();
		d3.setDef(new Ab.Def() {
			@Override
			public void run() {
			}
			@Override
			public void fly() {
			}
		});
		
		
	}

}
