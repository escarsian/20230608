package com.yedam.listTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListExe {
	public static void main(String[] args) {
		// 인터페이스.(List) - 구현 클래스.(ArrayList, LinkedList)
		List<String> list = null;
		list = new ArrayList<String>();
		list = new LinkedList<String>();
		
		list.add("Apple");  // list.get(0) -> 1번
		list.add("Banana"); // list.get(1) -> 2번
		
		//Date 자바.
		Date today = new Date(); //Thu Jun 08 11:46:14 KST 2023 default
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today)); // format :  Date 객체 -> 문자열.
		String format = sdf.format(today);
		
		String sdate = "2023-07-22 13:13:13";
		try {
			Date date = sdf.parse(sdate); // parse :  문자열 -> Date 객체로 바꿔줌.
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
}
