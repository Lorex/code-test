/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.RequestDispatcher;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class News
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 21 */     if (request.getParameter("pid") != null) {
/* 22 */       String pid = request.getParameter("pid");
/* 23 */       String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 24 */       String filePath = String.valueOf(webInfPath) + "/posts/" + pid + ".txt";
/* 25 */       if (pid.replaceAll("\\s+", "") != null || pid.replaceAll("\\s+", "") != "") {
/* 26 */         File f = new File(filePath);
/* 27 */         if (f.exists() && !f.isDirectory()) {
/* 28 */           File file = new File(filePath);
/* 29 */           String[] post = new String[5];
/* 30 */           String postTitle = "";
/* 31 */           StringBuffer postContent = new StringBuffer();
/* 32 */           String finalPostContent = "";
/* 33 */           String postCreatedAt = "";
/* 34 */           String postUpdatedAt = "";
/* 35 */           String postType = "";
/* 36 */           String path = file.getAbsolutePath();
/* 37 */           BufferedReader br = new BufferedReader(new FileReader(path));
/*    */           try {
/* 39 */             postTitle = br.readLine();
/* 40 */             postType = br.readLine();
/* 41 */             postCreatedAt = br.readLine();
/* 42 */             postUpdatedAt = br.readLine();
/* 43 */             String line = br.readLine();
/* 44 */             while (line != null) {
/* 45 */               postContent.append(line);
/* 46 */               postContent.append("\n");
/* 47 */               line = br.readLine();
/*    */             } 
/* 49 */             finalPostContent = postContent.toString();
/*    */           } finally {
/* 51 */             br.close();
/*    */           } 
/* 53 */           post[0] = postTitle;
/* 54 */           post[1] = postType;
/* 55 */           post[2] = postCreatedAt;
/* 56 */           post[3] = postUpdatedAt;
/* 57 */           post[4] = finalPostContent;
/* 58 */           request.setAttribute("post", post);
/* 59 */           RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("View/news.jsp");
/* 60 */           requestDispatcher1.forward((ServletRequest)request, (ServletResponse)response);
/*    */           
/*    */           return;
/*    */         } 
/* 64 */         String message = "文章不存在";
/* 65 */         request.setAttribute("error", message);
/* 66 */         RequestDispatcher requestDispatcher = request.getRequestDispatcher("Home");
/* 67 */         requestDispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*    */         return;
/*    */       } 
/*    */     } 
/* 71 */     RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
/* 72 */     dispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/News.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */