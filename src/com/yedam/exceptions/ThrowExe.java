package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args) {
		try {
		int result = divide(3,0);
		System.out.println(result);
		}catch(ArithmeticException e){
			System.out.println("2번째 숫자에 0을 입력하지마세요.");
		}
		try {
			method("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception ee) {
			System.out.println("알 수 없는 예외.");
		}
	}
	
	public static void method(String cls) // 예외 떠넘기기.
			throws ClassNotFoundException, Exception {
		
		Class.forName(cls); //여기서 예외처리하지 않고 이걸 호출하는 method로 떠넘기겠다.
		
		System.out.println("end of method.");
	}
	public static int divide(int a, int b) {
		
		return a / b;
	}
}
