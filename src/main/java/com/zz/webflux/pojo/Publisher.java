package com.zz.webflux.pojo;

import lombok.Data;

@Data
public class Publisher {

	private int pubId;
	private String address;
	private String name;
	
	public Publisher() {
		
	}

	public Publisher(int pubId, String address, String name) {
		super();
		this.pubId = pubId;
		this.address = address;
		this.name = name;
	}

	public int getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
		this.pubId = pubId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
