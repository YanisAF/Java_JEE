
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="people" type="java.util.ArrayList<com.example.demo.Person>" scope="request" />
<html>
<head>
    <title>Title</title>
    <%@include file="/WEB-INF/assets/bootstrapImports.html"%>
</head>
<body>

<main class="container">
    <h1>Liste des Personnes</h1>
    <hr>
    <table class="table table-dark text-center align-middle">
        <thead>
        <tr>
            <th>#</th>
            <th>Prenom</th>
            <th>Nom</th>
            <th>Age</th>
        </tr>
        </thead>
        <tbody>
        <% for (int i = 0; i < people.size(); i++) { %>
        <tr>
            <td><%= i+1 %></td>
            <td><%= people.get(i).getNom() %></td>
            <td><%= people.get(i).getPrenom() %></td>
            <td><%= people.get(i).getAge() %></td>
        </tr>
        <% } %>
        </tbody>

    </table>
</main>




</body>
</html>
