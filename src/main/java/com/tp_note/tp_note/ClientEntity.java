package com.tp_note.tp_note;


public class ClientEntity {

    private Integer id;
    private String nom;
    private String prenom;
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
	public Integer getIdConseiller() {
		return this.id_conseiller;
	}

	/**
	 * @param id_conseiller the id_conseiller to set
	 */
	public void setIdConseiller(final Integer id_conseiller) {
		this.id_conseiller = id_conseiller;
	}

}