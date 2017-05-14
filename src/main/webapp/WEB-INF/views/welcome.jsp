<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Kolekcja gier - Witaj!</title>
</head>
<body>
<section>
    <jsp:include page="header.jsp" />
    <div class="jumbotron" style="opacity: 0.8">
        <div class="container">
            <h1> ${greeting} </h1>
            <p> ${tagline} </p>
        </div>
    </div>
</section>
<div style="alignment: center">

</div>
<jsp:include page="footer.jsp" />
</body>
</html>
