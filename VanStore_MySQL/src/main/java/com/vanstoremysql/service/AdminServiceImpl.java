package com.vanstoremysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vanstoremysql.mapper.AdminMapper;
import com.vanstoremysql.model.AttachImageVO;
import com.vanstoremysql.model.CateVO;
import com.vanstoremysql.model.ClothesVO;
import com.vanstoremysql.model.Criteria;
import com.vanstoremysql.model.MemberVO;
import com.vanstoremysql.model.OrderVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminMapper adminMapper;
	
	/* 상품 등록 */
	@Transactional
	@Override
	public void vinEnroll(ClothesVO clothes) {
		
		log.info("(service)vinEnroll........");
		
		adminMapper.vinEnroll(clothes);
		
		if(clothes.getImageList() == null || clothes.getImageList().size() <= 0) {
			return;
		}
		
		clothes.getImageList().forEach(attach -> {
			attach.setVinId(clothes.getVinId());
			adminMapper.imageEnroll(attach);
		});
		
	}
	
	/* 카테고리 리스트 */
	@Override
	public List<CateVO> cateList() {
		
		log.info("(service)cateList........");
		
		return adminMapper.cateList();
	}
	
	/* 상품 리스트 */
	@Override
	public List<ClothesVO> goodsGetList(Criteria cri) {
		log.info("goodsGetTotalList()..........");
		return adminMapper.goodsGetList(cri);
	}

	/* 상품 총 갯수 */
	public int goodsGetTotal(Criteria cri) {
		log.info("goodsGetTotal().........");
		return adminMapper.goodsGetTotal(cri);
	}
	
	/* 상품 조회 페이지 */
	@Override
	public ClothesVO goodsGetDetail(int vinId) {
			
		log.info("(service)vinGetDetail......." + vinId);
				
		return adminMapper.goodsGetDetail(vinId);
	}
	
	/* 상품 정보 수정 */
	@Transactional
	@Override
	public int goodsModify(ClothesVO vo) {
		int result = adminMapper.goodsModify(vo);
		
		if(result == 1 && vo.getImageList() != null && vo.getImageList().size() > 0) {
			adminMapper.deleteImageAll(vo.getVinId());
			
			vo.getImageList().forEach(attach -> {
				attach.setVinId(vo.getVinId());
				adminMapper.imageEnroll(attach);
			});
			
		}
		return result;
	}
	
	/* 상품 정보 삭제 */
	@Override
	@Transactional
	public int goodsDelete(int vinId) {

		log.info("goodsDelete..........");
		
		adminMapper.deleteImageAll(vinId);
		
		return adminMapper.goodsDelete(vinId);
	}
	
	/* 지정 상품 이미지 정보 얻기 */
	@Override
	public List<AttachImageVO> getAttachInfo(int vinId) {
		
		log.info("getAttachInfo........");
		
		return adminMapper.getAttachInfo(vinId);
	}
	
    /* 회원 목록 */
    @Override
    public List<MemberVO> memberGetList(Criteria cri) throws Exception {
        
        return adminMapper.memberGetList(cri);
    }
    
    /* 회원 총 수 */
	public int memberGetTotal(Criteria cri) {
		log.info("memberGetTotal().........");
		return adminMapper.memberGetTotal(cri);
	}
	
	/* 주문 목록 */
	@Override
	public List<OrderVO> orderList(Criteria cri) throws Exception {
		return adminMapper.orderList(cri);
	}
	
	/* 주문 목록 갯수 */
	@Override
	public int orderCount(Criteria cri) throws Exception {
		return adminMapper.orderCount();
	}
	
	/* 배송 출발 버튼 */
	@Override
	public void shipStart(String orderId) throws Exception {
		adminMapper.shipStart(orderId);
		
	}

	/* 배송 도착 버튼 */
	@Override
	public void shipArrive(String orderId) throws Exception {
		adminMapper.shipArrive(orderId);
	}
	
}
