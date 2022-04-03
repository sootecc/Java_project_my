package chap10.Ex04;

class Animal3 {			//부모 클래스, 모든 클래스는 Object 클래스를 상속한다. 기본적으로 생략되어 있음
	String name;
	int age;
	
	void cry() {
		System.out.println(this.name+"은(는) 웁니다.");
	}

	@Override						//Object 클래스 안의 toString 메소드
	public String toString() {		//객체의 주소를 출력한다. [패키지명.클래스명@객체 메모리의 해쉬코드]
		return "이름은: "+name+" , 나이는: "+age+"입니다."+super.toString();
	}

	

	
	
}

class Tiger3 extends Animal3{

	Tiger3(){}					//다른 생성자가 객체 내에 존재할 경우 기본 생성자 호출할 때 생략되어 있으면 안된다.
	
	Tiger3(String a, int b){	//생성자: 객체 생성시 메모리의 초기값을 할당할 때 사용
		super.name = a;			//부모(super) 클래스
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();		//super 키워드는 부모클래스, super: 상속 관계일 때 자식 클래스에서 부모 클래스 호출할 때
							//this 키워드는 자기 자신의 객체	
		System.out.println("호랑이는 어흥 하고 웁니다.");
	}						
}

class Cat3 extends Animal3{
	
	Cat3(){}
	
	Cat3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		//super.cry();
		System.out.println("고양이는 야옹");
	}
	
}
class Dog3 extends Animal3{

	Dog3(){}
	
	Dog3(String a, int b){
		super.name = a;
		super.age = b;
	}
	
	@Override
	void cry() {
		System.out.println("개는 멍멍");
	}
	
}



public class Test02 {

	public static void main(String[] args) {
		
		Animal3 a3 = new Animal3();		//a3 객체 생성
		System.out.println(a3);			//객체 자체를 출력할 경우, Object 클래스의 toString 메소드가 호출된다.
										//Object.toString(): 객체 메모리 주소의 해쉬코드를 출력해준다.
										//chap10.Ex04.Animal3@32d2fa64 | [패키지명.클래스명@객체 메모리의 해쉬코드]
		System.out.println(a3.toString());
		System.out.println("========================================");
		//객체 자체를 출력하면 객체의 Object 클래스의 toString 메소드를 호출한다.
		
		Animal3 t3 = new Tiger3();
		Animal3 c3 = new Cat3();
		Animal3 d3 = new Dog3();
		
		t3.cry();		//부모의 cry()를 호출할 경우 오버라이딩된 Tiger3의 cry() 호출
		c3.cry();		//부모의 cry()를 호출할 경우 오버라이딩된 Cat3의 cry() 호출
		d3.cry();
		System.out.println("========================================");
		
		Animal3[] animal3 = {t3,c3,d3};
		for(int i = 0; i<animal3.length;i++) {
			animal3[i].cry();
		}
		System.out.println("========================================");
		
		for(Animal3 k : animal3) {
			k.cry();
		}
		System.out.println("========================================");
		
		Animal3 tt3 = new Tiger3("호랑이",5);
		Animal3 cc3 = new Cat3("고양이",3);
		Animal3 dd3 = new Dog3("개",2);
		
		System.out.println(tt3);	// toString
		System.out.println(cc3);
		System.out.println(dd3);
		
		Animal3[] animal33 = {tt3, cc3, dd3};
		for(int i = 0;i<animal33.length;i++) {
			System.out.println(animal33[i]);
		}
		
		for(Animal3 k : animal33) {
			System.out.println(k);
		}
		System.out.println("========================================");
		
	}

}
