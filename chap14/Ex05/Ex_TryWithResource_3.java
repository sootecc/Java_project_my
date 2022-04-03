package chap14.Ex05;

//�ڵ� ���ҽ�(��ü) ����

//�ʵ忡 �� �Ҵ�. ������ ȣ��� �ʵ忡 ���� �ο�

class Abc implements AutoCloseable{
	
	Bcd d;
	
	String name ;
	int studentID, kor, math, eng;
	double avg;	//��� ���
	
	Abc(){}
	Abc(String name, int studentID, int kor, int math, int eng){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	interface Bcd{
		String name = "�������";
		int studentID = 3333;
		int kor = 100;
		int math = 40;
		int eng = 56;
		void studentGradeCard();
	}
	
	void gradeCard() {
		d.studentGradeCard();
	}
	
	void setAbc(Bcd d) {
		this.d = d;
		this.name = Bcd.name;
		this.studentID = Bcd.studentID;
		this.kor = Bcd.kor;
		this.math = Bcd.math;
		this.eng = Bcd.eng;
		
	}
	
	void studentGradeCard(){
		this.avg = (kor + math + eng) / 3.0;
		System.out.println("=================================");
		System.out.println("�̸�: "+name+"\n�й�: "+studentID+"\n���� ����: "+kor+"\n���� ����: "+eng+"\n���� ����: "+ math+"\n���: "+avg);
		System.out.println("=================================");
	}
	
	@Override
	public void close() throws Exception {
		if(name != null || studentID != 0 || kor != 0 || math != 0 || eng != 0 ) {
			name = null;
			studentID = 0;
			kor = 0;
			math = 0;
			eng = 0;
			
		}
	}
	
	
}


public class Ex_TryWithResource_3 {

	protected Object avg;

	public static void main(String[] args) {
		
		//1. ��ü�� ��� �ʵ带 �ʱ�ȭ�ϰ� �ڵ����� close
			try(Abc a1 = new Abc("ȫ�浿", 1111, 94, 98, 100);){
				a1.studentGradeCard();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("����ǥ ����");
			}
			
		
		//2. ���� close(), finally ��Ͽ��� close() ȣ��
			Abc a2 = null; 
			
			try {
				a2 =  new Abc("�̼���",2222,49,39,100);
				a2.studentGradeCard();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("����ǥ ����");
			}
			finally {
				if(a2.name != null || a2.studentID != 0 || a2.kor != 0 || a2.math != 0 || a2.eng != 0)
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		//setter�� ���ؼ� interface �� �Ҵ� 
			Abc a3 = new Abc();
			a3.setAbc(new Abc.Bcd() {
				
				double avg = 0.0;
				
				@Override
				public void studentGradeCard() {
					this.avg = (kor + math + eng) / 3.0;
					System.out.println("=================================");
					System.out.println("�̸�: "+name+"\n�й�: "+studentID+"\n���� ����: "+kor+"\n���� ����: "+eng+"\n���� ����: "+ math+"\n���: "+avg);
					System.out.println("=================================");
				}
			});
			a3.gradeCard();
	}

}
