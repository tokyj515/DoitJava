package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		Buy.super.order();
	}

	/*@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}*/
}

