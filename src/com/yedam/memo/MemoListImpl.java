package com.yedam.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl implements MemoList {

	List<Memo> list = new ArrayList<Memo>();
	Scanner scn = new Scanner(System.in);

	@Override
	public void input(Memo memo) {
		// 동일 여부를 체크.
		for (int i = 0; i < list.size(); i++) {
//			if(list.get(i).equals(memo)) {// Object.equals();
			Memo memo1 = list.get(i);
			if (memo1.getNo() == memo.getNo() && memo1.getDate().equals(memo.getDate())
					&& memo1.getContent().equals(memo.getContent()))
				System.out.println("same");
			return;
		}
		
		//순번 지정.
		for(int i =0; i<list.size();i++) {
			if(Integer.parseInt(list.get(i).getDate())> Integer.parseInt(memo.getDate())){
			 list.add(i, memo);
			 return;
			}
		}
		list.add(memo); //add는 제일 마지막 위치에 추가.
		//날짜 순으로 저장. + 번호.
		System.out.println("추가 완료.");
	}

	@Override
	public void update(Memo memo) {
		for (int i = 0; i < list.size(); i++) {
			if (memo.getNo() == list.get(i).getNo() && memo.getDate().equals(list.get(i).getDate())) {
				list.get(i).setContent(memo.getContent());
				System.out.println("수정 완료.");
				return;
			}

		}
	}

	@Override
	public void delete(int no) {
		// 같은 번호가 있으면 다 삭제.
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				list.remove(i--); //
				// list.remove(i); -> 라고 적으면 삭제된 이후에 index 값이 줄어들어서 앞 번호를 검토하지 못함.
			}
		}
	}

	@Override
	public void delete(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				list.remove(i--);
			}
		}
	}

	@Override
	public void search(int no) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getNo() == no) {
				System.out.printf("번호 %d 날짜 %s 내용 %s", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());
			}
		}
	}

	@Override
	public void search(String date) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDate().equals(date)) {
				System.out.printf("번호 %d 날짜 %s 내용 %s", list.get(i).getNo(), list.get(i).getDate(),
						list.get(i).getContent());
			}
		}
	}

	@Override
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
