
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
    <%@include file="/WEB-INF/assets/bootstrapImports.html"%>
</head>
<body>



<main class="container">
    <h1 class="text-center">Ajouter un chien à la liste :</h1>
    <hr>
    <div class="col-8 offset-2 text-bg-dark p-3">
    <h1 class="text-center text-light">Liste de chien(s)</h1>
    <form action="${pageContext.request.contextPath}/dog/addlist" method="post">
        <div class="mb-3">
            <label for="name" class="form-label">Nom :</label>
            <input type="text" class="form-control mb-3" id="name" name="name" >
        </div>
        <div class="mb-3">
            <label for="race" class="form-label">Race :</label>
            <input type="text" class="form-control mb-3" id="race" name="race" >
        </div>
        <div class="mb-3">
            <label for="date_de_naissance" class="form-label">Date de naissance :</label>
            <input type="date" class="form-control mb-3 col-sm-3" id="date_de_naissance" name="dateOfBirth" >
        </div>
        <button class="btn btn-primary bg-dark text-light">Add</button>
    </form>
    </div>
</main>

</body>
</html>
