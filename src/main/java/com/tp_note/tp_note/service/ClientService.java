package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ContratEntity;

public interface ClientService {
	
	List<ContratEntity> findContractsByClientId(Long id);
	
	ContratEntity findContractByClientIdAndContractId(Long clientId, Long contractId);

}
