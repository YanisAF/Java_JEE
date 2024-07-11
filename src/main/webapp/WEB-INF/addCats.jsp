
<jsp:useBean id="cats" type="java.util.ArrayList<com.example.demo.Cat>" scope="request" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulaire</title>
    <%@include file="/WEB-INF/assets/bootstrapImports.html"%>
</head>
<body>


<main class="container">
    <h1>Liste de chat</h1>
    <hr>

    <% if (cats.isEmpty()){ %>
    <p>Vous n'avez aucun chat dans votre list </p>
    <% } else { %>
    <table class="table table-dark text-center align-middle">
        <thead>
        <tr>
            <th>#</th>
            <th>Nom</th>
            <th>Race</th>
            <th>Repas favoris</th>
            <th>Date de naissance</th>
        </tr>
        </thead>
        <tbody>

        <% for (int i = 0; i < cats.size(); i++) { %>
        <tr>
            <td><%= i+1 %></td>
            <td><%= cats.get(i).getName() %></td>
            <td><%= cats.get(i).getRace() %></td>
            <td><%= cats.get(i).getFavouriteFood() %></td>
            <td><%= cats.get(i).getBirthDate() %></td>
        </tr>
        <% } %>
        </tbody>

    </table>

    <% }%>

<form action="cats" method="post">
    <div>
        <label for="name">Nom :</label>
        <input type="text" id="name" name="name" >
    </div>
    <div>
        <label for="race">Race :</label>
        <input type="text" id="race" name="race" >
    </div>
    <div>
        <label for="favouritefood">Repas favoris :</label>
        <input type="text" id="favouritefood" name="favfood" >
    </div>
    <div>
        <label for="date_de_naissance">Date de naissance :</label>
        <input type="date" id="date_de_naissance" name="date_de_naissance" >
    </div>
    <button>Ajouter</button>
</form>


</main>
</body>
</html>
