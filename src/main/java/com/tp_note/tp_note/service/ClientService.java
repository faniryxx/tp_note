package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ContratEntity;

public interface ClientService {
	
	List getListeClients();
	List getListeContrats(Long clientId);
	List getContratDetails(Long cliendId, Long contratId);
	List getClientsFromConseiller(Long conseillerId);
}
