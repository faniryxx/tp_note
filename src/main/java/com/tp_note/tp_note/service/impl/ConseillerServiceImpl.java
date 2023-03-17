package com.tp_note.tp_note.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.data.repository.ConseillerRepository;
import com.tp_note.tp_note.model.dto.ClientDTO;
import com.tp_note.tp_note.model.dto.ConseillerDTO;
import com.tp_note.tp_note.service.ClientService;
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
		List<Map<String, Object>> list = clientRepository.getClientsFromConseiller(id);
		for(Map<String, Object> map : list) {
			for (Map.Entry<String, Object> pair : map.entrySet()) {
				String str = pair.getKey();
				Object ob = pair.getValue();
				System.out.println(str + " " + ob);
			}
			System.out.println("--------------");
		}
		//TODO: get all client by conseiller ID
		return null;//		this.clientRepository.getClientsFromConseiller(id);
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
