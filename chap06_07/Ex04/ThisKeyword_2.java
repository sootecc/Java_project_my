package chap06_07.Ex04;

//명시적 this 키워드 추가: 반드시 this key를 사용해야 되는 경우

class Aa{		//this key를 사용하지 않은 경우: 지역변수로 인식
	int m ;
	int n ;
	void init(int m, int n) {
		m = m;					//this 키를 사용하지 않는 경우 m은 지역변수를 뜻한다
		n = n;
	}
	
}

class Bb{		//this key를 사용하는 경우
	int m; 
	int n;
	void init(int m, int n) {
		this.m = m;		//반드시 this 키를 명시적으로 사용해서 m이 필드의 m이란 것을 알려줘야 한다. 
		this.n = n;
	}
	
	
}



public class ThisKeyword_2 {

	public static void main(String[] args) {
		
		//1. 필드 변수명과 지역 변수명이 같은 경우 (this 키를 사용하지 않은 경우)
		Aa a = new Aa();
		a.init(2, 3);						
		System.out.println(a.m +" "+ a.n);	//0 0
		//2. 필드 변수명과 지역 변수명이 같은 경우 (this 키를 사용한 경우)
		Bb b = new Bb();					
		b.init(2, 3);						
		System.out.println(b.m +" "+ b.n);	//2 3
		
	}

}
