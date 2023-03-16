package com.tp_note.tp_note.data.repository;

import com.tp_note.tp_note.ClientEntity;
import com.tp_note.tp_note.ContratEntity;
import com.tp_note.tp_note.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

	/*
	public List getClientsFromConseiller(Integer conseillerId) {
		return clientService.getClientsFromConseiller(conseillerId);
	}*/
}
