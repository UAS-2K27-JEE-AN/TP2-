<<<<<<< HEAD
# MiniShop - TP 1 Java EE

Projet Maven WAR pour Java 17+, Jakarta Servlet 6 et Tomcat 10.1. Les routes sont enregistrées avec `@WebServlet`.

## Routes

- `/probe` : affiche le thread de traitement et l'instance de la servlet.
- `/danger` : compteur partagé volontairement non thread-safe pour observer la concurrence.
- `/safe` : compteur stocké dans la session HTTP de chaque navigateur.
- `/session` : affiche l'identifiant et les attributs de session.
- `/` : page JSP d'accueil avec les liens aux démonstrations.

## Construction et exécution

Dans IntelliJ, ouvre ce dossier comme projet Maven et lance `Lifecycle > package`. Le fichier produit est `target/minishop-1.0-SNAPSHOT.war`. Déploie-le dans `webapps` de Tomcat 10.1, démarre Tomcat, puis visite `http://localhost:8080/minishop-1.0-SNAPSHOT/`.

La dépendance Servlet a le scope `provided` car Tomcat 10.1 fournit l'API à l'exécution. Le compteur de `/danger` est intentionnellement partagé et non synchronisé pour illustrer le problème traité par le TP.
=======
# TP2-
>>>>>>> 9847d6ac552ec70e9bf8ee8a13961aa22e34f443
