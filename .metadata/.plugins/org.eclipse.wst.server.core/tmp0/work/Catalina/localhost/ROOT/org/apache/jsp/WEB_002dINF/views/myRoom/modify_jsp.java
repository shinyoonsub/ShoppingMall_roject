/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-08-22 12:36:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.myRoom;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modify_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1621336894086L));
    _jspx_dependants.put("jar:file:/C:/Users/PC/Desktop/vinshop-project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/VinShop_MySQL/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Users/PC/Desktop/vinshop-project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/VinShop_MySQL/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>VinShop</title>\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/css/myRoom/modify.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("        <div class=\"wrap\">\r\n");
      out.write("            <!-- gnv_area -->	\r\n");
      out.write("            <div class=\"top_gnb_area\">\r\n");
      out.write("            	<div class=\"logo_area\">\r\n");
      out.write("					<a href=\"/main\"><img src=\"../resources/img/VS_logo.png\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("                <ul class=\"list\">	\r\n");
      out.write("                    <li>\r\n");
      out.write("                    	<a href=\"/main\">메인 페이지</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                    	<a href=\"/member/logout.do\">로그아웃</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/myRoom/main\">마이룸</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"/order/cart\">장바구니</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                    	<a href=\"/board/list\">고객센터</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navi_bar_area\">\r\n");
      out.write("				<ul class=\"list\">\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"/menu/all\">ALL</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("					<li>\r\n");
      out.write("						<a href=\"/menu/outer\">OUTER</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li>\r\n");
      out.write("	                	<a href=\"/menu/top\">TOP</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li>\r\n");
      out.write("	                	<a href=\"/menu/bottom\">BOTTOM</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li>\r\n");
      out.write("	                	<a href=\"/menu/onepiece\">ONEPIECE</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li>\r\n");
      out.write("	                	<a href=\"/menu/shoesbags\">SHOES&BAGS</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("	                <li>\r\n");
      out.write("	                	<a href=\"/menu/acc\">ACC</a>\r\n");
      out.write("	                </li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- 마이룸 영역 -->\r\n");
      out.write("            <div class=\"member_top_wrap\">\r\n");
      out.write("                <span>마이룸 페이지</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("			<!-- contents-area -->\r\n");
      out.write("	        <div class=\"member_wrap\">\r\n");
      out.write("	        	<!-- 네비영역 -->\r\n");
      out.write("	            <div class=\"member_navi_wrap\">\r\n");
      out.write("		           <ul>\r\n");
      out.write("		               <li>\r\n");
      out.write("		                   <a class=\"member_list_01\" href=\"/myRoom/modify\">비밀번호 수정</a>\r\n");
      out.write("		               </li>\r\n");
      out.write("		               <li>\r\n");
      out.write("				           <a class=\"member_list_02\" href=\"/myRoom/shipInfo\">주문/배송 조회</a>\r\n");
      out.write("			           </li>\r\n");
      out.write("			           <li>\r\n");
      out.write("		                   <a class=\"member_list_03\" href=\"/myRoom/exit\">회원탈퇴</a>\r\n");
      out.write("		               </li>                                                                                        \r\n");
      out.write("		           </ul>\r\n");
      out.write("	            </div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"member_content_wrap\">\r\n");
      out.write("					<div class=\"member_content_subject\">\r\n");
      out.write("						<span>비밀번호 수정</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"member_content_main\">\r\n");
      out.write("						<form method=\"post\" id=\"modify_form\">\r\n");
      out.write("							<span>새 비밀번호</span>\r\n");
      out.write("							<div id=\"top_2_pw\"><input type=\"password\" name=\"password\" id=\"memberPw\"></div>\r\n");
      out.write("							<span id=\"top_2_pw_re\"></span>\r\n");
      out.write("							<span id=\"final_pw_ck\">비멀번호를 입력해주세요.</span>\r\n");
      out.write("							<span>새 비밀번호 확인</span>\r\n");
      out.write("							<div id=\"top_2_pwc\"><input type=\"password\" id=\"memberPw2\"></div>\r\n");
      out.write("							<span id=\"top_2_pwc_re\">비밀번호가 일치합니다.</span>\r\n");
      out.write("							<span id=\"top_2_pwc_re2\">비밀번호가 일치하지 않습니다.</span>\r\n");
      out.write("							<span id=\"final_pwck_ck\">비멀번호 제확인을 입력해주세요.</span>					\r\n");
      out.write("							<button id=\"modify_btn\">비밀번호 수정</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>	\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- Footer 영역 -->\r\n");
      out.write("			<div class=\"footer_nav\">\r\n");
      out.write("				<div class=\"footer_nav_container\">\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"../shopinfo/aboutus\">ABOUT US</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<span class=\"line\">|</span>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"../shopinfo/agreement\">AGREEMENT</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<span class=\"line\">|</span>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"../shopinfo/policy\">PRIVACY POLICY</a>\r\n");
      out.write("						</li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div> <!-- class=\"footer_nav\" -->\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"footer\">\r\n");
      out.write("				<div class=\"footer_container\">\r\n");
      out.write("					<div class=\"footer_customer\">\r\n");
      out.write("						CUSTOMER CENTER\r\n");
      out.write("						<br>\r\n");
      out.write("						<br>\r\n");
      out.write("						<strong>010-1234-1234</strong>\r\n");
      out.write("						<br>\r\n");
      out.write("						MON-FRI 10:00~17:30		LUNCH 12:00~13:00\r\n");
      out.write("						<br>\r\n");
      out.write("						SAT / SUN / HOLIDAY CLOSE\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer_bank\">\r\n");
      out.write("						BANK INFO\r\n");
      out.write("						<br>\r\n");
      out.write("						<br>\r\n");
      out.write("						신한 : 110-123-456789\r\n");
      out.write("						<br>\r\n");
      out.write("						농협 : 312-1234-1234-12\r\n");
      out.write("						<br>\r\n");
      out.write("						<strong>예금주 : 박은채</strong>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"footer_addr\">\r\n");
      out.write("						RETURN & EXCHANGE\r\n");
      out.write("						<br>\r\n");
      out.write("						<br>\r\n");
      out.write("						서울특별시 강남구 압구정로 5-25\r\n");
      out.write("						<br>\r\n");
      out.write("						CJ대한통운(1588-1255)\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div> <!-- class=\"footer\" -->\r\n");
      out.write("				\r\n");
      out.write("			<div class=\"footer_bottom\">\r\n");
      out.write("				<div class=\"footer_copy\">\r\n");
      out.write("					COMPANY : VINSHOP / OWNER : 박은채 / ADDRESS : 06000 서울특별시 강남구 압구정로 5-25\r\n");
      out.write("					<br>\r\n");
      out.write("					CALL : 010-1234-1234 / E-MAIL : pec6049@naver.com / BUSINESS LICENSE : 123-45-67890 / MALL ORDER LICENSE : 제2021-서울특별시-0000\r\n");
      out.write("					<br>\r\n");
      out.write("					COPYRIGHT © VINSHOP ALL RIGHTS RESERVED.\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"></div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("		</div>	<!-- class=\"wrap\" -->\r\n");
      out.write("	</div>	<!-- class=\"wrapper\" -->\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		$('#modify_btn').on(\"click\",function(e){\r\n");
      out.write("			e.preventDefault();\r\n");
      out.write("			\r\n");
      out.write("			var memberPw1 = $('#memberPw').val();\r\n");
      out.write("			var memberPw2 = $('#memberPw2').val();\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호 입력 확인\r\n");
      out.write("			var check = false;\r\n");
      out.write("			\r\n");
      out.write("			// 비밀번호 재입력 입력 확인\r\n");
      out.write("			var check2 = false;\r\n");
      out.write("	\r\n");
      out.write("			$('#modify_btn').css(\"disabled\", \"false\");\r\n");
      out.write("			\r\n");
      out.write("			if(memberPw1 == \"\"){\r\n");
      out.write("				$('#final_pw_ck').css(\"display\",\"block\");\r\n");
      out.write("			} else {\r\n");
      out.write("				$('#final_pw_ck').css(\"display\",\"none\");\r\n");
      out.write("				check = true;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(memberPw2 != \"\"){\r\n");
      out.write("				check2 = true;\r\n");
      out.write("				$('#final_pwck_ck').css(\"display\",\"none\");\r\n");
      out.write("			} else{\r\n");
      out.write("				$('#final_pwck_ck').css(\"display\",\"block\");\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			if(check && check2){\r\n");
      out.write("				alert(\"비밀번호 변경에 성공하였습니다. 다시 로그인 해주십시오\");\r\n");
      out.write("				\r\n");
      out.write("				$('#modify_btn').css(\"disabled\", \"true\");\r\n");
      out.write("				$('#modify_form').submit();\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 비밀번호 중복검사\r\n");
      out.write("		$('#memberPw2').on(\"propertychange change keyup paste input\",function(){\r\n");
      out.write("			var memberPw1 = $('#memberPw').val();\r\n");
      out.write("			var memberPw2 = $('#memberPw2').val();\r\n");
      out.write("			\r\n");
      out.write("			if(memberPw1 == memberPw2 && memberPw != \"\"&& memberPw2 != \"\"){\r\n");
      out.write("				$('#top_2_pwc_re2').css(\"display\",\"none\");\r\n");
      out.write("				$('#top_2_pwc_re').css(\"display\",\"block\");\r\n");
      out.write("				\r\n");
      out.write("			}else{\r\n");
      out.write("				$('#top_2_pwc_re2').css(\"display\",\"block\");\r\n");
      out.write("				$('#top_2_pwc_re').css(\"display\",\"none\");\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
