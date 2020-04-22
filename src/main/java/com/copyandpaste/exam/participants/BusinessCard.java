package com.copyandpaste.exam.participants;

import java.time.LocalDate;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessCard {
	@JacksonXmlProperty(localName = "id", isAttribute = true)
	private int icd;
	private String businessCode;
	private String businessName;
	private LocalDate regDate;
}
