package com.tp_note.tp_note;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CONTRAT")
public class ContratEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_contrat")
	private int id_contrat;
	@Column(name = "description")
	private String description;
	@Column(name = "type_de_contrat")
	private String type_de_contrat;
	
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

}
