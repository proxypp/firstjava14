package co.micol.prj.member.serviceImpl;

import co.micol.prj.comm.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.service.MemberVO;

public class MemberLogin implements Command {

	@Override
	public void execute() {
		MemberService memberService = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId("proxypp");
		vo.setPassword("1234");
		System.out.println(vo.getId() + " : " +vo.getPassword());
		// id 패쓰워드는 mybatis를 통해 dbms로 넘어간순간 초기화 되서 없어진다.
		// 리셋된다고 보면된다.
		vo = memberService.loginCheck(vo);
		System.out.println(vo.getName()+" : "+ vo.getAuthor());
		System.out.println(vo.getId() + " : " +vo.getPassword());
	}

}
