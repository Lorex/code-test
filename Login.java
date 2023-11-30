/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ import javax.servlet.http.HttpSession;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Login
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 19 */     HttpSession session = request.getSession();
/* 20 */     if (session.getAttribute("userName") != null) {
/* 21 */       response.sendRedirect("AdminPanel");
/*    */     }
/*    */     
/* 24 */     request.getRequestDispatcher("View/admin/login.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 29 */     String userName = request.getParameter("userName");
/* 30 */     String userPassword = request.getParameter("userPassword");
/*    */ 
/*    */     
/* 33 */     if (userName.equalsIgnoreCase("vghksadmin") && userPassword.equalsIgnoreCase("admin@vghks")) {
/*    */       
/* 35 */       HttpSession session = request.getSession();
/*    */       
/* 37 */       session.setAttribute("userName", userName);
/*    */       
/* 39 */       response.sendRedirect("AdminPanel");
/*    */     } else {
/* 41 */       String message = "帳號密碼有誤";
/* 42 */       request.setAttribute("message", message);
/* 43 */       request.getRequestDispatcher("View/admin/login.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/Login.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */