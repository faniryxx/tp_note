package com.tp_note.tp_note.service.impl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Map<String, Object>> getListeClients() {
		return clientRepository.getListeClients();
	}

	@Override
	public List<Map<String, Object>> getClientsFromConseiller(Integer conseillerId) {
		return clientRepository.getClientsFromConseiller(conseillerId);
	}

	@Override
	public ClientDTO ajouterClient(ClientDTO client) {
		clientRepository.ajouterClient(client);
		return client;
	}

	@Override
	public Integer supprimerClient(Integer clientId) {
		return clientRepository.supprimerClient(clientId);
	}

	@Override
	public ClientDTO modifierClient(Integer clientId, ClientDTO client) {
		clientRepository.modifierClient(clientId, client);
		client.setId(clientId);
		return client;
	}
	
	@Override
	public List<Map<String, Object>> getListeContrats(Integer clientId) {
		return clientRepository.getListeContrats(clientId);
	}

	@Override
	public List<Map<String, Object>> getContratDetails(Integer clientId, Integer contratId) {
		return clientRepository.getContratDetails(clientId, contratId);
	}

}
