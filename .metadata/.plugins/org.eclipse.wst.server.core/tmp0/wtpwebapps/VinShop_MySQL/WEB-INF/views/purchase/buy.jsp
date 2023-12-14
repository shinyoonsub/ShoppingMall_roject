<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VinShop</title>
<link rel="stylesheet" href="../resources/css/purchase/buy.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>  
</head>
<body>

	<div class="wrapper">
		<div class="wrap">
			<div class="top_gnb_area">
				<div class="logo_area">
					<a href="/main"><img src="../resources/img/VS_logo.png"></a>
				</div>
				<ul class="list">
					<c:if test = "${member == null}">
		                <li >
		                    <a href="../member/login">로그인</a>
		                </li>
		                <li>
		                    <a href="../member/join">회원가입</a>
		                </li>
	                </c:if>
	                <c:if test="${member != null }">
	                	<c:if test="${member.adminCk == 1 }">
	                        <li><a href="../admin/main">관리자 페이지</a></li>
	                    </c:if>                
	                    <li>
	                        <a id="gnb_logout_button">로그아웃</a>
	                    </li>
	                    <li>
	                        <a href="/myRoom/main">마이룸</a>
	                    </li>
	                    <li>
	                        <a href="/order/cart">장바구니</a>
	                    </li>
	                </c:if> 
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
			
			<!-- 주문정보 출력 영역 -->
			<div class="content_area">
				<div class="content_subject">
					<span>ORDER SUCCESS</span>
				</div>
				<div class="content_container">
					<div class="success_img">
						<img src="../resources/img/success_img.png">
					</div>
					<span>고객님의 주문이 <strong>완료</strong> 되었습니다.</span>
					<br>
					<br>
					<p>주문내역 및 배송에 관한 안내는</p>
					<p><strong>[마이룸->주문/배송 조회]</strong>를 통하여 확인 가능합니다.</p>
				</div> <!-- content_container -->
			</div>
			
			<!-- Footer 영역 -->
			<div class="footer_nav">
				<div class="footer_nav_container">
					<ul>
						<li>
							<a href="/shopinfo/aboutus">ABOUT US</a>
						</li>
						<span class="line">|</span>
						<li>
							<a href="/shopinfo/agreement">AGREEMENT</a>
						</li>
						<span class="line">|</span>
						<li>
							<a href="/shopinfo/policy">PRIVACY POLICY</a>
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
						<strong>예금주 : 박은채</strong>
					</div>
					<div class="footer_addr">
						RETURN & EXCHANGE
						<br>
						<br>
						서울특별시 강남구 압구정로 5-25
						<br>
						CJ대한통운(1588-1255)
					</div>
				</div>
			</div> <!-- class="footer" -->
			<div class="footer_bottom">
				<div class="footer_copy">
					COMPANY : VINSHOP / OWNER : 박은채 / ADDRESS : 06000 서울특별시 강남구 압구정로 5-25
					<br>
					CALL : 010-1234-1234 / E-MAIL : pec6049@naver.com / BUSINESS LICENSE : 123-45-67890 / MALL ORDER LICENSE : 제2021-서울특별시-0000
					<br>
					COPYRIGHT © VINSHOP ALL RIGHTS RESERVED.
				</div>
				<div class="clearfix"></div>
			</div>
			
		</div>	<!-- class="wrap" -->
	</div>	<!-- class="wrapper" -->
    
    <script>
    
    </script>
    
</body>
</html>