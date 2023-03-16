package com.tp_note.tp_note.service;

import java.util.List;

import com.tp_note.tp_note.ClientEntity;

public interface ConseillerService {
	
	List<ClientEntity> findByConseillerId(Integer id);
	
	ClientEntity save(ClientEntity client);
}
