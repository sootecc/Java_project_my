package chap06_07.EX02;

class Abc{
	int m = 3;		//필드 heap에 저장, 객체화 시켰을 때 사용 가능
	int n = 4;
	
	void work1() {				//인풋값 없는 메소드
		int k = 5;				//지역변수: stack 영역에 저장, 메소드 종료시 사라진다
		System.out.println(k);
		work2(3);				//다른 메소드 호출
	}
	
	void work2(int i) {
		int j = 4;					//지역변수
		System.out.println(i+j);
		
		int l;						//지역변수이므로 자동 초기화가 되지 않는다.
		l=2;
		System.out.println(l);
	}
	
}



public class FieldComponent {

	public static void main(String[] args) {
		
		//클래스를 활용하여 객체 생성
		Abc abc = new Abc();
		
		System.out.println(abc.m);
		System.out.println(abc.n);
		
		//메소드 호출
		abc.work1();
	
	}

}
