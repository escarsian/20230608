package com.yedam.exceptions;

public class ClassNotFoundExe {
	public static void main(String[] args) {
		
		try {
			//Exception 클래스.
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
