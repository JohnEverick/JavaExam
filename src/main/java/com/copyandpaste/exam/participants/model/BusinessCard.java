package com.copyandpaste.exam.participants.model;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "businesscard")
public class BusinessCard {

	private Participant participant;
	@JacksonXmlProperty(localName = "entity")
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Entity> entities;

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	public List<Entity> getEntitiesByName(String name) {
		List<Entity> result = entities.stream().filter(entity -> entity.getName().getNameVal().contains(name))
				.collect(Collectors.toList());
		return result.stream().collect(Collectors.toList());
	}

	public boolean entityNameExists(String name) {
		List<Entity> result = entities.stream().filter(entity -> entity.getName().getNameVal().contentEquals(name))
				.collect(Collectors.toList());
		return !result.isEmpty();

	}

}
