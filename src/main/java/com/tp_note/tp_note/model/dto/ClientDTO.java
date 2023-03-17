package com.tp_note.tp_note.model.dto;

import java.io.Serializable;

import com.tp_note.tp_note.ClientEntity;

public class ClientDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

    private Integer id;
    private String nom;
    private String prenom;
    private Integer id_conseiller;

    public ClientDTO() {
        super();
    }
    public ClientDTO(final ClientEntity clientEntity) {
        this.id = clientEntity.getId();
        this.nom = clientEntity.getNom();
        this.prenom = clientEntity.getPrenom();
        this.id_conseiller = clientEntity.getId_conseiller();
    }

    public ClientEntity toEntity(){
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setId(id);
        clientEntity.setNom(nom);
        clientEntity.setPrenom(prenom);
        clientEntity.setId_conseiller(id_conseiller);
        return clientEntity;
    }

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

}