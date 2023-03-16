package com.tp_note.tp_note.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ConseillerEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.data.repository.ConseillerRepository;
import com.tp_note.tp_note.service.ConseillerService;

@Service
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	private ConseillerRepository conseillerRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public List<ClientEntity> findClientsByConseillerId(Integer id) {
		return null;//this.clientRepository.getClientsFromConseiller(id);
	}

	@Override
	public ClientEntity save(ClientEntity client) {
		return null;//clientRepository.save(client);
	}

	@Override
	public ConseillerEntity getById(Integer id) {
		System.out.println("SERVICE");
		return conseillerRepository.getReferenceById(id);
	}

}
