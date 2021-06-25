<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <link href="asset/css/team.css" rel="stylesheet">
    <link href="asset/css/footer.css" rel="stylesheet">
    <title>Hobby Results</title>

</head>
<body>
<h2>The friends who share your hobby of ${requestScope.hobby} are:</h2>

<jsp:include page="navbar.jsp" />

<c:forEach var="names" items="${requestScope.names}">
    ${names}
    <br/>
</c:forEach>

<div class="container">
    <div class="row">
        <c:forEach var="names" items="${requestScope.names}">
        <div class="col-12 col-sm-6 col-md-4 col-lg-3">
            <div class="our-team">
                <div class="picture">
                    <img class="img-fluid" src="asset/image/${names}.jpg">
                </div>
                <div class="team-content">
                    <h3 class="name">${names}</h3>
                    <h4 class="title">Hobby: ${requestScope.hobby}</h4>
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</div>

<jsp:include page="footer.jsp" />

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script>
</body>
</html>