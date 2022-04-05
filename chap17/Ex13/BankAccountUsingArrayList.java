package chap17.Ex13;

import java.util.ArrayList;
import java.util.Scanner;

class AAccount{
	
	private String ano;		//계좌 번호
	private String owner; 	//계좌 주
	private int balance;	//통장 금액
	
	public AAccount(String ano, String owner, int balance) {
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



public class BankAccountUsingArrayList {
			
			
	public static void main(String[] args) {

		ArrayList<Account> arr = new ArrayList<Account>();
		Scanner scanner = new Scanner(System.in);
		int count=0;
		 
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {//계좌생성
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				
				int overlap = 0;		//중복 계좌 체크
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						System.out.println("이미 있는 계좌번호입니다. 다시 생성해주세요.");
						overlap =1;
						break;
					}
				}
				if(overlap == 1) {continue;}
				
				System.out.println("이름을 입력하세요: ");
				String name = scanner.next();
				System.out.println("초기 통장 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				Account customer = new Account(ano, name, balance);
				arr.add(customer);
				count++;
			}
			else if(selectNo == 2) {//계좌목록
				for(int i = 0 ; i<count; i++) {
							Account act = arr.get(i);
							System.out.print("계좌번호: "+act.getAno()+" 이름: "+act.getOwner()+" 금액: "+act.getBalance());
							System.out.println();
				}		
			}
			else if(selectNo == 3) {//예금
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				
				
				int existAccount = 0;	//계좌번호 존재 여부 확인
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.println("없는 계좌번호입니다.");
					continue;
				}
				
				
				System.out.println("예금할 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<count;i++) {//예금
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						totalbalance =  arr.get(i).getBalance() + balance;
						arr.get(i).setBalance(totalbalance);
					}
				}
		
			}
			else if(selectNo == 4) {//출금
				System.out.println("계좌번호를 입력하세요: ");
				String ano = scanner.next();
				
				
				int existAccount = 0;	//계좌번호 존재 여부 확인
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.println("없는 계좌번호입니다.");
					continue;
				}
				
				
				System.out.println("출금할 금액을 입력하세요: ");
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						totalbalance =  arr.get(i).getBalance() - balance;
						arr.get(i).setBalance(totalbalance);
					}
				}
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
