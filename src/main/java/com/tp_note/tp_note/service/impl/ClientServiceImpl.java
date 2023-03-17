package com.tp_note.tp_note.service.impl;
import java.util.List;

import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ContratDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List getListeClients() {
		return clientRepository.getListeClients();
	}

	@Override
	public List getListeContrats(Integer clientId) {
		return clientRepository.getListeContrats(clientId);
	}

	@Override
	public List getContratDetails(Integer clientId, Integer contratId) {
		return clientRepository.getContratDetails(clientId, contratId);
	}

	@Override
	public List getClientsFromConseiller(Integer conseillerId) {
		return clientRepository.getClientsFromConseiller(conseillerId);
	}

	@Override
	public void ajouterClient(ClientDTO client) {
		clientRepository.ajouterClient(client);
	}

	@Override
	public void supprimerClient(Integer clientId) {
		clientRepository.supprimerClient(clientId);
	}

	@Override
	public void modifierClient(Integer clientId, ClientDTO client) {
		clientRepository.modifierClient(clientId, client);
	}

	@Override
	public void ajouterContrat(ContratDTO contrat) {
		clientRepository.ajouterContrat(contrat);
	}
}
