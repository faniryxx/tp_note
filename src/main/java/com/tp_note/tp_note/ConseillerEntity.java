package com.tp_note.tp_note;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CONSEILLER")
public class ConseillerEntity implements Serializable {
	
	@Override
	public String toString() {
		return "ConseillerEntity [id_conseiller=" + id_conseiller + ", nom=" + nom + ", prenom=" + prenom
				+ ", id_client=" + id_client + "]";
	}
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_conseiller")
	private int id_conseiller;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	@Column(name = "id_client")
	private int id_client;

	
	public int getId_conseiller() {
		return id_conseiller;
	}
	public void setId_conseiller(int id_conseiller) {
		this.id_conseiller = id_conseiller;
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
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
}
