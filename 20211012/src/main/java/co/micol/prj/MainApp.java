package co.micol.prj;

import co.micol.prj.menu.Menu;

//import java.util.ArrayList;
//import java.util.List;
//
//import co.micol.prj.board.service.BoardService;
//import co.micol.prj.board.service.BoardVO;
//import co.micol.prj.board.serviceImpl.BoardServiceImpl;
//import co.micol.prj.member.service.MemberService;
//import co.micol.prj.member.service.MemberVO;
//import co.micol.prj.member.serviceImpl.MemberServiceImpl;

public class MainApp {
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.run();
		
		
		
//		List<MemberVO> list = new ArrayList<MemberVO>();
//		MemberService dao = new MemberServiceImpl();
//		list = dao.memberSelectList();
//		
//		for (MemberVO member : list) {
//			System.out.println(member.getId() + " : " +member.getName());				
//		}
//		System.out.println("==========================");
//		BoardService bs = new BoardServiceImpl();
//		List<BoardVO> boards = new ArrayList<BoardVO>();
//		boards = bs.boardSelectList();
//		
//		for (BoardVO board : boards) {
//			System.out.println(board.getBId() + " : "+ board.getBContents());
//		}
//		
//		System.out.println("hello~~~~");
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		BoardService dao = new BoardServiceImpl(); // 서비스 호출
//		BoardVO vo = new BoardVO();
//		// 새로운 공지사항을 추가해보자.
//
//		vo.setBWriter("김영오");
//		vo.setBTitle("3번쨰 내용");
//		vo.setBContents("마이바티스는 sqlMapperfh dbm과 통신한다.");
//		int n = dao.boardInsert(vo);
//		if (n != 0) {
//			System.out.println("입력성공");
//			list = dao.boardSelectList();
//			for (BoardVO board : list) {
//
//				System.out.println(board.getBId() + " : " + board.getBContents());
//			}
//
//		} else {
//			System.out.println("입력실패.");
//		}

//		vo.setBId(2); // 2번글 가져오기.
//		vo = dao.boardSelect(vo);
//		System.out.println(vo.getBId());
//		System.out.println(vo.getBContents());

		// List<BoardVO > list = new ArrayList<BoardVO>();
//		 list = dao.boardSelectList();
//		 
//		 for (BoardVO vo : list) {
//			System.out.println(vo.getBId()+ " : " + vo.getBTitle());
//		}
	}

}
