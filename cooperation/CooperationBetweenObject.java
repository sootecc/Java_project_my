package cooperation;

import java.util.ArrayList;
import java.util.Scanner;

//��ü���� ����

/*			   	�� �л��� �뵷: 100,000��
 * 
 		�л�		: 			������ Ż ��(-1,000��) 		����ö(-1,500��)
  		����		: 1,000��	�°� �� ����, ���� ����
  		����ö	: 1,500��							�°� �� ����, ���� ����
  		
 		
 */

class Student{
	String studentName;		//�л� �̸�
	int money;				//�л��� ���� ��, �ʱⰪ: 100,000��
	Bus bus;				//Ÿ�� �ִ� ����
	Subway subway;			//Ÿ�� �ִ� ����ö
	
	Student(String studentName){
		this.studentName = studentName;
		this.money = 100000;
		System.out.println(this.studentName+"�� �뵷�� 100,000�� �޾ҽ��ϴ�.");
	}

	
	public void takeBus(Bus bus) {	//�л��� ������ ���� �� ������ ���� �����ؾ� �Ѵ�.
		if(this.money<1000) {
			System.out.println("���� ��� ��Ÿ�� �Ф�");
		}else {
			bus.take(1000);
			this.bus = bus;
			this.money -= 1000;
		}
	}
	public void takeOutBus(Bus bus) {	//�������� ����
		if(bus.passengerCount>0) {
			bus.takeOut();
			this.bus = null;
		}else {
			System.out.println("�л��� �����");
		}
	}
	
	
	public void takeSubway(Subway subway) {	//�л��� ����ö�� ���� �� ����ö�� ���� �����ؾ� �Ѵ�.
		if(this.money<1500) {
			System.out.println("���� ��� ��Ÿ�� �Ф�");
		}else {
			subway.take(1500);
			this.subway = subway;
			this.money -= 1500;
		}
	}
	public void takeOutSubway(Subway subway) {	//�������� ����
		if(subway.passengerCount>0) {
			subway.takeOut();
			this.subway = null;
		}else {
			System.out.println("�л��� �����");
		}
	}
	
	
	
}

class Bus{
	int busName; 		//�� �� ������		<< ��ǲ ���� �޾Ƽ� ���� �̸��� ����
	int passengerCount;	//�°� ��
	int money;		//������ ����
	
	Bus (int busName){
		this.busName = busName;
		System.out.println(this.busName+"�� ������ ��������ϴ�.");
	}
	
	public void take(int money) {		//������ ������ ó��, �°� ���� ó��
		this.passengerCount ++;
		this.money += money;
	}
	
	public void takeOut() {
		this.passengerCount --;
	}
	
}

class Subway{
	String lineNumber;		//"1ȣ��", "2ȣ��"..
	int passengerCount;
	int money;
	
	Subway(String lineNumber){
		this.lineNumber = lineNumber;
		System.out.println(this.lineNumber+" ����ö�� ��������ϴ�.");
	}
	
	public void take(int money) {		//������ ������ ó��, �°� ���� ó��
		this.passengerCount ++;
		this.money += money;
	}
	
	public void takeOut() {
		this.passengerCount --;
	}
}

public class CooperationBetweenObject {
	
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Bus>	busList = new ArrayList<>();
		ArrayList<Subway> subwayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<6; i++) {		//���� 5�� ���� 
			Bus b = new Bus(i*100);
			busList.add(b);
		}
		
		for(int i = 1; i<6; i++) {		//����ö 5�� ����
			Subway s = new Subway(i+"ȣ��");
			subwayList.add(s);
		}
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ����  \r\n");
			System.out.println("=============================================");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				for(int i =0; i<5; i++) {
					System.out.println("�л� �̸�:");
					String name = sc.next();
					Student s = new Student(name);
					studentList.add(s);
				}
			}else if(choice == 2) {
				System.out.println("=====�л����� ���=====");
				for(Student k : studentList) {
					System.out.println(k.studentName+"	"+ k.money);
				}
				
				while(true) {
					System.out.println("�л� ����(�̸��Է�)");
					String name = sc.next();
					Student s = null;
					for(Student k : studentList) {
						if(k.studentName.equals(name)) {
							s = k;
						}
					}
					
					System.out.println("���߱��� ����");
					System.out.println("3. ������ Ž   4.  ������ ����    5. ����ö�� Ž  	6. ����ö�� ����.   7. ���� ");
					int secondChoice = sc.nextInt();
					if(secondChoice == 3) {
						System.out.println("�� �� ������ Ÿ�ðڽ��ϱ�?");
						for(Bus k : busList) {
							System.out.println(k.busName);
						}
						
						int busnum = sc.nextInt();
						
						for(Bus bus : busList) {
							if(bus.busName==busnum) {
								s.takeBus(bus);
								System.out.println(s.studentName+"�� "+bus.busName+"�� ������ �����ϴ�. ��ſ� �Ϸ� �Ǽ���.");
								System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
								System.out.println("���� "+bus.busName+"���� �°��� "+bus.passengerCount+"���̰� ������"+bus.money+"�Դϴ�.");
							}
						}
					}else if(secondChoice ==4 ) {
						if(s.bus ==null) {
							System.out.println("������ Ÿ�� ���� �ʾƿ�");
							continue;
						}
						System.out.println("Ÿ�� �ִ� ����: "+s.bus.busName);
						
						for(Bus bus : busList) {
							try {
								if(bus.busName==s.bus.busName) {
									s.takeOutBus(bus);
									System.out.println(s.studentName+"�� "+bus.busName+"�� �������� ���Ƚ��ϴ�. �¹���~~");
									System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
									System.out.println("���� "+bus.busName+"���� �°��� "+bus.passengerCount+"���̰� ������"+bus.money+"�Դϴ�.");
									}
								}catch(Exception e) {}
						}
					}
						
					else if(secondChoice ==5 ) {
						System.out.println("�� �� ����ö�� Ÿ�ðڽ��ϱ�?");
						for(Subway k : subwayList) {
							System.out.println(k.lineNumber);
						}
						String subnum = sc.next();					
						for(Subway sub : subwayList) {
							if(sub.lineNumber.equals(subnum)) {
								s.takeSubway(sub);
								System.out.println(s.studentName+"�� "+sub.lineNumber+"�� ����ö�� �����ϴ�. ��ſ� �Ϸ� �Ǽ���.");
								System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
								System.out.println("����ö "+sub.lineNumber+"�� �°��� "+sub.passengerCount+"���̰� ������"+sub.money+"�Դϴ�.");
							}
						}
					}else if(secondChoice ==6 ) {
						if(s.subway ==null) {
							System.out.println("����ö�� Ÿ�� ���� �ʾƿ�");
							continue;
						}
						System.out.println("Ÿ�� �ִ� ����ö: "+s.subway.lineNumber);
						for(Subway sub : subwayList) {
							try {
								if(sub.lineNumber.equals(s.subway.lineNumber)) {
									s.takeOutSubway(sub);
									System.out.println(s.studentName+"�� "+sub.lineNumber+"�� ����ö���� ���Ƚ��ϴ�. �¹���~~");
									System.out.println(s.studentName+"���� ���� ���� "+s.money+"�Դϴ�.");
									System.out.println("����ö "+sub.lineNumber+"�� �°��� "+sub.passengerCount+"���̰� ������"+sub.money+"�Դϴ�.");
								}
							}catch(Exception e) {}
						}
					}else if(secondChoice ==7 ) {
						break;
					}
				}
			}
			
		}

		
	}
}
