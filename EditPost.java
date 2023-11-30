/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileReader;
/*     */ import java.io.FileWriter;
/*     */ import java.io.IOException;
/*     */ import java.sql.Timestamp;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import javax.servlet.RequestDispatcher;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.ServletRequest;
/*     */ import javax.servlet.ServletResponse;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ import javax.servlet.http.HttpSession;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EditPost
/*     */   extends HttpServlet
/*     */ {
/*     */   private static final long serialVersionUID = 1L;
/*     */   
/*     */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*  28 */     HttpSession session = request.getSession();
/*  29 */     request.setCharacterEncoding("UTF-8");
/*  30 */     if (session.getAttribute("userName") != null) {
/*  31 */       if (request.getParameter("pid") != null) {
/*  32 */         String pid = request.getParameter("pid");
/*  33 */         String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/*  34 */         String filePath = String.valueOf(webInfPath) + "/posts/" + pid + ".txt";
/*  35 */         if (pid.replaceAll("\\s+", "") != null || pid.replaceAll("\\s+", "") != "") {
/*  36 */           File f = new File(filePath);
/*  37 */           if (f.exists() && !f.isDirectory()) {
/*  38 */             File file = new File(filePath);
/*  39 */             String[] post = new String[5];
/*  40 */             String postTitle = "";
/*  41 */             StringBuffer postContent = new StringBuffer();
/*  42 */             String finalPostContent = "";
/*  43 */             String postCreatedAt = "";
/*  44 */             String postUpdatedAt = "";
/*  45 */             String postType = "";
/*  46 */             String path = file.getAbsolutePath();
/*  47 */             BufferedReader br = new BufferedReader(new FileReader(path));
/*     */             try {
/*  49 */               postType = br.readLine();
/*  50 */               postTitle = br.readLine();
/*  51 */               postCreatedAt = br.readLine();
/*  52 */               postUpdatedAt = br.readLine();
/*  53 */               String line = br.readLine();
/*  54 */               while (line != null) {
/*  55 */                 postContent.append(line);
/*  56 */                 postContent.append("\n");
/*  57 */                 line = br.readLine();
/*     */               } 
/*  59 */               finalPostContent = postContent.toString();
/*     */             } finally {
/*  61 */               br.close();
/*     */             } 
/*  63 */             post[0] = postType;
/*  64 */             post[1] = postTitle;
/*  65 */             post[2] = postCreatedAt;
/*  66 */             post[3] = postUpdatedAt;
/*  67 */             post[4] = finalPostContent;
/*     */ 
/*     */             
/*  70 */             request.setAttribute("pid", request.getParameter("pid"));
/*  71 */             request.setAttribute("post", post);
/*  72 */             RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("View/admin/editPost.jsp");
/*  73 */             requestDispatcher1.forward((ServletRequest)request, (ServletResponse)response);
/*     */             
/*     */             return;
/*     */           } 
/*  77 */           String str1 = "文章不存在";
/*  78 */           request.setAttribute("error", str1);
/*  79 */           RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminPanel");
/*  80 */           requestDispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/*     */       
/*  86 */       String str = "請輸入文章ID";
/*  87 */       request.setAttribute("error", str);
/*  88 */       RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel");
/*  89 */       dispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*     */       
/*     */       return;
/*     */     } 
/*  93 */     String message = "請先登入";
/*  94 */     request.setAttribute("message", message);
/*  95 */     response.sendRedirect("Login");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 101 */     HttpSession session = request.getSession();
/* 102 */     request.setCharacterEncoding("UTF-8");
/* 103 */     if (session.getAttribute("userName") != null) {
/* 104 */       if (request.getParameter("pid") != null) {
/* 105 */         String pid = request.getParameter("pid");
/* 106 */         String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 107 */         String filePath = String.valueOf(webInfPath) + "/posts/" + pid + ".txt";
/* 108 */         if (pid.replaceAll("\\s+", "") != null || pid.replaceAll("\\s+", "") != "") {
/* 109 */           File f = new File(filePath);
/* 110 */           if (f.exists() && !f.isDirectory()) {
/* 111 */             String postTitle = request.getParameter("title");
/* 112 */             String postType = request.getParameter("type");
/* 113 */             String postBody = request.getParameter("body");
/* 114 */             String postCreatedAt = request.getParameter("post_created_at");
/* 115 */             String time = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(Calendar.getInstance().getTime());
/*     */             
/* 117 */             SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
/* 118 */             Timestamp now = new Timestamp(System.currentTimeMillis());
/* 119 */             String str2 = df.format(now);
/*     */             
/* 121 */             File file = new File(filePath);
/* 122 */             if (!file.exists()) {
/*     */               
/* 124 */               file.getParentFile().mkdirs();
/*     */               try {
/* 126 */                 file.createNewFile();
/* 127 */               } catch (IOException e) {
/* 128 */                 e.printStackTrace();
/*     */               } 
/*     */             } 
/* 131 */             BufferedWriter writer = new BufferedWriter(new FileWriter(file));
/* 132 */             writer.write(postType);
/* 133 */             writer.newLine();
/* 134 */             writer.write(postTitle);
/* 135 */             writer.newLine();
/* 136 */             writer.write(postCreatedAt);
/* 137 */             writer.newLine();
/* 138 */             writer.write(time);
/* 139 */             writer.newLine();
/* 140 */             writer.write(postBody);
/* 141 */             writer.flush();
/* 142 */             writer.close();
/*     */             
/* 144 */             response.sendRedirect("AdminPanel");
/*     */             
/*     */             return;
/*     */           } 
/* 148 */           String str1 = "文章不存在";
/* 149 */           request.setAttribute("error", str1);
/* 150 */           RequestDispatcher requestDispatcher = request.getRequestDispatcher("AdminPanel");
/* 151 */           requestDispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*     */           
/*     */           return;
/*     */         } 
/*     */       } 
/* 156 */       String str = "請輸入文章ID";
/* 157 */       request.setAttribute("error", str);
/* 158 */       RequestDispatcher dispatcher = request.getRequestDispatcher("AdminPanel");
/* 159 */       dispatcher.forward((ServletRequest)request, (ServletResponse)response);
/*     */       
/*     */       return;
/*     */     } 
/* 163 */     String message = "請先登入";
/* 164 */     request.setAttribute("message", message);
/* 165 */     response.sendRedirect("Login");
/*     */   }
/*     */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/EditPost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */