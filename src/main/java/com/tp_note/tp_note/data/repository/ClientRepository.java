package com.tp_note.tp_note.data.repository;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List listerClients(){
		String sql = "SELECT * FROM client;";
		return this.jdbcTemplate.queryForList(sql);
	}

	public List getContrats(Long clientId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}

	public List findContratByIdAndContratId(Long clientId, Long contratId) {
		String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+" AND id_contrat="+contratId.toString()+";";
		return this.jdbcTemplate.queryForList(sql);
	}
}
