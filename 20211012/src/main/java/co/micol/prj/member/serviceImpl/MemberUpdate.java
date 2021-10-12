package co.micol.prj.member.serviceImpl;

import java.util.Scanner;

import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberUpdate implements Command {
	
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		MemberVO vo = new MemberVO();
		System.out.println("==================");
		System.out.println("입력할 아이디를 등록하세요.");
		vo.setId(scb.nextLine());scb.nextLine();
		System.out.println("이름을 등록하세요.");
		vo.setName(scb.nextLine());
		System.out.println("패스워드를 등록하세요");
		vo.setPassword(scb.nextLine());
		System.out.println("전화 번호를 입력하세요.");
		vo.setTel(scb.nextLine());
		System.out.println("주소를 입력하세요.");
		vo.setAddress(scb.nextLine());
		System.out.println("직업을 입력하세요.");
		vo.setAuthor(scb.nextLine());
		int n = memberService.memberUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 변경이 되었습니다.");
		}else {
			System.out.println("글 수정이 실패 되었습니다.");
		}
		
	}

}
