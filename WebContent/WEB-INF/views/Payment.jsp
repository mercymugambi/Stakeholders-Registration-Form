<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%><%@
taglib
	prefix="s" uri="http://www.springframework.org/tags"%><%@
taglib
	prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="front ie lt-ie9 lt-ie8 lt-ie7 fluid sticky-top"> <![endif]-->
<!--[if IE 7]>    <html class="front ie lt-ie9 lt-ie8 fluid sticky-top"> <![endif]-->
<!--[if IE 8]>    <html class="front ie lt-ie9 fluid sticky-top"> <![endif]-->
<!--[if gt IE 8]> <html class="front ie gt-ie8 fluid sticky-top"> <![endif]-->
<!--[if !IE]><!-->
<html class="front fluid sticky-top">
<!-- <![endif]-->
<head>

	<style>  
.errorblock {  
 color: #ff0000;  
 background-color: #ffEEEE;  
 border: 3px solid #ff0000;  
 padding: 8px;  
 margin: 16px;  
}  
</style>  
<title>AFA Registration</title>

<!-- Meta -->
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />

<!-- Bootstrap -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/css/bootstrap.css'/>" />
<link rel="shortcut icon" type="image/png"
	href="<c:url value="/resources/images/ASKSLEEK.jpg"/>">
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

<!-- Bootstrap Extended -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/extend/jasny-bootstrap/css/jasny-bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/extend/jasny-bootstrap/css/jasny-bootstrap-responsive.min.css'/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/extend/bootstrap-wysihtml5/css/bootstrap-wysihtml5-0.0.2.css'/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/extend/bootstrap-select/bootstrap-select.css" '/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/bootstrap/extend/bootstrap-toggle-buttons/static/stylesheets/bootstrap-toggle-buttons.css'/>" />

<!-- Select2 Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/forms/select2/select2.css" '/>" />

<!-- DateTimePicker Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/forms/bootstrap-datetimepicker/css/datetimepicker.css" '/>" />

<!-- JQueryUI -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/system/jquery-ui/css/smoothness/jquery-ui-1.9.2.custom.min.css" '/>" />

<!-- MiniColors ColorPicker Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/color/jquery-miniColors/jquery.miniColors.css" '/>" />

<!-- Notyfy Notifications Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/notifications/notyfy/jquery.notyfy.css" '/>" />
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/notifications/notyfy/themes/default.css" '/>" />

<!-- Gritter Notifications Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/notifications/Gritter/css/jquery.gritter.css'/>" />

<!-- Easy-pie Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/charts/easy-pie/jquery.easy-pie-chart.css'/>" />

<!-- Google Code Prettify Plugin -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/scripts/plugins/other/google-code-prettify/prettify.css" '/>" />

<!-- Main Theme Stylesheet :: CSS -->
<link rel="stylesheet" type="text/css" media="all"
	href="<s:url value='/resources/common/theme/css/style-default.css?1371698494" '/>" />
	
<script src='https://www.google.com/recaptcha/api.js'></script>

<!-- LESS.js Library -->
<script
	src="<c:url value="/resources/common/theme/scripts/plugins/system/less.min.js" />"></script>
</head>
<body>

	<!-- Main Container Fluid -->
	<div class="container-fluid">

		<!-- Content -->
		<div id="content">

	
			<!-- Top navbar END -->
			<div class="container-960 innerT">



				<div class="row-fluid">

					<div class="span8">
					
						<div class="widget widget-heading-simple widget-body-gray">
							<div class="widget-body">
								<div class="row-fluid">
									<div class="span12">
										<H4>AFA IMIS Partner Registration</H4>
										<c:if test="${not empty message}">
											<h5 class="strong text-uppercase">${message}</h5>

										</c:if>
									<%-- 	<c:if test="${empty message}"> --%>

											<c:if test="${empty fullUrl}">
												<sf:form method="post" action="/BriskAFA/register"
													commandName="accountForm">

													<div class="register">

													
														<label class="strong">First Name</label> 	<font color="red"> <sf:errors path="firstName"
																cssClass="error" /></font> 
																
																<font color="black">
														<sf:input id="firstName"  path="firstName" type="text"
															class="input-block-level" placeholder="First Name" />
															</font>
													
																
																
																<label class="strong">Surname</label><font color="red"> <sf:errors path="surname"
																cssClass="error" /></font> 
														<sf:input id="surname" path="surname" type="text"
															class="input-block-level" placeholder="surname" />
														
																
																<label class="strong">Othernames</label> 	<font color="red"> <sf:errors path="otherNames"
																cssClass="error" /></font> 
														<sf:input id="otherNames" path="otherNames" type="text"
															class="input-block-level" placeholder="Othernames" />
													
																
																<label class="strong">National
															ID NO</label> 	<font color="red"> <sf:errors path="idNumber"
																cssClass="error" /></font>
														<sf:input id="idNumber" path="idNumber" type="number"
															class="input-block-level" placeholder="national ID NO" />
													

														<label class="strong">Mobile Phone No<font
															color="red"></font></label>
														<sf:input id="phoneNumber" path="phoneNumber" type="telephone"
															class="input" placeholder="0712345678" />
															
														<font color="red"><sf:errors path="phoneNumber"
																cssClass="error" /></font> </br> 
																
																<label class="strong">Email</label>
														<sf:input path="email" type="text"
															class="input-block-level"
															placeholder="Your Valid Email Address" />
														<font color="red"> <sf:errors path="email"
																cssClass="error" /></font> 
												       <label class="strong">Company
															Name</label>
														<sf:input id="companyName" path="companyName" type="text"
															class="input-block-level" placeholder="company Name" />
														<font color="red"> <sf:errors path="companyName"
																cssClass="error" /></font> <label class="strong">Company
															PIN</label>
														<sf:input id="tAXPIN" path="tAXPIN" type="text"
															class="input-block-level" placeholder="KRA PIN" />
														<font color="red"> <sf:errors path="tAXPIN"
																cssClass="error" /></font> <label class="strong">Company
															Registration No</label>
														<sf:input id="companyRegNumber"
															path="companyRegNumber" type="text"
															class="input-block-level"
															placeholder="Company Registration NO" />
														<font color="red"> <sf:errors
																path="companyRegNumber" cssClass="error" /></font> <label
															class="strong">Company Email</label>
														<sf:input path="companyEmail" type="text"
															class="input-block-level"
															placeholder="Company Valid Email Address" />
														<font color="red"> <sf:errors path="companyEmail"
																cssClass="error" /></font> <label class="strong">Postal
															Address</label>
														<sf:input path="postalAddress" type="text"
															class="input-block-level" placeholder="Postal Address" />
														<font color="red"> <sf:errors path="postalAddress"
																cssClass="error" /></font> <label class="strong">County</label>
														<sf:input path="county" type="text"
															class="input-block-level" placeholder="County" />
														<font color="red"> <sf:errors path="county"
																cssClass="error" /></font> <label class="strong">Sub
															County</label>
														<sf:input path="subCounty" type="text"
															class="input-block-level" placeholder="Sub County" />
														<font color="red"> <sf:errors path="subCounty"
																cssClass="error" /></font> <label class="strong">Town/City</label>
														<sf:input path="town" type="text"
															class="input-block-level" placeholder="Town/ City" />
														<font color="red"> <sf:errors path="town"
																cssClass="error" /></font>


<div class="g-recaptcha" data-sitekey="6LfFwpkUAAAAAP5ziCkmMum9c8L_naD_F085nHq0"></div>


														<%-- <label class="strong">Amount</label>
														<sf:input path="ttl" type="ttl" class="register-input"
															placeholder="amount" /> --%>
														</br> </br> <input type="submit" value="Submit Form"
															class="register-button">
													</div>
												</sf:form>
											</c:if>
											


									<%-- 	</c:if> --%>
										<c:if test="${not empty message}">
											<h5 class="strong text-uppercase">${message}</h5>
										</c:if>

									</div>
								</div>
							</div>
						</div>



					</div>
				</div>
			</div>
		</div>
		<!-- // Content END -->

<%-- 		<jsp:include page="footer.jsp" /> --%>
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