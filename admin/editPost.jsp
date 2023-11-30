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
             	<div class="panel-group">
             		<form method="POST" action="EditPost">
             			<a href="AdminPanel" style="display: inline-block; margin-bottom: 20px;" class="btn btn-primary">返回文章清單</a> 
	                	<div class="panel panel-default">
		                    <div class="panel-heading">編輯文章</div>
		                    <div class="panel-body">
								<input class="form-control" name="pid" type="hidden" value="${pid}">
								<input class="form-control" name="post_created_at" type="hidden" value="${post[2]}">
								<div class="form-group">
								    <label for="title">文章標題：</label>
								    <input class="form-control" name="title" type="text" id="title" autocomplete="off" value="${post[1]}">
								</div>
								<div class="row">
								    <div class="col-sm-3 col-md-3">
								        <div class="form-group">
								            <label for="type">文章分類：</label>
								            <select class="form-control" id="type" name="type">
								            	<option value="">--請選擇項目--</option>
								            	<option value="新聞" ${post[0]=="新聞" ? "selected" : ""}>新聞</option>
								            	<option value="活動" ${post[0]=="活動" ? "selected" : ""}>活動</option>
								            	<option value="專訪" ${post[0]=="專訪" ? "selected" : ""}>專訪</option>
								            	<option value="公告" ${post[0]=="公告" ? "selected" : ""}>公告</option></select>
								        </div>
								    </div><!-- /col-md-3 -->
								</div>
								<div class="form-group">
								    <label for="content">文章內容：</label>
								    <textarea class="form-control" name="body" cols="50" rows="10" id="body">${post[4]}</textarea>
								</div>
								<input class="btn btn-success pull-right" type="submit" value="確定儲存">
							</div><!-- /panel-body -->
						</div><!-- /panel panel-default -->
					</form>
				</div><!-- /panel-group -->
			</div><!-- /col-md-12 -->
		</div><!-- /row -->
	</div>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/tinymce/tinymce.min.js"></script>
  	<script>
  	 $( document ).ready(function() {
            tinymce.init({
                language: 'zh_TW',
                selector: 'textarea',
                content_css : '${pageContext.request.contextPath}/assets/css/main.css',
                height: 400,
                plugins: [
                    'advlist autolink lists link image charmap print preview anchor',
                    'searchreplace visualblocks code fullscreen',
                    'insertdatetime media table contextmenu paste code'
                ],
                toolbar: 'insertfile undo redo | styleselect | bold italic | alignleft aligncenter alignright alignjustify | bullist numlist outdent indent | link image',
                content_css: [
                    'http://www.cmis.tku.edu.tw/css/app.css',
                    'http://www.cmis.tku.edu.tw/css/style.css',
                    'http://www.cmis.tku.edu.tw/css/custom.css'
                ]
            });
        });
  	</script>
</body>
</html>