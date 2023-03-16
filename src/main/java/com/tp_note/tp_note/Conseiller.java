package com.tp_note.tp_note;

public class Conseiller {
	
	private int id_conseiller;
	private String nom;
	private String prenom;
	private int id_client;
	
	public Conseiller(int id_conseiller, String nom, String prenom, int id_client) {
		super();
		this.id_conseiller = id_conseiller;
		this.nom = nom;
		this.prenom = prenom;
		this.id_client = id_client;
	}

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
