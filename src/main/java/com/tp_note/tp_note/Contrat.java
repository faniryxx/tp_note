package com.tp_note.tp_note;

public class Contrat {
	
	private int id_contrat;
	private String description;
	private String type_de_contrat;
	
	public Contrat(int id_contrat, String description, String type_de_contrat) {
		super();
		this.id_contrat = id_contrat;
		this.description = description;
		this.type_de_contrat = type_de_contrat;
	}
	
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
