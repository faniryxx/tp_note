package com.tp_note.tp_note.model.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
public class ContratDTO {

    @Override
    public String toString() {
        return "ContratEntity [id_contrat=" + id_contrat + ", description=" + description + ", type_de_contrat="
                + type_de_contrat + "]";
    }
    private static final long serialVersionUID = 1L;

    private int id_contrat;
    private String description;
    private String type_de_contrat;
    private Integer id_client;

    public int getId_contrat() {
        return id_contrat;
    }
    public void setId_contrat(int id_contrat) {
        this.id_contrat = id_contrat;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getType_de_contrat() {
        return type_de_contrat;
    }
    public void setType_de_contrat(String type_de_contrat) {
        this.type_de_contrat = type_de_contrat;
    }
    public Integer getId_client() {
        return id_client;
    }
    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }
}

