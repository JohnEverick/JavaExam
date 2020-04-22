package com.copyandpaste.exam.participants;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "participant")
public class Participant {
	@JacksonXmlProperty(isAttribute = true)
	private String scheme;
	@JacksonXmlProperty(isAttribute = true)
	private String value;

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
