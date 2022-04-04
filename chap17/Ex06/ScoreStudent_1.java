package chap17.Ex06;

import java.util.ArrayList;
import java.util.Scanner;

/*
 		1. �л� ��: 5. ������ ���� �Է����� �� ArrayList�� capacity ũ������
 		2. ���� �Է�: �Է� ���� �л� ���� ���� ���� �Է�. ArrayList�� ��ü�� ����
 		3. ���� ����Ʈ: ArrayList�� ����� Student ��ü�� �����ͼ� score ���
 		4. �м�: �ְ��� : , ��� ����:
 		5. ����
 	
 */

class Student{
	int score;		//������ �Է� �޴� ����, �ʵ���  �� �Ҵ�.(1. ��ü ���� �� ���� ���� �ִ´�. 2. private(�����ڳ� getter setter) 3.
	
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
        Scanner scanner = new Scanner(System.in);			//System.in: �ܼ��� ���ؼ� ���� �ްڴ�.
        
        
        boolean run = true;
        int studentNum = 0;			//while ���� �ۿ��� ����, ���� ����
        while(run) {					//run: true
            System.out.println("----------------------------------------------------");
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            int selectNo = scanner.nextInt();
            
            
            
            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();				//�л� �� ��ǲ
                arr= new ArrayList<Student>(studentNum);
                //�ڵ� �ۼ� 
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		
            	if(studentNum == 0) {		//studentNum�� �Ҵ� �޾ƾ� for���� ������ ������ �� �ִ�.
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	}
            	else {
	        		for(int i = 0; i<studentNum;i++) {		//for���� ���ؼ� ��ǲ ���� �л� �� ��ŭ ������ �Է�.
	        			Student std = new Student();		//�̰� �ۿ� �ִ��ϸ�?
	        			//��ǲ ���� ���� Student  ��ü�� score ������ �Ҵ� -> ��ü�� �����ؾ��Ѵ�.
	        			
	        			System.out.println((i+1)+ "��° �л� ������ �Է��ϼ���. ");
	        			
	        			//std.score = scanner.nextInt();	//���� �Ҵ�
	        			std.setScore(scanner.nextInt()); 	//�̷��Ե� ����
	        			arr.add(std);		//ArrayList�� �ʵ忡 ���� �Ҵ��� ��ü�� ArrayList�� ����
	        			System.out.println("�Է� �Ϸ�");		//�Է� �Ϸ� ��� �� ����
	        		}
            	}
               
            } else if(selectNo == 3) {		//���� ����Ʈ ���, ArrayList �� ������ �Ҵ�� ��ü�� ����, ��ü ���� �� �ʵ��� ���� ���� ��� or getter�� ���� ���
            	
            	if(studentNum ==0 ) {
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	}
            	else {
	            	for(int i = 0; i < studentNum;i++) {		//arr.size�� ������?-> �� ���� ���� �� �ϴ�.   //ArrayList ��ü�� �����ͼ� Student.sscore �ʵ��� ���� ���
	            		System.out.print((i+1) +"��° �л��� ����: ");
	            		Student std = arr.get(i); // ArrayList�� get()�� ����Ͽ� �� ���� Student ��ü�� �����´�.
	            		
	            		//System.out.println(arr.get(i).score);		
	            		//System.out.println(std.score);
	            		System.out.println(std.getScore());
	            		
	            		//�߿��� ���� ��ü�� �����Ѵٴ� ��!!!!
	            		//�ݷ��Ǿȿ� ���� ���� �� ��ü�� ���� �ϴ� ��찡 �ʹ��ʹ� ����.
	        		}	
            	}
            	
            	
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	if(studentNum == 0) {
            		System.out.println("�л� ���� ���� �Է��ϼ���.");
            	}
            	else {
            		int maxScore = 0;		
                	int sum =0;
                	
                	//1. ArrayList�� ��ü�� ���� �´�.
            		//2. Student ��ü�� score �ʵ� ���� �����ͼ� ó��
                	
                	for(int i = 0; i<arr.size();i++) {
                		Student std = arr.get(i);
                		maxScore = (std.score > maxScore) ? std.score : maxScore;	//���� ������ �̷��� ��� ����
                		
                		
                		/*if(maxScore < arr.get(i).score) {
                			maxScore = arr.get(i).score;
                   		}*/
                		
                		//sum += arr.get(i).score;
                		sum += std.score;
                		
                		
                	}
                	//���
                	System.out.println("�ְ����� : " + maxScore);
                	System.out.println("������� : " + (float) sum / studentNum);
            	}
            	
            	
            	
            		
            	
         
            } else if(selectNo == 5) {
            	break;
            	//run = false; �� ����
              }
        
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}