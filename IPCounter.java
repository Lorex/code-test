/*    */ import java.io.IOException;
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.ResultSet;
/*    */ import java.sql.SQLException;
/*    */ import java.sql.Statement;
/*    */ import javax.servlet.ServletException;
/*    */ import javax.servlet.http.HttpServlet;
/*    */ import javax.servlet.http.HttpServletRequest;
/*    */ import javax.servlet.http.HttpServletResponse;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class IPCounter
/*    */   extends HttpServlet
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   
/*    */   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/* 24 */     String webInfPath = getServletConfig().getServletContext().getRealPath("WEB-INF");
/* 25 */     String filePath = String.valueOf(webInfPath) + "/db/db.db";
/*    */     
/*    */     try {
/* 28 */       Class.forName("org.sqlite.JDBC");
/* 29 */     } catch (ClassNotFoundException e1) {
/* 30 */       e1.printStackTrace();
/*    */     } 
/* 32 */     Connection connection = null;
/*    */ 
/*    */     
/*    */     try {
/* 36 */       connection = DriverManager.getConnection("jdbc:sqlite:" + filePath);
/* 37 */       Statement statement = connection.createStatement();
/* 38 */       statement.setQueryTimeout(30);
/* 39 */       ResultSet rs = statement.executeQuery("select Count(*) from ip");
/* 40 */       rs.next();
/* 41 */       int rowCount = rs.getInt(1);
/* 42 */       response.getWriter().println(rowCount);
/*    */     }
/* 44 */     catch (SQLException e) {
/*    */ 
/*    */ 
/*    */       
/* 48 */       System.err.println(e.getMessage());
/*    */     } finally {
/*    */ 
/*    */       
/*    */       try {
/*    */         
/* 54 */         if (connection != null) {
/* 55 */           connection.close();
/*    */         }
/* 57 */       } catch (SQLException e) {
/*    */ 
/*    */         
/* 60 */         System.err.println(e);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
/*    */ }


/* Location:              /Users/shiunchen/Downloads/TAMIS衛教/WEB-INF/classes/!/IPCounter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */