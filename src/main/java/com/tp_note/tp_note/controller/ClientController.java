package com.tp_note.tp_note.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;

@RestController
@RequestMapping("/clients")

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/{client_id}/contrats")
    public List<ContratEntity> getContratsByClientId(@PathVariable(value = "client_id") Long clientId) {
        ClientEntity client = clientRepository.findById(clientId);
                //.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        return client.getContrats();
    }

    @GetMapping("/{client_id}/contrats/{contrat_id}")
    public ContratEntity getContratByIdAndClientId(@PathVariable(value = "client_id") Long clientId,
                                              @PathVariable(value = "contrat_id") Long contratId) {
        return clientRepository.findByIdAndContratId(clientId, contratId);
                //.orElseThrow(() -> new ResourceNotFoundException("Contrat", "id", contratId));
    }
}