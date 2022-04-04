package chap17.Ex06;

import java.util.ArrayList;
import java.util.Scanner;

/*
 		1. 학생 수: 5. 임의의 값을 입력했을 때 ArrayList의 capacity 크기지정
 		2. 점수 입력: 입력 받은 학생 수에 따라서 점수 입력. ArrayList에 객체를 저장
 		3. 점수 리스트: ArrayList에 저장된 Student 객체를 가져와서 score 출력
 		4. 분석: 최고점 : , 평균 점수:
 		5. 종료
 	
 */

class Student{
	int score;		//점수를 입력 받는 변수, 필드의  값 할당.(1. 객체 생성 후 직접 값을 넣는다. 2. private(생성자나 getter setter) 3.
	
	Student(){}
	Student(int score){
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);			//System.in: 콘솔을 통해서 값을 받겠다.
        
        
        boolean run = true;
        int studentNum = 0;			//while 블록 밖에서 선언, 전역 변수
        while(run) {					//run: true
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt();
            
            
            
            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                studentNum = scanner.nextInt();				//학생 수 인풋
                arr= new ArrayList<Student>(studentNum);
                //코드 작성 
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		
            	if(studentNum == 0) {		//studentNum을 할당 받아야 for문의 범위를 지정할 수 있다.
            		System.out.println("학생 수를 먼저 입력하세요.");
            	}
            	else {
	        		for(int i = 0; i<studentNum;i++) {		//for문을 통해서 인풋 받은 학생 수 만큼 점수를 입력.
	        			Student std = new Student();		//이게 밖에 있다하면?
	        			//인풋 받은 값을 Student  객체의 score 변수에 할당 -> 객체를 생성해야한다.
	        			
	        			System.out.println((i+1)+ "번째 학생 점수를 입력하세요. ");
	        			
	        			//std.score = scanner.nextInt();	//직접 할당
	        			std.setScore(scanner.nextInt()); 	//이렇게도 가능
	        			arr.add(std);		//ArrayList의 필드에 값을 할당한 객체를 ArrayList에 저장
	        			System.out.println("입력 완료");		//입력 완료 출력 후 개행
	        		}
            	}
               
            } else if(selectNo == 3) {		//점수 리스트 출력, ArrayList 각 점수가 할당된 객체가 저장, 객체 생성 후 필드의 값을 직접 출력 or getter를 통해 출력
            	
            	if(studentNum ==0 ) {
            		System.out.println("학생 수를 먼저 입력하세요.");
            	}
            	else {
	            	for(int i = 0; i < studentNum;i++) {		//arr.size로 돌리면?-> 별 차이 없는 듯 하다.   //ArrayList 객체를 가져와서 Student.sscore 필드의 값을 출력
	            		System.out.print((i+1) +"번째 학생의 점수: ");
	            		Student std = arr.get(i); // ArrayList의 get()을 사용하여 각 방의 Student 객체를 가져온다.
	            		
	            		//System.out.println(arr.get(i).score);		
	            		//System.out.println(std.score);
	            		System.out.println(std.getScore());
	            		
	            		//중요한 것은 객체에 저장한다는 것!!!!
	            		//콜렉션안에 값을 넣을 때 객체를 만들어서 하는 경우가 너무너무 많다.
	        		}	
            	}
            	
            	
             
            } else if(selectNo == 4) {
            	//코드작성
            	if(studentNum == 0) {
            		System.out.println("학생 수를 먼저 입력하세요.");
            	}
            	else {
            		int maxScore = 0;		
                	int sum =0;
                	
                	//1. ArrayList의 객체를 갖고 온다.
            		//2. Student 객체의 score 필드 값을 가져와서 처리
                	
                	for(int i = 0; i<arr.size();i++) {
                		Student std = arr.get(i);
                		maxScore = (std.score > maxScore) ? std.score : maxScore;	//삼항 연산자 이렇게 사용 가능
                		
                		
                		/*if(maxScore < arr.get(i).score) {
                			maxScore = arr.get(i).score;
                   		}*/
                		
                		//sum += arr.get(i).score;
                		sum += std.score;
                		
                		
                	}
                	//출력
                	System.out.println("최고점수 : " + maxScore);
                	System.out.println("평균점수 : " + (float) sum / studentNum);
            	}
            	
            	
            	
            		
            	
         
            } else if(selectNo == 5) {
            	break;
            	//run = false; 도 가능
              }
        
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
