package com.google.chapter07;

public class SmartPhoneCharge implements USB {
	static int PhoneCode = 0;
public static final String PHONE_NO="APTX-4869";
	private SmartPhoneCharge() {
		PhoneCode++;
		System.out.println("你增加了一部智能手机，编号：" + PhoneCode);
		System.out.println("你的手机型号为：" + PHONE_NO);
	}

	public static SmartPhoneCharge CreateAPhone() {
		if (PhoneCode >= 10) {
			System.err.println("手机位溢出，手机位只有10个");
			return null;
		} else {
			return new SmartPhoneCharge();
		}

	}

	@Override
	public void insertUSB() {
		System.out.println(PhoneCode+"号"+PHONE_NO+"手机插入USB充电线，开始充电");
	}

}
