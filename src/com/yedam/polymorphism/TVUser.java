package com.yedam.polymorphism;

public class TVUser {
	public static void main(String[] args) {
//		Speaker speaker = new SonySpeaker(); // new AppleSpeaker();
//		TV tv = new LgTV(speaker); // new SamsungTV(speaker);
		BeanFactory factory = new BeanFactory();
		TV tv = (TV) factory.getBean(args[0], args[1]); 
		
		tv.powerOn();   // 인터페이스에 정의된 메소드.
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
