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
		$('#btnWrite').click(function(){
			location.href='./W';
		});
	});	
	</script>
  </head>

  <body>
  	<%@ include file="./inc/gnb.jsp" %>
    <div class="container-fluid">
      <div class="row-fluid">
        <%@ include file="./inc/left.jsp" %>
        <div class="span9">
          <table class="table table-bordered">
            <thead>
              <tr>
                <th>column1</th>
                <th>column2</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>contents1</td>
                <td>contents2</td>
              </tr>
            </tbody>
          </table>
          <section>
            <button type="submit" id="btnWrite" class="btn btn_inverse pull-right">Write</button>
          </section>
        </div><!--/span-->
      </div><!--/row-->
      <%@ include file="./inc/footer.jsp" %>
    </div><!--/.fluid-container-->
  </body>
</html>
