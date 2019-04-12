
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%><%@
taglib
	prefix="s" uri="http://www.springframework.org/tags"%><%@
taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@
page
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>ASK Online Tickets</title>
  <link rel="stylesheet" href="css/signUpstyle.css">
  <link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/css/signUpstyle.css'/>" />
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
  
  <script src="/resources/lib/jquery.js"></script>
	<script src="/resources/dist/jquery.validate.js"></script>
<script>
	$.validator.setDefaults({
		submitHandler: function() {
			alert("submitted!");
		}
	});

	$().ready(function() {
		// validate the comment form when it is submitted
		$("#commentForm").validate();

		// validate signup form on keyup and submit
		$("#ticketForm").validate({
			rules: {
				surname: "required",
				othername: "required",
				username: {
					required: true,
					minlength: 2
				},
				password: {
					required: true,
					minlength: 5
				},
				repeatEmail: {
					required: true,
					email: true
					equalTo: "#email"
				},
				email: {
					required: true,
					email: true
				},
				topic: {
					required: "#newsletter:checked",
					minlength: 2
				},
				agree: "required"
			},
			messages: {
				surname: "Please enter your surname",
				othername: "Please enter your othernames",
				username: {
					required: "Please enter a username",
					minlength: "Your username must consist of at least 2 characters"
				},
				password: {
					required: "Please provide a password",
					minlength: "Your password must be at least 5 characters long"
				},
				confirm_password: {
					required: "Please provide a password",
					minlength: "Your password must be at least 5 characters long",
					equalTo: "Please enter the same password as above"
				},
				email: "Please enter a valid email address",
				repeatEmail: "Please enter a valid email address as above",
				agree: "Please accept our policy"
			}
		});

		// propose username by combining first- and lastname
		$("#username").focus(function() {
			var firstname = $("#firstname").val();
			var lastname = $("#lastname").val();
			if (firstname && lastname && !this.value) {
				this.value = firstname + "." + lastname;
			}
		});

		//code to hide topic selection, disable for demo
		var newsletter = $("#newsletter");
		// newsletter topics are optional, hide at first
		var inital = newsletter.is(":checked");
		var topics = $("#newsletter_topics")[inital ? "removeClass" : "addClass"]("gray");
		var topicInputs = topics.find("input").attr("disabled", !inital);
		// show when newsletter is checked
		newsletter.click(function() {
			topics[this.checked ? "removeClass" : "addClass"]("gray");
			topicInputs.attr("disabled", !this.checked);
		});
	});
	</script>
	<style>
	#commentForm {
		width: 500px;
	}
	#commentForm label {
		width: 250px;
	}
	#commentForm label.error, #commentForm input.submit {
		margin-left: 253px;
	}
	#ticketForm {
		width: 670px;
	}
	#ticketForm label.error {
		margin-left: 10px;
		width: auto;
		display: inline;
	}
	#newsletter_topics label.error {
		display: none;
		margin-left: 103px;
	}
	</style>
</head>
<body>
  <h1 class="register-title">Welcome to ASK Ticketing System</h1>
  <sf:form  class="cmxform" id="ticketForm" method="post" action="/DrugIndex/addUser"  commandName="user">
  
 <div class="register">
 
    <div class="register-switch">
    <sf:input path= "userId" type="hidden" class="register-input"/>
      <!--  <input type="radio" name="sex" value="F" id="sex_f" class="register-switch-input" checked>
      <label for="sex_f" class="register-switch-label">Female</label>
       <input type="radio" name="sex" value="M" id="sex_m" class="register-switch-input">
      <label for="sex_m" class="register-switch-label">Male</label> -->
    </div>
    <sf:input id ="email" path="email" type="email" class="register-input" placeholder="Email address"/>
  <%--    <sf:input path="password" type="password" class="register-input" placeholder="Password"/> --%>
       <sf:input id="repeatEmail" path ="repeatEmail" type="email" class="register-input" placeholder="Repeat Email"/>
      <sf:input id ="surname" path="surname" type="text" class="register-input" placeholder="Surname"/>
         <sf:input id ="otherNames" path="otherNames" type="text" class="register-input" placeholder="Other Names"/>
       
          <sf:input id ="telephone" path ="telephone" type="telephone" class="register-input" placeholder="telephone"/>
    <input type="submit" value="Buy Ticket" class="register-button">
    </div>
  </sf:form>

  <div class="about">
    <p class="about-links">
      <a href="#" target="_parent">About Us</a>
      <a href="#" target="_parent">Terms And Condition</a>
    </p>
    
  </div>
</body>
</html>
