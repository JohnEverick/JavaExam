package com.copyandpaste.exam.participants.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "contact")
public class Contact {
	@JacksonXmlProperty(isAttribute = true)
	private String email;
	@JacksonXmlProperty(isAttribute = true)
	private String name;
	@JacksonXmlProperty(isAttribute = true)
	private String phonenumber;
	@JacksonXmlProperty(isAttribute = true)
	private String type;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
