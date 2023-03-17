package com.tp_note.tp_note.service;

import java.util.List;
import java.util.Map;

import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;
import com.tp_note.tp_note.model.dto.ContratDTO;

public interface ConseillerService {
	
	ConseillerDTO getById(Integer id);
	
	/**
	 * Récupère la liste des clients d'un conseiller
	 * @param id : l'id du conseiller
	 * @return
	 */
	ConseillerDTO findClientsByConseillerId(Integer id);
	
	/**
	 * Sauvegarde un client dans la base associé à un id conseiller
	 */
	ClientDTO addClient(Integer idConseiller, ClientDTO client);
	/**
	 * Sauvegarde un client avec un id dans la base associé à un id conseiller
	 */
	ClientDTO updateClient(Integer idClient, Integer idConseiller, ClientDTO client);
	

	ContratDTO ajouterContrat(ContratDTO contrat);
	ContratDTO updateContratDetails(Integer clientId, Integer contratId, ContratDTO contrat);
}
