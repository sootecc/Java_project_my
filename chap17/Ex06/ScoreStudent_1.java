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
            System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
            System.out.println("----------------------------------------------------");
            System.out.println("����> ");
            
            
            int selectNo = scanner.nextInt();
            
            if(selectNo == 1) {
                System.out.println("�л����� �Է��ϼ��� : ");
                studentNum = scanner.nextInt();	
                arr= new ArrayList<Student>(studentNum);
                //�ڵ� �ۼ� 
                System.out.println("�Է¿Ϸ�");
                
            } else if(selectNo == 2) {
            		
            		for(int i = 0; i<studentNum;i++) {
            			Student std = new Student();		//�̰� �ۿ� �ִ��ϸ�?
            			std.score = scanner.nextInt();
            			arr.add(std);
            		}
               
            } else if(selectNo == 3) {
            	for(int i = 0; i < studentNum;i++) {		//arr.size�� ������? 
            		System.out.println(arr.get(i).score);
        		}
             
            } else if(selectNo == 4) {
            	//�ڵ��ۼ�
            	
            	int maxScore = 0;
            	int sum =0;
            	for(int i = 0; i<arr.size();i++) {
            		if(maxScore < arr.get(i).score) {
            			maxScore = arr.get(i).score;
            			
            		}
            		sum += arr.get(i).score;
        		}
            	
            	
            	
            		
            	System.out.println("�ְ����� : " + maxScore);
            	System.out.println("������� : " + (float) sum / studentNum);
         
            } else if(selectNo == 5) {
            	break;
              }
        
        }
        scanner.close();
        System.out.println ("���α׷� ����");
	}
}
