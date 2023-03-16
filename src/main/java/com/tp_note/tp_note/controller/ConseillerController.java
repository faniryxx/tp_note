package com.tp_note.tp_note.controller;

import com.tp_note.tp_note.ConseillerEntity;
import com.tp_note.tp_note.ClientEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ConseillerEntity;
import com.tp_note.tp_note.data.repository.ConseillerRepository;



@RestController
@RequestMapping("/conseillers")
public class ConseillerController {

    /*@Autowired
    private ConseillerRepository conseillerRepository;

    @GetMapping("/{conseiller_id}/clients")
    public List<ClientEntity> getClientsByConseillerId(@PathVariable(value = "conseiller_id") Long conseillerId) {
        ConseillerEntity conseiller = conseillerRepository.findById(conseillerId);
                //.orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        return conseiller.getClients();
    }

    @PostMapping("/{conseiller_id}/clients")
    public ClientEntity addClient(@PathVariable(value = "conseiller_id") Long conseillerId, @RequestBody Client client) {
        ConseillerEntity conseiller = conseillerRepository.findById(conseillerId);
                //.orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        client.setConseiller(conseiller);
        return clientRepository.save(client);
    }

    @PutMapping("/{conseiller_id}/clients/{client_id}")
    public ClientEntity updateClient(@PathVariable(value = "conseiller_id") Long conseillerId,
                               @PathVariable(value = "client_id") Long clientId, @RequestBody ClientEntity clientDetails) {
        ConseillerEntity conseiller = conseillerRepository.findById(conseillerId);
                //.orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        ClientEntity client = clientRepository.findById(clientId);
                //.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        client.setNom(clientDetails.getNom());
        client.setPrenom(clientDetails.getPrenom());

        return clientRepository.save(client);
    }

    /*@DeleteMapping("/{conseiller_id}/clients/{client_id}")
    public ResponseEntity<?> deleteClient(@PathVariable(value = "conseiller_id") Long conseillerId,
                                           @PathVariable(value = "client_id") Long clientId) {
        Conseiller conseiller = conseillerRepository.findById(conseillerId);
                //.orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        Client client = clientRepository.findById(clientId);
                //.orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        clientRepository.delete(client);

        return ResponseEntity.ok().build();
    }*/
}

