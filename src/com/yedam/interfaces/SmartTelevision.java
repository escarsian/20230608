package com.yedam.interfaces;

//인터페이스는 다중상속 허용.
public class SmartTelevision implements RemoteControl, Searchable {
	
	@Override
	public void search(String url) { //Searchable 상속
		System.out.println(url + "을 검색합니다."); 
	}

	@Override
	public void turnOn() {  // RemoteControl 상속
		System.out.println("SmartTV를 켭니다.");
	}

	@Override
	public void turnOff() { // RemoteControl 상속
		System.out.println("SmartTV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
	}

}
