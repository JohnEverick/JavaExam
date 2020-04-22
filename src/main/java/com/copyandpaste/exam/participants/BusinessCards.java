package com.copyandpaste.exam.participants;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BusinessCards {
	@JacksonXmlProperty(localName = "businesscard")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<BusinessCard> businessCards;

	public List<BusinessCard> getBusinessCards() {
		return businessCards;
	}

	public void setBusinessCards(List<BusinessCard> businessCards) {
		this.businessCards = businessCards;
	}

}
