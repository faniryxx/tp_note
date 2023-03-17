package com.tp_note.tp_note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;
import com.tp_note.tp_note.service.ClientService;
import com.tp_note.tp_note.service.ConseillerService;



@RestController
@RequestMapping("/conseillers")
public class ConseillerController {

	@Autowired
    private ConseillerService conseillerService;

    @GetMapping("/{conseiller_id}")
    public ConseillerDTO getConseiller(@PathVariable(value = "conseiller_id") Integer conseillerId) {
        return conseillerService.getById(conseillerId);
    }
	
    @GetMapping("/{conseiller_id}/clients")
    public ConseillerDTO getClientsByConseillerId(@PathVariable(value = "conseiller_id") Integer conseillerId) {
        return conseillerService.findClientsByConseillerId(conseillerId);
    }

    @PostMapping("/{conseiller_id}/clients")
    public ClientDTO addClient(@PathVariable(value = "conseiller_id") Integer conseillerId, @RequestBody ClientDTO client) {
        return conseillerService.addClient(conseillerId, client);
    }

    /**
     * Modifie un client d'un conseiller
     * @param conseillerId : L'id du conseiller
     * @param clientId : L'id du client du conseiller
     * @param clientDetails : Le nouvelle valeur du client
     * @return
     */
    @PutMapping("/{conseiller_id}/clients/{client_id}")
    public ClientDTO updateClient(@PathVariable(value = "conseiller_id") Integer conseillerId,
                               @PathVariable(value = "client_id") Integer clientId, @RequestBody ClientDTO clientDetails) {
        return conseillerService.updateClient(clientId, conseillerId, clientDetails);
    }

   /* @DeleteMapping("/{conseiller_id}/clients/{client_id}")
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

