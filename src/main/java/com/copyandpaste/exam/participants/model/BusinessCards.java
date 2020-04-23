package com.copyandpaste.exam.participants.model;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BusinessCards {
	@JacksonXmlProperty(localName = "businesscard")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<BusinessCard> cards;

	public List<BusinessCard> getCards() {
		return cards;
	}

	public void setCards(List<BusinessCard> cards) {
		this.cards = cards;
	}
}
