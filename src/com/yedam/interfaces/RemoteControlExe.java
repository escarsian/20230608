package com.yedam.interfaces;

public class RemoteControlExe { //다중 상속 허용.
	public static void main(String[] args) { 
		
//		Audio audio = new Audio();
//		Television audio = new Television();
		RemoteControl remote = new Audio();//매개변수의 다형성.
		remote = new Television(); //매개변수의 다형성. //코드를 최대한 변형시키지 않고 내가 원하는 기능을 수행하고 싶어서.
		
		remote.turnOn();
		remote.setVolume(6);
		remote.turnOff();
	}
}
