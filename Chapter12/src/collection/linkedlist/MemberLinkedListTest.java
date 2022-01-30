package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkecList memberArrayList = new MemberLinkecList();
		
		Member memberLee = new Member(1001, "홍길동");
		Member memberSon = new Member(1002, "이순신");
		Member memberPark = new Member(1003, "신사임당");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}