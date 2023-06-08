package com.yedam.interfaces;

public interface RemoteControl { //다중 상속 허용.
	
	int MAX_VOLUME = 10; //상수 필드 선언, 대문자로 써야함. 단어 사이에는 _로 연결.
	
	public abstract void turnOn(); //public abstract
	void turnOff(); //public abstract default로 되어 있음
	void setVolume(int volume);
}
