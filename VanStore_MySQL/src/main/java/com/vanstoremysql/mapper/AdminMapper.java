package com.vanstoremysql.mapper;

import java.util.List;

import com.vanstoremysql.model.AttachImageVO;
import com.vanstoremysql.model.CateVO;
import com.vanstoremysql.model.ClothesVO;
import com.vanstoremysql.model.Criteria;
import com.vanstoremysql.model.MemberVO;
import com.vanstoremysql.model.OrderVO;

public interface AdminMapper {

	/* 상품 등록 */
	public void vinEnroll(ClothesVO clothes);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
	
	/* 상품 리스트 */
	public List<ClothesVO> goodsGetList(Criteria cri);	//goodsGetList() : 각각 상품 목록 페이지에 출력될 페이징화 된 상품 데이터
	
	/* 상품 총 개수 */
	public int goodsGetTotal(Criteria cri); //goodsGetTotal() : 페이지 이동 인터페이스 객체를 인스턴스화 하는데 필요로 한 '상품 목록 총 개수' 데이터
	
	/* 상품 조회 페이지 */
	public ClothesVO goodsGetDetail(int vinId);
	
	/* 상품 수정 */
	public int goodsModify(ClothesVO vo);
	
	/* 상품 정보 삭제 */
	public int goodsDelete(int vinId);
	
	/* 이미지 등록 */
	public void imageEnroll(AttachImageVO vo);
	
	/* 지정 상품 이미지 전체 삭제 */
	public void deleteImageAll(int vinId);
	
	/* 어제자 날짜 이미지 리스트 */
	public List<AttachImageVO> checkFileList();
	
	/* 지정 상품 이미지 정보 얻기 */
	public List<AttachImageVO> getAttachInfo(int vinId);

    /* 회원 목록 */
    public List<MemberVO> memberGetList(Criteria cri);
    
    /* 회원 총 수 */
	public int memberGetTotal(Criteria cri);
	
	/* 관리자페이지 주문 목록 리스트 */
	public List<OrderVO> orderList(Criteria cri) throws Exception;
	
	/* 관리자페이지 주문 개숫 */
	public int orderCount() throws Exception;
	
	/* 배송출발 버튼 */
	public void shipStart(String orderId) throws Exception;

	/* 배송도착 버튼 */
	public void shipArrive(String orderId) throws Exception;
    
}
