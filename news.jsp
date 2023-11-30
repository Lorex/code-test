<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <link rel="stylesheet" type="text/css" href="assets/css/main.css?20160125">
	    <link rel="icon" type="image/x-icon" href="assets/images/logo2-backup.ico"><title>全球心肌梗塞照護網</title>
	    <link href='http://fonts.googleapis.com/css?family=Abel'rel='stylesheet' type='text/css'>
	    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,500' rel='stylesheet' type='text/css'>
	    <link href='http://fonts.googleapis.com/css?family=Dosis:300,400,500,600' rel='stylesheet' type='text/css'>
	    <link rel="stylesheet" type="text/css" href="assets/css/animate.css">
		<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="assets/css/owl.carousel.css">
		<link rel="stylesheet" type="text/css" href="assets/css/owl.theme.css">
		<link rel="stylesheet" type="text/css" href="assets/css/owl.transitions.css">
		<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="assets/css/sticky-btn.css">
		<link rel="stylesheet" type="text/css" href="assets/css/main.css">
		<link href="assets/css/css.css" rel="stylesheet" type="text/css"/>
		<link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,300' rel='stylesheet' type='text/css'>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	</head>
	<body>
		<section class= "navs">
			<nav class="navbar navbar-default navbar-fixed-top ">
				<div>
					<div class="scrolled-logo">
						<a href="Home"><img src="./assets/images/logo2.png" alt="logo"></a>
						<span>全球心肌梗塞照護網</span>
					</div>
					<div class="navbar-header">
						<ul class="sub-menu ">
							<li ><a href="http://kkppmed.kmu.edu.tw/"target=_blank><i class="fa fa-h-square"></i><span class="sub-menue-txt">高屏澎醫療網</span></a></li>
		                    <li><a href="${pageContext.request.contextPath}/"target=_blank><i class="fa fa-heartbeat fa-lg"></i><span class="sub-menue-txt">高榮冠心病</span></a></li>
		                    <li><a href="http://www.vghks.gov.tw/cv/"target=_blank><i class="fa fa-heart fa-lg"></i><span class="sub-menue-txt">心臟內科</span></a></li>
		                    <li><a href="http://cms03p.vghks.gov.tw/Chinese/MainSite/"target=_blank><i class="fa fa-plus-square fa-lg"></i><span class="sub-menue-txt">高雄榮總</span></a></li>
		                    <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-dribbble fa-lg"></i><span class="sub-menue-txt">English</span></a></li>
		                    <li><a href="${pageContext.request.contextPath}/"><i class="fa fa-mobile fa-lg"></i><span class="sub-menue-txt">APP</span></a></li>
		                    
				            <li><form role="form" class="search" method="get" action="http://www.google.com.tw/custom" target="_blank">
			                    <input type="text" name="q" class="search-form" autocomplete="off" placeholder="請輸入關鍵字">
			                    <input type="hidden" name="domains" value="\\WWW2\KSAC.ear\KSACWeb.war">
								<input type="hidden" name="sitesearch" value="file:\\WWW2\KSAC.ear\KSACWeb.war">
			                    <button type="submit" name="sa">
			                    	<i class="fa fa-search"></i>
			                    </button>
				                </form>
			                </li>
		                </ul>
					</div>
				</div>
			</nav>
			<header> 
			    <div class="container ">
			    <div class="row"> 
				    <div class="col-xs-3 col-sm-3 col-md-3 logo-photo">
				        <h1 class="navbar-brand navbar-brand_ "><a href="Home"><img src="./assets/images/logo2.png" alt="logo"></a></h1>
				    </div>
				        <!--<strong<img src="./assets/images/logo3.png"><span class="ttl-ch">全球心肌梗塞照護網</span></strong>-->	
				    <div class="col-xs-9 col-sm-9 col-md-9 logo-text">
				    	<a class="logo" href="Home">
							<!--<i class="fa fa-heartbeat fa-spin"></i>-->
							<strong><span class="ttl-ch">全球心肌梗塞照護網</span></strong>
							<p><span class="ttl-en" style="color :#FF0000; font-size:20px;">G</span>LOB<span class="ttl-en" style="color :#FF0000; font-size:20px;">A</span>L  <span class="ttl-en" style="color :#FF0000; font-size:20px;">M</span>YOCARDIAL <span class="ttl-en" style="color :#FF0000; font-size:20px;">I</span>NFARCTION CARE <span class="ttl-en" style="color :#FF0000; font-size:20px;">N</span>ETWORK</p>
	  				    </a> 
				    </div>
				 </div>
				 </div>
			</header>
			<div class="menuBox">
			    <div>
			        <div class="container">
			            <nav class="navbar navbar-default navbar-static-top tm_navbar clearfix" role="navigation">
			                <ul class="nav sf-menu sf-arrows">
			                    <li class="active "><a href="Home" class="sf-with-ul">首頁</a><span></span></li>
			                    <li class=" sub-menu"><a href="2.html" class="sf-with-ul">症狀警訊</a>
			                        <ul class="submenu sub-menu" style="display: none;">
			            				<li ><a href="3.html" class="sf-with-ul">症狀警告</a></li><li ><a href="2-1.html" class="sf-with-ul">冠心定義</a></li>
			            				<li ><a href="2-2.html" class="sf-with-ul">冠心現狀</a></li>
			            				<li ><a href="2-3.html" class="sf-with-ul">危險因子</a></li>
			            				<li ><a href="2-4.html" class="sf-with-ul">病發症</a></li>

			            			</ul>
			                    </li>
			                    
			                    <li><a href="4.html">即時診斷</a></li>
			                    <li><a href="5.html">搶救時效</a></li>
			                    <li class=" sub-menu"><a href="6.html" class="sf-with-ul">冠心治療</a>
			                        <ul class="submenu sub-menu" style="display: none;">
			            				<li ><a href="6-1.html" class="sf-with-ul">導管治療</a></li>
			            				<li ><a href="6-2.html" class="sf-with-ul">藥物治療</a></li>
			            				<li><a href="7.html" class="sf-with-ul"> 冠心手術</a></li>
			            			</ul>
			                    </li>
			                   
			                    <li><a href="8.html"> 冠心復健</a></li>
			                     <li class=" sub-menu"><a href="9.html" class="sf-with-ul">健康生活</a>
			                        <ul class="submenu sub-menu" style="display: none;">
			            				<li ><a href="9-1.html" class="sf-with-ul">預防戒菸</a></li>
			            				<li ><a href="9-2.html" class="sf-with-ul">開心手術</a></li>
			            				<li ><a href="9-3.html" class="sf-with-ul">生活照顧</a></li>
			            			</ul>
			                    </li>
			                    <li><a href="video.html">冠心影片</a></li>
			                    <li><a href="game.html">冠心挑戰</a></li>
			               </ul>
			            </nav>
			        </div>
			    </div>
			</div>

			<div id="cd-nav">
				<a href="#0" class="cd-nav-trigger">Menu<span></span></a>
				<nav id="cd-main-nav">
					<ul>
						<li><a href="Home">首頁</a></li>
						<li><a href="2.html">症狀警訊</a></li>
						<li><a href="4.html">即時診斷</a></li>
						<li><a href="5.html">搶救時效</a></li>
						<li><a href="6.html">冠心治療</a></li>
						<li><a href="8.html">冠心復健</a></li>
						<li><a href="9.html">健康生活</a></li>
						<li><a href="video.html">冠心影片</a></li>
						<li><a href="game.html">冠心挑戰</a></li>
					</ul>
				</nav>
			</div>
		</section>		
			    
		<section class= "starting-new">
			<div class="container">
				<div class="newstitle">
					<p>[${post[0]}]${post[1]}</p>
				</div>
			</div>
		</section>


		<section >
      		<div class="container">
	      		<div class="newscontent">
					<p>${post[4]}</p>
	      		</div>
      		</div>
	  	</section>
		<section id="bottom" >
            <div class="row bottom-wrapper" >
                <h3 class="text-center" style="color :#220088"><strong>高雄榮總心肌梗塞照護團隊</strong></h3>
	            <div class="row col-md-12 text-center" >
	                <h4 style="color :#220088"><strong><p>分分秒秒守護您</p></strong></h4>
	            </div>
	            <div class="row col-md-12 text-center" > 
		            <div style="color :#220088">
		                <h6 style="color :#220088" ><p>高雄榮民總醫院</p></h6>
		                <h6 style="color :#220088" ><p>E-MAIL : wwwcv@vghks.gov.tw</p></h6>
		                <h6 style="color :#220088"><p>地址 ：81362 高雄市左營區大中一路３８６號</p></h6>
		                <h6 style="color :#220088"><p>電話：07－3422121轉2011(+886-7-342-2121#2011)</p></h6>
		                <h6><p>傳真：07－3455045</p></h6>
		            </div >    
	            </div>
            </div>
           
        </section><!--/#bottom-->
		
			<div class="fbbox" style="">
			  <div>
			    <iframe src="http://www.facebook.com/plugins/likebox.php?href=http%3A%2F%2Ffacebook.com%2F高雄榮民總醫院-心臟血管中心-1380158908948168&amp;width=245&amp;colorscheme=light&amp;show_faces=true&amp; connections=9&amp;stream=false&amp;header=false&amp;height=220" scrolling="no" frameborder="0" scrolling="no" style="border: medium none; overflow: hidden; height: 220px; width: 245px;background:#fff;"></iframe>
			  </div>
			</div>
				
        <footer id="footer" class="midnight-blue">
		    <div class="container" >
		    	<div class="row">
				    <!--<tbody>
				        <tr>
				       		<td class="foot">
				                <div class="counter" style="text-align: center;">
				              		自民國104年12月起參訪人數
				                    <script language='javascript'>
				                        if (typeof(Counter) != 'undefined') document.write(s_counter(Counter));
				                      	    Counter='6130';

				                            function s_counter(p_id) {
				                                var l_path = "file:///Users/apple/Desktop/冠心病照護團隊Home.html/assets/images/Counter/"
				                                var l_length = "6"
				                                var str = '',
				                                    c, f
				                                for (var i = 0; i < p_id.length; i++) {
				                                    c = p_id.charAt(i);
				                                    f = l_path + c + "_13" + ".gif"
				                                    str += "<img src='" + f + "' border=0 title='" + Counter + "'>"
				                                }
				                                for (var i = l_length - p_id.length; i > 0; i--) {
				                                    f = l_path + "0_13" + ".gif"
				                                    str = "<img src='" + f + "' border=0 title='" + Counter + "''>" + str
				                                }
				                                return str
				                            }
				                    </script>
				                </div>
				            </td>
				        </tr>
					</tbody>-->
					<!-- Start of SimpleHitCounter Code -->


					<div class="row col-md-4 text-left">
			    	<a href="Home"  style="color :#FFFFFF">&copy; 高雄榮總心肌梗塞照護團隊關心您</a></div>
					<div class="row col-md-4 text-center"><a >瀏覽人次:</a>
					<img src="http://simplehitcounter.com/hit.php?uid=2014510&f=16777215&b=0" border="0" height="18" width="83" alt="web counter"></div>
		            <div class="row col-md-4 text-right ">
		            <a  href="Home">首頁</a></li>
		            <a href="contact.html">聯絡我們</a>
	                <a href="${pageContext.request.contextPath}/">APP</a>
		            </div>

		            
		        </div>
		    </div>
		</footer><!--/#footer-->
		<script type="text/javascript" src="assets/js/jquery.min.js"></script>
		<script type="text/javascript" src="assets/js/owl.carousel.min.js"></script>
		<script type="text/javascript" src="assets/js/isotope.pkgd.min.js"></script>
		<script type="text/javascript" src="assets/js/wow.min.js"></script>
		<script type="text/javascript" src="assets/js/superfish.js"></script>
		<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="assets/js/back-to-top.js"></script>
		<script>
      		new WOW().init();
		</script>
		<script type="text/javascript">
			$(document).ready(function() {
			  $(".fbbox").hover(function(){
			      $(this).stop().animate({right: "46"}, "medium");
			      }, function(){
			        $(this).stop().animate({right: "-201"}, "medium");
			  }, 500);
			});
			</script>

		<script>
			$(document).ready(function() {
  				$("#starting-slider").owlCarousel({
  					autoPlay: 5000,
  					loop: true,
  					navigationText: [
				      "<i class='fa fa-chevron-left '></i>",
				      "<i class='fa fa-chevron-right '></i>"
				      ],
      				navigation : true, // Show next and prev buttons
      				slideSpeed : 1000,
      				paginationSpeed : 1000,
      				singleItem:true
  				});
  				$('.menuBox').affix({
  					offset: {
    					top: 150
  					}
				});

				printAllVideos();
				
				function printAllVideos(){
					var videos = [
						'uvb40t_SadM',
						'1Thpsffavdo',
						'525CdsUzVbU',
						'w3f-tq7jPrM'
					];
					var max=videos.length-1, min=0;
					var index = Math.floor(Math.random() * (max - min + 1)) + min;
					$('#video-box').append(getVideoText(videos, index, 1));
					for(var i=0; i<videos.length; i++){
						if(i!=index){
							$('#video-box').append(getVideoText(videos, i, 0));
						}
					}
				}

				//回傳完整youtube內砍影片字串function
				function getVideoText(videos, index, isAuto){
					return '<div class="video-item"><iframe src="http://www.youtube.com/embed/' + videos[index] + '?autoplay='+isAuto+'" frameborder="0" allowfullscreen></iframe></div>';
				}

				});
		</script>
		<script>
			$( function() {
				  // init Isotope
			  	var $container = $('.isotope').isotope
			  	({
				    itemSelector: '.element-item',
				    layoutMode: 'fitRows'
			  	});


  				// bind filter button click
  				$('#filters').on( 'click', 'button', function() 
  				{
				    var filterValue = $( this ).attr('data-filter');
				    // use filterFn if matches value
				    $container.isotope({ filter: filterValue });
				 });
  
			  // change is-checked class on buttons
			  	$('.button-group').each( function( i, buttonGroup ) 
			  	{
			    	var $buttonGroup = $( buttonGroup );
			    	$buttonGroup.on( 'click', 'button', function() 
			    	{
			      		$buttonGroup.find('.is-checked').removeClass('is-checked');
			      		$( this ).addClass('is-checked');
			    	});
			  	});
			  
			});

			// browser window scroll (in pixels) after which the "menu" link is shown
			var offset = 300;

			var navigationContainer = $('#cd-nav'),
				mainNavigation = navigationContainer.find('#cd-main-nav ul');

			//hide or show the "menu" link
			checkMenu();
			$(window).scroll(function(){
				checkMenu();
			});

			//open or close the menu clicking on the bottom "menu" link
			$('.cd-nav-trigger').on('click', function(){
				$(this).toggleClass('menu-is-open');
				//we need to remove the transitionEnd event handler (we add it when scolling up with the menu open)
				mainNavigation.off('webkitTransitionEnd otransitionend oTransitionEnd msTransitionEnd transitionend').toggleClass('is-visible');

			});
			var imageHeight = parseInt($('.navbar-brand_ a img').css('height')),
                stopHeight=imageHeight /4,
                marginHeight = parseInt($('.navbar-brand_ a img').css('margin-top'))
    		    stopMargin=marginHeight/2;
			$(window).scroll(function(e){
				var windowScroll = $(window).scrollTop(),
				    newHeight = imageHeight - windowScroll;
				if(windowScroll>=100){
					$('.navbar-brand_ a img').css({'top': '-10px'});
				}
				if(windowScroll>=150){
					$('.scrolled-logo').css("display","inline-block");
				}else{
					$('.scrolled-logo').css("display","none");
				}
				if(newHeight>=stopHeight){
					$('.navbar-brand_ a img').css("display", 'block');
					$('.navbar-brand_ a img').css("height", newHeight);
					$('.navbar-brand_ a img').css("width", newHeight);
				}else{
					$('.navbar-brand_ a img').css("display", 'none');
					$('.navbar-brand_ a img').css("width", stopHeight);
				}

			});

			function checkMenu() {
				if( $(window).scrollTop() > offset && !navigationContainer.hasClass('is-fixed')) {
					navigationContainer.addClass('is-fixed').find('.cd-nav-trigger').one('webkitAnimationEnd oanimationend msAnimationEnd animationend', function(){
						mainNavigation.addClass('has-transitions');
					});
				} else if ($(window).scrollTop() <= offset) {
					//check if the menu is open when scrolling up
					if( mainNavigation.hasClass('is-visible')  && !$('html').hasClass('no-csstransitions') ) {
						//close the menu with animation
						mainNavigation.addClass('is-hidden').one('webkitTransitionEnd otransitionend oTransitionEnd msTransitionEnd transitionend', function(){
							//wait for the menu to be closed and do the rest
							mainNavigation.removeClass('is-visible is-hidden has-transitions');
							navigationContainer.removeClass('is-fixed');
							$('.cd-nav-trigger').removeClass('menu-is-open');
						});
					//check if the menu is open when scrolling up - fallback if transitions are not supported
					} else if( mainNavigation.hasClass('is-visible')  && $('html').hasClass('no-csstransitions') ) {
							mainNavigation.removeClass('is-visible has-transitions');
							navigationContainer.removeClass('is-fixed');
							$('.cd-nav-trigger').removeClass('menu-is-open');
					//scrolling up with menu closed
					} else {
						navigationContainer.removeClass('is-fixed');
						mainNavigation.removeClass('has-transitions');
					}
				} 
			}
		</script>

	    
	</body>
</html>