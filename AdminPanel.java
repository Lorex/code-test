/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
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
/*    */ public class AdminPanel
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 24 */     HttpSession session = request.getSession();
/* 25 */     if (session.getAttribute("userName") != null) {
/* 26 */       String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 27 */       String postFolderPath = String.valueOf(webInfPath) + "/posts/";
/* 28 */       File file = new File(postFolderPath);
/* 29 */       File[] files = file.listFiles();
/* 30 */       String[][] posts = new String[files.length][5];
/* 31 */       if (posts.length > 0) {
/* 32 */         for (int i = 0; i < files.length; i++) {
/* 33 */           String postTitle = "";
/* 34 */           String postCreatedAt = "";
/* 35 */           String postUpdatedAt = "";
/* 36 */           String postType = "";
/* 37 */           String path = files[i].getAbsolutePath();
/* 38 */           BufferedReader br = new BufferedReader(new FileReader(path));
/*    */           try {
/* 40 */             postTitle = br.readLine();
/* 41 */             postType = br.readLine();
/* 42 */             postCreatedAt = br.readLine();
/* 43 */             postUpdatedAt = br.readLine();
/*    */           } finally {
/* 45 */             br.close();
/*    */           } 
/* 47 */           posts[i][0] = postTitle;
/* 48 */           posts[i][1] = postType;
/* 49 */           posts[i][2] = postCreatedAt;
/* 50 */           posts[i][3] = postUpdatedAt;
/* 51 */           posts[i][4] = stripExtension(files[i].getName());
/*    */         } 
/*    */       }
/* 54 */       request.setAttribute("posts", posts);
/* 55 */       request.getRequestDispatcher("View/admin/adminPanel.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */       
/*    */       return;
/*    */     } 
/* 59 */     String message = "請先登入";
/* 60 */     request.setAttribute("message", message);
/* 61 */     response.sendRedirect("Login");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */ 
/*    */ 
/*    */   
/*    */   static String stripExtension(String str) {
/* 71 */     if (str == null) return null;
/*    */ 
/*    */ 
/*    */     
/* 75 */     int pos = str.lastIndexOf(".");
/*    */ 
/*    */ 
/*    */     
/* 79 */     if (pos == -1) return str;
/*    */ 
/*    */ 
/*    */     
/* 83 */     return str.substring(0, pos);
/*    */   }
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/AdminPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */