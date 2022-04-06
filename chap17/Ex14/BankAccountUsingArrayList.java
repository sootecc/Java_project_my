package chap17.Ex14;

import java.util.ArrayList;
import java.util.Scanner;


class Account{ 	//���� ������ �����ϴ� ��ü, �߿��� �ʵ�, private(ĸ��ȭ) ������(O), getter, setter		//DTO, VO <= �� �������� �ʵ��� ���� �����ϰ� ���� 
	
	private String ano;		//���� ��ȣ
	private String owner; 	//���� ��
	private int balance;	//���� �ݾ�
	
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
			//�÷���(ArrayList<E>)�� ����ؼ� Account ��ü ���
			//�迭�� ���� ũ�Ⱑ ����
			//�÷����� ���� ũ�Ⱑ ����
	
	
	
	
			
	public static void main(String[] args) {
		 
		
		ArrayList<Account> arr = new ArrayList<Account>();	//�迭�� ��ü ����.
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
				
				int overlap = 0;		//�ߺ� ���� üũ
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						System.out.printf("%s%s","�̹� �ִ� ���¹�ȣ�Դϴ�. �ٽ� �������ּ���.",System.lineSeparator());
						overlap =1;
						break;
					}
				}
				if(overlap == 1) {continue;}
				
				System.out.printf("%s%s","�̸��� �Է��ϼ���: ",System.lineSeparator());
				String name = scanner.next();
				System.out.printf("%s%s","�ʱ� ���� �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
			
				Account customer = new Account(ano, name, balance);
				arr.add(customer);
			}
			else if(selectNo == 2) {	//���¸��
				for(int i = 0 ; i<arr.size(); i++) {
					
					Account act = arr.get(i);
					System.out.printf("���¹�ȣ: %s  �̸�: %s �ݾ�: %d%s",act.getAno(),act.getOwner(),act.getBalance(),System.lineSeparator());
							
				}		
			}
			else if(selectNo == 3) {	//����
				System.out.printf("%s%s","������ ���¹�ȣ�� �Է��ϼ���: ",System.lineSeparator());
				String ano = scanner.next();
				
				
				int existAccount = 0;		//���¹�ȣ ���� ���� Ȯ��
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.printf("%s%s","���� ���¹�ȣ�Դϴ�.",System.lineSeparator());
					continue;
				}//���� �����̸� if Ż�� while������
				
				
				System.out.printf("%s%s","������ �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<arr.size();i++) {//����
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						totalbalance =  arr.get(i).getBalance() + balance;
						arr.get(i).setBalance(totalbalance);
					}
				}
		
			}
			else if(selectNo == 4) {//���
				System.out.printf("%s%s","����� ���¹�ȣ�� �Է��ϼ���: ",System.lineSeparator());
				String ano = scanner.next();
				
				
				int existAccount = 0;	//���¹�ȣ ���� ���� Ȯ��
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						existAccount = 1;
						break;
					}
				}
				if(existAccount  == 0) {
					System.out.printf("%s%s","���� ���¹�ȣ�Դϴ�.",System.lineSeparator());
					continue;
				}
				
				
				System.out.printf("%s%s","����� �ݾ��� �Է��ϼ���: ",System.lineSeparator());
				int balance = scanner.nextInt();
				
				
				for(int i=0;i<arr.size();i++) {
					if(arr.get(i).getAno().equals(ano)) {
						int totalbalance=0;
						
						if(arr.get(i).getBalance()>=balance) {
							totalbalance =  arr.get(i).getBalance() - balance;
							arr.get(i).setBalance(totalbalance);
						}
						else {
							System.out.printf("%s%s���� ������ �ܾ�: %d%s","���� �ִ� ������ ���� �Է��Ͽ����ϴ�.",System.lineSeparator(),arr.get(i).getBalance(),System.lineSeparator());
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
		System.out.printf("%s%s","���α׷� ����",System.lineSeparator());
		
		
	}
	

}
