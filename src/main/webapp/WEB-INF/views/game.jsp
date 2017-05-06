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
				<h3>${game.name}</h3>
				<p>${game.description}</p>
				<p>
					<strong>Kod gry: </strong><span class="label label-warning">${game.gameId}</span>
				</p>
				<p>
					<strong>Producent</strong>: ${game.manufacturer}
				</p>
				<p>
					<strong>Status</strong>: ${game.status}
				</p>
				<h4>${game.buyPrice} PLN</h4>
				<p>
					<a href="<spring:url value="/games" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> wstecz
					</a>

				</p>

			</div>
		</div>
	</section>
</body>
</html>
