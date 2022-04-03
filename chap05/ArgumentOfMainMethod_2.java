package chap05;

public class ArgumentOfMainMethod_2 {
	public static void main(String[] args) {
		
		//main method의 인풋 매개변수로 들어오는 배열의 길이를 구하기
		System.out.println(args.length);
		System.out.println();
		
		//입력 매개변수를 for문으로 출력 
		for(int i = 0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		System.out.println("====================");
		
		
		//입력된 매개변수를 enhanced for문으로 출력
		for(String k : args) {
			System.out.println(k);
		}
		
		
			
		
		
	}
}
