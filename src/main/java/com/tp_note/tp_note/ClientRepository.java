package com.tp_note.tp_note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;


}
