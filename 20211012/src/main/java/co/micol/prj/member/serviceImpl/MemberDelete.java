package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberDelete implements Command {
	
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("==============");
		System.out.println("삭제할 아이디를 입력하세요.");
		vo.setId(scb.nextLine());
		int n = memberService.memberDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제 되었습니다.");
		}else {
			System.out.println("게시글 삭제 실패입니다.");
		}

	}

}
