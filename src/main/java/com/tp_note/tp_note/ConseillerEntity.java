package com.tp_note.tp_note;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CONSEILLER")
public class ConseillerEntity implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_conseiller")
	private Integer idConseiller;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;

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

	@Override
	public String toString() {
		return "ConseillerEntity [idConseiller=" + idConseiller + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	

}
