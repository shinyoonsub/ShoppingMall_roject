/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-08-22 12:38:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.purchase;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class buy_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<link rel=\"stylesheet\" href=\"../resources/css/purchase/buy.css\">\r\n");
      out.write("<script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.4.1.js\"\r\n");
      out.write("  integrity=\"sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>  \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		<div class=\"wrap\">\r\n");
      out.write("			<div class=\"top_gnb_area\">\r\n");
      out.write("				<div class=\"logo_area\">\r\n");
      out.write("					<a href=\"/main\"><img src=\"../resources/img/VS_logo.png\"></a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<ul class=\"list\">\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	                ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write(" \r\n");
      out.write("	                <li>\r\n");
      out.write("	                    <a href=\"/board/list\">고객센터</a>\r\n");
      out.write("	                </li>            \r\n");
      out.write("	            </ul>\r\n");
      out.write("			</div>\r\n");
      out.write("	\r\n");
      out.write("			<div class=\"navi_bar_area\">\r\n");
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
      out.write("			<!-- 주문정보 출력 영역 -->\r\n");
      out.write("			<div class=\"content_area\">\r\n");
      out.write("				<div class=\"content_subject\">\r\n");
      out.write("					<span>ORDER SUCCESS</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"content_container\">\r\n");
      out.write("					<div class=\"success_img\">\r\n");
      out.write("						<img src=\"../resources/img/success_img.png\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<span>고객님의 주문이 <strong>완료</strong> 되었습니다.</span>\r\n");
      out.write("					<br>\r\n");
      out.write("					<br>\r\n");
      out.write("					<p>주문내역 및 배송에 관한 안내는</p>\r\n");
      out.write("					<p><strong>[마이룸->주문/배송 조회]</strong>를 통하여 확인 가능합니다.</p>\r\n");
      out.write("				</div> <!-- content_container -->\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<!-- Footer 영역 -->\r\n");
      out.write("			<div class=\"footer_nav\">\r\n");
      out.write("				<div class=\"footer_nav_container\">\r\n");
      out.write("					<ul>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"/shopinfo/aboutus\">ABOUT US</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<span class=\"line\">|</span>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"/shopinfo/agreement\">AGREEMENT</a>\r\n");
      out.write("						</li>\r\n");
      out.write("						<span class=\"line\">|</span>\r\n");
      out.write("						<li>\r\n");
      out.write("							<a href=\"/shopinfo/policy\">PRIVACY POLICY</a>\r\n");
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
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("    \r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/purchase/buy.jsp(25,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		                <li >\r\n");
          out.write("		                    <a href=\"../member/login\">로그인</a>\r\n");
          out.write("		                </li>\r\n");
          out.write("		                <li>\r\n");
          out.write("		                    <a href=\"../member/join\">회원가입</a>\r\n");
          out.write("		                </li>\r\n");
          out.write("	                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/purchase/buy.jsp(33,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	                	");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f1, _jspx_page_context))
            return true;
          out.write("                \r\n");
          out.write("	                    <li>\r\n");
          out.write("	                        <a id=\"gnb_logout_button\">로그아웃</a>\r\n");
          out.write("	                    </li>\r\n");
          out.write("	                    <li>\r\n");
          out.write("	                        <a href=\"/myRoom/main\">마이룸</a>\r\n");
          out.write("	                    </li>\r\n");
          out.write("	                    <li>\r\n");
          out.write("	                        <a href=\"/order/cart\">장바구니</a>\r\n");
          out.write("	                    </li>\r\n");
          out.write("	                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
      // /WEB-INF/views/purchase/buy.jsp(34,18) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.adminCk == 1 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	                        <li><a href=\"../admin/main\">관리자 페이지</a></li>\r\n");
          out.write("	                    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
