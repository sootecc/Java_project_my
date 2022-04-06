package chap17.Ex14;

import java.util.ArrayList;
import java.util.Scanner;


class Account{ 	//계좌 정보를 저장하는 객체, 중요한 필드, private(캡슐화) 생성자(O), getter, setter		//DTO, VO <= 각 계층으로 필드의 값을 저장하고 전달 
	
	private String ano;		//계좌 번호
	private String owner; 	//계좌 주
	private int balance;	//통장 금액
	
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
	
}



public class BankAccountUsingArrayList {
			//컬렉션(ArrayList<E>)을 사용해서 Account 객체 등록
			//배열은 방의 크기가 고정
			//컬렉션은 방의 크기가 동적
	
	
	
	
			
	public static void main(String[] args) {
		 
		
		ArrayList<Account> arr = new ArrayList<Account>();	//배열에 객체 저장.
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
				
				int overlap = 0;		//중복 계좌 체크
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						System.out.printf("%s%s","이미 있는 계좌번호입니다. 다시 생성해주세요.",System.lineSeparator());
						overlap =1;
						break;
					}
				}
				if(overlap == 1) {continue;}
				
				System.out.printf("%s%s","이름을 입력하세요: ",System.lineSeparator());
				String name = scanner.next();
				System.out.printf("%s%s","초기 통장 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
			
				Account customer = new Account(ano, name, balance);
				arr.add(customer);
			}
			else if(selectNo == 2) {	//계좌목록
				for(int i = 0 ; i<arr.size(); i++) {
					
					Account act = arr.get(i);
					System.out.printf("계좌번호: %s  이름: %s 금액: %d%s",act.getAno(),act.getOwner(),act.getBalance(),System.lineSeparator());
							
				}		
			}
			else if(selectNo == 3) {	//예금
				System.out.printf("%s%s","예금할 계좌번호를 입력하세요: ",System.lineSeparator());
				String ano = scanner.next();
				
				
				int existAccount = 0;		//계좌번호 존재 여부 확인
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.printf("%s%s","없는 계좌번호입니다.",System.lineSeparator());
					continue;
				}//없는 계좌이면 if 탈출 while문으로
				
				
				System.out.printf("%s%s","예금할 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<arr.size();i++) {//예금
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						totalbalance =  arr.get(i).getBalance() + balance;
						arr.get(i).setBalance(totalbalance);
					}
				}
		
			}
			else if(selectNo == 4) {//출금
				System.out.printf("%s%s","출금할 계좌번호를 입력하세요: ",System.lineSeparator());
				String ano = scanner.next();
				
				
				int existAccount = 0;	//계좌번호 존재 여부 확인
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.printf("%s%s","없는 계좌번호입니다.",System.lineSeparator());
					continue;
				}
				
				
				System.out.printf("%s%s","출금할 금액을 입력하세요: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						
						if(arr.get(i).getBalance()>=balance) {
							totalbalance =  arr.get(i).getBalance() - balance;
							arr.get(i).setBalance(totalbalance);
						}
						else {
							System.out.printf("%s%s현재 계좌의 잔액: %d%s","갖고 있는 돈보다 많이 입력하였습니다.",System.lineSeparator(),arr.get(i).getBalance(),System.lineSeparator());
						}
					}
				}
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
