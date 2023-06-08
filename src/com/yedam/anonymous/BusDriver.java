package com.yedam.anonymous;

public class BusDriver implements Driver {

	@Override
	public void drive(Runnable runnable) {
		runnable.run();
	}

}
