package collection.linkedlist;

import collection.Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {

		MemberLinkecList memberArrayList = new MemberLinkecList();
		
		Member memberLee = new Member(1001, "ȫ�浿");
		Member memberSon = new Member(1002, "�̼���");
		Member memberPark = new Member(1003, "�Ż��Ӵ�");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		
		memberArrayList.showAllMember();
	}

}