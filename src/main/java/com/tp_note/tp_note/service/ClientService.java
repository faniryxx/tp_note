package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.model.dto.ClientDTO;

public interface ClientService {
	
	List getListeClients();
	List getListeContrats(Integer clientId);
	List getContratDetails(Integer cliendId, Integer contratId);
	List getClientsFromConseiller(Integer conseillerId);
	void ajouterClient(ClientDTO client);
	void supprimerClient(Integer clientId);
	void modifierClient(Integer clientId, ClientDTO client);
}
