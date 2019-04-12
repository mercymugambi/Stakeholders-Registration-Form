
</html><%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%><%@
taglib
	prefix="s" uri="http://www.springframework.org/tags"%><%@
taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><%@
page
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--   <%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
        pageEncoding="ISO-8859-1"%>  --%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="front ie lt-ie9 lt-ie8 lt-ie7 fluid sticky-top"> <![endif]-->
<!--[if IE 7]>    <html class="front ie lt-ie9 lt-ie8 fluid sticky-top"> <![endif]-->
<!--[if IE 8]>    <html class="front ie lt-ie9 fluid sticky-top"> <![endif]-->
<!--[if gt IE 8]> <html class="front ie gt-ie8 fluid sticky-top"> <![endif]-->
<!--[if !IE]><!-->
<html class="front fluid sticky-top">
<!-- <![endif]-->
<head>
<title>AFA Partner Registration</title>
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>

<!-- Meta -->
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />
<%-- 	<link rel="shortcut icon" type="image/png"
	href="<c:url value="/resources/images/favicon.ico"/>"> --%>

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/css/bootstrap.css'/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/css/responsive.css'/>" />

<!-- Glyphicons Font Icons -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/fonts/glyphicons/css/glyphicons.css'/>" />

<link rel="stylesheet"
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
</head>
<body class="login" onload='document.f.j_username.focus();'>

	<!-- Main Container Fluid -->
	<div class="container-fluid">

		<!-- Content -->
		<div id="content">

			<!-- Top navbar (note: add class "navbar-hidden" to close the navbar by default) -->
			<div class="navbar main hidden-print">

		


			</div>
			<!-- Top navbar END -->
			<!-- Wrapper -->
			<div id="login">

				<div class="container">

					<div class="wrapper">






						

							<h1>Sorry an error occured, admin has been notified. Please click the home button</h1>
							<h2>${msg}</h2>


						
						<!-- // Box END -->

					</div>

				</div>

			</div>
			<!-- // Wrapper END -->
		</div>
		<!-- // Content END -->
		<!-- // Content END -->

		

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
		var primaryColor = '#4a8bc2', dangerColor = '#b55151', successColor = '#609450', warningColor = '#ab7a4b', inverseColor = '#45484d';
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