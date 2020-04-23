package com.copyandpaste.exam.participants.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "entity")
public class Entity {
	@JacksonXmlProperty(isAttribute = true)
	private String countrycode;
	private Name name;
	private String geoinfo;
	private String website;
	private String additionalinfo;
	private Contact contact;

	@JacksonXmlProperty(localName = "regdate")
	private String regdate;

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getGeoinfo() {
		return geoinfo;
	}

	public void setGeoinfo(String geoinfo) {
		this.geoinfo = geoinfo;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAdditionalinfo() {
		return additionalinfo;
	}

	public void setAdditionalinfo(String additionalinfo) {
		this.additionalinfo = additionalinfo;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
