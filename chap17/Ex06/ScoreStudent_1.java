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
	int score;	
}

public class ScoreStudent_1 {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        
        
        boolean run = true;
        int studentNum = 0;
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            
            
            int selectNo = scanner.nextInt();
            
            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                studentNum = scanner.nextInt();	
                arr= new ArrayList<Student>(studentNum);
                //코드 작성 
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            		
            		for(int i = 0; i<studentNum;i++) {
            			Student std = new Student();		//이게 밖에 있다하면?
            			std.score = scanner.nextInt();
            			arr.add(std);
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
              }
        
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
