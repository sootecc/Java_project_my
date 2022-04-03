package chap06_07.EX01;


class Aaa{
	
	String name;		//필드: 객체화 시켜야 사용 가능, 클래스 block에서 선언
	int age;			//필드의 값들은 Heap 영역에 저장, Heap 영역의 변수값들은 자동 초기화
	String email;
	boolean man;
	double weight;
	
	public String getName() {		//메소드
		return name;
	}
	public void setName(String name) {		//인풋되는 변수, 받는 변수 이름, 메모리 이름이 모두 동일할 경우
		this.name = name;					//메모리 이름에 this: 자신의 클래스속'" 변수
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
}





public class CreateObjec_02 {
	public static void main(String[] args) {
		
		//필드의 초기 값을 출력(Heap 영역은 자동 초기화)
		Aaa aaa = new Aaa();	//객체 생성 (aaa)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		System.out.println("================");
		//변수의 값을 직접 대입[Heap]. 보안상 별로
		aaa.name = "홍길동";
		aaa.age	= 30;
		aaa.weight = 70.5;
		aaa.man = true;
		aaa.email = "aaa@aaa.com";
			
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		System.out.println("================");
		//setter를 통해서 값을 대입, 메모리에 값을 넣을 때 제어를 할 수 있다.
			//month 저장하는 변수
		aaa.setName("세종대왕");
		aaa.setAge(60);
		aaa.setEmail("bbb@bbb.com");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		
		//getter를 통해서 메모리의 값을 출력
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.isMan());
		System.out.println(aaa.getWeight());
		
		//하나의 클래스에서 여러개의 객체를 생성 및 사용
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
	
	}
	
	
}
