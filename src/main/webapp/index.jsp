1<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MiniShop - TP Java EE</title>
    <style>
        body { max-width: 760px; margin: 3rem auto; padding: 0 1rem; font: 16px/1.6 system-ui, sans-serif; color: #172033; }
        h1 { color: #145a78; }
        li { margin: .55rem 0; }
        a { color: #075e91; }
        .note { padding: 1rem; background: #eef7fb; border-left: 4px solid #2381a6; }
    </style>
</head>
<body>
<h1>MiniShop - première application Java EE</h1>
<p class="note">Page d’accueil JSP avec JSTL. Choisis une route pour observer les servlets et les sessions.</p>
<ul>
    <li><a href="<c:url value='/probe' />">/probe - informations du conteneur</a></li>
    <li><a href="<c:url value='/danger' />">/danger - compteur partagé (non thread-safe)</a></li>
    <li><a href="<c:url value='/safe' />">/safe - compteur par session</a></li>
    <li><a href="<c:url value='/session' />">/session - attributs de session</a></li>
</ul>
</body>
</html>
