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
			  
			  	var returns = "";
			  	
			  	for(f in data){			  	
			  		returns += data[f] + "<br/>";
			  	}
			  	var parsedData = JSON.parse(data);
			  	
			  	alert('로그인하였습니다.');
			  	
			  },
			  error : function(xhr ,stat, e){
			  	alert(e);
			  }
			});
		});
		
		$("#logout").click(function(){
			$.ajax({
			  method: "POST",
			  url: "/rest/logout",
			  data: { id : $("#id").val(), password: $("#password").val() },
			  success: function(data, stat, xhr){
			  
			  	var returns = "";
			  	
			  	for(f in data){			  	
			  		returns += data[f] + "<br/>";
			  	}
			  	
			  	alert('로그아웃되었습니다.')
			  	
			  },
			  error : function(xhr ,stat, e){
			  	alert(e);
			  }
			});
		});
		
	});
	</script>
	<title>로그인</title>
</head>
<body>

<div class="container">
  <!-- Content here -->

	<form>
	  <div class="form-group">
	    <label for="exampleInputEmail1">아이디</label>
	    <input type="text" class="form-control" id="id" name="id" aria-describedby="emailHelp" placeholder="아이디를 입력하세요">
	    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
	  </div>
	  <div class="form-group">
	    <label for="exampleInputPassword1">비밀번호</label>
	    <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력하세요">
	  </div>
	  <!--<div class="form-group form-check">
	    <input type="checkbox" class="form-check-input" id="exampleCheck1"> 
	    <label class="form-check-label" for="exampleCheck1">Check me out</label>
	  </div>-->
	  <button type="button" id="submit" class="btn btn-primary">확인</button>
	  <button type="button" id="logout" class="btn btn-secondary">로그아웃</button>
	</form>
</div>
</body>
</html>