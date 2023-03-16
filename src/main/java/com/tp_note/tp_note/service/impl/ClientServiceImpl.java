package com.tp_note.tp_note.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.service.ClientService;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	
	@Override
	public List<ContratEntity> findContractsByClientId(Long id) {
		ClientEntity entity = this.clientRepository.findById(id);
		//TODO: entity.getContracts()
		return null;
	}

	@Override
	public ContratEntity findContractByClientIdAndContractId(Long clientId, Long contractId) {
		
		return null;
	}

	


}
