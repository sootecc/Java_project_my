package test;
// 객체간의 협업

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  
 * 학생	: 용돈 100,000
 * 			     		버스를 탈때(-1000원)			지하철을 탈때(-1,500원) 
 * 버스	:1,000원			승객 수 증가 수입 증가			
 * 지하철 :1,500원										승객 수 증가 수입 증가
 * 
 */

class Student{
	String studentName;		//학생명
	int money;				//학생이 가진돈, 초기 값 : 100,000
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeBus(Bus bus) { //학생이 버스를 탔을 때  버스에 돈을 지불해야한다.
		bus.take(1000);
		this.money-=1000;
		bus.getBusName();
		
		
	}
	public void takeOutBus(Bus bus) {
		
	}
	
	public void takeSubway(Subway subway) { //지하철 탈때 지하철에 돈 지불
		subway.take(1500);
		this.money-=1500;
		subway.getLineNumber();
	}
	public void takeOutSubway(Subway subway) { //지하철 내릴때
		
	}


	@Override
	public String toString() {
		return getStudentName()+"\t"+getMoney();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if(this.studentName.equals(((Student)obj).studentName)){
				return true;
			}
		}
		return false;
	}
	
}

class Bus{
	int busName;	//100번 버스, 200번 버스  <==인풋값을 받아서, 생성자로

	int passengerCount; //승객 수 
	int money;
	
//	public Bus(int busName) {
//		this.busName=busName;
//	}
	public void setBusName(int busName) {
		this.busName = busName;
	}
	
	public int getBusName() {
		return busName;
	}
	public void take(int money) { //버스의 수입을 처리, 승객수를 처리 
		this.money=money;
		this.passengerCount++;
		
	}
	
	public void takeOut() { //버스 승객수만 감소
		this.passengerCount--;
	}
}

class Subway{
	String lineNumber;//1호선 2  3
	int passengerCount; //승객 수 
	int money;
	
	//생성자를 통해서 지하철 호선을 인풋받아서 활성화,
	
//	public Subway(String lineNumber) {
//		this.lineNumber=lineNumber;
//	}
	public String getLineNumber() {
		return lineNumber;
	}
	
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { //지하철의 수입을 처리, 승객수를 처리 
		this.money=money;
		this.passengerCount++;
	}
	public void takeOut() { //지하철 승객수만 감소
		this.passengerCount--;
		
	}
}


public class CooperationBetweenObject {

	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner scanner= new Scanner(System.in);
		final boolean RUN = true;
		Student str = null ;
		Bus bus= new Bus();
		Subway subway = new Subway();
		
		
		while(RUN) {
			System.out.println("===================================================================");
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택 ");
			System.out.println("3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료");
			System.out.println("===================================================================");
			System.out.println("선택 >> ");
			int choice =scanner.nextInt();
			if(choice==1) {
				boolean a = true;
				while(a) {
					if(studentList.size()>4) {a=false; break;}else {
					System.out.println("학생 5명을 입력해주세요");
					System.out.print("학생이름 : ");
					String name=scanner.next();
					int money=100000;
					System.out.print("학생돈 : "+money);
					System.out.println();
					Student student = new Student(name,money);
					studentList.add(student);
					System.out.println();
					}
				}
			}else if(choice==2){
				System.out.println("=====학생 정보 출력======");
				System.out.println("학생이름\t 가진돈");
				for(Student student:studentList) {
					System.out.println(student);
					System.out.println();
				}
				System.out.print("학생 선택 (이름 입력) >>");
				String seletname= scanner.next();
				for(int i=0; i<studentList.size(); i++) {
					Student student = studentList.get(i);
					if(student.studentName.equals(seletname)){
						str=student;
					
					}
				}
			}else if(choice==3){
				System.out.print("타려는 버스번호 : ");
				int bunum=scanner.nextInt();
				bus.setBusName(bunum);
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeBus(bus);
						System.out.println(s.studentName+"님"+bus.getBusName()+"번 버스를 탔습니다. 즐거운 하루되세요");
						System.out.println(s.studentName+"님의 남은 돈은 "+s.money+"입니다.");
						System.out.println("버스 "+bus.getBusName()+"번의 승객은 "+ bus.passengerCount+"명이고 수입은 "+ bus.money+"입니다.");
					}
				}
			
			}else if(choice==4){
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeOutBus(bus); bus.takeOut();
						System.out.println(s.studentName+"님"+bus.getBusName()+"번 버스에서 내렸습니다. 굿바이~~~");
						System.out.println(s.studentName+"님의 남은 돈은 "+s.money+"입니다.");
						System.out.println("버스 "+bus.getBusName()+"번의 승객은 "+ bus.passengerCount+"명이고 수입은 "+ bus.money+"입니다.");
					}
				}
				
			}else if(choice==5){
				System.out.print("타려는 호선 : ");
				String linenum=scanner.next();
				subway.setLineNumber(linenum);
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeSubway(subway);
						System.out.println(s.studentName+"님"+subway.getLineNumber()+"호선 지하철를 탔습니다. 즐거운 하루되세요.");
						System.out.println(s.studentName+"님의 남은 돈은 "+s.money+"입니다.");
						System.out.println("지하철 "+subway.getLineNumber()+"호선의 승객은 "+ subway.passengerCount+"명이고 수입은 "+ subway.money+"입니다.");
					}
				}
			}else if(choice==6){
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeOutSubway(subway); subway.takeOut();
						System.out.println(s.studentName+"님"+subway.getLineNumber()+"호선 지하철에서 내렸습니다. 굿바이~~~");
						System.out.println(s.studentName+"님의 남은 돈은 "+s.money+"입니다.");
						System.out.println("지하철 "+subway.getLineNumber()+"호선의 승객은 "+subway.passengerCount +"명이고 수입은 "+ subway.money+"입니다.");
					}
				}
			}else if(choice==7){
				break;
			}
			
		}
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
