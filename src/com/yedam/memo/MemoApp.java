package com.yedam.memo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
//		List<Memo> list = new ArrayList<>();
//		list.add(new Memo(1, "20230503", "내용1"));
		Scanner scn = new Scanner(System.in);
		MemoList app = new MemoListImpl(); // ArrayList.
											// 파일저장.
											// DB.
		boolean run = true;
		int selectnum = 1;
		while (run) {
			// 1.추가 2.수정(번호&날짜) 3.삭제(번호, 날짜) 4.조회(번호, 날짜) 5.목록 6.종료
			System.out.println("1.추가 2.수정 3.삭제 4.조회 5.목록 6.종료");
			System.out.println("숫자를 입력하세요.");
			
			try {
				selectnum = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}

			if (selectnum == 1) {
				System.out.print("숫자를 입력> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.print("날짜를 입력(ex:20230505> ");
				String date = scn.nextLine();
				System.out.print("내용을 입력> ");
				String content = scn.nextLine();

				if (date.equals("")) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
					date = sdf.format(new Date()); // Date -> 문자열
				}
				app.input(new Memo(no, date, content));

			} else if (selectnum == 2) {
				System.out.println("번호 입력> ");
				int no = Integer.parseInt(scn.nextLine());
				System.out.println("날짜 입력> ");
				String date = scn.nextLine();
				System.out.println("수정할 내용 입력>");
				String content = scn.nextLine();

				app.update(new Memo(no, date, content));

			} else if (selectnum == 3) {
				System.out.println("1.삭제 번호 선택, 2.삭제 날짜 선택");
				int selectno = Integer.parseInt(scn.nextLine());
				int check = 0;
				String chk = "";
				if (selectno == 1) {
					System.out.println("삭제할 번호 입력>");
					app.delete(check);
				} else if (selectno == 2) {
					System.out.println("삭제할 날짜 입력>");
					app.delete(chk);
				}
			} else if (selectnum == 4) {
				System.out.println("1.조회 번호 선택, 2.조회 날짜 선택");
				int selectno = Integer.parseInt(scn.nextLine());
				int check = 0;
				String chk = "";
				if (selectno == 1) {
					System.out.println("조회할 번호 입력>");
					app.search(check);
				} else if (selectno == 2) {
					System.out.println("조회할 날짜 입력>");
					app.search(chk);
				}
			} else if (selectnum == 5) {
				app.print();
			} else if (selectnum == 6) {
				run = false;
				System.out.println("종료.");
			}

		}

		System.out.println("end of prog");
	}
}
