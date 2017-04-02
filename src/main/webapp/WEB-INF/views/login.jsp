<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<html>
	<body>
	<div class="container-fluid">
	<div class="row">
	<div class="col-md-4 col-md-offset-4">
	<div class="panel panel-default">
  <div class="panel-body">
  <div class="wrapper">	
		<form name='loginForm' action="<c:url value='j_spring_security_check' />" method='POST'>
<div class="container-fluid">
	<div class="input-group">
		<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		<input id="username" type="text" class="form-control" name="username" placeholder="Email" required>
	</div>
	<div class="input-group">
		<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
		<input id="password" type="password" class="form-control" name="password" placeholder="Password" required>
	</div>
	<div class="top5">
	<button type="submit" class="btn btn-success col-md-12 col-xs-12 col-sm-12">log in</button>
	</div>
</div>
</form>
	</div>
</div>
	</div>
	</div>
	</div>
	</div>
	

</body>
</html>