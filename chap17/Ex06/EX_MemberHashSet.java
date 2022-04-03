package chap17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//HashSet으로 전환
//Member 클래스의 memberID 컬럼을 equals(), hashCode()

class Member{	//DTO, VO: 각 계층간의 
	
	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {	//생성자를 통해서 필드의 값 할당
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

		return memberName + " 회원님의 아이디는 " + memberID+" 입니다.";
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

class MemberHashSet{		//MemberArrayList를 객체화하면 ArrayList 객체가 생성된다.
	private Set<Member> hashSet;
	
		//List<Member> aList = new ArrayList<Member>();	제네릭 타입클래스 객체 생성
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {
		hashSet = new HashSet();
	}		//기본 생성자
	
	public void addMember(Member member) {//Member 객체를 받아서 맨 마지막 방에 
		hashSet.add(member);
	}
	
	public boolean removeMember (int memberID) { //ArrayList에 저장된 memberID를 검색해서 해당 객체를 삭제한다.
		
		//iterator 사용하여 remove 
		
		Iterator<Member> iterator = hashSet.iterator();
		
		if(iterator.hasNext()) {
			Member member = (Member) iterator.next();
			if(member.getMemberID() == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		
		
		
		System.out.println(memberID + " 가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//System.out.println(arrayList);
		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println( iterator.next());
		}
	}//ArrayList에 저장된 모든 사용자 정보를 출력하는 메소드
	
	public void showSize() {
		System.out.println(hashSet.size());
	}
	
	
}


public class EX_MemberHashSet {

	public static void main(String[] args) {
		
		MemberHashSet memberhashset = new MemberHashSet();		//객체를 생성하는 순간 arrayList 필드가 활성화
			//메소드를 호출하기 위해 객체 생성
			// addMember(Member member), addMember2(int index, Member member), removeMember(int memberID),showAllMember()
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		Member memberLee2 = new Member(1001,"이지원");
		
		//각 객체를 생성해서 ArrayList에 저장 
		memberhashset.addMember(memberLee);			
		memberhashset.addMember(memberSon);
		memberhashset.addMember(memberPark);
		memberhashset.addMember(memberHong);
		
		memberhashset.showSize();
		
	
		
		
		//모든 사용자 출력
		memberhashset.showAllMember();
		System.out.println("==================");
		
		//특정 ID를 가진 사용자 제거
		memberhashset.removeMember(1001);
		memberhashset.showAllMember();
	}

}
