<!-- 
<html>
<body>
<h2>Banking System</h2>

</body>
</html> -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"> -->


<!-- <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>


<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script> -->
<!-- <style>
.center {
  margin: auto;
  width: 50%;
  padding: 10px;
}
.bcenter {
  margin: auto;
  width: 50%;
  background-color: DodgerBlue;
  padding: 10px;
}
</style> -->

<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script> -->
<body>
<br>
<br>
<br>
<form action="loginServlet" method="post">
  <div class="center">
    <label class="form-label" for="email">Email address</label>
    <input type="email" id="email" class="form-control" name="email" required/>
    
  </div>
  <div class="center">
    <label class="form-label" for="password">Password</label>
    <input type="password" id="password" class="form-control" name="password" required />
    
  </div>
<div class="center">
    <div class="col">
      <a href="#!">Forgot password?</a>
    </div>
</div>
   <div class="center">
    <button type="submit" class="btn btn-primary">Sign In</button>
</div>
  <div class="text-center">
    <p>Not a member? <a href="Register.html">Register</a></p>
  </div>
</form>

</body>
</html>
