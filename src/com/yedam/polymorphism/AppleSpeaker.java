package com.yedam.polymorphism;

public class AppleSpeaker implements Speaker {
	
	AppleSpeaker(){
		System.out.println("AppleSpeaker 객체 생성.");
	}
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker 소리 올림.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker 소리 내림.");
	}

}
