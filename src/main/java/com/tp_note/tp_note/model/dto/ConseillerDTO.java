package com.tp_note.tp_note.model.dto;

import java.io.Serializable;
import java.util.List;

import com.tp_note.tp_note.data.Entity.ConseillerEntity;


public class ConseillerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer idConseiller;

	private String nom;

	private String prenom;
	
	private List<ClientDTO> clients;

	public ConseillerDTO() {
		super();
	}
	
	public ConseillerDTO(final ConseillerEntity entity) {
		this.idConseiller = entity.getIdConseiller();
		this.nom = entity.getNom();
		this.prenom = entity.getPrenom();
	}

	public ConseillerEntity toEntity(){
		ConseillerEntity entity = new ConseillerEntity();
		entity.setIdConseiller(this.idConseiller);
		entity.setNom(this.nom);
		entity.setPrenom(this.prenom);
		return entity;
	}

	public Integer getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(Integer idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<ClientDTO> getClients() {
		return clients;
	}

	public void setClients(List<ClientDTO> clients) {
		this.clients = clients;
	}
	
}
