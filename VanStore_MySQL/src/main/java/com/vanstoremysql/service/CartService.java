package com.vanstoremysql.service;

import java.util.List;

import com.vanstoremysql.model.CartListVO;
import com.vanstoremysql.model.CartVO;

public interface CartService {
	
	/* 장바구니 등록 */
	public void cartEnroll(CartVO cart) throws Exception;
	
	/* 장바구니 리스트 */
	public List<CartListVO> cartList(String memberId) throws Exception;
	
	/* 장바구니 삭제 */
	public void cartDelete(CartVO cart) throws Exception;
	
	/* 장바구니 수량 변경 */
	public void stockChange(CartVO cart) throws Exception;
	
	/* 장바구니 선택 리스트 */
	public CartListVO buyList(int cartId) throws Exception;
}
