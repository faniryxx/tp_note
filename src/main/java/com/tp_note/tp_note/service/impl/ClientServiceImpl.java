package com.tp_note.tp_note.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.jdbc.core.JdbcTemplate;

public class ClientServiceImpl implements ClientService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ClientRepository clientRepository;


	@Override
	public List getListeClients() {
		String sql = "SELECT * FROM client;";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getListeContrats(Long clientId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getContratDetails(Long clientId, Long contratId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+" AND id_contrat="+contratId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getClientsFromConseiller(Long conseillerId) {
		String sql = "SELECT * FROM client WHERE id_conseiller="+conseillerId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}
}
