package chap17.Ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;


//HashSet으로 전환
//Member 클래스의 memberID 컬럼을 equals(), hashCode()


//중요!!!!: Set은 중복된 값을 저장할 수 없다. 
	//Wrapper 클래스: Integer, Double, Float, Character, Byte, Short, Long, Boolean
	//Wrapper 클래스는 equals(), hashCode() 메소드가 재정의 되어 있다.
	//특정 객체를 생성 후 그 객체를 Set에 저장할 경우 그 객체의 Object클래스의 equals(), hashCode()를 재정의 해야한다.
	//객체의 특정 필드의 값이 같을 때 중복을 식별하는 필드를 생성
	



class Member{	//DTO, VO: 각 계층간의 데이터를 받아서 전달해주는 클래스
					//Set 에 넣을 식별자, memberID 필드의 값이 같을 때 같은 객체이다 라고 선언
					// -> 그 방법은 equals()와 hashCode()를 재정의
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
	@Override										//member1.equals(member2) 
	public boolean equals(Object obj) {			//객체의 정보가 Object로 업캐스팅
			if(obj instanceof Member) {			//다운캐스팅 할 때 런타임 오류를 방지하기 위해 Object에 Member객체가 포함되어 잇는지 확인하다.
				Member member = (Member)obj;	//obj는 Object로 업캐스팅 되어 들어온 인풋 -> 다시 다운캐스팅
				if(this.memberID == member.memberID) {	//this.memberID: member1 객체의 memberID, member.memberID: member2 객체의 memberID
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
			return false;		//obj가 Member 타입을 내포하지 않을 때
	}
	@Override
	public int hashCode() {		//처리해 주어야 하는 것: memberID 필드의 값이 동일할 떄 동일한 hashCode를 생성.
			
		//1. return memberID;		//this.memberID
		//2. return this.memberID;	//하나의 필드만을 조건으로 hashCode() 생성
		return Objects.hashCode(memberID);		//권장사항 
		
		//Objects.hashCode(memberID, memberName ... ) 여러개의 필드를 조건으로 hashCode를 생성할 수 있다.
			//memberID, memberName 필드의 값이 모두 동일할 경우 동일한 hashCode()를 만든다.
		
		 
	}
	
}

class MemberHashSet{		//MemberArrayList를 객체화하면 ArrayList 객체가 생성된다.
		
	private Set<Member> hashSet;		//Set 선언: <Member> , 필드의 private (생성자, setter 를 통해서 값 할당)
		
		//Set<Member> hashSet = new HashSet<Member>();
		//List<Member> aList = new ArrayList<Member>();	제네릭 타입클래스 객체 생성
		//ArrayList<Member> arrayList = new ArrayList<Member>();
	
	public MemberHashSet() {			//기본 생성자 호출 시 Set 의 참조 변수 활성화.
		hashSet = new HashSet();
	}		//기본 생성자
	
	public void addMember(Member member) {	//Member 객체를 받아서 맨 마지막 방에 값을 추가하는 메소드
		hashSet.add(member);				//Member 객체를 input받아 hashSet에 Member객체를 저장, 중복 저장되면 안된다.
	}										//Member 객체의 memberID 필드 값이 동일할 경우, 동일한 객체 -> hashCode, equals에서 재정의 해줬쥬?
												
	public boolean removeMember (int memberID) { //ArrayList에 저장된 memberID를 검색해서 해당 객체를 삭제한다.
		//Set은 index가 존재하지 않으므로 기본 for문은 사용할 수 없다.
		//향상된 for문을 사용할 수 있고, iterator를 사용할 수 있다.
		
		//iterator 사용하여 remove 
		
		Iterator<Member> iterator = hashSet.iterator();
		
		
		
		
		
		while(iterator.hasNext()) {
			Member member = (Member) iterator.next();	//객체를 한 번 거쳐주면 쉽네요
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
			Member member = iterator.next();	//hashSet의 값을 가지고 온다.
			System.out.println( member);		//hashSet의 객체를 출력, toString() 재정의 -> 필드의 값을 출력한다. 
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
		memberhashset.removeMember(1002);
		memberhashset.showAllMember();
	}

}
