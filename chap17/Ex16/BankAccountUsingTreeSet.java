package chap17.Ex16;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//�Ϸ�ð� : 5:00 , p.jangwoo@gmail.com, ����� �����ּҷε� ������ �ּ���. 

// Account ��ü�� TreeSet�� ����. ano[���� ��ȣ], owner[�̸�], balance[���ݱݾ�] 
// TreeSet �� �Ϲݰ�ü�� ������ � �÷��� ���������� ����. Comparable<E>,  Comparator<E> 
// Account ��ü�� �������� �ʰ�. balance ���� ū�ͺ��� ��µǵ��� ����. <��������> 

public class BankAccountUsingTreeSet {
	
	private static TreeSet<Account> tSet = new TreeSet<Account>(new Comparator<Account>() {
		
		@Override
		public int compare(Account o1, Account o2) {
			if(o1.getBalance()>o2.getBalance()) {return -1;}
			else if(o1.getBalance() == o2.getBalance()) {return 0;}
			else {return 1;}
		}
	});
	private static Scanner scanner = new Scanner(System.in); 
	
	private static void createAccount() {
		//�ڵ� �ۼ� : 1. ���� ����.  ��ĳ�ʷ� 1.���¹�ȣ, 2. �̸�, 3. �ʱ����� �ݾ�
		//�迭 ��ü�� ����. 
		System.out.println("----------");
		System.out.println("1. ���� ����");
		System.out.println("----------");
		System.out.println("���� ��ȣ�� �Է� �ϼ��� >>");
		String ano = scanner.next();    //���� ��ȣ�� ��ǲ �޾Ƽ� ano ������ �Ҵ�. <�޼ҵ� �������� ����ϴ� ���� ����>  
		System.out.println("�̸��� �Է� �ϼ���>>");
		String owner = scanner.next(); 
		System.out.println("���� ������ �ʱ� �ݾ��� �Է� �ϼ��� >>");
		int balance = scanner.nextInt(); 
		
		//�� �ʵ��� ������ ����ڷ� ���� �Ҵ� �޾Ƽ� ��ü�� ������ ��ü�� �ʵ��� ���� ����. 
		Account newAccount = new Account(ano, owner, balance);    //�����ڸ� ���ؼ� ��ü�� �ʵ尪������ ��ü ����. 
			  
		tSet.add(newAccount) ;   
		System.out.println("���°� ���������� �����Ǿ����ϴ�. ");
			 		
	}
	private static void accountList() {
		//�ڵ� �ۼ� :2. ���� ��� ��� :  �迭�� ����� ��ü�� �����ͼ� ���¹�ȣ, �̸�, �ݾ� �� ��� 
		//�迭�� �� ���� ��ȸ �ϸ鼭 null�� �ƴ� ��� �迭���� ��ü�� ������ �ʵ��� ������ ���. 
		System.out.println("------------");
		System.out.println("2. ���¸�����");
		System.out.println("------------");
		
		//�迭�� ������ null�ƴ� ��� , ��ü�� �ʵ��� ���� ���. 
		Iterator<Account> ir = tSet.iterator();
		while(ir.hasNext()) {
			Account account = ir.next();    // 0 ~ 99 ���� ��ü�� account ���� ������ ��´�. 
			if (account != null) {    //�� ���� ���� null�� �ƴ� ��츸 ��ü������ �����ͼ� ���. 
				System.out.print(account.getAno());  //���� ����. 
				System.out.print("    ");
				System.out.print(account.getOwner());   //�̸�
				System.out.print("    ");
				System.out.print(account.getBalance());  //�ݾ�
				System.out.println();   //���� ����. 
			}
		}	
	}
	private static void deposit() {
		//�ڵ� �ۼ� : 3. ���� <== ���¹�ȣ�� �޾Ƽ� ��ü���� �ش� ���¸� ã�Ƽ�, �Աݱݾ� : �ش� ���¿� ����. 
		//1. ����ڷ� ���� �Ա��� ���¸� �޾ƾ� �Ѵ�. 
		//2. ����ڷ� ���� ���� ��ȣ�� �迭�� ����� ��ü���� ���� ��ȣ�� Ȯ���� �ش� ���¿� �Ա�. 
		
		System.out.println("----------");
		System.out.println("3.�����ϱ�");
		System.out.println("----------");
		System.out.println("������ ���� ��ȣ�� �Է��ϼ��� >>");
		String ano = scanner.next(); 
		System.out.println("������ �ݾ��� �Է� �ϼ��� >>");
		int money = scanner.nextInt(); 
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Account account = findAccount(ano);      //findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.  ");
			return;    //�޼ҵ带 ����. 
		}
		account.setBalance(account.getBalance() + money );   //settor �� ����ؼ� ������ �ݾ� + �߰� �Ա� 
		System.out.println("��� : ������ ���������� �Ա� �Ǿ����ϴ�. ");
		
	}
	private static void withdraw() {
		//�ڵ� �ۼ� : 4. ��� <== ���� ��ȣ�� ��ǲ �޾� �ش� ���¸� ��ü���� ã�Ƽ� ���.
		
		
		System.out.println("----------");
		System.out.println("4.����ϱ�");
		System.out.println("----------");
		System.out.println("����� ���� ��ȣ�� �Է��ϼ��� >>");
		String ano = scanner.next(); 
		System.out.println("����� �ݾ��� �Է� �ϼ��� >>");
		int money = scanner.nextInt(); 
		
		//�ش� ���¸� �迭���� ã�Ƽ� ã�� ��ü�� �޾ƿ´�. 
		Account account = findAccount(ano);      //findAccount(���¹�ȣ)
		
		if (account == null) {
			System.out.println("��� : �ش� ���°� �������� �ʽ��ϴ�.  ");
			return;    //�޼ҵ带 ����. 
		}
		account.setBalance(account.getBalance() - money );   //setter �� ����ؼ� ������ �ݾ� - �߰� �Ա� 
		System.out.println("��� : ������ ���������� ��� �Ǿ����ϴ�. ");
		System.out.println("���� �ݾ� : " + account.getBalance());
		
		
		
	}
	
	//�迭���� Account ��ü ���� ano[���¹�ȣ] �� ������ ���¸� ã�Ƽ� ã�� ��ü�� �������� ������. 
	//����, ����Ҷ� �����ڵ� , ���� �޼ҵ忡�� �ߺ� ��� �ɶ� ������ �޼ҵ带 �����ؼ� �ߺ��ڵ带 �����ϰ� ����� �ش�. 
	private static Account findAccount(String ano) {
		Account account = null ; 
		//�ڵ� �ۼ� 
		Iterator<Account> ir = tSet.iterator();
		
		while(ir.hasNext()) {
			Account a1 = ir.next();
			String dbAno = a1.getAno(); //�迭�� �� �濡 ����� ��ü�� ano�� dbAno ������ �Ҵ�. 
			if (dbAno.equals(ano)) {	
				account = a1; 
				return account;
				
			}	
		}
			return account; 
	}
	
	
	

	public static void main(String[] args) {
		
		

		boolean run = true; 
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------------");
			System.out.println("����>>");
			int selectNO = scanner.nextInt(); 
			
			if (selectNO == 1) {
				createAccount() ; 	//�޼ҵ� ȣ�� , ��ü ���� ���� �޼ҵ������ ȣ��(static) , 
			}else if (selectNO == 2) {
				accountList(); 
			}else if (selectNO == 3) {
				deposit(); 
			}else if (selectNO == 4) {
				withdraw(); 
			}else if (selectNO == 5) {
				run = false; 
				//break; 
			}
			
		}
		scanner.close(); 
		System.out.println("���α׷� ����");
		
		

	}

}
