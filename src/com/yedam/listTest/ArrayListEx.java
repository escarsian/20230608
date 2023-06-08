package com.yedam.listTest;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		//저장 유형이 Object.
		list.add("Apple");
//		list.add(new Integer(10));
		
		for(int i=0; i<list.size(); i++) {
//			 결과는 Object.
//			Object result = list.get(i);
//			if(result instanceof String) {
//				System.out.println((String) result);
//			}else if(result instanceof Integer) {
//				System.out.println((Integer) result);
//			}
		String result  = list.get(i);
		System.out.println(result);
		}
		
		ArrayList<Integer> nList = new ArrayList<Integer>();
		nList.add(10);
		nList.add(20);
		//삭제. remove
		nList.remove(1);
		nList.set(0, 100);
		nList.add(200);
		
		for(Integer num :nList) {
			System.out.println(num);
		}
	}
}
