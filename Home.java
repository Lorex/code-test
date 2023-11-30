/*    */ import java.io.BufferedReader;
/*    */ import java.io.File;
/*    */ import java.io.FileReader;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.ServletRequest;
/*    */ import javax.servlet.ServletResponse;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Home
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 21 */     String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 22 */     String postFolderPath = String.valueOf(webInfPath) + "/posts/";
/* 23 */     File file = new File(postFolderPath);
/* 24 */     File[] files = file.listFiles();
/* 25 */     String[][] posts = new String[files.length][5];
/* 26 */     if (posts.length > 0) {
/* 27 */       for (int i = files.length - 1; i >= 0; i--) {
/* 28 */         String postTitle = "";
/* 29 */         String postCreatedAt = "";
/* 30 */         String postUpdatedAt = "";
/* 31 */         String postType = "";
/* 32 */         String path = files[i].getAbsolutePath();
/* 33 */         BufferedReader br = new BufferedReader(new FileReader(path));
/*    */         try {
/* 35 */           postTitle = br.readLine();
/* 36 */           postType = br.readLine();
/* 37 */           postCreatedAt = br.readLine();
/* 38 */           postUpdatedAt = br.readLine();
/*    */         } finally {
/* 40 */           br.close();
/*    */         } 
/* 42 */         posts[i][0] = postTitle;
/* 43 */         posts[i][1] = postType;
/* 44 */         posts[i][2] = postCreatedAt;
/* 45 */         posts[i][3] = postUpdatedAt;
/* 46 */         posts[i][4] = stripExtension(files[i].getName());
/*    */       } 
/*    */     }
/* 49 */     request.setAttribute("posts", posts);
/* 50 */     request.getRequestDispatcher("View/home.jsp").forward((ServletRequest)request, (ServletResponse)response);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void WriteToFile(String path, String input) {
/*    */     try {
/* 59 */       System.out.println(input);
/* 60 */       File file = new File(path);
/* 61 */       FileWriter fw = new FileWriter(file);
/* 62 */       fw.write(input);
/* 63 */       fw.close();
/*    */     }
/* 65 */     catch (Exception e) {
/*    */       
/* 67 */       System.out.println(e.toString());
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static String stripExtension(String str) {
/* 75 */     if (str == null) return null;
/*    */ 
/*    */ 
/*    */     
/* 79 */     int pos = str.lastIndexOf(".");
/*    */ 
/*    */ 
/*    */     
/* 83 */     if (pos == -1) return str;
/*    */ 
/*    */ 
/*    */     
/* 87 */     return str.substring(0, pos);
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 91 */     doGet(request, response);
/*    */   }
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/Home.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */