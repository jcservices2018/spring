package com.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BaseDTO implements Serializable {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
