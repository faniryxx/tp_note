package com.tp_note.tp_note.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;
import com.tp_note.tp_note.model.dto.ContratDTO;
import com.tp_note.tp_note.service.ConseillerService;



@RestController
@RequestMapping("/conseillers")
public class ConseillerController {

	@Autowired
    private ConseillerService conseillerService;
	
	/**
	 * Récupère les clients d'un conseiller
	 * @param conseillerId
	 * @return
	 */
    @GetMapping("/{conseiller_id}/clients")
    public ResponseEntity<ConseillerDTO> getClientsByConseillerId(@PathVariable(value = "conseiller_id") Integer conseillerId) {
    	ConseillerDTO dto = conseillerService.findClientsByConseillerId(conseillerId);
    	return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

    /**
     * Ajout d'un client à la base
     * @param conseillerId
     * @param client
     * @return
     */
    @PostMapping("/{conseiller_id}/clients")
    public ResponseEntity<ClientDTO> addClient(@PathVariable(value = "conseiller_id") Integer conseillerId, @RequestBody ClientDTO client) {
    	ClientDTO dto = conseillerService.addClient(conseillerId, client);
    	return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    /**
     * Modifie un client d'un conseiller
     * @param conseillerId : L'id du conseiller
     * @param clientId : L'id du client du conseiller
     * @param clientDetails : Le nouvelle valeur du client
     * @return
     */
    @PutMapping("/{conseiller_id}/clients/{client_id}")
    public ResponseEntity<ClientDTO> updateClient(@PathVariable(value = "conseiller_id") Integer conseillerId,
                               @PathVariable(value = "client_id") Integer clientId, @RequestBody ClientDTO clientDetails) {
    	ClientDTO dto = conseillerService.updateClient(clientId, conseillerId, clientDetails);
    	return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    
    /**
     * Suppression d'un client de la base MySQL
     * @param clientId
     * @return
     */
    @DeleteMapping("/client/{client_id}")
    ResponseEntity<String> deleteClient(@PathVariable("client_id") Integer clientId) {
        int rows = this.conseillerService.supprimerClient(clientId);
        if(rows > 0) {
            return ResponseEntity.ok("Client d'id " + clientId + " supprimé");
        }else {
            return ResponseEntity.noContent().build();
        }

    }
    
    /**
     * Ajouter un contrat à un client
     * @param contrat
     * @return
     */
    @PostMapping("/contrat")
    public ResponseEntity<ContratDTO> addContrat(@RequestBody ContratDTO contrat) {
    	ContratDTO dto = this.conseillerService.ajouterContrat(contrat);
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
    
    /**
     * Modification d'un contrat
     * @param clientId
     * @param contratId
     * @return
     */
    @PutMapping("/contrat/{contrat_id}/client/{client_id}")
    public ResponseEntity<ContratDTO> updateContrat(@PathVariable(value = "client_id") Integer clientId,
                                  @PathVariable(value = "contrat_id") Integer contratId,
                                     @RequestBody ContratDTO contrat) {
        ContratDTO dto = this.conseillerService.updateContratDetails(clientId, contratId, contrat);
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }

}

