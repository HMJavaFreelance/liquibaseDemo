<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="${pageContext.servletContext.contextPath}/css/employee.css" rel="stylesheet">
<script type="text/javascript" charset="utf8" src="${pageContext.servletContext.contextPath}/js/employee.js"></script>

<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<form action="${pageContext.servletContext.contextPath}/save" method="post">
 	<h2>Employee Registration</h2>
   <label>
    <p class="label-txt">ENTER YOUR NAME</p>
    <input type="text" name="employeename" class="input">
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  <label>
    <p class="label-txt">ENTER YOUR EMAIL</p>
    <input type="text" name="employeeemail" class="input">
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label> 
  <label>
    <p class="label-txt">ENTER YOUR SALARY</p>
    <input type="number" name="employeesalary" class="input">
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  <button type="submit">submit</button>
</form>