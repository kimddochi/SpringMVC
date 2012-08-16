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
	});	
	</script>
  </head>

  <body>
  	<%@ include file="./inc/gnb.jsp" %>
    <div class="container-fluid">
      <div class="row-fluid">
        <%@ include file="./inc/left.jsp" %>
        <div class="span9">
          <form class="form-horizontal" name="formSave" id="formSave" method="post" enctype="multipart/form-data" action="./S">
            <fieldset>
              <div class="control-group">
                <label class="control-label" for="fileInput">File input</label>
                <div class="controls">
                  <input type="file" class="input-file" id="fileData" name="fileData" />
                  <p class="help-block"><span class="label label-info">Heads up!</span> 2개 이상의 파일을 업로드할 경우  <code>*.zip</code> 파일로 업로드하시기 바랍니다.</p>
                </div>
              </div>
              <section class="pull-right">
                <button type="submit" class="btn btn-primary">Save</button>
                <button class="btn">Cancel</button>
              </section>
            </fieldset>
          </form>
        </div><!--/span-->
      </div><!--/row-->
      <%@ include file="./inc/footer.jsp" %>
    </div><!--/.fluid-container-->
  </body>
</html>
