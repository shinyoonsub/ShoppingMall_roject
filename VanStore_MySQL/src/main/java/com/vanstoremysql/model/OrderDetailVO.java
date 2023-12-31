package com.vanstoremysql.model;

public class OrderDetailVO {
	
	/* 주문 상세id */
	private int orderDetailId;
	
	/* 주문번호 */
	private int orderId;
	
	/* 제품 번호 */
	private int vinId;
	
	/* 제품이름 */
	private String vinName;
	
	/* 수량 */
	private int amount;

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getVinId() {
		return vinId;
	}

	public void setVinId(int vinId) {
		this.vinId = vinId;
	}

	public String getVinName() {
		return vinName;
	}

	public void setVinName(String vinName) {
		this.vinName = vinName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderDetailVO [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", vinId=" + vinId
				+ ", vinName=" + vinName + ", amount=" + amount + "]";
	}
	
}
