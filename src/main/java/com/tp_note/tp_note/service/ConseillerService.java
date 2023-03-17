package com.tp_note.tp_note.service;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;

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
}
