package chap17.Ex13;

import java.util.ArrayList;
import java.util.Scanner;

class AAccount{
	
	private String ano;		//���� ��ȣ
	private String owner; 	//���� ��
	private int balance;	//���� �ݾ�
	
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
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ���� ");
			System.out.println("--------------------------------------------------");
			System.out.println("���� >> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {//���»���
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				
				int overlap = 0;		//�ߺ� ���� üũ
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						System.out.println("�̹� �ִ� ���¹�ȣ�Դϴ�. �ٽ� �������ּ���.");
						overlap =1;
						break;
					}
				}
				if(overlap == 1) {continue;}
				
				System.out.println("�̸��� �Է��ϼ���: ");
				String name = scanner.next();
				System.out.println("�ʱ� ���� �ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				
				Account customer = new Account(ano, name, balance);
				arr.add(customer);
				count++;
			}
			else if(selectNo == 2) {//���¸��
				for(int i = 0 ; i<count; i++) {
							Account act = arr.get(i);
							System.out.print("���¹�ȣ: "+act.getAno()+" �̸�: "+act.getOwner()+" �ݾ�: "+act.getBalance());
							System.out.println();
				}		
			}
			else if(selectNo == 3) {//����
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				
				
				int existAccount = 0;	//���¹�ȣ ���� ���� Ȯ��
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.println("���� ���¹�ȣ�Դϴ�.");
					continue;
				}
				
				
				System.out.println("������ �ݾ��� �Է��ϼ���: ");
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<count;i++) {//����
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						totalbalance =  arr.get(i).getBalance() + balance;
						arr.get(i).setBalance(totalbalance);
					}
				}
		
			}
			else if(selectNo == 4) {//���
				System.out.println("���¹�ȣ�� �Է��ϼ���: ");
				String ano = scanner.next();
				
				
				int existAccount = 0;	//���¹�ȣ ���� ���� Ȯ��
				for(int i=0;i<count;i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.println("���� ���¹�ȣ�Դϴ�.");
					continue;
				}
				
				
				System.out.println("����� �ݾ��� �Է��ϼ���: ");
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
		System.out.println("���α׷� ����");
		
		
	}
	

}
