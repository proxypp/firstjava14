package co.micol.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.micol.prj.board.service.BoardService;
import co.micol.prj.board.service.BoardVO;
import co.micol.prj.comm.Command;

public class BoardSelect implements Command {
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("==================");
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt());
		board = boardService.boardSelect(board);
		boardService.boardHitUpdate(board.getBId());
		
		System.out.print(board.getBId() + " : ");
		System.out.print(board.getBWriter() + " : ");
		System.out.print(board.getBWriteDate() + " : ");
		System.out.print(board.getBTitle() + " : ");
		System.out.print(board.getBContents() + " : ");
		
	}

}
