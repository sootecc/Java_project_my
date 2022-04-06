package chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class Account{ 	//계좌 정보를 저장하는 객체, 중요한 필드, private(캡슐화) 생성자(O), getter, setter		//DTO, VO <= 각 계층으로 필드의 값을 저장하고 전달 
	
	private String ano;		//계좌 번호
	private String owner; 	//계좌 주
	private int balance;	//통장 금액
	
	public Account() {}
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//getter, setter
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return  "계좌번호: "+ano+" 이름: "+owner+" 잔액: "+balance;


	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Account) {
			Account act = (Account)obj;
			if(this.ano == act.ano) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hashCode(ano);
	}
	
}

class AccountHashSet{
	private Set<Account> hashSet;
	
	public AccountHashSet() {
		hashSet = new HashSet();
	}
	
	public void addAccount(Account account) {
		
		hashSet.add(account);
	}
	
	public void showAccount() {
		Iterator<Account> itr = hashSet.iterator();
		
		while(itr.hasNext()) {
			Account act = (Account) itr.next();
			System.out.println(act);
			
		}	
	}
	
	public void deposit(String ano, int balance) {
		Iterator<Account> itr = hashSet.iterator();
		
		
		while(itr.hasNext()) {
			Account act = (Account) itr.next();
			if(act.getAno().equals(ano)) {
				int totalbalance=0;
				totalbalance =  act.getBalance() + balance;
				act.setBalance(totalbalance);
				hashSet.add(act);
			}
		}
	}
	
	
	public void minus(String ano, int balance) {
		Iterator<Account> itr = hashSet.iterator();
		while(itr.hasNext()) {
			Account act = (Account) itr.next();
			if(act.getAno().equals(ano)) {
				int totalbalance=0;
				totalbalance =  act.getBalance() - balance;
				hashSet.add(act);
			}
		}
	}
	
	public boolean findAccount(String ano) {
		Iterator<Account> itr = hashSet.iterator();
		while(itr.hasNext()) {
			Account act = (Account) itr.next();
			if(act.getAno().equals(ano)) {
				return true;
			}
		}
		return false;
	}
	
}






public class BankAccountUsingHashSet {
			//동일한 계좌를 넣을 수 있다.
			//계좌 번호는 중복 저장이 되면 안된다. ano 컬럼은 중복 저장되면 안되게 설정하고 Set에 저장
	
	
	
	
			
	public static void main(String[] args) {
		 
		AccountHashSet actHashSet = new AccountHashSet();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {	//계좌생성
				System.out.printf("%s%s","계좌번호를 입력하세요: ",System.lineSeparator());
				String ano = scanner.next();
				System.out.printf("%s%s","이름을 입력하세요: ",System.lineSeparator());
				String name = scanner.next();
				System.out.printf("%s%s","초기 통장 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				Account tempAct = new Account(ano, name, balance);
				if(actHashSet.findAccount(ano)) {
					actHashSet.addAccount(tempAct);
				}
				else {
					System.out.println("중복된 계좌번호입니다.");
				}
				
				
			}
			else if(selectNo == 2) {	//계좌목록

				actHashSet.showAccount();
					
			}
			else if(selectNo == 3) {	//예금
				System.out.printf("%s%s","예금할 계좌번호를 입력하세요: ",System.lineSeparator());
				String ano = scanner.next();
				
				System.out.printf("%s%s","예금할 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				actHashSet.deposit(ano, balance);
				
			}
			else if(selectNo == 4) {//출금
				System.out.printf("%s%s","출금할 계좌번호를 입력하세요: ",System.lineSeparator());
				String ano = scanner.next();
				
				System.out.printf("%s%s","출금할 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				actHashSet.minus(ano, balance);
				
			}
			else if(selectNo == 5) {
				run = false;
				//break;
			}
			
		}
		
		scanner.close();
		System.out.printf("%s%s","프로그램 종료",System.lineSeparator());
		
		
	}
	

}
