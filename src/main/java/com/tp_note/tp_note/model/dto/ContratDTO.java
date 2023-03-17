package com.tp_note.tp_note.model.dto;

import java.io.Serializable;

import com.tp_note.tp_note.data.Entity.ContratEntity;

public class ContratDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id_contrat;
    private String description;
    private String type_de_contrat;
    private Integer id_client;

    public ContratDTO() {
    	super();
    }
	public ContratDTO(final ContratEntity entity) {
		this.id_contrat = entity.getId_contrat();
		this.description = entity.getDescription();
		this.type_de_contrat = entity.getType_de_contrat();
		this.id_client = entity.getId_client();
	}
    public ContratEntity toEntity(){
    	ContratEntity contratEntity = new ContratEntity();
    	contratEntity.setId_contrat(id_contrat);
    	contratEntity.setDescription(description);
    	contratEntity.setType_de_contrat(type_de_contrat);
    	contratEntity.setId_client(id_client);
        return contratEntity;
    }
    public Integer getId_contrat() {
        return id_contrat;
    }
    public void setId_contrat(Integer id_contrat) {
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
    
	@Override
	public String toString() {
		return "ContratDTO [id_contrat=" + id_contrat + ", description=" + description + ", type_de_contrat="
				+ type_de_contrat + ", id_client=" + id_client + "]";
	}
    
}

