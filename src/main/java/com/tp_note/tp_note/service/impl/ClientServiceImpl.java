package com.tp_note.tp_note.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.data.repository.ClientRepository;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List getListeClients() {
		String sql = "SELECT * FROM client;";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getListeContrats(Integer clientId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getContratDetails(Integer clientId, Integer contratId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+" AND id_contrat="+contratId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}

	@Override
	public List getClientsFromConseiller(Integer conseillerId) {
		String sql = "SELECT * FROM client WHERE id_conseiller="+conseillerId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}
}
