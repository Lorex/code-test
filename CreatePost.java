/*    */ import java.io.BufferedWriter;
/*    */ import java.io.File;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import java.sql.Timestamp;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
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
/*    */ 
/*    */ public class CreatePost
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 30 */     HttpSession session = request.getSession();
/* 31 */     if (session.getAttribute("userName") != null) {
/* 32 */       request.getRequestDispatcher("View/admin/createPost.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */     }
/*    */     
/* 35 */     String message = "請先登入";
/* 36 */     request.setAttribute("message", message);
/* 37 */     response.sendRedirect("Login");
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 41 */     HttpSession session = request.getSession();
/* 42 */     request.setCharacterEncoding("UTF-8");
/* 43 */     if (session.getAttribute("userName") != null) {
/* 44 */       String postTitle = request.getParameter("title");
/* 45 */       String postType = request.getParameter("type");
/* 46 */       String postBody = request.getParameter("body");
/* 47 */       String time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Calendar.getInstance().getTime());
/*    */       
/* 49 */       String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 50 */       SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
/* 51 */       Timestamp now = new Timestamp(System.currentTimeMillis());
/* 52 */       String str = df.format(now);
/* 53 */       String filePath = String.valueOf(webInfPath) + "/posts/" + str + ".txt";
/* 54 */       File file = new File(filePath);
/* 55 */       if (!file.exists()) {
/*    */         
/* 57 */         file.getParentFile().mkdirs();
/*    */         try {
/* 59 */           file.createNewFile();
/* 60 */         } catch (IOException e) {
/* 61 */           e.printStackTrace();
/*    */         } 
/*    */       } 
/* 64 */       BufferedWriter writer = new BufferedWriter(new FileWriter(file));
/* 65 */       writer.write(postType);
/* 66 */       writer.newLine();
/* 67 */       writer.write(postTitle);
/* 68 */       writer.newLine();
/* 69 */       writer.write(time);
/* 70 */       writer.newLine();
/* 71 */       writer.write(time);
/* 72 */       writer.newLine();
/* 73 */       writer.write(postBody);
/* 74 */       writer.flush();
/* 75 */       writer.close();
/*    */ 
/*    */       
/* 78 */       String str1 = "文章新增成功";
/* 79 */       request.setAttribute("message", str1);
/* 80 */       response.sendRedirect("AdminPanel");
/*    */       
/*    */       return;
/*    */     } 
/* 84 */     String message = "請先登入";
/* 85 */     request.setAttribute("message", message);
/* 86 */     response.sendRedirect("Login");
/*    */   }
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/CreatePost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */