package com.tp_note.tp_note.controller;
import com.tp_note.tp_note.data.repository.ClientRepository;

import com.tp_note.tp_note.model.dto.ClientDTO;
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

    @GetMapping("/clients/{client_id}/contrats")
    public List getContratsByClientId(@PathVariable(value = "client_id") Integer clientId) {
        return clientService.getListeContrats(clientId);
    }

    @GetMapping("/clients/{client_id}/contrats/{contrat_id}")
    public List getContratDetails(@PathVariable(value = "client_id") Integer clientId,
                                  @PathVariable(value = "contrat_id") Integer contratId) {
        return clientService.getContratDetails(clientId, contratId);
    }

    @PostMapping("/client")
    public ResponseEntity<ClientDTO> ajouterClient(@RequestBody ClientDTO client) {
        this.clientService.ajouterClient(client);
        return ResponseEntity.status(HttpStatus.CREATED).body(client);
    }

    @DeleteMapping("/client/{client_id}")
    ResponseEntity.BodyBuilder supprimerCompte(@PathVariable("client_id") Integer clientId) {
        this.clientService.supprimerCompte(clientId);
        return ResponseEntity.status(HttpStatus.OK);
    }
}