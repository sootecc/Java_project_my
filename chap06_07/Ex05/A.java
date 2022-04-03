package chap06_07.Ex05;

	//접근 제어자(캡슐화, 데이터를 외부로부터 보호): public, protected, default, private
		//클래스 이름, 필드명, 메소드명, 생성자명 < 접근제어자가 반드시 할당되어 있다.
		//클래스 이름: public, default

public class A {

		int m = 3;	//필드의 기본 접근 제어자는 default, 생략됨
		int n = 4;	//default: 다른 패키지의 클래스에서는 접근 불가
				
					//private: 외부 클래스에서 접근이 불가능
		public int k = 10;	//public: 다른 패키지에서 접근 가능
		
		void print() {		//default: 같은 패키지내의 클래스에서만 사용 가능
			System.out.println("import success "+ m+" , "+n);
		}
		public void print2() {
			System.out.println("외부패키지의 다른 클래스에서 접근 가능" + k);
		}
	public static void main(String[] args) {

	}

}
