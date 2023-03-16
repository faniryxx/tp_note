# Framework Spring TP noté

Nous souhaitons créer API Rest avec Spring Boot pour une assurance :
Les clients de l’assurance et les conseillers.
Chaque client possède un ou plusieurs contrat et chaque contrat concerne un et un seul client
Chaque client est géré par un et un seul conseiller et un conseiller peut gérer plusieurs clients

Créer une API conseiller pour que :
Le conseiller affiche la liste de ses clients.
Ajouter /modifier/supprimer un client
Ajouter /modifier un contrat pour un client
Créer une API client pour que :
Le client affiche la liste de ses contrats.

Voici une suggestion d'endpoints pour votre API REST :
API conseiller :
Récupérer la liste de ses clients : GET /conseillers/{conseiller_id}/clients
Ajouter un client : POST /conseillers/{conseiller_id}/clients
Modifier un client : PUT /conseillers/{conseiller_id}/clients/{client_id}
API client :
Récupérer la liste de ses contrats : GET /clients/{client_id}/contrats
Afficher les détails d'un contrat : GET /clients/{client_id}/contrats/{contrat_id}
Notez que les paramètres {conseiller_id}, {client_id} et {contrat_id} représentent les
identifiants uniques du conseiller, du client et du contrat respectivement. Vous pouvez les
remplacer par les noms ou les numéros des identifiants que vous utilisez dans votre système.

Nous allons créer deux controller un pour le client et un pour le conseiller.
Utilisez une base de données (MySQL PAS H2)
La partie gérée par le conseiller sera effectuée en JPA
La partie gérée par le client sera effectuée en JDBC
Utiliser les aspects pour logger : les méthodes find*
Bonus
Traitez les erreurs Http @ExceptionHandler
Sécurisez l’application avec spring security