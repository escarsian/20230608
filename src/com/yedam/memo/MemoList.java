package com.yedam.memo;

// 기능을 정의.
public interface MemoList {
	// 등록.
	void input(Memo memo);
	//수정.
	void update(Memo memo); // 번호, 날짜 -> 내용 변경.
	//삭제.
	void delete(int no); // 번호 기준 삭제.
	void delete(String date); // 날짜 기준 삭제.
	//조회.
	void search(int no); // 번호 기준 조회.
	void search(String date); // 날짜 기준으로 모두 조회.
	//전체 목록.
	void print();
	
}
