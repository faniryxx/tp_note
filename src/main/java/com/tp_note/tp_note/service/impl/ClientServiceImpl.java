package com.tp_note.tp_note.service.impl;
import java.util.List;
import com.tp_note.tp_note.model.dto.ClientDTO;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Override
	public void ajouterClient(ClientDTO client) {
		jdbcTemplate.update(
				"INSERT INTO spring.client " +
						"(nom, prenom, id_conseiller) " +
						"VALUES (?, ?, ?)",
				client.getNom(), client.getPrenom(), client.getId_conseiller().toString()
		);
	}

	@Override
	public void supprimerClient(Integer clientId) {
		jdbcTemplate.update(
				"DELETE FROM spring.client "+
				"WHERE id_client=(?);",
				clientId
		);
	}
}
