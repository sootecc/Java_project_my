package chap16.Ex13;

// 두 점의 좌표 값을 사용해서 넓이를 구하는 프로그램을 작성하세요. 제너릭 메소드를 사용

class Point <T,V>{
	
	//한 점의 좌표를 담는 클래스
	T x;
	V y;
	
	Point(T x, V y){	//생성자, Setter  대신 생성자를 사용해서 좌표값 할당
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
}

class GenericMethod {
	
	public static <T,V> double makeRectangle(Point <T,V> p1, Point<T,V> p2) {
		
		double width;
		double height;
		
		width = (double) p1.getX() - (double) p2.getX();
		height = (double) p1.getY() - (double)p2.getY();
		
		
		
		double result = width * height;
		if(result<0) {result *= -1;}
		
		return result;
	}
}




public class Ex_Make_Rectangle {

	public static void main(String[] args) {
		
		Point<Double, Double> p1 = new Point<Double, Double>(1.0,2.0);
		Point<Double, Double> p2 = new Point<Double, Double>(10.0,50.0);
		double rect = GenericMethod.<Double, Double> makeRectangle(p1,p2);	
		
		System.out.println("두 점이 만드는 직사각형의 넓이는: "+ rect);
	}

}
