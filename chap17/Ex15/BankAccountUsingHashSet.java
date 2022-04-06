package chap17.Ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class Account{ 	//���� ������ �����ϴ� ��ü, �߿��� �ʵ�, private(ĸ��ȭ) ������(O), getter, setter		//DTO, VO <= �� �������� �ʵ��� ���� �����ϰ� ���� 
	
	private String ano;		//���� ��ȣ
	private String owner; 	//���� ��
	private int balance;	//���� �ݾ�
	
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
		return  "���¹�ȣ: "+ano+" �̸�: "+owner+" �ܾ�: "+balance;


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
			//������ ���¸� ���� �� �ִ�.
			//���� ��ȣ�� �ߺ� ������ �Ǹ� �ȵȴ�. ano �÷��� �ߺ� ����Ǹ� �ȵǰ� �����ϰ� Set�� ����
	
	
	
	
			
	public static void main(String[] args) {
		 
		AccountHashSet actHashSet = new AccountHashSet();
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� ");
			System.out.println("--------------------------------------------------");
			System.out.println("���� >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {	//���»���
				System.out.printf("%s%s","���¹�ȣ�� �Է��ϼ���: ",System.lineSeparator());
				String ano = scanner.next();
				System.out.printf("%s%s","�̸��� �Է��ϼ���: ",System.lineSeparator());
				String name = scanner.next();
				System.out.printf("%s%s","�ʱ� ���� �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				Account tempAct = new Account(ano, name, balance);
				if(actHashSet.findAccount(ano)) {
					actHashSet.addAccount(tempAct);
				}
				else {
					System.out.println("�ߺ��� ���¹�ȣ�Դϴ�.");
				}
				
				
			}
			else if(selectNo == 2) {	//���¸��

				actHashSet.showAccount();
					
			}
			else if(selectNo == 3) {	//����
				System.out.printf("%s%s","������ ���¹�ȣ�� �Է��ϼ���: ",System.lineSeparator());
				String ano = scanner.next();
				
				System.out.printf("%s%s","������ �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				actHashSet.deposit(ano, balance);
				
			}
			else if(selectNo == 4) {//���
				System.out.printf("%s%s","����� ���¹�ȣ�� �Է��ϼ���: ",System.lineSeparator());
				String ano = scanner.next();
				
				System.out.printf("%s%s","����� �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				actHashSet.minus(ano, balance);
				
			}
			else if(selectNo == 5) {
				run = false;
				//break;
			}
			
		}
		
		scanner.close();
		System.out.printf("%s%s","���α׷� ����",System.lineSeparator());
		
		
	}
	

}
