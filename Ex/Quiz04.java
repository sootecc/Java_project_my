package Ex;

class E extends Object{		//자바에 모든 클래스는 Object의 자식클래스이다.
								//Object 클래스의 미리 정의된 메소드를 사용할 수 있다.
	
	String name;
	
	E(){}					//기본 생성자: 클래스내의 다른 생성자가 존재할 때 외부에서 기본생성자를 호출할 때 생략되면 안된다.
	E(String name){
		this.name = name;	//매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일할 경우 this
							//this : 자신의 객체
	}
	
	@Override
		public String toString() {	//객체 자체를 출력할 때(println) toString()가 호출
			
			return "이름: "+ name;	//this.name
		}
	@Override
		public boolean equals(Object obj) {		//e2.equals(e3)
		
			if(this.name == ((E)obj).name) {	//obj타입을 E타입으로 다운캐스팅
				return true;
			}
			else {
				return false;
			}
		}
}

class Student1{
	int studentID;
	String name;
	int kor;
	int eng;
	Student1(int studentID, String name, int kor, int eng){
		this.studentID = studentID;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.studentID == ((Student1)obj).studentID){
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String toString() {
		return studentID+", "+name+", "+kor+", "+eng;
	}
	
}

public class Quiz04 {

	public static void main(String[] args) {
		Student1 s1 = new Student1(1111,"홍길동",59,38);
		Student1 s2 = new Student1(3334,"김철수",49,95);
		Student1 s3 = new Student1(2234,"김영희",55,48);
		Student1 s4 = new Student1(1111,"김맹구",98,76);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/*객체의 studentID column을 비교해서 같을 경우 같은 학생이다라고 출력
			== : 기본 타입 (boolean, byte, short, int, long, double, float, char)일 경우 값을 비교
				참조타입인 경우 객체의 주소를 비교한다. 배열, 객체, String(특수함)
			String: toString(), equals()가 값을 비교하도록 재정의 되어있다.
			
		Object의 toString, equals()를 재정의해서 많이 사용한다.
			
			toString(): 객체 자체를 println(a), 패키지이름.클래스이름@해쉬코드
				- 보통 오버라이딩해서 객체의 필드 정보를 출력
			equals(): == 과 같다. 객체의 주소를 비교
				- 재정의하여 객체 내의 특정 필드의 값을 비교
		*/		
		
		Student1[] array = {s1,s2,s3,s4};
		
		for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].equals(array[j])){
					System.out.println(array[i].name+"("+array[i].studentID+") 와 "+array[j].name+"("+array[j].studentID+")는 같은 학생입니다.");
				}
				else {
					System.out.println(array[i].name+"("+array[i].studentID+") 와 "+array[j].name+"("+array[j].studentID+")는 다른 학생입니다.");
				}
			}
		}
		
		E e1 = new E();					//기본 생성자 호출: Heap속의 필드 값은 강제 초기화된다.
		System.out.println(e1.name);	//null
		
		E e2 = new E("고양이");
		System.out.println(e2.name);
		
		E e3 = new E("고양이");
		System.out.println(e2.equals(e3));
		
		System.out.println(e2 == e3);		//참조타입( == ) : 객체의 주소를 비교
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3));	// Object의 equals(): == 객체의 주소를 비교
		//Object의 toString(), equals()는 재정의하여 사용한다.
		
	}

}
