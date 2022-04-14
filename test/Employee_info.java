package test;

 

import java.util.Comparator;

import java.util.Iterator;

import java.util.Scanner;

import java.util.TreeSet;

 

 

 

class Employee { // ����� ������ ���� Ŭ����

	int empNo; // �����ȣ

	String empName; // ����̸�

	String phone; // ����ó

	int age; // ����

	String dept; // �μ�

	String compRank; // ����

 

	public Employee() {

	};

 

	public Employee(int empNo, String empName, String phone, int age, String dept, String compRank) {

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

 

}

 

public class Employee_info {

 

	public static void main(String[] args) {

 

		Employee emp = new Employee();

		Employee_info info = new Employee_info();

 

		Scanner sc = new Scanner(System.in);

		int selectNo;

		do {

			System.out.println("=======������� ���α׷�============");

			System.out.println("# 1. ������� �űԵ��");

			System.out.println("# 2. ������� �˻�");

			System.out.println("# 3. ������� ����");

			System.out.println("# 4. ������� ����");

			System.out.println("# 5. ���α׷� ����");

 

			selectNo = sc.nextInt();

 

			if (selectNo == 5) {

				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");

				return;

			} else if (selectNo == 1) { // ������

				info.empInsert();

			} else if (selectNo == 2) {

				info.empList();

			} else if (selectNo == 3) {

				info.empEdit();

			} else if (selectNo == 4) {

				info.empDel();

			}

 

		} while (true);

	}

 

	private static TreeSet<Employee> set = new TreeSet<Employee>(new Comparator<Employee>() {

 

		@Override

		public int compare(Employee o1, Employee o2) {

			if (o1.empNo < o2.empNo) {

				return 1;

			} else if (o1.empNo == o2.empNo) {

				return 0;

			} else {

				return -1;

			}

		}

 

	});

	

	private static Scanner sc = new Scanner(System.in);

	private static void empInsert() {

		

		System.out.println("������� �Է�");

		System.out.println("�����ȣ�� �Է����ּ���");

		int empNo = sc.nextInt();

		System.out.println("�̸��� �Է����ּ���");

		String empName = sc.next();

		System.out.println("�޴���ȭ ��ȣ�� �Է����ּ���");

		String phone = sc.next();

		System.out.println("���̸� �Է����ּ���");

		int age = sc.nextInt();

		System.out.println("�Ҽ� �Ͻ� �μ��� �Է����ּ���");

		String dept = sc.next();

		System.out.println("������ �Է����ּ���");

		String compRank = sc.next();

 

		Employee employ = new Employee(empNo, empName, phone, age, dept, compRank);

		set.add(employ);

		System.out.println(empName + "���� ��������� �ԷµǾ����ϴ�.");

	}

	

	private static void empList() {

		System.out.println("��� ����Ʈ");

		Iterator<Employee> ir = set.iterator();

		while(ir.hasNext()) {

			Employee employee = ir.next();

			if(employee != null) {

				System.out.print(employee.getEmpNo());

				System.out.print("    ");

				System.out.print(employee.getEmpName());

				System.out.print("    ");

				System.out.print(employee.getPhone());

				System.out.print("    ");

				System.out.print(employee.getAge());

				System.out.print("    ");

				System.out.print(employee.getDept());

				System.out.print("    ");

				System.out.print(employee.getCompRank());

				System.out.println();

			}

		}

		

	}

	

	private static void empEdit() {

		System.out.println("������ ���:");

		int empno = sc.nextInt();

		int select;

		String phone; // ����ó

		int age; // ����

		String dept; // �μ�

		String compRank; // ����

		Employee employee = findEmp(empno);

		

		if(employee == null) {

			System.out.println("��� : ��ġ�ϴ� ����� �����ϴ�.");

			return;

		}

		

		System.out.println("������ �ʵ� ���� [1. ����ó, 2.����, 3. �μ�, 4.����] : ");

		select = sc.nextInt();

		if(select == 1) {

			System.out.println("������ ����ó�� �Է����ּ���.");

			phone = sc.next();

			employee.setPhone(phone);

			System.out.println("����ó�� ����Ǿ����ϴ�.");

		}else if(select == 2) {

			System.out.println("������ ���̸� �Է����ּ���");

			age = sc.nextInt();

			employee.setAge(age);

			System.out.println("���̰� ����Ǿ����ϴ�.");

		}else if(select == 3) {

			System.out.println("������ �μ��� �Է����ּ���.");

			dept = sc.next();

			employee.setDept(dept);

			System.out.println("�μ������� �Ǿ����ϴ�.");

		}else if(select == 4) {

			System.out.println("������ ������ �Է����ּ���");

			compRank = sc.next();

			employee.setCompRank(compRank);

			System.out.println("������ ����Ǿ����ϴ�.");

		}

		

	}

	

	private static void empDel() {

		

		System.out.println("������ ����� �Է����ּ���.");

		int empno = sc.nextInt();

		Employee employee = findEmp(empno);

		

		if(employee == null) {

			System.out.println("��� : ��ġ�ϴ� ����� �����ϴ�.");

			return;

		}else {

			set.remove(employee);

			System.out.println("�ش� ����� �����Ǿ����ϴ�.");

		}

		

		

			

		

		

	}

	

	private static Employee findEmp(int ano) {

		Employee employee = null;

		

		Iterator<Employee> ir = set.iterator();

		

		while(ir.hasNext()) {

			Employee e1 = ir.next();

			int dbno = e1.getEmpNo();

			if(dbno == ano) {

				employee = e1;

				return employee;

			}

		}

		

		

		return employee;

	}

	

	

 

}