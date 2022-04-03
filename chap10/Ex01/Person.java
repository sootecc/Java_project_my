package chap10.Ex01;

class Student_sub extends Student{
	//Student_sub는 Student를 상속 받고 있다. Student의 필드와 메소드를 상속 받는다.
	//Student는 Person을 상속 받고 있다. Person의 필드와 메소드를 상속 받는다.
	
	//Student_sub는 Person의 필드와 메소드, Student의 필드와 메소드를 전부 상속 받는다.
	
	String sub1;
	
	void sub1() {
		System.out.println("Student_sub1클래스. 부모의 필드와 메소드를 상속 받는다.");
		System.out.println(this.sub1);
		
	}
}

class Student extends Person{	//대학생 클래스, 부모클래스: Person
		//자식 클래스는 부모 클래스의 멤버를 상속받는다.
	int studentID;
	void goToSchool() {
	System.out.println("Student 자식 클래스의 메소드 goToSchool 호출");
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.studentID);
	}
}

class Worker extends Person{	//직장인 클래스, 부모클래스: Person
	
	int workerID;
	void goToWork() {
	System.out.println("Worker 자식 클래스의 메소드 goToWork 호출");
	System.out.println(this.name);
	System.out.println(this.age);
	System.out.println(this.workerID);
	}
}

public class Person {	//상속: 부모 클래스의 멤버(필드, 메소드, 내부 클래스)를 자식 클래스에게 상속
						//상속의 이점: 
						// 1. 중복된 코드 제거(코드의 재사용)
						// 2. 코드가 간결해짐
						// 3. 다형성 구현(메소드 오버라이딩을 통해)  -> 하나의 메소드 이름을 갖고 여러 형식으로 출력
	String name;
	int age;
	
	void eat() {
		System.out.println("부모 클래스의 eat() 메소드");
	}
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드");
	}

	
	public static void main(String[] args) {
			
		// 1. Person 객체 생성
		Person p = new Person();
			p.name = "홍길동";
			p.age = 11;
			p.eat();
			p.sleep();
			System.out.println("====================================");
			
		
		
		
		
		// 2. Student 객체 생성
		Student s = new Student();		//Person 클래스를 상속, Person 클래스의 필드와 메소드를 사용
										//자식 클래스는 부모 클래스에서 선언된 필드와 메소드 사용 가능
			//Person 클래스의 필드
			s.name = "이순신";
			s.age = 50;
			
			//Student 클래스의 필드
			s.studentID = 20200310;
			
			//Person 클래스의 메소드
			s.eat();
			s.sleep();
			
			//Student 클래스의 메소드
			s.goToSchool();
		
		System.out.println("====================================");
		
		
		
		
		
		// 3. Worker 객체 생성
		Worker w = new Worker();
			
			//Person 클래스의 필드
			w.name = "세종대왕";
			w.age = 60;
			
			//Worker 클래스의 필드
			w.workerID = 20220310;
			
			//Person 클래스의 메소드
			w.eat();
			w.sleep();
			
			//Worker 클래스의 메소드
			w.goToWork();
			
		System.out.println("====================================");
		
		
		
		
		
		
		
		Student_sub sub1 = new Student_sub();
		//클래스 타입 	객체명		
		
			//Person 클래스의 필드와 메소드
			sub1.name = "율곡이이";
			sub1.age = 70;
			sub1.eat();
			sub1.sleep();
			//Student 클래스의 필드와 메소드
			sub1.studentID = 20210310;
			sub1.goToSchool();
			//Student_sub의 필드와 메소드
			sub1.sub1 = "자식의 자식 클래스";
			sub1.sub1();
			
	
			
			
		//업캐스팅===================================================================	
		//객체 생성시 타입 변환
		Person p1 = new Person();		//가능, Person은 Person이다. (자식은 부모다.)
		Person p2 = new Student();		//업캐스팅, Student는 Person이다.
		//Student sp = new Person();	//Person은 Student다.(X)
		Person pw = new Worker();		//업캐스팅 Worker는 Person이다.
		//Worker wp = new Person();		//Person은 Worker다.(X)
		//자식은 부모꺼 받음, 할아버지 할머니도 받음
				
		Person ps1 = new Student_sub();		//업캐스팅: Student_sub 객체를 생성시 부모 데이터 타입으로 형변환
			//Student_sub는 Person 타입으로 업캐스팅, Person클래스의 멤버만 사용 가능 => Person이 돼 버리네?
			
		
			ps1.name = "BTS";	//Person 클래스의 필드와 메소드만 접근 가능, Person이 최상위 부모니까~
			ps1.age = 30;
			ps1.eat();
			ps1.sleep();
			
			
		Student ss1 = new Student_sub();	//업캐스팅: Student_sub를 Student타입으로 업캐스팅
			//Person과 student의 필드와 메소드를 사용 가능, 최상위 부모부터 ~ Student까지
			//Person 클래스의 필드와 메소드
			ss1.name = "SES";
			ss1.age = 30;
			ss1.eat();
			ss1.sleep();
			//Student의 필드와 메소드
			ss1.studentID = 20220310;
			ss1.goToSchool();
			
		
			
		Student_sub ss2 = new Student_sub();	//Person, Student, Student_sub의 필드와 메소드 모두 사용.
			//Person 클래스의 필드와 메소드
			ss2.name = "봄여름가을겨울";
			ss2.age = 40;
			ss2.eat();
			ss2.sleep();
			//Student의 필드와 메소드
			ss2.studentID = 20220310;
			ss2.goToSchool();
			//Student_sub의 필드와 메소드
			ss2.sub1 = "student_sub";
			ss2.sub1();
		
			
			
		//상속 관계에서 객체 생성시 부모 데이터 타입으로 업캐스팅 가능
			//부모 데이터 타입으로 업캐스팅 된 경우 부모와 그 상위 부모들의 필드와 메소드만 사용 가능
			
			//Person <= Student <= Student_sub
			
			Person ps4 = new Student_sub();
			//Student_sub 객체를 생성시 Person타입으로 업캐스팅
			//Student_sub는 Person, Student, Student_sub의 모든 필드와 메소드를 포함하고 있는데
			//그 중 Person 클래스의 필드와 메소드만 접근 가능하게 된다.
			
			Student ss4 = new Student_sub();
			//Student_sub 객체를 생성시 Student타입으로 업캐스팅
			//Student_sub는 Person, Student, Student_sub의 모든 필드와 메소드를 포함하고 있는데
			//그 중 Person, Student 클래스의 필드와 메소드만 접근 가능하게 된다.
			
			Student_sub ss5 = new Student_sub();
			//Student_sub 객체를 생성시 Student_sub타입으로 적용
			//Student_sub는 Person, Student, Student_sub의 모든 필드와 메소드를 포함하고 있는데
			//그 중 Person, Student, Student_sub 클래스의 필드와 메소드에 접근 가능하게 된다.
			
			
			
		
			
			
		//다운 캐스팅: 부모 데이터 타입으로 업캐스팅 된 것을 자식 데이터 타입으로 변환(수동으로 변환)
			
		Student ps5 = (Student) ps4;		//ps4의 접근 가능한 데이터 타입은 Person
					//ps5는 Person, Student 의 필드와 메소드 접근 가능
			ps5.name = "다운 캐스팅";
			ps5.age = 30;
			ps5.studentID = 20220310;	//Student 필드와 메소드 사용 가능
			ps5.goToSchool();			//Student의 메소드 사용
			
		
			
		Student_sub ps6 = (Student_sub)ps4;	//ps4는 Person 데이터 타입에서 Student_sub로 다운캐스팅
					//Student_sub로 다운 캐스팅됨(Person, Student, Student_sub의 필드와 메소드 접근 가능)
			ps6.name = "이용식";
			ps6.age = 30;
			ps6.studentID = 20220310;	//Student
			ps6.sub1 = "student_sub(자식의 자식)";
			
	
			
		
			
	}

}