package Ex;


import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//임의의 운동 이름을 넣고 해당 운동의 구성원(명수)를 넣어서 출력하는 프로그램을 작성
		// 전체 합 및 평균도 출력
		
		/*
		 * 예)
		 * 입력>>
		 * 탁구 2 야구 9 축구 11 농구 6 씨름 2
		 * 
		 * 출력>>
		 * 탁구:2, 야구:9, 축구:11, 농구:6, 씨름:2
		 * 운동종목의 구성원 총 합계:
		 * 운동종목의 평균 구성원 수:
		 * 
		 * "그만" 이라고 입력하면 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {						//do while로 사용할 때의 장점은?
			System.out.println("입력>> ");
			String input = sc.nextLine();	//전체 String 값을 인풋받는 변수, .next(): 공백까지 인풋
			
			if(input.equals("그만")) {break;}
			else {
				Calc(Divide_Transform(input));
			}
		}
	}
	
	
	
	
	static int[] Divide_Transform(String input) {
		String split[] = input.split(" ");
		int number[] = new int[split.length/2];
		
		for(int i=0; i<split.length/2;i++) {
			number[i] = Integer.parseInt(split[2*i+1]);			//%연산으로 짝, 홀 구분하는 법도 있다.		
			System.out.print(split[2*i]+":"+number[i]+" ");
		}	//홀수 인덱스의 integer값 추출&앞부분 출력
		
		System.out.println();
		return number;
	}
	
	
	static void Calc(int[] number) {
		int sum = 0;
		
		for(int k : number) {sum+=k;}
		System.out.println("운동종목의 구성원 총 합계: "+sum);
		System.out.println("운동종목의 평균 구성원 수: "+(double)sum/number.length);
	}
	
	

}
