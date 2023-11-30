<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css">
		
		<style type="text/css">
			.main-content{
				margin-top: 80px;
			}
		</style>
	</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="${pageContext.request.contextPath}/">KVGH管理後台</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="AdminPanel">最新文章管理</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                	<li class="dropdown">
                        <a href="${pageContext.request.contextPath}/" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><%=session.getAttribute("userName")%><span class="caret"></span></a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a href="Logout">登出</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
	<div class="container main-content">
		<div class="row">
			<div class="col-md-12">
				<a href="CreatePost" style="display: inline-block; margin-bottom: 20px;" class="btn btn-success">新增文章</a> 
				 <% if(null!=request.getAttribute("error")){  %>
				    <div class="alert alert-danger" role="alert">
					  <i class="fa fa-exclamation-triangle"></i>
					  <%=request.getAttribute("error")%>
					</div>
           		 <% }%>
				
				<div class="panel panel-default">  
					<div class="panel-heading">最新消息清單</div> 
					<table class="table">
						 <thead> 
						 	<tr>
						 		<th>ID#</th> 
						 		<th>類型</th>
						 		<th>文章標題</th> 
						 		<th>創建日期</th> 
						 		<th>更新日期</th>
						 		<th>功能</th> 
						 	</tr> 
						 </thead> 
						 <tbody> 
						 	<c:forEach var="post" items="${posts}" varStatus="loop">
							 	<tr>
							 		<td scope="row">${loop.index}</td>  
							 		<td>${post[0]}</td> 
							 		<td>${post[1]}</td> 
							 		<td>${post[2]}</td> 
							 		<td>${post[3]}</td>
							 		<td>
							 			<a href="EditPost?pid=${post[4]}" class="btn btn-info">修改</a>
							 			<a href="${pageContext.request.contextPath}/" class="btn btn-danger">刪除</a>
							 		</td>
							 	</tr> 
						 	</c:forEach>
						</tbody> 
					</table> 
				</div>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
</body>
</html>