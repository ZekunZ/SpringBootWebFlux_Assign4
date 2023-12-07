package com.zz.webflux.pojo;

import lombok.Data;

@Data
public class Member {

	private int memberId;
	private String name;
	private String address;
	private String memberType;
	private String memberDate;
	private String expiryDate;
	
	public Member() {
	
	}

	public Member(int memberId, String name, String address, String memberType, String memberDate, String expiryDate) {
		super();
		this.memberId = memberId;
		this.name = name;
		this.address = address;
		this.memberType = memberType;
		this.memberDate = memberDate;
		this.expiryDate = expiryDate;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getMemberDate() {
		return memberDate;
	}

	public void setMemberDate(String memberDate) {
		this.memberDate = memberDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
