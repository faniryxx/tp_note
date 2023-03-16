package com.tp_note.tp_note;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbcClientDaoImpl{

	@Autowired
	private JdbcTemplate jdbcTemplate;


}
