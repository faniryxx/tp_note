package com.tp_note.tp_note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ConseillerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Conseiller findById(Long conseillerId) {
        String sql = "SELECT * FROM conseiller WHERE id_conseiller="+conseillerId.toString()+";";
        return this.jdbcTemplate.queryForObject(sql, Conseiller.class);
    }
}
