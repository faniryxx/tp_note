package com.tp_note.tp_note.data.Entity;

import javax.persistence.*;

@Entity
@Table(name = "CLIENT")
public class ClientEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_client")
    private Integer id;
    @Column(name="nom")
    private String nom;
    @Column(name="prenom")
    private String prenom;
    @Column(name="id_conseiller")
    private Integer id_conseiller;
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

	/**
	 * @return the id_conseiller
	 */
    public Integer getId_conseiller() {
        return id_conseiller;
    }

    public void setId_conseiller(Integer id_conseiller) {
        this.id_conseiller = id_conseiller;
    }
    
    @Override
	public String toString() {
		return "ClientEntity [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", id_conseiller=" + id_conseiller
				+ "]";
	}

}