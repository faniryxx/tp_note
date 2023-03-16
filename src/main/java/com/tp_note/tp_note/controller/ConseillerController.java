package com.tp_note.tp_note.controller;

import com.tp_note.tp_note.Conseiller;
import com.tp_note.tp_note.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conseillers")
public class ConseillerController {

    @Autowired
    private ConseillerRepository conseillerRepository;

    @GetMapping("/{conseiller_id}/clients")
    public List<Client> getClientsByConseillerId(@PathVariable(value = "conseiller_id") Long conseillerId) {
        Conseiller conseiller = conseillerRepository.findById(conseillerId)
                .orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        return conseiller.getClients();
    }

    @PostMapping("/{conseiller_id}/clients")
    public Client addClient(@PathVariable(value = "conseiller_id") Long conseillerId, @RequestBody Client client) {
        Conseiller conseiller = conseillerRepository.findById(conseillerId)
                .orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        client.setConseiller(conseiller);
        return clientRepository.save(client);
    }

    @PutMapping("/{conseiller_id}/clients/{client_id}")
    public Client updateClient(@PathVariable(value = "conseiller_id") Long conseillerId,
                               @PathVariable(value = "client_id") Long clientId, @RequestBody Client clientDetails) {
        Conseiller conseiller = conseillerRepository.findById(conseillerId)
                .orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        client.setNom(clientDetails.getNom());
        client.setPrenom(clientDetails.getPrenom());

        return clientRepository.save(client);
    }

    @DeleteMapping("/{conseiller_id}/clients/{client_id}")
    public ResponseEntity<?> deleteClient(@PathVariable(value = "conseiller_id") Long conseillerId,
                                           @PathVariable(value = "client_id") Long clientId) {
        Conseiller conseiller = conseillerRepository.findById(conseillerId)
                .orElseThrow(() -> new ResourceNotFoundException("Conseiller", "id", conseillerId));

        Client client = clientRepository.findById(clientId)
                .orElseThrow(() -> new ResourceNotFoundException("Client", "id", clientId));

        clientRepository.delete(client);

        return ResponseEntity.ok().build();
    }
}

