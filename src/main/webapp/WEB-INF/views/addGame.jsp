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
		<div class="jumbotron">
			<div class="container">
				<h1>Gry</h1>
				<p>Dodaj gry</p>
			</div>
			<a href="<c:url value="/j_spring_security_logout" />" class="btn btn-danger btn-mini pull-right">wyloguj</a>	
		</div>
	</section>
	<section class="container">
		<form:form  modelAttribute="newGame" class="form-horizontal">
			<fieldset>
				<legend>Dodaj nową grę</legend>

				<div class="form-group">
					<label class="control-label col-lg-2 col-lg-2" for="gameId"><spring:message code="addGame.form.gameId.label"/></label>
					<div class="col-lg-10">
						<form:input id="gameId" path="gameId" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="name">Nazwa</label>
					<div class="col-lg-10">
						<form:input id="name" path="name" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="buyPrice">Cena</label>
					<div class="col-lg-10">
						<div class="form:input-prepend">
							<form:input id="buyPrice" path="buyPrice" type="text" class="form:input-large"/>
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description">Opis</label>
					<div class="col-lg-10">
						<form:textarea id="description" path="description" rows = "2"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="manufacturer">Producent</label>
					<div class="col-lg-10">
						<form:input id="manufacturer" path="manufacturer" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="status">Status</label>
					<div class="col-lg-10">
						<form:input id="status" path="status" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="playTime">Liczba godzin rozgrywki</label>
					<div class="col-lg-10">
						<form:input id="playTime" path="playTime" type="text" class="form:input-large"/>
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="status">Stan</label>
					<div class="col-lg-10">
						<form:radiobutton path="status" value="Status.NOWA" />Nowa
						<form:radiobutton path="status" value="Status.DO_SPRZEDANIA" />Do sprzedania
						<form:radiobutton path="status" value="Status.NIE_DO_SPREDANIA" />Nie na sprzedaż
					</div>
				</div>
				
				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnAdd" class="btn btn-primary" value ="Dodaj"/>
					</div>
				</div>
				
			</fieldset>
		</form:form>
	</section>
</body>
</html>
