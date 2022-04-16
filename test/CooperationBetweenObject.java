package test;
// ��ü���� ����

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  
 * �л�	: �뵷 100,000
 * 			     		������ Ż��(-1000��)			����ö�� Ż��(-1,500��) 
 * ����	:1,000��			�°� �� ���� ���� ����			
 * ����ö :1,500��										�°� �� ���� ���� ����
 * 
 */

class Student{
	String studentName;		//�л���
	int money;				//�л��� ������, �ʱ� �� : 100,000
	
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
	
	public void takeBus(Bus bus) { //�л��� ������ ���� ��  ������ ���� �����ؾ��Ѵ�.
		bus.take(1000);
		this.money-=1000;
		bus.getBusName();
		
		
	}
	public void takeOutBus(Bus bus) {
		
	}
	
	public void takeSubway(Subway subway) { //����ö Ż�� ����ö�� �� ����
		subway.take(1500);
		this.money-=1500;
		subway.getLineNumber();
	}
	public void takeOutSubway(Subway subway) { //����ö ������
		
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
	int busName;	//100�� ����, 200�� ����  <==��ǲ���� �޾Ƽ�, �����ڷ�

	int passengerCount; //�°� �� 
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
	public void take(int money) { //������ ������ ó��, �°����� ó�� 
		this.money=money;
		this.passengerCount++;
		
	}
	
	public void takeOut() { //���� �°����� ����
		this.passengerCount--;
	}
}

class Subway{
	String lineNumber;//1ȣ�� 2  3
	int passengerCount; //�°� �� 
	int money;
	
	//�����ڸ� ���ؼ� ����ö ȣ���� ��ǲ�޾Ƽ� Ȱ��ȭ,
	
//	public Subway(String lineNumber) {
//		this.lineNumber=lineNumber;
//	}
	public String getLineNumber() {
		return lineNumber;
	}
	
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) { //����ö�� ������ ó��, �°����� ó�� 
		this.money=money;
		this.passengerCount++;
	}
	public void takeOut() { //����ö �°����� ����
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
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ���� ");
			System.out.println("3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����");
			System.out.println("===================================================================");
			System.out.println("���� >> ");
			int choice =scanner.nextInt();
			if(choice==1) {
				boolean a = true;
				while(a) {
					if(studentList.size()>4) {a=false; break;}else {
					System.out.println("�л� 5���� �Է����ּ���");
					System.out.print("�л��̸� : ");
					String name=scanner.next();
					int money=100000;
					System.out.print("�л��� : "+money);
					System.out.println();
					Student student = new Student(name,money);
					studentList.add(student);
					System.out.println();
					}
				}
			}else if(choice==2){
				System.out.println("=====�л� ���� ���======");
				System.out.println("�л��̸�\t ������");
				for(Student student:studentList) {
					System.out.println(student);
					System.out.println();
				}
				System.out.print("�л� ���� (�̸� �Է�) >>");
				String seletname= scanner.next();
				for(int i=0; i<studentList.size(); i++) {
					Student student = studentList.get(i);
					if(student.studentName.equals(seletname)){
						str=student;
					
					}
				}
			}else if(choice==3){
				System.out.print("Ÿ���� ������ȣ : ");
				int bunum=scanner.nextInt();
				bus.setBusName(bunum);
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeBus(bus);
						System.out.println(s.studentName+"��"+bus.getBusName()+"�� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���");
						System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
						System.out.println("���� "+bus.getBusName()+"���� �°��� "+ bus.passengerCount+"���̰� ������ "+ bus.money+"�Դϴ�.");
					}
				}
			
			}else if(choice==4){
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeOutBus(bus); bus.takeOut();
						System.out.println(s.studentName+"��"+bus.getBusName()+"�� �������� ���Ƚ��ϴ�. �¹���~~~");
						System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
						System.out.println("���� "+bus.getBusName()+"���� �°��� "+ bus.passengerCount+"���̰� ������ "+ bus.money+"�Դϴ�.");
					}
				}
				
			}else if(choice==5){
				System.out.print("Ÿ���� ȣ�� : ");
				String linenum=scanner.next();
				subway.setLineNumber(linenum);
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeSubway(subway);
						System.out.println(s.studentName+"��"+subway.getLineNumber()+"ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���.");
						System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
						System.out.println("����ö "+subway.getLineNumber()+"ȣ���� �°��� "+ subway.passengerCount+"���̰� ������ "+ subway.money+"�Դϴ�.");
					}
				}
			}else if(choice==6){
				for(Student s : studentList) {
					if(s.studentName.equals(str.getStudentName())) {
						s.takeOutSubway(subway); subway.takeOut();
						System.out.println(s.studentName+"��"+subway.getLineNumber()+"ȣ�� ����ö���� ���Ƚ��ϴ�. �¹���~~~");
						System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
						System.out.println("����ö "+subway.getLineNumber()+"ȣ���� �°��� "+subway.passengerCount +"���̰� ������ "+ subway.money+"�Դϴ�.");
					}
				}
			}else if(choice==7){
				break;
			}
			
		}
		scanner.close();
		System.out.println("���α׷��� �����մϴ�.");
		
	}

}
