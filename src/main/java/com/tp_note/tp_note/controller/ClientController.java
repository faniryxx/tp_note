package com.tp_note.tp_note.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.service.ClientService;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

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