package com.yedam.interfaces;
//구현 클래스
public class Audio implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("Audio 볼륨 : " + this.volume);
	}

}
