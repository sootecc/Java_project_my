package chap17.Ex16;

import java.util.Objects;


public class Account {
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
			if(this.ano.equals(act.ano)) {
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
