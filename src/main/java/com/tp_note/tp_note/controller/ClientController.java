package com.tp_note.tp_note.controller;

import ch.qos.logback.core.net.server.Client;
import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ConseillerEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients")
    public List listClients() {
        return clientRepository.listerClients();
    }

    @GetMapping("/clients/{client_id}/contrats")
    public List getContratsByClientId(@PathVariable(value = "client_id") Integer clientId) {
        return clientRepository.getContrats(clientId);
    }

    @GetMapping("/{client_id}/contrats/{contrat_id}")
    public List getContratDetails(@PathVariable(value = "client_id") Integer clientId,
                                  @PathVariable(value = "contrat_id") Integer contratId) {
        return clientRepository.findContratByIdAndContratId(clientId, contratId);
    }

    /*@PostMapping("/client")
    public ResponseEntity<ClientEntity> addClient(@RequestBody ClientEntity client) {
        this.clientRepository.
    }*/
}