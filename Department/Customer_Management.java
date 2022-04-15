package Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 	��ȭ���� �� ���� ���α׷�. (��Ӱ� ������)
 	
 	�� ��� :
 		Silver ��: ���ʽ�����Ʈ(1%) ����, ���η� ����
 		Gold ��: ���ʽ�����Ʈ(2%) ����, ���η� 5%
 		VIP ��: ���ʽ�����Ʈ(5%) ����, ���η� 10%, ��� ������Ʈ�� ����
 	
 */

class Customer{		//Silver
	
	int customerID;				//�� ID
	String customerName;		//�� �̸�
	String customerGrade;		//�� ���("Silver", "Gold", "VIP")
	double bonusPoint;			//���ʽ� ����Ʈ
	double bonusRatio;			//���ʽ� ����Ʈ ������ 1% 2% 5%
	
	//�����ڿ��� �⺻���� 2���� �ʵ� ���� �ε�: customerGrade, bonusRatio
	Customer(int customerID, String customerName, double bonusPoint){
		this.customerID = customerID;
		this.customerName =customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = bonusPoint;
		this.bonusRatio = 0.01;
	}
	
	public double calcPrice(double price) {		//���� Ŭ�������� �������̵��Ͽ� ó��
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
		this.bonusPoint += price * this.bonusRatio;
		
		return price; //���ε� ������ ���Ͻ����ش�.
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override
	public String toString() {
	//��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 1%		"+this.bonusRatio; 
	}
}

class GoldCustomer extends Customer{
	
	double saleRatio;		//��ǰ ���η� 5%
	
	GoldCustomer(int customerID, String customerName, double bonusPoint){
		super(customerID, customerName, bonusPoint);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.95;
	}
	
	@Override
	public double calcPrice(double price) {		//���� Ŭ�������� �������̵��Ͽ� ó��
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
		this.bonusPoint += price * this.bonusRatio;
		price = price * this.saleRatio;
		return price; //���ε� ������ ���Ͻ����ش�.
	}
	@Override
	public String toString() {
	//��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 2%		"+this.bonusRatio; 
	}
}

class VIPCustomer extends Customer{
	
	private int agentID;			//		������, setter, �ʵ�(X)
	double saleRatio;				//��ǰ ���η� 10%
	
	VIPCustomer(int customerID, String customerName, double bonusPoint){
		super(customerID, customerName, bonusPoint);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.9;
	}
	@Override
	public double calcPrice(double price) {		//���� Ŭ�������� �������̵��Ͽ� ó��
		//��ǰ�� ������ �޾Ƽ� ���ʽ� ����Ʈ�� �����ϴ� �ڵ�
		this.bonusPoint += price * this.bonusRatio;
		price = price * this.saleRatio;
		return price; //���ε� ������ ���Ͻ����ش�.
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	@Override
	public String toString() {
	//��ID	���̸�	�����	���η�	���ʽ�����Ʈ����	������ƮID<VIP��>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 5%		"+this.bonusRatio+"	"+this.agentID; 
	}
	
}



public class Customer_Management {

	
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		

		
		while(true){
			System.out.println("======================================================================");
			System.out.println("1. �Ϲݰ� ���	|   2. VIP �����      |  3. Gold �� ���   4. ���� ���    5. ��ǰ����  6. ���� ");
			System.out.println("======================================================================");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("==�Ϲݰ� ����Դϴ�.");
				System.out.println("�� ���̵�: ");
				int id = sc.nextInt();
				System.out.println("�� �̸�:");
				String name = sc.next();
				
				Customer cs = new Customer(id, name, 0.0);
				customerList.add(cs);
				System.out.println("���������� ��ϵǾ����ϴ�.");
				
			}else if(choice ==2 ) {
				System.out.println("==VIP�� ����Դϴ�.");
				System.out.println("�� ���̵�: ");
				int id = sc.nextInt();
				System.out.println("�� �̸�:");
				String name = sc.next();
				System.out.println("��� ������Ʈ ���:");
				int agent = sc.nextInt();
				
				VIPCustomer cs = new VIPCustomer(id, name, 0.0);
				cs.setAgentID(agent);
				customerList.add(cs);
				
				System.out.println("���������� ��ϵǾ����ϴ�.");
			}else if(choice ==3 ) {
				System.out.println("==Gold�� ����Դϴ�.");
				System.out.println("�� ���̵�: ");
				int id = sc.nextInt();
				System.out.println("�� �̸�:");
				String name = sc.next();
				
				GoldCustomer cs = new GoldCustomer(id, name, 0.0);
				customerList.add(cs);
				System.out.println("���������� ��ϵǾ����ϴ�.");
			}else if(choice ==4 ) {
				System.out.println("==�� ���� ����Դϴ�.");
				for(Customer k : customerList) {
					System.out.println(k);
				}
				
			}else if(choice ==5 ) {
				System.out.println("==��ǰ������ �������ּ���");
				System.out.println("�� ���̵�: ");
				int id = sc.nextInt();
				System.out.println("���� ��ǰ ����: ");
				int price = sc.nextInt();
				
				Customer cs = null;
				
				
				Iterator<Customer> ir = customerList.iterator();
				while(ir.hasNext()) {
					Customer cs2 = ir.next();    
					if(cs2.customerID == id) {
						cs = cs2;
					}
				}
				

				
				
				if(cs.getCustomerGrade().equals("Silver")) {
					cs.calcPrice(price);
				}else if(cs.getCustomerGrade().equals("Gold")) {
					cs.calcPrice(price);
				}else if(cs.getCustomerGrade().equals("VIP")) {
					cs.calcPrice(price);
				}
				
				System.out.println(cs.customerName+" ���� "+price+"�� �����ϼ̽��ϴ�.");
				System.out.println(cs.customerName+" ������ ����� "+cs.customerGrade+"�̰� ���� ����Ʈ�� "+cs.bonusPoint+"�̰� ������ "+(price - cs.calcPrice(price))+"�� �Ǿ����ϴ�.");
				
				
				
			}else if(choice ==6 ) {
				break;
			}
			
		}
		System.out.println("���α׷� ����");
		
		
	}

}
