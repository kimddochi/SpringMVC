<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ include file="./inc/base.jsp" %>
<!DOCTYPE html>
<html lang="ko">
  <head>
    <meta charset="utf-8">
    <title>Kimddochi's Story</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<%@ include file="./inc/header.jsp" %>
	<script defer src="/assets/js/jquery.flexslider.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){	
		$('.carousel').carousel();
	});	
	</script>
  </head>

  <body>
  	<%@ include file="./inc/gnb.jsp" %>
    <div class="container-fluid">
      <div class="row-fluid">
        <%@ include file="./inc/left.jsp" %>
        <div class="span9">
          <div class="row-fluid">

            <div id="myCarousel" class="carousel slide">
              <!-- Carousel items -->
              <div class="carousel-inner">
                <div class="active item"><img src="/assets/img/gallery/001.jpg" /></div>
                <div class="item"><img src="/assets/img/gallery/002.jpg" /></div>
                <div class="item"><img src="/assets/img/gallery/003.jpg" /></div>
              </div>
              <!-- Carousel nav -->
              <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
              <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
            </div>

          </div><!--/row-->
        </div><!--/span-->
      </div><!--/row-->
      <%@ include file="./inc/footer.jsp" %>
    </div><!--/.fluid-container-->
  </body>
</html>
