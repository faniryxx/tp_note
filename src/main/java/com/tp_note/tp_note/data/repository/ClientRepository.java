package com.tp_note.tp_note.data.repository;

import com.tp_note.tp_note.ClientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tp_note.tp_note.ClientEntity;

import java.util.List;


@Repository
public class ClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	public ClientEntity findById(Long clientId){
		String sql = "SELECT * FROM client WHERE id_client="+clientId.toString()+";";
		return this.jdbcTemplate.queryForObject(sql, ClientEntity.class);
	}

	public List listerClients(){
		String sql = "SELECT * FROM client;";
		return this.jdbcTemplate.queryForList(sql);
	}
}
