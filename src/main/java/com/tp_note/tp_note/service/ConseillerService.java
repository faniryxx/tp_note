package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ConseillerEntity;
import com.tp_note.tp_note.model.dto.ConseillerDTO;

public interface ConseillerService {
	
	ConseillerDTO getById(Integer id);
	
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
