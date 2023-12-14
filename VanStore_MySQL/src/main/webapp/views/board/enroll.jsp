<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VanStore</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script src="https://cdn.ckeditor.com/ckeditor5/28.0.0/classic/ckeditor.js"></script>  
<link rel="stylesheet" href="/resources/css/board/enroll.css">
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
		                    <a href="/member/login">로그인</a>
		                </li>
		                <li>
		                    <a href="/member/join">회원가입</a>
		                </li>
	                </c:if>
	                <c:if test="${member != null }">
	                	<c:if test="${member.adminCk == 1 }">
	                        <li><a href="/admin/main">관리자 페이지</a></li>
	                    </c:if>                
	                    <li>
	                        <a href="/member/logout.do">로그아웃</a>
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
			
			<!-- 게시판 등록 영역 -->
			<div class="content_area">
				<div class="content_subject">
					<span>CUSTOMER CENTER</span>
				</div>
				<div class="content_wrap">
					<form action="/board/enroll" method="post" id="boardForm">
						<div class="form_section">
			    			<table>
								<thead>
									<tr>
										<th class="title_width">제목</th>
											<td><input name="title"></td>
									</tr>
									<tr>		
										<th class="writer_width">작성자</th>
											<td><input name="writer"></td>
									</tr>
								</thead>
							</table>
			    		</div>
						<div class="form_section">
			    			<div class="form_section_content">
			    				<textarea name="content" id="content_textarea"></textarea>
			    			</div>
						</div>
					</form>
					<div class="btn_section">
						<button id="enrollBtn" class="btn enroll_btn">등 록</button>
						<button id="cancelBtn" class="btn">취 소</button>
			 		</div>
				</div>
				
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
	
	let enrollForm = $("#enrollForm")
	
	/* 취소 버튼 */
	$("#cancelBtn").click(function(){
		
		location.href="/board/list"
	});
	
	/* 게시글 등록 */
	$(document).ready(function(){
	    
	    let result = '<c:out value="${result}"/>';
	    
	    checkAlert(result);
	    
	    function checkAlert(result){
	        
	        if(result === ''){
	            reutrn;
	        }
	        
	        if(result === "enroll success"){
	            alert("등록이 완료되었습니다.");
	        }
	        
	    }    
	    
	});
	
	/* 상품 등록 버튼 */
	$("#enrollBtn").on("click",function(e){
		
		e.preventDefault();
	
		boardForm.submit();
	
	});
	
	/* 위지윅 적용 */
	/* 상품 소개 */
	ClassicEditor
		.create(document.querySelector('#content_textarea'))
		.catch(error=>{
			console.error(error);
	});
	
	</script>
	
</body>
</html>