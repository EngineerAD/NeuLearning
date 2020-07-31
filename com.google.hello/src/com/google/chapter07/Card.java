package com.google.chapter07;
/**
 * @author 吴昇
 * @Encode UTF-8
 * @version 1.0
 * @since 1.8 欢迎反馈更多bug
 * @function 简单例子说明多态
 */
public class Card {
	public static void pay(Cards card) {
		card.pay();
	}

	public static void main(String[] args) {
		BankCard c1 = new BankCard();
		CreditCard c2 = new CreditCard();
		pay(c1);
		pay(c2);
	}

}

abstract class Cards {
	public abstract void pay();
}

class CreditCard extends Cards {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("信用卡");
	}

}

class BankCard extends Cards {

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("储蓄卡");
	}

}