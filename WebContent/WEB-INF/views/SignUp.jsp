<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%><%@
taglib
	prefix="s" uri="http://www.springframework.org/tags"%><%@
taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@
page
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="front ie lt-ie9 lt-ie8 lt-ie7 fluid sticky-top"> <![endif]-->
<!--[if IE 7]>    <html class="front ie lt-ie9 lt-ie8 fluid sticky-top"> <![endif]-->
<!--[if IE 8]>    <html class="front ie lt-ie9 fluid sticky-top"> <![endif]-->
<!--[if gt IE 8]> <html class="front ie gt-ie8 fluid sticky-top"> <![endif]-->
<!--[if !IE]><!-->
<html class="front fluid sticky-top">
<!-- <![endif]-->
<head>
<title>ASK Online Tickets</title>

<!-- Meta -->
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />
<link rel="shortcut icon" type="image/png"
	href="<c:url value="/resources/images/favicon.ico"/>">

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/css/responsive.css'/>" />

<!-- Glyphicons Font Icons -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/fonts/glyphicons/css/glyphicons.css'/>" />

<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/fonts/font-awesome/css/font-awesome.min.css'/>" />
<!--[if IE 7]><link rel="stylesheet" href="../../../common/theme/fonts/font-awesome/css/font-awesome-ie7.min.css"><![endif]-->

<!-- Uniform Pretty Checkboxes -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/forms/pixelmatrix-uniform/css/uniform.default.css'/>" />

<!-- Main Theme Stylesheet :: CSS -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/css/style-default.css?1371698494'/>" />


<!-- LESS.js Library -->
<script
	src="<c:url value="/resources/common/theme/scripts/plugins/system/less.min.js" />"></script>
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
		$("#ticketForm").validate();

		// validate signup form on keyup and submit
		$("#ticketForm").validate({
			rules: {
				surname: "required",
				othername: "required",
				username: {
					required: true,
					minlength: 2
				},
				telephone:{
					required: true,
					minlength: 10
				},
				password: {
					required: true,
					minlength: 5
				},
				repeatEmail: {
					required: true,
					email: true,
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
				agree: "Please accept our policy",
					telephone: "Enter the correct Phone number"
			}
		});

		// propose username by combining first- and lastname
		$("#username").focus(function() {
			var firstname = $("#surname").val();
			var lastname = $("#othernames").val();
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

#commentForm label.error,#commentForm input.submit {
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
<body class="login">

	<!-- Main Container Fluid -->
	<div class="container-fluid">

		<!-- Content -->
		<div id="content">

			<!-- Top navbar (note: add class "navbar-hidden" to close the navbar by default) -->
			<div class="navbar main hidden-print">

				<div class="secondary">
					<div class="container-960">

						<!-- Brand -->
						<a href="index.html?lang=en&amp;style=style-default"
							class="appbrand pull-left"><img src="top_logo.png"></a>

						<ul class="topnav pull-right">

							<!-- Themer -->
							<li class="hidden-phone"><a href="#themer"
								data-toggle="collapse" class="glyphicons eyedropper single-icon"><i></i></a></li>
							<!-- // Themer END -->

							<li><a href="contact.html?lang=en&amp;style=style-default"
								class="glyphicons shield"><i></i> Get Help</a></li>
							<li class="glyphs hidden-phone">
								
							</li>
						</ul>
						<div class="clearfix"></div>

					</div>
				</div>

				<div class="container-960">

					<!-- Menu Toggle Button -->
					<button type="button" class="btn btn-navbar visible-phone">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
			
					<div class="clearfix"></div>
					<!-- // Top Menu Right END -->

				</div>

			</div>
			<!-- Top navbar END -->
			<!-- Wrapper -->
			<div id="login">

				<div class="wrapper signup">

					<h1 class="glyphicons user_add">
						Sign up <i></i>
					</h1>

					<!-- Box -->
					<div class="widget widget-heading-simple">
						<div class="widget-body">
							
							<!-- Form -->
							<sf:form id ="ticketForm" method="post" action="/OnlineTickets/addUser"
								commandName="user">

								<!-- Row -->
								<div class="row-fluid row-merge">

									<!-- Column -->
									<div class="span6">
										<div class="innerR">

											<label class="strong">Surname</label>
											<sf:input id="surname" path="surname" type="text"
												class="input-block-level" placeholder="surname" />
											<label class="strong">Othernames</label>
											<sf:input id="otherNames" path="otherNames" type="text"
												class="input-block-level" placeholder="Othernames" />
											<label class="strong">Email</label>
											<sf:input path="email" type="text" class="input-block-level"
												placeholder="Your Valid Email Address" />
											<label class="strong">Confirm Email</label>
											<sf:input id="repeatEmail" path="repeatEmail" type="text"
												class="input-block-level"
												placeholder="Your Valid Email Address" />
											<sf:input path="userId" type="hidden"
												class="input-block-level" readonly="true" />
												<label class="strong">Telephone</label>
											<sf:input id="telephone" path="telephone" type="telephone"
												class="input" placeholder="telephone" />
												
											
										</div>
									</div>
									<!-- // Column END -->

									<!-- Column -->
									<div class="span6">
										<div class="innerL">

											<%-- <label class="strong">Confirm Email</label>
								  <sf:input path="email" type="text" class="input-block-level" placeholder="Confirm Your Email Address"/> --%>
											<label for="ticketCategory">Ticket Category</label>
										
								
										<sf:select id="combobox" path="ticketCategory">
										
											<sf:option value="Pre-Show Tuesday ticket"
												var="1" itemValue="1"
												itemLabel="key" />
										       
												<sf:option value="Perimeter Adult"
												var="2" itemValue="2"
												itemLabel="key" />
												<sf:option value="Perimeter Child"
												var="3" itemValue="3"
												itemLabel="key" />
												
										</sf:select>
											<label class="strong">Number Of Tickets</label>
											<sf:input id="numberOfTickets" path="numberOfTickets" type="numberOfTickets"
												class="input" placeholder="1"  />
											<button name="submit"
												class="btn btn-icon-stacked btn-block btn-success glyphicons user_add">
												<i></i><span>Buy </span><span class="strong">Tickets
													 now</span>
											</button>
											<p>
												Having troubles? <a
													href="faq.html?lang=en&amp;style=style-default">Get
													Help</a>
											</p>
										</div>
									</div>
									<!-- // Column END -->

								</div>
								<!-- // Row END -->

							</sf:form>
							<!-- // Form END -->


						</div>
						<!-- // Box END -->

					</div>

				</div>

			</div>
			<!-- // Wrapper END -->
		</div>
		<!-- // Content END -->

		<div id="footer" class="hidden-print">

			<div class="container-960 innerTB">
				<div class="row-fluid">
					<div class="span2">
						<h4>Quick Links</h4>
						<ul>
							<li><a href="http://www.ask.co.ke/">Home</a></li>
							<li><a href="www.bsl.co.ke">Powered By Brisk</a></li>
							
						</ul>
					</div>
					<div class="span4">
						<h4>About</h4>
						<div class="box-generic">Lorem Ipsum is simply dummy text of
							the printing and typesetting dustry. Lorem Ipsum has been the
							industry's standard dummy text ever since the 1500s, when an
							unknown printer took a galley of type and scrambled it to make a
							type specimen book.</div>
					</div>
					<div class="span3">
						<h4>Important Links</h4>
						<ul>
							<li><a href="http://www.ask.co.ke/resources/calendar-of-events">Calendar Of Events</a></li>
							
						</ul>
					</div>
					<div class="span3">
						<h4>Contact</h4>
						<ul class="icons">
							<li class="glyphicons phone"><i></i>++254786926142</li>
							<li class="glyphicons envelope"><i></i>info@bsl.co.ke</li>
						</ul>

						<h4>Social</h4>
						<a href="" class="glyphicons standard primary facebook"><i></i></a>
						<a href="" class="glyphicons standard twitter"><i></i></a> <a
							href="" class="glyphicons standard linked_in"><i></i></a> <a
							href="" class="glyphicons standard google_plus"><i></i></a> <a
							href="" class="glyphicons standard vimeo"><i></i></a>
					</div>
				</div>

				<!--  Copyright Line -->
				<div class="copy">
					Copyright &copy; 2014 - <a href="http://www.bsl.co.ke">brisk online tickets</a>
					| All rights reserved. <span class="appbrand"></span>
				</div>
				<!--  End Copyright Line -->

			</div>

		</div>
		<!-- // Footer END -->

	</div>
	<!-- // Main Container Fluid END -->

	<!-- Themer -->
	<div id="themer" class="collapse">
		<div class="wrapper">
			<span class="close2">&times; close</span>
			<h4>
				Themer <span>color options</span>
			</h4>
			<ul>
				<li>Theme: <select id="themer-theme" class="pull-right"></select>
					<div class="clearfix"></div></li>
				<li>Primary Color: <input type="text" data-type="minicolors"
					data-default="#ffffff" data-slider="hue" data-textfield="false"
					data-position="left" id="themer-primary-cp" />
					<div class="clearfix"></div></li>
				<li><span class="link" id="themer-custom-reset">reset
						theme</span> <span class="pull-right"><label>advanced <input
							type="checkbox" value="1" id="themer-advanced-toggle" /></label></span></li>
			</ul>
			<div id="themer-getcode" class="hide">
				<hr class="separator" />
				<button
					class="btn btn-primary btn-small pull-right btn-icon glyphicons download"
					id="themer-getcode-less">
					<i></i>Get LESS
				</button>
				<button
					class="btn btn-inverse btn-small pull-right btn-icon glyphicons download"
					id="themer-getcode-css">
					<i></i>Get CSS
				</button>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- // Themer END -->

	<!-- JQuery -->
	<script
		src="<c:url value="http://code.jquery.com/jquery-1.10.1.min.js" />"></script>
	<script
		src="<c:url value="http://code.jquery.com/jquery-migrate-1.2.1.min.js" />"></script>

	<!-- Code Beautify -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/other/js-beautify/beautify.js" />"></script>
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/other/js-beautify/beautify-html.js" />"></script>

	<!-- Global -->
	<script>
		var basePath = '', commonPath = '../../../common/';
	</script>

	<!-- JQueryUI -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/system/jquery-ui/js/jquery-ui-1.9.2.custom.min.js" />"></script>

	<!-- JQueryUI Touch Punch -->
	<!-- small hack that enables the use of touch events on sites using the jQuery UI user interface library -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/system/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js" />"></script>


	<!-- Modernizr -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/system/modernizr.js" />"></script>

	<!-- Bootstrap -->
	<script
		src="<c:url value="/resources/common/bootstrap/js/bootstrap.min.js" />"></script>

	<!-- SlimScroll Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/other/jquery-slimScroll/jquery.slimscroll.min.js" />"></script>

	<!-- Common Demo Script -->
	<script
		src="<c:url value="/resources/common/theme/scripts/demo/common.js?1371698494" />"></script>

	<!-- Holder Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/other/holder/holder.js" />"></script>
	<script>
		Holder.add_theme("dark", {
			background : "#000",
			foreground : "#aaa",
			size : 9
		});
		Holder.add_theme("white", {
			background : "#fff",
			foreground : "#c9c9c9",
			size : 9
		});
	</script>

	<!-- Uniform Forms Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/forms/pixelmatrix-uniform/jquery.uniform.min.js" />"></script>

	<!-- Bootstrap Extended -->
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootstrap-select/bootstrap-select.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootstrap-toggle-buttons/static/js/jquery.toggle.buttons.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootstrap-hover-dropdown/twitter-bootstrap-hover-dropdown.min.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/jasny-bootstrap/js/jasny-bootstrap.min.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/jasny-bootstrap/js/bootstrap-fileupload.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootbox.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootstrap-wysihtml5/js/wysihtml5-0.3.0_rc2.min.js" />"></script>
	<script
		src="<c:url value="/resources/common/bootstrap/extend/bootstrap-wysihtml5/js/bootstrap-wysihtml5-0.0.2.js" />"></script>

	<!-- Google Code Prettify -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/other/google-code-prettify/prettify.js" />"></script>

	<!-- Gritter Notifications Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/notifications/Gritter/js/jquery.gritter.min.js" />"></script>

	<!-- Notyfy Notifications Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/notifications/notyfy/jquery.notyfy.js" />"></script>

	<!-- MiniColors Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/color/jquery-miniColors/jquery.miniColors.js" />"></script>

	<!-- DateTimePicker Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/forms/bootstrap-datetimepicker/js/bootstrap-datetimepicker.min.js" />"></script>

	<!-- Cookie Plugin -->
	<script
		src="<c:url value="/resources/common/theme/scripts/plugins/system/jquery.cookie.js" />"></script>

	<!-- Colors -->
	<script>
	var primaryColor = '#4a8bc2',
		dangerColor = '#b55151',
		successColor = '#609450',
		warningColor = '#ab7a4b',
		inverseColor = '#45484d';
	</script>

	<!-- Themer -->
	<script>
	var themerPrimaryColor = primaryColor;
	</script>
	<script
		src="<c:url value="/resources/common/theme/scripts/demo/themer.js" />"></script>


	<!-- Twitter Feed -->
	<script
		src="<c:url value="/resources/common/theme/scripts/demo/twitter.js" />"></script>

</body>
</html>