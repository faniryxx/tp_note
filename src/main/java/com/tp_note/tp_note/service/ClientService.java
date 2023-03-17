package com.tp_note.tp_note.service;

import java.util.List;
import java.util.Map;

public interface ClientService {
	
	List<Map<String, Object>> getListeContrats(Integer clientId);
	List<Map<String, Object>> getContratDetails(Integer clientId, Integer contratId);
}
