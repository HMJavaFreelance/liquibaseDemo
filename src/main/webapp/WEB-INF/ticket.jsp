<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="${pageContext.servletContext.contextPath}/css/employee.css" rel="stylesheet">
<script type="text/javascript" charset="utf8" src="${pageContext.servletContext.contextPath}/js/employee.js"></script>

<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<form action="${pageContext.servletContext.contextPath}/save" method="post">
 	<h2>Insert Ticket</h2>
   <label>
    <p class="label-txt">Enter Ticket no.</p>
    <input type="text" name="ticketNo" class="input">
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>
  <label>
    <p class="label-txt">Enter Version Tag</p>
    <input type="text" name="versionTag" class="input">
    <div class="line-box">
      <div class="line"></div>
    </div>
  </label>   
  <button type="submit">submit</button>
</form>