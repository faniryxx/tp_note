# Framework Spring TP noté

Groupe 5

Le fichier "API.postman_collection.json" à la racine du projet permet de lancer postman avec les différentes requêtes de l'API

### Endpoints client

- Lister les contrats d'un client: GET /client/{client_id}/contrats
- Lister les détails d'un contrat spécifique d'un client: GET /client/{client_id}/contrat/{contrat_id}

### Endpoints conseiller

- Lister les clients d'un conseiller : GET /conseillers/{conseiller_id}/clients
- Ajout d'un client à la base : POST /conseillers/{conseiller_id}/clients
- Modification d'un client d'un conseiller : PUT /conseillers/{conseiller_id}/clients/{client_id}
- Suppression d'un client de la base: DELETE /client/{client_id}
- Ajout d'un contrat : POST /conseillers/contrat
- Modification d'un contrat : PUT /conseillers/contrat/{contrat_id}/client/{client_id}
