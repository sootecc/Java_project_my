package chap17.Ex13;

import java.util.Scanner;

class Account{
	
	private String ano;		//���� ��ȣ
	private String owner; 	//���� ��
	private int balance;	//���� �ݾ�
	
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
		//�迭�� ����ؼ� Account ��ü ���
			private static Account[] accountArray = new Account[100];	//�迭�� ��ü ����.
			private static Scanner scanner = new Scanner(System.in);
			private static int counter = 0;
			
			private static void createAccount() {
				//�ڵ� �ۼ�: 1. ���� ����. ��ĳ�ʷ� 1. ���¹�ȣ, 2. �̸�, 3. �ʱ� ���� �ݾ�
				//�迭 ��ü�� ����.
				
				
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				System.out.println("�̸��� �Է��ϼ���: ");
				String name = scanner.next();
				System.out.println("�ʱ� ���� �ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				
				Account customer = new Account(ano, name, balance);
				accountArray[counter] = customer;
				
				counter ++;
			}
			
			private static void accountList() {
				//�ڵ� �ۼ�: 2. �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ��� ���
				for(int i = 0 ; i<100; i++) {
					try {
						System.out.print("���¹�ȣ: "+accountArray[i].getAno()+" �̸�: "+accountArray[i].getOwner()+" �ݾ�: "+accountArray[i].getBalance());
						System.out.println();
					}
					catch(NullPointerException e) {}
				}
			}
			
			private static void deposit() {
				//�ڵ� �ۼ�: 3. ���� <= ���¹�ȣ�� �ް� ��ü���� �ش� ���¸� ã��, �Աݱݾ�: �ش� ���¿� ����. 
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				System.out.println("������ �ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				
				int totalbalance=0;
				totalbalance = balance + findAccount(ano).getBalance();
				findAccount(ano).setBalance(totalbalance);
				
			}
			
			private static void withdraw() {
				//�ڵ� �ۼ�: 4. ��� <= ���¹�ȣ�� �ް� ��ü���� �ش� ���¸� ã��, ��ݱݾ�: �ش� ���¿��� ���.
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				System.out.println("����� �ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				
				int totalbalance=0;
				totalbalance =  findAccount(ano).getBalance() - balance;
				findAccount(ano).setBalance(totalbalance);
				
			}
			
			//�迭���� Account ��ü ���� ano[���¹�ȣ]�� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������.
			private static Account findAccount(String ano) {
				
				Account account = null;
				//�ڵ� �ۼ�
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
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� ");
			System.out.println("--------------------------------------------------");
			System.out.println("���� >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();	//�޼ҵ� ȣ��
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
		System.out.println("���α׷� ����");
		
		
	}

}
