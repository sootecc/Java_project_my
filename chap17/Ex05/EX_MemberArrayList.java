package chap17.Ex05;

import java.util.ArrayList;
import java.util.List;

class Member{	//DTO, VO: �� �������� 
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {	//�����ڸ� ���ؼ� �ʵ��� �� �Ҵ�
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {

		return memberName + " ȸ������ ���̵�� " + memberID+" �Դϴ�.";
	}
}

class MemberArrayList{		//MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� �����ȴ�.
	private ArrayList<Member> arrayList;
	
		//List<Member> aList = new ArrayList<Member>();	���׸� Ÿ��Ŭ���� ��ü ����
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}		//�⺻ ������
	
	public void addMember(Member member) {//Member ��ü�� �޾Ƽ� �� ������ �濡 
		arrayList.add(member);
	}
	public void addMember2(int index, Member member) {//�Ű����� 2���� �޾Ƽ� Ư�� index�� ���� �߰�
		
		try {
			arrayList.add(index, member);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("index ��Ż����!");
		}
	}
	public boolean removeMember (int memberID) { //ArrayList�� ����� memberID�� �˻��ؼ� �ش� ��ü�� �����Ѵ�.
		
		for(int i= 0; i<arrayList.size();i++) {
			if(arrayList.get(i).getMemberID() == memberID) {
				arrayList.remove(i);
				System.out.println("ȸ������ "+memberID+"�� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println(memberID + " �� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		//System.out.println(arrayList);
	
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}//ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
	
	public void showSize() {
		System.out.println(arrayList.size());
	}
	
	
}


public class EX_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();		//��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
			//�޼ҵ带 ȣ���ϱ� ���� ��ü ����
			// addMember(Member member), addMember2(int index, Member member), removeMember(int memberID),showAllMember()
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		
		//�� ��ü�� �����ؼ� ArrayList�� ���� 
		memberArrayList.addMember(memberLee);			
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		//Ư�� index�濡 �߰��� ����� �߰�
		memberArrayList.addMember2(2,memberLee);
		
		
		//��� ����� ���
		memberArrayList.showAllMember();
		
		
		//Ư�� ID�� ���� ����� ����
		memberArrayList.removeMember(1001);
		memberArrayList.showAllMember();
	}

}
