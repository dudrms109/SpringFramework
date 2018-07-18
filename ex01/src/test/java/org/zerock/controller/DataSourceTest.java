package org.zerock.controller;

import java.util.List;
import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.persistence.BoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DataSourceTest {
	
	
	@Inject
	private BoardDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(DataSourceTest.class);
	
	@Test
	public void testCreate() throws Exception{
		BoardVO board = new BoardVO();
		board.setTitle("새로운 글");
		board.setContent("새로운 글 넣습니다.");
		board.setWriter("user00");
		dao.create(board);
	}
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() throws Exception{
		try(Connection con = ds.getConnection()){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testListPage() throws Exception{
		int page = 3;
		List<BoardVO> list = dao.listPage(page);
		
		for(BoardVO boardVO : list) {
			logger.info(boardVO.getBno()+":"+boardVO.getTitle());
		}
	}
	
	@Test
	public void testListCriteria() throws Exception{
		Criteria cri = new Criteria();
		cri.setPage(2);
		cri.setPerPageNum(20);
		
		List<BoardVO> list = dao.listCriteria(cri);
		
		for(BoardVO boardVO : list) {
			logger.info(boardVO.getBno()+":"+boardVO.getTitle());
		}
	}
}
