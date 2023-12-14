<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VanStore</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<link rel="stylesheet" href="../resources/css/myRoom/shipInfo.css">
</head>
<body>
	
	<div class="wrapper">
        <div class="wrap">
            <!-- gnv_area -->	
            <div class="top_gnb_area">
            	<div class="logo_area">
					<a href="/main"><img src="../resources/img/VS_logo.png"></a>
				</div>
                <ul class="list">	
                    <li>
                    	<a href="/main">메인 페이지</a>
                    </li>
                    <li>
                    	<a href="/member/logout.do">로그아웃</a>
                    </li>
                    <li>
                        <a href="/myRoom/main">마이룸</a>
                    </li>
                    <li>
                        <a href="/order/cart">장바구니</a>
                    </li>
                    <li>
                    	<a href="/board/list">고객센터</a>
                    </li>
                </ul>
            </div>
            <div class="navi_bar_area">
				<ul class="list">
					<li>
						<a href="/menu/all">ALL</a>
	                </li>
					<li>
						<a href="/menu/outer">OUTER</a>
	                </li>
	                <li>
	                	<a href="/menu/top">TOP</a>
	                </li>
	                <li>
	                	<a href="/menu/bottom">BOTTOM</a>
	                </li>
	                <li>
	                	<a href="/menu/onepiece">ONEPIECE</a>
	                </li>
	                <li>
	                	<a href="/menu/shoesbags">SHOES&BAGS</a>
	                </li>
	                <li>
	                	<a href="/menu/acc">ACC</a>
	                </li>
				</ul>
			</div>
			
			<!-- 마이룸 영역 -->
            <div class="member_top_wrap">
                <span>마이룸 페이지</span>
            </div>
            
			<!-- contents-area -->
	        <div class="member_wrap">
	        	<!-- 네비영역 -->
	            <div class="member_navi_wrap">
		           <ul>
		               <li >
		                   <a class="member_list_01" href="/myRoom/modify">비밀번호 수정</a>
		               </li>
		               <li>
				           <a class="member_list_02" href="/myRoom/shipInfo">주문/배송 조회</a>
			           </li>
			           <li>
		                   <a class="member_list_03" href="/myRoom/exit">회원탈퇴</a>
		               </li>                                                                                           
		           </ul>
	            </div>
			</div>	
			<div class="ship_content_wrap">
				<div class="ship_content_subject">
					<span>주문/배송 정보</span>
				</div>
				<div class="ship_content_main">
					<!-- 주문 리스트 O -->
					<c:if test="${listcheck != 'empty'}">
						<table>
							<thead>
								<tr>
									<td id="th_td_year">일자</td>
									<td id="th_td_info">상품정보</td>
									<td id="th_td_state">상태</td>
									<td id="th_td_btn">비고</td>
								</tr>
							</thead>
							<tbody>
								<c:set var="i" value="0" />
								<c:forEach items="${list}" var="list">
								<tr>
									<td id="tb_td_year" class="tb_td_year">${list.orderDate}</td>
									<td  class="tb_td_info">
										상품명 :<span id="vinName${i}"></span>
										(<span id="cnt${i}"></span> 종 /<span id="amount${i}"></span>개)
										<br>
										금액 : <fmt:formatNumber value="${list.totalPrice}" pattern="#,###"/>원
									</td>
									<td class="tb_td_state">${list.state}</td>
									<td class="tb_td_btn">
										<c:if test="${list.state != '배송완료'}">
											-
										</c:if>
									
										<c:if test="${list.state == '배송완료' }">
											<button id="shipClear${i}">구매확정</button>
										</c:if>
										<input type="hidden" id="orderId${i}" value="${list.orderId}">
										
										<script>
										//구매확정 버튼
										$('#shipClear${i }').on("click", function(){
											
											var orderId = $('#orderId${i}').val();
											var data = {orderId : orderId}
											$.ajax({
												url : "shipClear",
												type : "post",
												data : data,
												dataType:'json',
												success : function(data){
													location.reload();
												}
											});
										});
										</script>
										
									</td>
								</tr>
									<input type="hidden" id="orderId${i}" value="${list.orderId}">
									
									<script>
									//상품 이름, 종류, 갯수
									(function(){
										//alert("연결");
										var orderId = $('#orderId${i}').val();
										//orderId = String(orderId);
										var data = {orderId : orderId}
										$.ajax({
											url : "repOrder",
											type : "post",
											data : data,
											dataType:'json',
											success : function(data){
												console.log(data.vinName);
												$('#vinName${i}').html(data.vinName);
												$('#cnt${i}').html(data.cnt);
												$('#amount${i}').html(data.amount);
											}
										});
									})();
									</script>
								
								<c:set var="i" value="${i+1}" />	
								</c:forEach>
							</tbody>
						</table>
					</c:if>
					<!-- 주문 리스트 X -->
					<c:if test="${listCheck == 'empty'}">
						<div class="table_empty">
							<h2>주문하신 상품이 없습니다.</h2>
						</div>
					</c:if>
				</div>
				
				<!-- 페이지 이름 인터페이스 영역 -->
				<div class="pageMaker_wrap">
					<ul class="pageMaker">
						<!-- 이전 버튼 -->
						<c:if test="${pageMaker.prev }">
							<li class="pageMaker_btn prev">
								<a href="${pageMaker.pageStart -1}">이전</a>
							</li>
						</c:if>
						<!-- 페이지 번호 -->
						<c:forEach begin="${pageMaker.pageStart }" end="${pageMaker.pageEnd }" var="num">
							<li class="pageMaker_btn ${pageMaker.cri.pageNum == num ? 'active':''}">
								<a href="${num}">${num}</a>
							</li>	
						</c:forEach>
						<!-- 다음 버튼 -->
						<c:if test="${pageMaker.next}">
							<li class="pageMaker_btn next">
								<a href="${pageMaker.pageEnd + 1 }">다음</a>
							</li>
						</c:if>
					</ul>
				</div>
				<form id="moveForm" action="/myRoom/shipInfo" method="get" >
					<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
					<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
				</form>
			</div>
			<div class="clearfix"></div>
			<!-- Footer 영역 -->
			<div class="footer_nav">
				<div class="footer_nav_container">
					<ul>
						<li>
							<a href="../shopinfo/aboutus">ABOUT US</a>
						</li>
						<span class="line">|</span>
						<li>
							<a href="../shopinfo/agreement">AGREEMENT</a>
						</li>
						<span class="line">|</span>
						<li>
							<a href="../shopinfo/policy">PRIVACY POLICY</a>
						</li>
					</ul>
				</div>
			</div> <!-- class="footer_nav" -->
			
			<div class="footer">
				<div class="footer_container">
					<div class="footer_customer">
						CUSTOMER CENTER
						<br>
						<br>
						<strong>010-1234-1234</strong>
						<br>
						MON-FRI 10:00~17:30		LUNCH 12:00~13:00
						<br>
						SAT / SUN / HOLIDAY CLOSE
					</div>
					<div class="footer_bank">
						BANK INFO
						<br>
						<br>
						신한 : 110-123-456789
						<br>
						농협 : 312-1234-1234-12
						<br>
						<strong>예금주 : 신윤섭</strong>
					</div>
					<div class="footer_addr">
						RETURN & EXCHANGE
						<br>
						<br>
						충청북도 청주시 상당구
						<br>
						CJ대한통운(1588-1255)
					</div>
				</div>
			</div> <!-- class="footer" -->
				
			<div class="footer_bottom">
				<div class="footer_copy">
					COMPANY : VanStore / OWNER : 신윤섭 / ADDRESS : 충청북도 청주시 상당구
					<br>
					CALL : 010-1234-1234 / BUSINESS LICENSE : 123-45-67890 

				</div>
				<div class="clearfix"></div>
			</div>
			
		</div>	<!-- class="wrap" -->
	</div>	<!-- class="wrapper" -->

	<script>
	
	let moveForm = $('#moveForm');
	
	/* 페이지 이동 버튼 */
	$(".pageMaker_btn a").on("click", function(e){
		
		e.preventDefault();
		
		moveForm.find("input[name='pageNum']").val($(this).attr("href"));
		
		moveForm.submit();
	});
	
	</script>
	
</body>
</html>