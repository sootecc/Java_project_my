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
	        			
	        			//std.score = scanner.nextInt();	//직접 할당
	        			System.out.println((i+1)+ "번째 학생 점수를 입력하세요. ");
	        			std.setScore(scanner.nextInt()); 	//이렇게도 가능
	        			arr.add(std);
	        		}
            	}
               
            } else if(selectNo == 3) {
            	for(int i = 0; i < studentNum;i++) {		//arr.size로 돌리면? 
            		System.out.println(arr.get(i).score);
        		}
             
            } else if(selectNo == 4) {
            	//코드작성
            	
            	int maxScore = 0;
            	int sum =0;
            	for(int i = 0; i<arr.size();i++) {
            		if(maxScore < arr.get(i).score) {
            			maxScore = arr.get(i).score;
            			
            		}
            		sum += arr.get(i).score;
        		}
            	
            	
            	
            		
            	System.out.println("최고점수 : " + maxScore);
            	System.out.println("평균점수 : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	break;
            	//run = false; 도 가능
              }
        
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
