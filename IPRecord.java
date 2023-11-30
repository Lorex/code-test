/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.GregorianCalendar;
/*     */ import javax.servlet.ServletException;
/*     */ import javax.servlet.http.HttpServlet;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import javax.servlet.http.HttpServletResponse;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class IPRecord
/*     */   extends HttpServlet
/*     */ {
/*     */   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*  30 */     String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/*  31 */     String filePath = String.valueOf(webInfPath) + "/db/db.db";
/*  32 */     File file = new File(filePath);
/*  33 */     if (!file.exists()) {
/*     */       
/*  35 */       file.getParentFile().mkdirs();
/*  36 */       Connection connection = null;
/*     */       try {
/*  38 */         file.createNewFile();
/*     */         
/*     */         try {
/*     */           try {
/*  42 */             Class.forName("org.sqlite.JDBC");
/*  43 */           } catch (ClassNotFoundException e) {
/*  44 */             e.printStackTrace();
/*     */           } 
/*     */           
/*  47 */           connection = DriverManager.getConnection("jdbc:sqlite:" + filePath);
/*  48 */           Statement statement = connection.createStatement();
/*  49 */           statement.setQueryTimeout(30);
/*  50 */           statement.executeUpdate("drop table if exists ip");
/*  51 */           statement.executeUpdate("create table ip (id INTEGER PRIMARY KEY AUTOINCREMENT, ip TEXT, link TEXT, created_at TEXT)");
/*     */         }
/*  53 */         catch (SQLException e) {
/*     */ 
/*     */ 
/*     */           
/*  57 */           System.err.println(e.getMessage());
/*     */         } finally {
/*     */ 
/*     */           
/*     */           try {
/*     */             
/*  63 */             if (connection != null) {
/*  64 */               connection.close();
/*     */             }
/*  66 */           } catch (SQLException e) {
/*     */ 
/*     */             
/*  69 */             System.err.println(e);
/*     */           } 
/*     */         } 
/*  72 */       } catch (IOException e) {
/*  73 */         e.printStackTrace();
/*     */       } 
/*     */       
/*     */       try {
/*  77 */         file.createNewFile();
/*     */         
/*     */         try {
/*     */           try {
/*  81 */             Class.forName("org.sqlite.JDBC");
/*  82 */           } catch (ClassNotFoundException e) {
/*  83 */             e.printStackTrace();
/*     */           } 
/*     */           
/*  86 */           connection = DriverManager.getConnection("jdbc:sqlite:" + filePath);
/*  87 */           Statement statement = connection.createStatement();
/*  88 */           statement.setQueryTimeout(30);
/*     */ 
/*     */           
/*  91 */           String ip = getIpAddr(request);
/*  92 */           String myDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new Date());
/*  93 */           String todayStr = getToday();
/*  94 */           String tomorrowStr = getTomorrow();
/*     */           
/*  96 */           int rowCount = 0;
/*  97 */           ResultSet rs = statement.executeQuery("SELECT * FROM ip WHERE created_at BETWEEN '" + todayStr + "' AND '" + tomorrowStr + "' AND link = '" + request.getParameter("url") + "'");
/*  98 */           while (rs.next()) {
/*  99 */             rowCount = rs.getInt(1);
/*     */           }
/* 101 */           if (rowCount < 1) {
/* 102 */             statement.executeUpdate("insert into ip values(null, '" + ip + "', '" + request.getParameter("url") + "', '" + myDate + "' )");
/*     */           }
/* 104 */           statement.close();
/*     */         }
/* 106 */         catch (SQLException e) {
/*     */ 
/*     */ 
/*     */           
/* 110 */           System.err.println(e.getMessage());
/*     */         } finally {
/*     */ 
/*     */           
/*     */           try {
/*     */             
/* 116 */             if (connection != null) {
/* 117 */               connection.close();
/*     */             }
/* 119 */           } catch (SQLException e) {
/*     */ 
/*     */             
/* 122 */             System.err.println(e);
/*     */           } 
/*     */         } 
/* 125 */       } catch (IOException e) {
/* 126 */         e.printStackTrace();
/*     */       } 
/*     */     } else {
/*     */       
/* 130 */       Connection connection = null;
/*     */       try {
/* 132 */         file.createNewFile();
/*     */         
/*     */         try {
/*     */           try {
/* 136 */             Class.forName("org.sqlite.JDBC");
/* 137 */           } catch (ClassNotFoundException e) {
/* 138 */             e.printStackTrace();
/*     */           } 
/*     */           
/* 141 */           connection = DriverManager.getConnection("jdbc:sqlite:" + filePath);
/* 142 */           Statement statement = connection.createStatement();
/* 143 */           statement.setQueryTimeout(30);
/*     */ 
/*     */           
/* 146 */           String ip = getIpAddr(request);
/* 147 */           String myDate = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new Date());
/* 148 */           String todayStr = getToday();
/* 149 */           String tomorrowStr = getTomorrow();
/*     */           
/* 151 */           int rowCount = 0;
/* 152 */           ResultSet rs = statement.executeQuery("SELECT * FROM ip WHERE created_at BETWEEN '" + todayStr + "' AND '" + tomorrowStr + "' AND link = '" + request.getParameter("url") + "'");
/* 153 */           while (rs.next()) {
/* 154 */             rowCount = rs.getInt(1);
/*     */           }
/* 156 */           if (rowCount < 1) {
/* 157 */             statement.executeUpdate("insert into ip values(null, '" + ip + "', '" + request.getParameter("url") + "', '" + myDate + "' )");
/*     */           }
/* 159 */           statement.close();
/*     */         }
/* 161 */         catch (SQLException e) {
/*     */ 
/*     */ 
/*     */           
/* 165 */           System.err.println(e.getMessage());
/*     */         } finally {
/*     */ 
/*     */           
/*     */           try {
/*     */             
/* 171 */             if (connection != null) {
/* 172 */               connection.close();
/*     */             }
/* 174 */           } catch (SQLException e) {
/*     */ 
/*     */             
/* 177 */             System.err.println(e);
/*     */           } 
/*     */         } 
/* 180 */       } catch (IOException e) {
/* 181 */         e.printStackTrace();
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIpAddr(HttpServletRequest request) {
/* 190 */     String ip = request.getHeader("x-forwarded-for");
/* 191 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/* 192 */       ip = request.getHeader("Proxy-Client-IP");
/*     */     }
/* 194 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/* 195 */       ip = request.getHeader("WL-Proxy-Client-IP");
/*     */     }
/* 197 */     if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
/* 198 */       ip = request.getRemoteAddr();
/*     */     }
/* 200 */     return ip;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getToday() {
/* 205 */     Calendar date = new GregorianCalendar();
/*     */     
/* 207 */     date.set(11, 0);
/* 208 */     date.set(12, 0);
/* 209 */     date.set(13, 0);
/* 210 */     date.set(14, 0);
/* 211 */     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/*     */     
/* 213 */     return dateFormat.format(date.getTime());
/*     */   }
/*     */   
/*     */   public String getTomorrow() {
/* 217 */     Calendar date = new GregorianCalendar();
/*     */     
/* 219 */     date.set(11, 0);
/* 220 */     date.set(12, 0);
/* 221 */     date.set(13, 0);
/* 222 */     date.set(14, 0);
/* 223 */     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 224 */     date.add(5, 1);
/* 225 */     return dateFormat.format(date.getTime());
/*     */   }
/*     */   
/*     */   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*     */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/IPRecord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */