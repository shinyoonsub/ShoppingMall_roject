package com.vanstoremysql.service;

import java.util.List;

import com.vanstoremysql.model.AttachImageVO;
import com.vanstoremysql.model.CateVO;
import com.vanstoremysql.model.ClothesVO;
import com.vanstoremysql.model.Criteria;
import com.vanstoremysql.model.MemberVO;
import com.vanstoremysql.model.OrderVO;

public interface AdminService {

	/* 상품 등록 */
	public void vinEnroll(ClothesVO clothes);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
	
	/* 상품 리스트 */
	public List<ClothesVO> goodsGetList(Criteria cri);
	
	/* 상품 총 개수 */
	public int goodsGetTotal(Criteria cri);
	
	/* 상품 조회 페이지 */
	public ClothesVO goodsGetDetail(int vinId);
	
	/* 상품 수정 */
	public int goodsModify(ClothesVO vo);
	
	/* 상품 정보 삭제 */
	public int goodsDelete(int vinId);
	
	/* 지정 상품 이미지 정보 얻기 */
	public List<AttachImageVO> getAttachInfo(int vinId);
	
	/* 회원 리스트 */
    public List<MemberVO> memberGetList(Criteria cri) throws Exception;
    
    /* 회원 총 수 */
	public int memberGetTotal(Criteria cri);
	
	/* 주문 목록 리스트 */
	public List<OrderVO> orderList(Criteria cri) throws Exception;
	
	/* 주문 목록 갯수 */
	public int orderCount(Criteria cri) throws Exception;
	
	/* 배송 출발 버튼 */
	public void shipStart(String orderId) throws Exception;

	/* 배송 도착 버튼 */
	public void shipArrive(String orderId) throws Exception;
	
}
