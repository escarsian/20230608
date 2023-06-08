package com.yedam.shape;

public class MainApp {
	public static void main(String[] args) {
		Shape shape = new Triangle();// 자식 클래스는 부모 클래스에
		shape.setColor("White");
		if (shape instanceof Triangle) {
			((Triangle) shape).draw();
		}

		shape = new Circle();
		if (shape instanceof Circle) {
			((Circle) shape).move();
			((Circle) shape).draw();
		}
	}
}
