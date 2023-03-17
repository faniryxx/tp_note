package com.tp_note.tp_note.controller;
import com.tp_note.tp_note.data.repository.ClientRepository;

import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ContratDTO;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public List listClients() {
        return clientService.getListeClients();
    }

    /**
     * Liste des contrats d'un client
     * @param clientId
     * @return
     */
    @GetMapping("/clients/{client_id}/contrats")
    public List getContratsByClientId(@PathVariable(value = "client_id") Integer clientId) {
        return clientService.getListeContrats(clientId);
    }

    /**
     * Détails du contrat à l'ID contratId du client clientId
     * @param clientId
     * @param contratId
     * @return
     */
    @GetMapping("/clients/{client_id}/contrats/{contrat_id}")
    public List getContratDetails(@PathVariable(value = "client_id") Integer clientId,
                                  @PathVariable(value = "contrat_id") Integer contratId) {
        return clientService.getContratDetails(clientId, contratId);
    }

    /**
     * Ajout d'un client à la base MySQL
     * @param client
     * @return
     */
    @PostMapping("/client")
    public ResponseEntity<ClientDTO> ajouterClient(@RequestBody ClientDTO client) {
        this.clientService.ajouterClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

    /**
     * Suppression d'un client de la base MySQL
     * @param clientId
     * @return
     */
    @DeleteMapping("/client/{client_id}")
    ResponseEntity.BodyBuilder supprimerClient(@PathVariable("client_id") Integer clientId) {
        this.clientService.supprimerClient(clientId);
        return ResponseEntity.status(HttpStatus.OK);
    }

    /**
     * Modification des attributs d'un client
     * @param clientId
     * @param client
     * @return
     */
    @PostMapping("/client/{client_id}")
    ResponseEntity.BodyBuilder modifierClient(@PathVariable("client_id") Integer clientId,
                                              @RequestBody ClientDTO client) {
        this.clientService.modifierClient(clientId, client);
        return ResponseEntity.status(HttpStatus.OK);
    }

    @PostMapping("/clients/contrats")
    ResponseEntity.BodyBuilder ajouterContrat(@RequestBody ContratDTO contrat) {
        this.clientService.ajouterContrat(contrat);
        return ResponseEntity.status(HttpStatus.OK);
    }

}