package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ClientEntity;

public interface ConseillerService {
	
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
