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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Logout
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 23 */     HttpSession session = request.getSession();
/* 24 */     session.invalidate();
/* 25 */     request.getRequestDispatcher("View/admin/login.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 29 */     HttpSession session = request.getSession();
/* 30 */     session.invalidate();
/* 31 */     request.getRequestDispatcher("View/admin/login.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/Logout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */