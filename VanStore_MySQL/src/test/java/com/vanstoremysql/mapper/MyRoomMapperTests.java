package com.vanstoremysql.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vanstoremysql.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MyRoomMapperTests {

	@Autowired
	private MyRoomMapper mapper;
	
	/*
	@Test
	public void orderListTest() throws Exception{
		String memberId = "test1";
		List<OrderVO> list = mapper.orderList(memberId);
	}
	*/
	/*
	@Test
	public void orderListPagingTest() throws Exception{
		Criteria cri = new Criteria();
		cri.setMemberId("test1");
		
		List<OrderVO> list = mapper.orderListPaging(cri);
	}
	*/
	/* 주문목록 상세 */
	/*
	@Test
	public void selectDetailTest() throws Exception{
		int orderId = 3;
		List<OrderDetailVO> list = mapper.selectDetail(orderId);
	}
	*/
	
	/* 주문 갯수 */
	/*
	@Test
	public void orderCountTest() throws Exception{
		String memberId = "test1";
		mapper.orderCount(memberId);
	}
	*/
	/*
	@Test
	public void modifyPw() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setMemberId("test");
		vo.setMemberPw("test");
		
		mapper.modifyPw(vo);
	}
	*/
	
	/* 회원 탈퇴 */
	@Test
	public void deleteId() throws Exception{
		MemberVO vo = new MemberVO();
		vo.setMemberId("abcd");
		vo.setMemberMail("pec6049@naver.com");
		
		mapper.deleteId(vo);
	}
	
	
}
