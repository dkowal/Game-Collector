<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Gry</title>
</head>
<body>
	<section>
		<jsp:include page="header.jsp" />
		<div class="jumbotron" style="opacity: 0.8">
			<div class="container">
				<h1>Gry</h1>
				<p>Wszystkie gry, które posiadam</p>
			</div>
		</div>
	</section>

	<section class="container">
		<div class="row" >
			<c:forEach items="${games}" var="game">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<%-- <img src="<c:url value="/resources/images/${game.gameId}.jpg"></c:url>" alt="image"  style = "width:100%"/> --%>
						<div class="caption">
							<h3>${game.name}</h3>
							<p>${game.shortDescription}</p>
							<p>${game.buyPrice} PLN</p>
							<p>Status: ${game.status}</p>
<!--  							<p>
								<a
									href=" <spring:url value="/games/game?id=${game.gameId}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Szczegóły
								</a>
							</p>-->
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
