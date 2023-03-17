package com.tp_note.tp_note.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.service.ClientService;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

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
    ResponseEntity<String> supprimerClient(@PathVariable("client_id") Integer clientId) {
        int rows = this.clientService.supprimerClient(clientId);
        if(rows > 0) {
            return ResponseEntity.ok("Client d'id " + clientId + " supprimé");
        }else {
            return ResponseEntity.noContent().build();
        }

    }

    /**
     * Modification des attributs d'un client
     * @param clientId
     * @param client
     * @return
     */
    @PutMapping("/client/{client_id}")
    ClientDTO modifierClient(@PathVariable("client_id") Integer clientId,
                                              @RequestBody ClientDTO client) {
       
        return this.clientService.modifierClient(clientId, client);
    }
    
    /**
     * Liste des contrats d'un client
     * @param clientId
     * @return
     */
    @GetMapping("/client/{client_id}/contrats/")
    public List<Map<String, Object>> getContratsByClientId(@PathVariable(value = "client_id") Integer clientId) {
        return clientService.getListeContrats(clientId);
    }

    /**
     * Détails du contrat à l'ID contratId du client clientId
     * @param clientId
     * @param contratId
     * @return
     */
    @GetMapping("/client/{client_id}/contrat/{contrat_id}")
    public List<Map<String, Object>> getContratDetails(@PathVariable(value = "client_id") Integer clientId,
                                  @PathVariable(value = "contrat_id") Integer contratId) {
        return clientService.getContratDetails(clientId, contratId);
    }
}