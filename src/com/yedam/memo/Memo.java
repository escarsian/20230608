package com.yedam.memo;

//메모를 저장.
public class Memo {
	private int no; // 순번.
	private String date; // 작성시간.
	private String content; // 내용.
	
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
//	public Memo(String date, String content) {
//		this.date = date;
//		this.content = content;
//	}
	
	public Memo(int no, String content) {
		this.no = no;
		this.date = null; // Date() -> 문자열. 오늘 날짜.
		this.content = content;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public boolean equals(Object obj) {
		Memo memo = (Memo) obj;
		if(this.no ==memo.no && this.date.equals(memo.date) && this.content.equals(memo.content)) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Memo [no=" + no + ", date=" + date + ", content=" + content + "]";
	}
	
	
}
