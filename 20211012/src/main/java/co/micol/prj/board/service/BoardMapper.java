package co.micol.prj.board.service;
import java.util.List;
public interface BoardMapper { //Mybatis에서 사용할 인터페이스.
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	int boardHitUpdate(int id); //조회시 카운트 증가
}
