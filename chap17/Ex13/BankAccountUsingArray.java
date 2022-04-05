package chap17.Ex13;

import java.util.Scanner;

class Account{
	
	private String ano;		//계좌 번호
	private String owner; 	//계좌 주
	private int balance;	//통장 금액
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
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
	
	
	
	
}



public class BankAccountUsingArray {
		//배열을 사용해서 Account 객체 등록
			private static Account[] accountArray = new Account[100];	//배열에 객체 저장.
			private static Scanner scanner = new Scanner(System.in);
			private static int counter = 0;
			
			private static void createAccount() {
				//코드 작성: 1. 계좌 생성. 스캐너로 1. 계좌번호, 2. 이름, 3. 초기 통장 금액
				//배열 객체에 저장.
				
				
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				System.out.println("이름을 입력하세요: ");
				String name = scanner.next();
				System.out.println("초기 통장 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				Account customer = new Account(ano, name, balance);
				accountArray[counter] = customer;
				
				counter ++;
			}
			
			private static void accountList() {
				//코드 작성: 2. 배열에 저장된 객체를 가져와서 계좌번호, 이름, 금액을 출력
				for(int i = 0 ; i<100; i++) {
					try {
						System.out.print("계좌번호: "+accountArray[i].getAno()+" 이름: "+accountArray[i].getOwner()+" 금액: "+accountArray[i].getBalance());
						System.out.println();
					}
					catch(NullPointerException e) {}
				}
			}
			
			private static void deposit() {
				//코드 작성: 3. 예금 <= 계좌번호를 받고 객체에서 해당 계좌를 찾아, 입금금액: 해당 계좌에 저장. 
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				System.out.println("예금할 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				int totalbalance=0;
				totalbalance = balance + findAccount(ano).getBalance();
				findAccount(ano).setBalance(totalbalance);
				
			}
			
			private static void withdraw() {
				//코드 작성: 4. 출금 <= 계좌번호를 받고 객체에서 해당 계좌를 찾아, 출금금액: 해당 계좌에서 출금.
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				System.out.println("출금할 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				int totalbalance=0;
				totalbalance =  findAccount(ano).getBalance() - balance;
				findAccount(ano).setBalance(totalbalance);
				
			}
			
			//배열에서 Account 객체 내의 ano[계좌번호]와 동일한 계좌를 찾아서 찾은 객체를 리턴으로 돌려줌.
			private static Account findAccount(String ano) {
				
				Account account = null;
				//코드 작성
				for(int i =0 ; i<100; i++) {
					if(accountArray[i].getAno().equals(ano)) {
						account = accountArray[i];
						break;
					}
				}
				
				return account;
			} 
			
			
	public static void main(String[] args) {

		
		
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();	//메소드 호출
			}
			else if(selectNo == 2) {
				accountList();
			}
			else if(selectNo == 3) {
				deposit();
			}
			else if(selectNo == 4) {
				withdraw();
			}
			else if(selectNo == 5) {
				run = false;
				//break;
			}
			
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
		
		
	}

}
