package Department;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 	백화점의 고객 관리 프로그램. (상속과 다형성)
 	
 	고객 등급 :
 		Silver 고객: 보너스포인트(1%) 적립, 할인률 없음
 		Gold 고객: 보너스포인트(2%) 적립, 할인률 5%
 		VIP 고객: 보너스포인트(5%) 적립, 할인률 10%, 담당 에이전트가 존재
 	
 */

class Customer{		//Silver
	
	int customerID;				//고객 ID
	String customerName;		//고객 이름
	String customerGrade;		//고객 등급("Silver", "Gold", "VIP")
	double bonusPoint;			//보너스 포인트
	double bonusRatio;			//보너스 포인트 적립률 1% 2% 5%
	
	//생성자에서 기본으로 2개의 필드 값은 로드: customerGrade, bonusRatio
	Customer(int customerID, String customerName, double bonusPoint){
		this.customerID = customerID;
		this.customerName =customerName;
		this.customerGrade = "Silver";
		this.bonusPoint = bonusPoint;
		this.bonusRatio = 0.01;
	}
	
	public double calcPrice(double price) {		//하위 클래스에서 오버라이딩하여 처리
		//물품의 가격을 받아서 보너스 포인트를 적립하는 코드
		this.bonusPoint += price * this.bonusRatio;
		
		return price; //할인된 가격을 리턴시켜준다.
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
	//고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 1%		"+this.bonusRatio; 
	}
}

class GoldCustomer extends Customer{
	
	double saleRatio;		//물품 할인률 5%
	
	GoldCustomer(int customerID, String customerName, double bonusPoint){
		super(customerID, customerName, bonusPoint);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.95;
	}
	
	@Override
	public double calcPrice(double price) {		//하위 클래스에서 오버라이딩하여 처리
		//물품의 가격을 받아서 보너스 포인트를 적립하는 코드
		this.bonusPoint += price * this.bonusRatio;
		price = price * this.saleRatio;
		return price; //할인된 가격을 리턴시켜준다.
	}
	@Override
	public String toString() {
	//고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 2%		"+this.bonusRatio; 
	}
}

class VIPCustomer extends Customer{
	
	private int agentID;			//		생성자, setter, 필드(X)
	double saleRatio;				//물품 할인률 10%
	
	VIPCustomer(int customerID, String customerName, double bonusPoint){
		super(customerID, customerName, bonusPoint);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.9;
	}
	@Override
	public double calcPrice(double price) {		//하위 클래스에서 오버라이딩하여 처리
		//물품의 가격을 받아서 보너스 포인트를 적립하는 코드
		this.bonusPoint += price * this.bonusRatio;
		price = price * this.saleRatio;
		return price; //할인된 가격을 리턴시켜준다.
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	@Override
	public String toString() {
	//고객ID	고객이름	고객등급	할인률	보너스포인트비율	에이젼트ID<VIP고객>
		return this.customerID +"	"+this.customerName+"	"+this.customerGrade+"	 5%		"+this.bonusRatio+"	"+this.agentID; 
	}
	
}



public class Customer_Management {

	
	
	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		

		
		while(true){
			System.out.println("======================================================================");
			System.out.println("1. 일반고객 등록	|   2. VIP 고객등록      |  3. Gold 고객 등록   4. 정보 출력    5. 물품구매  6. 종료 ");
			System.out.println("======================================================================");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("==일반고객 등록입니다.");
				System.out.println("고객 아이디: ");
				int id = sc.nextInt();
				System.out.println("고객 이름:");
				String name = sc.next();
				
				Customer cs = new Customer(id, name, 0.0);
				customerList.add(cs);
				System.out.println("정상적으로 등록되었습니다.");
				
			}else if(choice ==2 ) {
				System.out.println("==VIP고객 등록입니다.");
				System.out.println("고객 아이디: ");
				int id = sc.nextInt();
				System.out.println("고객 이름:");
				String name = sc.next();
				System.out.println("담당 에이전트 등록:");
				int agent = sc.nextInt();
				
				VIPCustomer cs = new VIPCustomer(id, name, 0.0);
				cs.setAgentID(agent);
				customerList.add(cs);
				
				System.out.println("정상적으로 등록되었습니다.");
			}else if(choice ==3 ) {
				System.out.println("==Gold고객 등록입니다.");
				System.out.println("고객 아이디: ");
				int id = sc.nextInt();
				System.out.println("고객 이름:");
				String name = sc.next();
				
				GoldCustomer cs = new GoldCustomer(id, name, 0.0);
				customerList.add(cs);
				System.out.println("정상적으로 등록되었습니다.");
			}else if(choice ==4 ) {
				System.out.println("==고객 정보 출력입니다.");
				for(Customer k : customerList) {
					System.out.println(k);
				}
				
			}else if(choice ==5 ) {
				System.out.println("==물품가격을 지불해주세요");
				System.out.println("고객 아이디: ");
				int id = sc.nextInt();
				System.out.println("구매 물품 가격: ");
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
				
				System.out.println(cs.customerName+" 고객님 "+price+"원 지불하셨습니다.");
				System.out.println(cs.customerName+" 고객님의 등급은 "+cs.customerGrade+"이고 현재 포인트는 "+cs.bonusPoint+"이고 할인은 "+(price - cs.calcPrice(price))+"원 되었습니다.");
				
				
				
			}else if(choice ==6 ) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
	}

}
