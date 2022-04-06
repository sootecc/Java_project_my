package chap17.Ex16;

import java.util.Objects;


public class Account {
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
