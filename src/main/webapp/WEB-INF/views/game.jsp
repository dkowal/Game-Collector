<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Gry</title>
</head>
<body>
<section>
    <jsp:include page="header.jsp"/>
    <div class="jumbotron" style="opacity: 0.8">
        <div class="container">
            <h1>Gry</h1>
        </div>
    </div>
</section>
<section class="container">
    <div class="row" style="width:900px; margin:0 auto;">
        <div class="col-sm-6 col-md-3" style="padding-bottom: 15px;" >
            <img src="<c:url value="/resources/images/${game.gameId}.jpg"></c:url>" alt="image"
                 style="width:900px;height: 570px;alignment: center"/>
            <div style="width: 900px; background-color: antiquewhite;opacity: 0.8; font-size: medium">
                <p align="center" style="font-style: italic">${game.description}</p>
                <p style="margin-left: 10px">
                    <strong>Producent</strong>: <span class="label label-warning">${game.manufacturer}</span>
                </p>
                <p style="margin-left: 10px">
                    <strong>Status</strong>: ${game.status}
                </p>
                <p style="margin-left: 10px">
                    <strong>Czas rozgrywki</strong>: ${game.playTime}
                </p>
                <p style="margin-left: 10px">
                    <strong>Data premiery</strong>: ${game.dateOfPremiere}
                </p>
                <p style="margin-left: 10px">
                    <strong>Data kupna</strong>: ${game.dateOfPurchase}
                </p>
                <p style="margin-left: 10px">
                    <strong>Cena zakupu</strong>: ${game.buyPrice} PLN
                </p>
                <p style="width: 200px;margin-left: 10px">
                    <a href="<spring:url value="/games" />" class="btn btn-default">
                        <span class="glyphicon-hand-left glyphicon"></span> wstecz
                    </a>
                </p>
            </div>
        </div>
    </div>
</section>
</body>
</html>
