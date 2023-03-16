package com.tp_note.tp_note.controller;

import com.tp_note.tp_note.Client;
import com.tp_note.tp_note.Conseiller;
import com.tp_note.tp_note.ClientRepository;
import com.tp_note.tp_note.Contrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/{client_id}/contrats")
    public List<Contrat> getContratsByClientId(@PathVariable(value = "client_id") Long clientId) {
        Client client = clientRepository.findById(clientId);
                //.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        return client.getContrats();
    }

    @GetMapping("/{client_id}/contrats/{contrat_id}")
    public Contrat getContratByIdAndClientId(@PathVariable(value = "client_id") Long clientId,
                                              @PathVariable(value = "contrat_id") Long contratId) {
        return clientRepository.findByIdAndContratId(clientId, contratId);
                //.orElseThrow(() -> new ResourceNotFoundException("Contrat", "id", contratId));
    }
}