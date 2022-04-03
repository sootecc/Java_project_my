package chap17.Ex05;

import java.util.ArrayList;
import java.util.List;

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
}

class MemberArrayList{		//MemberArrayList를 객체화하면 ArrayList 객체가 생성된다.
	private ArrayList<Member> arrayList;
	
		//List<Member> aList = new ArrayList<Member>();	제네릭 타입클래스 객체 생성
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}		//기본 생성자
	
	public void addMember(Member member) {//Member 객체를 받아서 맨 마지막 방에 
		arrayList.add(member);
	}
	public void addMember2(int index, Member member) {//매개변수 2개를 받아서 특정 index에 값을 추가
		
		try {
			arrayList.add(index, member);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("index 이탈했음!");
		}
	}
	public boolean removeMember (int memberID) { //ArrayList에 저장된 memberID를 검색해서 해당 객체를 삭제한다.
		
		for(int i= 0; i<arrayList.size();i++) {
			if(arrayList.get(i).getMemberID() == memberID) {
				arrayList.remove(i);
				System.out.println("회원님의 "+memberID+"는 삭제되었습니다.");
				return true;
			}
		}
		System.out.println(memberID + " 가 존재하지 않습니다.");
		return false;
	}
	public void showAllMember() {
		//System.out.println(arrayList);
	
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
	}//ArrayList에 저장된 모든 사용자 정보를 출력하는 메소드
	
	public void showSize() {
		System.out.println(arrayList.size());
	}
	
	
}


public class EX_MemberArrayList {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();		//객체를 생성하는 순간 arrayList 필드가 활성화
			//메소드를 호출하기 위해 객체 생성
			// addMember(Member member), addMember2(int index, Member member), removeMember(int memberID),showAllMember()
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1002,"손민국");
		Member memberPark = new Member(1003,"박서원");
		Member memberHong = new Member(1004,"홍길동");
		
		//각 객체를 생성해서 ArrayList에 저장 
		memberArrayList.addMember(memberLee);			
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showSize();
		
		//특정 index방에 추가적 사용자 추가
		memberArrayList.addMember2(2,memberLee);
		
		
		//모든 사용자 출력
		memberArrayList.showAllMember();
		
		
		//특정 ID를 가진 사용자 제거
		memberArrayList.removeMember(1001);
		memberArrayList.showAllMember();
	}

}
