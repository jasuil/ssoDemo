<!DOCTYPE html>
<html lang="ko">
<head>
	<link href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
	<script src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
	
	<script>
	$(document).ready(function(){
		
		$("#submit").click(function(){
			$.ajax({
			  method: "POST",
			  url: "/rest/loginCk",
			  data: { id : $("#id").val(), password: $("#password").val() },
			  success: function(data, stat, xhr){
			  	alert(data);
			  },
			  error : function(xhr ,stat, e){
			  	alert(e);
			  }
			});
		});
		
	});
	</script>
	<title>로그인 하셨군요</title>
</head>
<body>

<div class="container">
  <!-- Content here -->

	<div class="jumbotron">
	  <h1 class="display-4">로그인 성공 화면</h1>
	  <p class="lead">성공하셨습니다.</p>
	  <hr class="my-4">
	  <p>SSO서버에서 토큰을 이용하여 로그인에 성공한 화면입니다.</p>
	  <a class="btn btn-primary btn-lg" href="javascript:void(0);" role="button">더 알아보기</a>
	</div>
</div>
</body>
</html>