package com.copyandpaste.exam.participants;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Entities {
	@JacksonXmlProperty(localName = "entity")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Entity> list;

	public List<Entity> getList() {
		return list;
	}

	public void setList(List<Entity> list) {
		this.list = list;
	}

}
