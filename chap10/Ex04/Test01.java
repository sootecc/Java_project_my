package chap10.Ex04;

class Human{		//부모클래스
	String name;	//인스턴스 필드: 객체화시켜야 사용 가능, Heap에 저장
	int age;	
	
	void eat() {	//인스턴스 메소드: 객체화시켜야 사용 가능, Heap(포인터), 클래스 영역 안에 있는 인스턴스 메소드 영역에 실제 코드 저장 
		System.out.println(this.name+"은(는) 먹습니다.");
	}
	void sleep() {
		System.out.println(this.name+"은(는) 잠을 잡니다.");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println(this.name+ "은(는) 학교에 갑니다.");
	}
}

class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println(this.name+"은(는) 직장에 갑니다.");
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Human h = new Human();	
		h.name = "홍길동";
		h.age = 30;
		h.eat();
		h.sleep();
		
		Student s = new Student();		
		s.name = "신사임당";
		s.age = 23;
		s.eat();
		s.studentID = 1111;
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "BTS";
		w.eat();
		w.sleep();
		w.workerID = 2222;
		w.goToCompany();
		
		Human h1 = new Student();		//업캐스팅
										//h: Human, Student 타입이 모두 저장, Human만 접근 가능
		h1.name = "이순신";
		h1.eat();
		
		//다운캐스팅
		//if 조건을 사용하여 instanceof 처리
		//런타임 오류를 방지하기 위해
		
		System.out.println(h1 instanceof Student);
		System.out.println(h1 instanceof Human);
		if(h1 instanceof Student) {
			Student s1 = (Student) h1;
			s1.studentID = 3333;
			s1.goToSchool();
		}
		
		if(h1 instanceof Worker) {
			Worker w4 = (Worker) h1;	//컴파일 오류는 발생하지 않지만 런타임 오류가 발생한다.
		}									
		else {
			System.out.println("h1은 Worker를 포함하고 있지 않다.");
		}
		
		
	}

}
