package Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;



class Member{				//DTO, VO : �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
	private int memberid;
	private String memberName;
	
	public Member(int memberid,String memberName) { //�����ڸ� ���ؼ� �ʵ忡 ���Ҵ�
		this.memberid = memberid;
		this.memberName= memberName;
		
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
		public String toString() {
			return memberName + "ȸ������ id�� "+memberid+"�Դϴ�.";
		}
	@Override
		public boolean equals(Object obj) {
		if (this.memberid == ((Member)obj).memberid) {
			return true;
		}else {
			return false;
		}
	}
	@Override
		public int hashCode() {
			return Objects.hash(memberid);
		}
}

class MemberHashSet{ 			//MemberArrayList��  ��üȭ�ϸ� ArrayList ��ü�� ���������.
	private HashSet<Member> hashSet;
	
	public MemberHashSet() { //�⺻ ������
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){ // Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member);
	
		
		
	}
	public boolean removeMember(int memberid) {
		
		
		
		Iterator<Member> iterator = hashSet.iterator();
		
		while(iterator.hasNext()) {
			Member member = (Member)iterator.next();
			if(member.getMemberid()==memberid) {
				hashSet.remove(member);
				return true;
			}	
		}
		return false;
	}       
	
	public void showAllMember() {
		//ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
		//iterator
		Iterator<Member> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+ " ");
		}
		System.out.println();
		
	}
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
	
}

public class Exercise {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberLee = new Member(1001, "������");
		Member memberKim = new Member(1002, "�����");
		Member memberSon = new Member(1003, "������");
		Member memberPark = new Member(1004, "���п�");
		Member memberPark2 = new Member(1004, "���п�");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark2);
		
		
		memberHashSet.showSize(); //4�� ���
		
		
		//��� ����� ���� ���
		memberHashSet.showAllMember();
		
		//Ư�� id�� ���� ����� ����
		memberHashSet.removeMember(1002);
		//Ȯ��
		
		memberHashSet.showAllMember();
		
	}

}
