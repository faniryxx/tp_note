package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ConseillerEntity;

public interface ConseillerService {
	
	ConseillerEntity getById(Integer id);
	
	/**
	 * Récupère la liste des clients d'un conseiller
	 * @param id : l'id du conseiller
	 * @return
	 */
	List<ClientEntity> findClientsByConseillerId(Integer id);
	
	/**
	 * Sauvegarde un client dans la base 
	 */
	ClientEntity save(ClientEntity client);
}
