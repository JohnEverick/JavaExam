package com.copyandpaste.exam.participants;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessCards {
	@JacksonXmlElementWrapper(localName = "businesscard", useWrapping = false)
	private BusinessCard[] businessCard;
}
