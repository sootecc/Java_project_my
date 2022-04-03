package Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;



class Member{				//DTO, VO : 각 계층간에 데이터를 받아서 전달해주는 클래스
	private int memberid;
	private String memberName;
	
	public Member(int memberid,String memberName) { //생성자를 통해서 필드에 값할당
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
			return memberName + "회원님의 id는 "+memberid+"입니다.";
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

class MemberHashSet{ 			//MemberArrayList를  객체화하면 ArrayList 객체가 만들어진다.
	private HashSet<Member> hashSet;
	
	public MemberHashSet() { //기본 생성자
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member){ // Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
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
		//ArrayList에 저장된 모든 사용자 정보를 출력하는 메소드
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
		Member memberLee = new Member(1001, "이지원");
		Member memberKim = new Member(1002, "김원국");
		Member memberSon = new Member(1003, "손지수");
		Member memberPark = new Member(1004, "박학원");
		Member memberPark2 = new Member(1004, "박학원");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberPark2);
		
		
		memberHashSet.showSize(); //4개 출력
		
		
		//모든 사용자 정보 출력
		memberHashSet.showAllMember();
		
		//특정 id를 가진 사용자 제거
		memberHashSet.removeMember(1002);
		//확인
		
		memberHashSet.showAllMember();
		
	}

}
