package chap13.Ex10;

class Button{
	//OnClickListener: 객체 타입, ocl: 참조변수
	OnClickListener ocl;		//  기본값으로 null
	
	
	//setter를 통해서 OnClickListener의 참조 변수 ocl에 객체 주소를 담는다.
	void setOnClickListener(OnClickListener ocl) {	
		this.ocl = ocl;				
	}

	//인터페이스만 존재하고 구현한 자식 클래스가 없다.
	//호출하는 곳에서 onClick()을 재정의하여 호출
	interface OnClickListener{	//이너 인터페이스, static 키 생략되어 있음, Button.OnClickListener
		void onClick();			//메소드 선언만 됨. 하위에서 오버라이딩하여 재정의
	}

	void click() {				//실행했을 떄 ocl.OnClick()을 호출
		ocl.onClick();
		System.out.println(ocl);
	}
}





public class ButtonAPIExample {

	public static void main(String[] args) {
		
		Button button1 = new Button();
		
		
		//A.B a = new A.B(){이너 인터페이스B의 메소드를 구현한 코드};
		
		//OnClickListener 객체 타입으로 객체 생성 매개변수 전달
		
		//개발자 1: 클릭 시 음악 재생
		button1.setOnClickListener(new Button.OnClickListener() {		//OnClickListener 객체타입으로 객체 생성
			
			@Override
			public void onClick() {
				System.out.println("개발자1. 음악 재생");
			}
		}
		);
		
		button1.click();
		
		
		System.out.println("====================");
		
		//개발자 2: 클릭 시 네이버 접속
		Button button2 = new Button();
		///setOnClickListener 메소드에 매개변수로 OnClickListener의 하위 익명 객체를 생성 후 OnClickListener
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("개발자2. 네이버 접속");
			}
		});
		
		button2.click();
		
		
	}

}
