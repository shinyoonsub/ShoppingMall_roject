<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VanStore</title>
<link rel="stylesheet" href="../resources/css/myRoom/main.css">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
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
			            <li>
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
				<div class="member_content_wrap">
			    	<div>마이룸 페이지 입니다.</div>
			    </div>
            	<div class="clearfix"></div>
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
	
	/* 회원정보 조회 페이지 */
	/*
	$(".member_list_01").on("click", function(e){
		
		e.preventDefault();
		
		moveForm.append("<input type='hidden' name='memberId' value='"+$(this).attr("href") + "'>");
		moveForm.attr("action", "/member/memberInfo");
		moveForm.submit();
		
	});
	*/
	</script>
	
</body>
</html>