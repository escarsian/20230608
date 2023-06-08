package com.yedam.exceptions;

public class NullPointerExe {
	public static void main(String[] args) {

		String msg = "Hello";
		msg = null;

		try {
			// try block에서 실행 예외가 발생하면
			// catch block에 있는 코드를 실행.
			System.out.println(msg.length());

			int no = Integer.parseInt(msg);
			System.out.println(no);

//		} catch (NumberFormatException e) {
//			System.out.println("NumberFormat 예외. msg의 값을 확인하세요.");
//			
//		}catch (NullPointerException e) {
//			System.out.println("NullPoint 예외. msg의 값을 확인하세요.");
//		}
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생.");
		}
		System.out.println("end of prog.");
	}
}
