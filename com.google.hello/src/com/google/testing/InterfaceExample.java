package com.google.testing;

import com.google.chapter07.SmartPhoneCharge;

public class InterfaceExample {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			SmartPhoneCharge.CreateAPhone();
		}
		SmartPhoneCharge phone = SmartPhoneCharge.CreateAPhone();
		SmartPhoneCharge phone1 = SmartPhoneCharge.CreateAPhone();
		// phone1=null;
		// 回收垃圾
		System.gc();
		phone.insertUSB();
		phone1.insertUSB();
	}
}
