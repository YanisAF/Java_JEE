
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dogs" type="java.util.ArrayList<com.example.demo.exercice5.model.Dog>" scope="request" />
<html>
<head>
    <title>Liste de chien</title>
    <%@include file="/WEB-INF/assets/bootstrapImports.html"%>
</head>
<body>

<h1 class="text-center">Ma liste de chiens</h1>

<main class="container">
    <% if (dogs.isEmpty()){ %>
    <p>Vous n'avez aucun chien dans votre list </p>
    <% } else { %>
    <table class="table table-dark text-center align-middle">
        <thead>
        <tr>
            <th>Id</th>
            <th>Nom</th>
            <th>Race</th>
            <th>Date de naissance</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < dogs.size(); i++) { %>
        <tr>
            <td><%= dogs.get(i).getId() %></td>
            <td><%= dogs.get(i).getName() %></td>
            <td><%= dogs.get(i).getRace() %></td>
            <td><%= dogs.get(i).getDateOfBirth() %></td>
        </tr>
        <% } %>
        </tbody>

    </table>

    <% }%>

</main>

</body>
</html>
