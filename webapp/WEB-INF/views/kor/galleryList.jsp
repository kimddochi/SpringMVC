<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Kimddochi's Story</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<%@ include file="./inc/header.jsp" %>
	<style type="text/css">/* Easy Slider */

	#slider ul, #slider li,
	#slider2 ul, #slider2 li{
		margin:0;
		padding:0;
		list-style:none;
		}
	#slider2{margin-top:1em;}
	#slider li, #slider2 li{ 
		/* 
			define width and height of list item (slide)
			entire slider area will adjust according to the parameters provided here
		*/ 
		width:696px;
		height:241px;
		overflow:hidden; 
		}	
	#prevBtn, #nextBtn,
	#slider1next, #slider1prev{ 
		display:block;
		width:30px;
		height:77px;
		position:absolute;
		left:-30px;
		top:71px;
		z-index:1000;
		}	
	#nextBtn, #slider1next{ 
		left:696px;
		}														
	#prevBtn a, #nextBtn a,
	#slider1next a, #slider1prev a{  
		display:block;
		position:relative;
		width:30px;
		height:77px;
		background:url(/assets/img/gallery/easyslider/btn_prev.gif) no-repeat 0 0;	
		}	
	#nextBtn a, #slider1next a{ 
		background:url(/assets/img/gallery/easyslider/btn_next.gif) no-repeat 0 0;	
		}
	</style>
  </head>

  <body>
  	<%@ include file="./inc/gnb.jsp" %>
    <div class="container-fluid">
      <div class="row-fluid">
        <%@ include file="./inc/left.jsp" %>
        <div class="span9">
        <!-- 
          <div class="hero-unit">
            <h1>Hello, world!</h1>
            <p>This is a template for a simple marketing or informational website. It includes a large callout called the hero unit and three supporting pieces of content. Use it as a starting point to create something more unique.</p>
            <p><a class="btn btn-primary btn-large">Learn more &raquo;</a></p>
          </div>
         -->
          <div class="row-fluid">
          <!-- 
            <div class="span4">
              <h2>Heading</h2>
              <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
              <p><a class="btn" href="#">View details &raquo;</a></p>
            </div>
           -->

		<div id="slider">
			<ul>				
				<li><a href="#"><img src="/assets/img/gallery/001.jpg" alt="Preview" /></a></li>
				<li><a href="#"><img src="/assets/img/gallery/002.jpg" alt="Preview" /></a></li>
				<li><a href="#"><img src="/assets/img/gallery/003.jpg" alt="Preview" /></a></li>
				<li><a href="#"><img src="/assets/img/gallery/004.jpg" alt="Preview" /></a></li>
				<li><a href="#"><img src="/assets/img/gallery/005.jpg" alt="Preview" /></a></li>			
			</ul>
		</div>
		

          </div><!--/row-->
        </div><!--/span-->
      </div><!--/row-->
    </div><!--/.fluid-container-->

    <%@ include file="../inc/jsLoad.jsp" %>

  </body>
</html>
