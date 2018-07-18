package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServicelmpl implements BoardService{

	@Inject
	private BoardDAO dao;

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#regist(org.zerock.domain.BoardVO)
	 */
	@Override
	public void regist(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.create(board);
	}

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#read(java.lang.Integer)
	 */
	@Override
	public BoardVO read(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return dao.read(bno);
	}

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#modify(org.zerock.domain.BoardVO)
	 */
	@Override
	public void modify(BoardVO board) throws Exception {
		// TODO Auto-generated method stub
		dao.update(board);
	}

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#remove(java.lang.Integer)
	 */
	@Override
	public void remove(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		dao.delete(bno);
	}

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#listAll()
	 */
	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

	/* (non-Javadoc)
	 * @see org.zerock.service.BoardService#listCriteria(org.zerock.domain.Criteria)
	 */
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listCriteria(cri);
	}
	
	@Override
	public int listCountCriteria(Criteria cri) throws Exception{
		return dao.countPaging(cri);
	}
	
	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception{
		return dao.listSearch(cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception{
		return dao.listSearchCount(cri);
	}
	
}
