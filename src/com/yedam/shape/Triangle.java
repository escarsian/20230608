package com.yedam.shape;

public class Triangle extends Shape implements Drawable {

	@Override
	public void draw() {
		System.out.println("삼각형을 그립니다.");
	}

}
