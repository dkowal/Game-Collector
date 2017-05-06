<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Gry</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Gry</h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="<c:url value="/resources/images/${game.gameId}.jpg"></c:url>" alt="image"  style = "width:100%"/>
				<h3>${game.name}</h3>
				<p>${game.description}</p>
				<p>
					<strong>Producent</strong>: <span class="label label-warning">${game.manufacturer}</span>
				</p>
				<p>
					<strong>Status</strong>: ${game.status}
				</p>
				<p>
					<strong>Czas rozgrywki</strong>: ${game.playTime}
				</p>
				<p>
					<strong>Data premiery</strong>: ${game.dateOfPremiere}
				</p>
				<p>
					<strong>Data kupna</strong>: ${game.dateOfPurchase}
				</p>
				<p>
					<strong>Cena zakupu</strong>: ${game.buyPrice} PLN
				</p>

					<a href="<spring:url value="/games" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> wstecz
					</a>

				</p>

			</div>
		</div>
	</section>
</body>
</html>
