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
  </head>

  <body>
  	<%@ include file="./inc/gnb.jsp" %>
    <div class="container">

      <!-- Main hero unit for a primary marketing message or call to action -->
      <div class="hero-unit">
        <h1>Hello, Kimddochi's Story!</h1>
        <p>Bootstrap을 이용하여 웹애플리케이션을 제작해보았습니다.</p>
        <p>Spring3.1.1로 구성하여 RESTful 방식으로 기본적인 로직을 구현해볼 예정입니다.</p>
        <!-- 
        <p><a class="btn btn-primary btn-large">Learn more &raquo;</a></p>
         -->
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="span4">
          <h2>BBS</h2>
           <p>등록된 게시물이 없습니다.</p>
          <p><a class="btn" href="/kor/community/bbs/L">View details &raquo;</a></p>
        </div>
        <div class="span4">
          <h2>Gallery</h2>
           <p>등록된 게시물이 없습니다. </p>
          <p><a class="btn" href="javascript:alert('Preparing...);">View details &raquo;</a></p>
       </div>
       <!-- 
        <div class="span4">
          <h2>Heading</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn" href="#">View details &raquo;</a></p>
        </div>
        -->
      </div>
      <%@ include file="./inc/footer.jsp" %>
    </div> <!-- /container -->
    <%@ include file="../inc/jsLoad.jsp" %>
  </body>
</html>
