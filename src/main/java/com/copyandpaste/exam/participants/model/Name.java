package com.copyandpaste.exam.participants.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "name")
public class Name {
	@JacksonXmlProperty(localName = "name", isAttribute = true)
	private String nameVal;
	@JacksonXmlProperty(isAttribute = true)
	private String language;

	public String getNameVal() {
		return nameVal;
	}

	public void setNameVal(String nameVal) {
		this.nameVal = nameVal;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
