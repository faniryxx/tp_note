package com.tp_note.tp_note;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENT")
public class ClientEntity implements Serializable {

	@Override
	public String toString() {
		return "ClientEntity [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_client")
	private Integer id;
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

}