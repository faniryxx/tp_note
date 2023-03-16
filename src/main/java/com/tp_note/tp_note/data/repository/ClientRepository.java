package com.tp_note.tp_note.data.repository;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ClientService clientService;

	public List listerClients(){
		return clientService.getListeClients();
	}

	public List getContrats(Integer clientId) {
		return clientService.getListeContrats(clientId);
	}

	public List findContratByIdAndContratId(Integer clientId, Integer contratId) {
		return clientService.getContratDetails(clientId, contratId);
	}

	public List getClientsFromConseiller(Integer conseillerId) {
		return clientService.getClientsFromConseiller(conseillerId);
	}
}
