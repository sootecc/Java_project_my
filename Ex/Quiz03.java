package Ex;

class Student{
	String name;		//학생 이름
	int studentID;		//학번
	int kor;			//국어 점수
	int eng;			//영어 점수
	int math;			//수학 점수
	int sum;			//점수 합계
	double avg;			//점수 평균

	void hobby() {
		System.out.println("학생의 취미는"+ "입니다.");
	}

	@Override
	public String toString() {
		return "이름: "+name+", 학번: "+studentID+", 국어: "+kor+", 영어: "+eng+", 수학: "+math+", 점수 합계: "+sum+", 평균: "+avg;
	}
}

class S_철수 extends Student{
	
	
	S_철수(){}
	S_철수(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
		System.out.println("철수의 취미는 낚시입니다.");
	}
}
class S_영희 extends Student{
	
	S_영희(){}
	S_영희(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
		System.out.println("영희의 취미는 음악듣기입니다.");
	}
}

class S_영식 extends Student{
	
	S_영식(){}
	S_영식(String name, int StudentID, int kor, int eng, int math){
		super.name = name;
		super.studentID = StudentID;
		super.kor = kor;
		super.eng = eng;
		super.math = math;
		super.sum = kor + eng + math;
		super.avg = (kor + eng + math) / 3.0;
		
	}
	@Override
	void hobby() {
	System.out.println("영식의 취미는 책읽기입니다.");
	}
}



public class Quiz03 {

	public static void main(String[] args) {
		
		Student one = new S_철수("철수",1111,20,30,40);
		Student two = new S_영희("영희",2222,50,36,44);
		Student three = new S_영식("영식",3333,73,57,98);
		
		Student[] arr = {one, two, three};
		
		for(Student k : arr) {
			System.out.println(k);
			k.hobby();
			System.out.println("=======================");
		}
		
		
	}

}
