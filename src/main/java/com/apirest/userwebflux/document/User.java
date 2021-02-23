package com.apirest.userwebflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {
	
	public User(String id, String nomeCompleto) {
		super();
		this.id = id;
		this.nomeCompleto = nomeCompleto;
	}
	
	@Id
	private String id;
	private String nomeCompleto;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
}
