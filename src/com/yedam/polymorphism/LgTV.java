package com.yedam.polymorphism;

public class LgTV implements TV {
	
	private Speaker speaker;
	
	LgTV(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV power On");
	}

	@Override
	public void powerOff() {
		System.out.println("LgTV power Off");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

}
