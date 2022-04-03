package chap14.Ex05;

//자동 리소스(객체) 제거

//필드에 값 할당. 생성자 호출시 필드에 값을 부여

class Abc implements AutoCloseable{
	
	Bcd d;
	
	String name ;
	int studentID, kor, math, eng;
	double avg;	//평균 계산
	
	Abc(){}
	Abc(String name, int studentID, int kor, int math, int eng){
		this.name = name;
		this.studentID = studentID;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	interface Bcd{
		String name = "세종대왕";
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
		System.out.println("이름: "+name+"\n학번: "+studentID+"\n국어 점수: "+kor+"\n영어 점수: "+eng+"\n수학 점수: "+ math+"\n평균: "+avg);
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
		
		//1. 객체의 모든 필드를 초기화하고 자동으로 close
			try(Abc a1 = new Abc("홍길동", 1111, 94, 98, 100);){
				a1.studentGradeCard();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("성적표 오류");
			}
			
		
		//2. 수동 close(), finally 블록에서 close() 호출
			Abc a2 = null; 
			
			try {
				a2 =  new Abc("이순신",2222,49,39,100);
				a2.studentGradeCard();
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("성적표 오류");
			}
			finally {
				if(a2.name != null || a2.studentID != 0 || a2.kor != 0 || a2.math != 0 || a2.eng != 0)
				try {
					a2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		//setter를 통해서 interface 값 할당 
			Abc a3 = new Abc();
			a3.setAbc(new Abc.Bcd() {
				
				double avg = 0.0;
				
				@Override
				public void studentGradeCard() {
					this.avg = (kor + math + eng) / 3.0;
					System.out.println("=================================");
					System.out.println("이름: "+name+"\n학번: "+studentID+"\n국어 점수: "+kor+"\n영어 점수: "+eng+"\n수학 점수: "+ math+"\n평균: "+avg);
					System.out.println("=================================");
				}
			});
			a3.gradeCard();
	}

}
