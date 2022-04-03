package chap17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//HashSet���� ��ȯ
//Member Ŭ������ memberID �÷��� equals(), hashCode()

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
	@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				this.memberID = ((Member)obj).memberID;
				return true;
			}
			else {
				return false;
			}
		}
	@Override
		public int hashCode() {
			
			return memberID;
		}
	
}

class MemberHashSet{		//MemberArrayList�� ��üȭ�ϸ� ArrayList ��ü�� �����ȴ�.
	private Set<Member> hashSet;
	
		//List<Member> aList = new ArrayList<Member>();	���׸� Ÿ��Ŭ���� ��ü ����
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {
		hashSet = new HashSet();
	}		//�⺻ ������
	
	public void addMember(Member member) {//Member ��ü�� �޾Ƽ� �� ������ �濡 
		hashSet.add(member);
	}
	
	public boolean removeMember (int memberID) { //ArrayList�� ����� memberID�� �˻��ؼ� �ش� ��ü�� �����Ѵ�.
		
		//iterator ����Ͽ� remove 
		
		Iterator<Member> iterator = hashSet.iterator();
		
		if(iterator.hasNext()) {
			Member member = (Member) iterator.next();
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
			System.out.println( iterator.next());
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
		memberhashset.removeMember(1001);
		memberhashset.showAllMember();
	}

}
