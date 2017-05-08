<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Gry</title>
</head>
<body>
	<section>
		<jsp:include page="header.jsp" />
		<div class="jumbotron" style="opacity: 0.8">
			<div class="container">
				<a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">wyloguj</a>
				<h1>Gry</h1>
				<p>Dodaj gry</p>
			</div>
		</div>
	</section>
	<section class="container">
		<div style="width: 900px; background-color: antiquewhite;opacity: 0.8; font-size: medium;margin-left: 150px">
		<form:form  modelAttribute="newGame" class="form-horizontal" enctype="multipart/form-data">
			<fieldset>
				<legend style="margin-left: 250px">Dodaj nową grę</legend>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2 col-lg-2" for="gameId"><spring:message code="addGame.form.gameId.label"/></label>
					<div class="col-lg-10">
						<form:input id="gameId" path="gameId" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group"  style="margin-left: 50px">
					<label class="control-label col-lg-2" for="name">Nazwa: </label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="buyPrice">Cena zakupu: </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="buyPrice" path="buyPrice" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>
				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="shortDescription">Skrócony opis: </label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="shortDescription" path="shortDescription" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="description">Pełny opis: </label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="manufacturer">Producent: </label>
					<div class="col-lg-10">
						<form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="status">Status: </label>
					<div class="col-lg-10">
						<form:input id="status" path="status" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="playTime">Godziny rozgrywki: </label>
					<div class="col-lg-10">
						<form:input id="playTime" path="playTime" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group" style="margin-left: 50px">
					<label class="control-label col-lg-2" for="status">Stan</label>
					<div class="col-lg-10">
						<form:radiobutton path="status" value="Status.NOWA" />Nowa
						<form:radiobutton path="status" value="Status.DO_SPRZEDANIA" />Do sprzedania
						<form:radiobutton path="status" value="Status.NIE_DO_SPREDANIA" />Nie na sprzedaż
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="gameImage"> <spring:message
							code="addGame.form.gameImage.label" />
					</label>
					<div class="col-lg-10">
						<form:input id="gameImage" path="gameImage" type="file"
									class="form:input-large" />
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Dodaj"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
		</div>
	</section>
</body>
</html>
