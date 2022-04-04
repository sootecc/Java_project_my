package chap17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


//HashSet���� ��ȯ
//Member Ŭ������ memberID �÷��� equals(), hashCode()


//�߿�!!!!: Set�� �ߺ��� ���� ������ �� ����. 
	//Wrapper Ŭ����: Integer, Double, Float, Character, Byte, Short, Long, Boolean
	//Wrapper Ŭ������ equals(), hashCode() �޼ҵ尡 ������ �Ǿ� �ִ�.
	//Ư�� ��ü�� ���� �� �� ��ü�� Set�� ������ ��� �� ��ü�� ObjectŬ������ equals(), hashCode()�� ������ �ؾ��Ѵ�.
	//��ü�� Ư�� �ʵ��� ���� ���� �� �ߺ��� �ĺ��ϴ� �ʵ带 ����
	



class Member{	//DTO, VO: �� �������� �����͸� �޾Ƽ� �������ִ� Ŭ����
					//Set �� ���� �ĺ���, memberID �ʵ��� ���� ���� �� ���� ��ü�̴� ��� ����
					// -> �� ����� equals()�� hashCode()�� ������
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
	@Override										//member1.equals(member2) 
	public boolean equals(Object obj) {			//��ü�� ������ Object�� ��ĳ����
			if(obj instanceof Member) {			//�ٿ�ĳ���� �� �� ��Ÿ�� ������ �����ϱ� ���� Object�� Member��ü�� ���ԵǾ� �մ��� Ȯ���ϴ�.
				Member member = (Member)obj;	//obj�� Object�� ��ĳ���� �Ǿ� ���� ��ǲ -> �ٽ� �ٿ�ĳ����
				if(this.memberID == member.memberID) {	//this.memberID: member1 ��ü�� memberID, member.memberID: member2 ��ü�� memberID
					return true;
				}
				else {
					return false;
				}
				/*
				this.memberID = ((Member)obj).memberID;		
				return true;
				*/
			}
			return false;		//obj�� Member Ÿ���� �������� ���� ��
	}
	@Override
	public int hashCode() {		//ó���� �־�� �ϴ� ��: memberID �ʵ��� ���� ������ �� ������ hashCode�� ����.
			
		//1. return memberID;		//this.memberID
		//2. return this.memberID;	//�ϳ��� �ʵ常�� �������� hashCode() ����
		return Objects.hashCode(memberID);		//������� 
		
		//Objects.hashCode(memberID, memberName ... ) �������� �ʵ带 �������� hashCode�� ������ �� �ִ�.
			//memberID, memberName �ʵ��� ���� ��� ������ ��� ������ hashCode()�� �����.
		
		 
	}
	
}

class MemberHashSet{		//MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� �����ȴ�.
		
	private Set<Member> hashSet;		//Set ����: <Member> , �ʵ��� private (������, setter �� ���ؼ� �� �Ҵ�)
		
		//Set<Member> hashSet = new HashSet<Member>();
		//List<Member> aList = new ArrayList<Member>();	���׸� Ÿ��Ŭ���� ��ü ����
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {			//�⺻ ������ ȣ�� �� Set �� ���� ���� Ȱ��ȭ.
		hashSet = new HashSet();
	}		//�⺻ ������
	
	public void addMember(Member member) {	//Member ��ü�� �޾Ƽ� �� ������ �濡 ���� �߰��ϴ� �޼ҵ�
		hashSet.add(member);				//Member ��ü�� input�޾� hashSet�� Member��ü�� ����, �ߺ� ����Ǹ� �ȵȴ�.
	}										//Member ��ü�� memberID �ʵ� ���� ������ ���, ������ ��ü -> hashCode, equals���� ������ ������?
												
	public boolean removeMember (int memberID) { //ArrayList�� ����� memberID�� �˻��ؼ� �ش� ��ü�� �����Ѵ�.
		//Set�� index�� �������� �����Ƿ� �⺻ for���� ����� �� ����.
		//���� for���� ����� �� �ְ�, iterator�� ����� �� �ִ�.
		
		//iterator ����Ͽ� remove 
		
		Iterator<Member> iterator = hashSet.iterator();
		
		
		
		
		
		while(iterator.hasNext()) {
			Member member = (Member) iterator.next();	//��ü�� �� �� �����ָ� ���׿�
			if(member.getMemberID() == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		
		System.out.println(memberID + " �� �������� �ʽ��ϴ�.");
		return false;
	}
	public void showAllMember() {
		//System.out.println(arrayList);
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();	//hashSet�� ���� ������ �´�.
			System.out.println( member);		//hashSet�� ��ü�� ���, toString() ������ -> �ʵ��� ���� ����Ѵ�. 
		}
		
		
	}//ArrayList�� ����� ��� ����� ������ ����ϴ� �޼ҵ�
	
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
	
}


public class EX_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberhashset = new MemberHashSet();		//��ü�� �����ϴ� ���� arrayList �ʵ尡 Ȱ��ȭ
			//�޼ҵ带 ȣ���ϱ� ���� ��ü ����
			// addMember(Member member), addMember2(int index, Member member), removeMember(int memberID),showAllMember()
		
		Member memberLee = new Member(1001,"������");
		Member memberSon = new Member(1002,"�չα�");
		Member memberPark = new Member(1003,"�ڼ���");
		Member memberHong = new Member(1004,"ȫ�浿");
		Member memberLee2 = new Member(1001,"������");
		
		//�� ��ü�� �����ؼ� ArrayList�� ���� 
		memberhashset.addMember(memberLee);			
		memberhashset.addMember(memberSon);
		memberhashset.addMember(memberPark);
		memberhashset.addMember(memberHong);
		
		memberhashset.showSize();
		
	
		
		
		//��� ����� ���
		memberhashset.showAllMember();
		System.out.println("==================");
		
		//Ư�� ID�� ���� ����� ����
		memberhashset.removeMember(1002);
		memberhashset.showAllMember();
	}

}
