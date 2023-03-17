package com.tp_note.tp_note.data.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tp_note.tp_note.model.dto.ClientDTO;

@Repository
public class ClientRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Lister tous les clients de la base
     * @return
     */
    public List<Map<String, Object>> getListeClients() {
        String sql = "SELECT * FROM client;";
        return this.jdbcTemplate.queryForList(sql);
    }

    /**
     * Lister les contrats associés au clientId
     * @param clientId
     * @return
     */
    public List<Map<String, Object>> getListeContrats(Integer clientId) {
        String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+";";
        return this.jdbcTemplate.queryForList(sql);
    }

    /**
     * Détails du contrat à l'ID contratId du client clientId
     * @param clientId
     * @param contratId
     * @return
     */
    public List<Map<String, Object>> getContratDetails(Integer clientId, Integer contratId) {
        String sql = "SELECT * FROM contrat WHERE id_client="+clientId.toString()+" AND id_contrat="+contratId.toString()+";";
        return this.jdbcTemplate.queryForList(sql);
    }

    /**
     * Lister tous les clients associés au conseillerId
     * @param conseillerId
     * @return
     */
    public List<Map<String, Object>> getClientsFromConseiller(Integer conseillerId) {
        String sql = "SELECT * FROM client WHERE id_conseiller="+conseillerId.toString()+";";
        return this.jdbcTemplate.queryForList(sql);
    }

    /**
     * Ajout d'un client à la base MySQL
     * @param client
     */
    public void ajouterClient(ClientDTO client) {
        jdbcTemplate.update(
                "INSERT INTO spring.client " +
                        "(nom, prenom, id_conseiller) " +
                        "VALUES (?, ?, ?)",
                client.getNom(), client.getPrenom(), client.getId_conseiller().toString()
        );
    }

    /**
     * Suppression d'un client de la base MySQL
     * @param clientId
     */
    public Integer supprimerClient(Integer clientId) {
        return jdbcTemplate.update(
                "DELETE FROM spring.client "+
                        "WHERE id_client=(?);",
                clientId
        );
    }

    /**
     * Modification des attributs d'un client
     * @param clientId
     * @param client
     */
    public void modifierClient(Integer clientId, ClientDTO client) {
        jdbcTemplate.update(
                "UPDATE spring.client " +
                        "SET nom=(?), prenom=(?), id_conseiller=(?) " +
                        "WHERE id_client=(?); ",
                client.getNom(), client.getPrenom(), client.getId_conseiller(), clientId
        );
    }
}
