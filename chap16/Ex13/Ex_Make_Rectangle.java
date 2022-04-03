package chap16.Ex13;

// �� ���� ��ǥ ���� ����ؼ� ���̸� ���ϴ� ���α׷��� �ۼ��ϼ���. ���ʸ� �޼ҵ带 ���

class Point <T,V>{
	
	//�� ���� ��ǥ�� ��� Ŭ����
	T x;
	V y;
	
	Point(T x, V y){	//������, Setter  ��� �����ڸ� ����ؼ� ��ǥ�� �Ҵ�
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
		
		System.out.println("�� ���� ����� ���簢���� ���̴�: "+ rect);
	}

}
