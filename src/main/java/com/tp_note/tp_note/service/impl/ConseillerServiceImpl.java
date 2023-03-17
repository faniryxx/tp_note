package com.tp_note.tp_note.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.data.repository.ConseillerRepository;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;
import com.tp_note.tp_note.service.ConseillerService;

@Service
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	private ConseillerRepository conseillerRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public ConseillerDTO findClientsByConseillerId(Integer id) {
		ConseillerDTO conseiller = new ConseillerDTO(this.conseillerRepository.findById(id).get());
		List<Map<String, Object>> list = clientRepository.getClientsFromConseiller(id); //Réponse sql des clients d'un conseiller
		List<ClientDTO> clients = new ArrayList<>(); //Liste vide des clients du conseiller
		
		//On récupère les données des client pour les ajouter dans la listes
		for(Map<String, Object> map : list) {
			Object[] values = map.values().toArray();
			ClientDTO client = new ClientDTO();
			client.setId((Integer)values[0]);
			client.setNom((String)values[1]);
			client.setPrenom((String)values[2]);
			client.setId_conseiller((Integer)values[3]);
			clients.add(client);
		}
		
		conseiller.setClients(clients);
		return conseiller;
	}

	@Override
	public ClientDTO addClient(Integer idConseiller, ClientDTO client) {
		client.setId_conseiller(idConseiller);
		clientRepository.ajouterClient(client);
		return client;
	}

	@Override
	public ClientDTO updateClient(Integer idClient, Integer idConseiller, ClientDTO client) {
		client.setId_conseiller(idConseiller);
		client.setId(idClient);
		clientRepository.modifierClient(idClient, client);
		return client;
	}

	@Override
	public ConseillerDTO getById(Integer id) {
		
		return new ConseillerDTO(conseillerRepository.findById(id).get());
	}

}
