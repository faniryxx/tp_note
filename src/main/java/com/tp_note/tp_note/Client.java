package com.tp_note.tp_note;

public class Client {
	
	private int id_client;
	private String nom;
	private String prenom;
	private int id_contrat;
	
	public Client(int id_client, String nom, String prenom, int id_contrat) {
		super();
		this.id_client = id_client;
		this.nom = nom;
		this.prenom = prenom;
		this.id_contrat = id_contrat;
	}
	
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
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
	public int getId_contrat() {
		return id_contrat;
	}
	public void setId_contrat(int id_contrat) {
		this.id_contrat = id_contrat;
	}
}
