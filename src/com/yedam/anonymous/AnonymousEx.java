package com.yedam.anonymous;

// 익명구현객체. 인터페이스 구현 객체로 클래스로 선언하지 않고 이름 없는 클래스로 쓰겠다.
public class AnonymousEx {
	public static void main(String[] args) {
		RunClass run = new RunClass();
		run.run(); // run 메소드 다른 기능

		Runnable runnable = new Runnable() {                      //인터페이스 Runnable에 run 메소드 뿐이라면
			@Override
			public void run() {
				System.out.println("고양이가 달립니다.");
			}
		};
		runnable.run();
		
		
		//매개값으로 함수가 사용. 람다표현식.
		runnable = () -> System.out.println("기차가 달립니다.");     //이런 식으로 표현가능.
				
		runnable.run();
		
		
	}
}
