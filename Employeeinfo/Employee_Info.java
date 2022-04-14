package Employeeinfo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

import chap17.Ex16.Account;

class Employee{		//����� ������ ���� Ŭ����
	int empNo;			//��� ��ȣ
	String empName;		//��� �̸�
	String phone;		//����ó
	int age;			//����
	String dept;		//�μ�
	String compRank;	//����
	
	Employee(int empNo, String empName, String phone, int age, String dept, String compRank ){
		this.empNo = empNo;
		this.empName = empName;
		this.phone = phone;
		this.age = age;
		this.dept = dept;
		this.compRank = compRank;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompRank() {
		return compRank;
	}

	public void setCompRank(String compRank) {
		this.compRank = compRank;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			this.empNo = ((Employee)obj).empNo;
			return true;
		}
		else
			return false;
	}
	
	
	@Override
	public int hashCode() {
		
		return Objects.hash(empNo);
	}
	
}

public class Employee_Info {

	private static TreeSet<Employee> tSet = new TreeSet<Employee>(new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			
			if(o1.empNo > o2.empNo) {
				return 1;
			}else if(o1.empNo == o2.empNo) {
				return 0;
			}else {
				return -1;
			}
		}
	});
	
	private static Scanner sc = new Scanner(System.in);
	
	private static void CreateEmployee() {
		
		System.out.println("- ���: ");
		int empno=sc.nextInt();
		
		
		
		System.out.println("- �̸�: ");
		String name = sc.next();
		System.out.println("- ����ó: ");
		String phone = sc.next();
		System.out.println("- ����: ");
		int age = sc.nextInt();
		System.out.println("- �μ�: ");
		String dept = sc.next();
		System.out.println("- ����: ");
		String compRank = sc.next();
		
		Employee newEmp = new Employee(empno, name, phone, age, dept, compRank);
		tSet.add(newEmp);
		System.out.println(name + " ���� ������ ���������� �ԷµǾ����ϴ�.");
		
	}
	
	private static void EmpList() {
		
		 
		Iterator<Employee> ir = tSet.iterator();
		while(ir.hasNext()) {
			Employee emp = ir.next();    
			if (emp != null) {    
				System.out.print(emp.getEmpNo()+"\t");   
				System.out.print(emp.getEmpName()+"\t");  
				System.out.print(emp.getPhone()+"\t"); 
				System.out.print(emp.getAge()+"\t"); 
				System.out.print(emp.getDept()+"\t"); 
				System.out.print(emp.getCompRank()+"\t"); 
				System.out.println();
			}
		}
	}
	
	
	private static void ChangeEmpInfo() {
		System.out.println("������ ���: ");
		int empno = sc.nextInt();
		Employee emp = findEmp(empno);
		System.out.println("������ �ʵ� ����");
		System.out.print("[1. ����ó, 2.����, 3. �μ�, 4.����] :");
		int choice = sc.nextInt();

		if(choice == 1) {
			System.out.println("���ο� ��ȭ��ȣ�� �Է��ϼ���:");
			String pn = sc.next();
			emp.setPhone(pn);
		}else if(choice == 2){
			System.out.println("���ο� �̸� �Է��ϼ���:");
			String name = sc.next();
			emp.setEmpName(name);
		}else if(choice == 3){
			System.out.println("���ο� ���̸� �Է��ϼ���:");
			int age = sc.nextInt();
			emp.setAge(age);
		}else if(choice == 4){
			System.out.println("���ο� ������ �Է��ϼ���:");
			String rank = sc.next();
			emp.setCompRank(rank);
		}
	}
	
	private static void FireEmp() {
		
		System.out.println("������ ���: ");
		int empno = sc.nextInt();
		Employee emp = findEmp(empno);
		tSet.remove(emp);
		
	}
	
	private static Employee findEmp(int empno) {
		Employee emp = null ; 
		//�ڵ� �ۼ� 
		Iterator<Employee> ir = tSet.iterator();
		
		while(ir.hasNext()) {
			Employee a1 = ir.next();
			int dbEmpno = a1.getEmpNo(); //�迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�. 
			if (dbEmpno==empno) {	
				emp = a1; 
				return emp;
				
			}	
		}
			return emp; 
	}
	
	private static boolean isEmp(int empno) {
		Employee emp = null ; 
		//�ڵ� �ۼ� 
		Iterator<Employee> ir = tSet.iterator();
		
		while(ir.hasNext()) {
			Employee a1 = ir.next();
			int dbEmpno = a1.getEmpNo(); //�迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�. 
			if (dbEmpno==empno) {	
				return true;
				
			}	
		}
			return false; 
	}
	
	
	public static void main(String[] args) {
		
		
		int menuNum;
		
		
		while(true) {
			System.out.println("=============��� ���� ���α׷�===============");
			System.out.println("# 1. ������� �űԵ��");
			System.out.println("# 2. ������� �˻�");
			System.out.println("# 3. ������� ����");
			System.out.println("# 4. ������� ����");
			System.out.println("# 5. ���α׷� ����");
			menuNum = sc.nextInt();
			if(menuNum == 1) {
				CreateEmployee();
			}else if(menuNum ==2) {
				EmpList();
			}else if(menuNum ==3) {
				ChangeEmpInfo();
			}else if(menuNum ==4) {
				FireEmp();
			}else if(menuNum == 5) {
				break;
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
