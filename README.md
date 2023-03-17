# Framework Spring TP noté

Groupe 5

### Endpoints client

- Lister les clients: GET /clients
- Lister les contrats d'un client: GET /clients/{client_id}/contrats
- Lister les détails d'un contrat spécifique d'un client: GET /clients/{client_id}/contrats/{contrat__id}
- Ajout d'un client à la base MySQL: POST /client
- Suppression d'un client de la base: DELETE /client/{client_id}
- Modification des attributs d'un client: POST /client/{client_id}