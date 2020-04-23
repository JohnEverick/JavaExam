package com.copyandpaste.exam.participants;

import java.io.IOException;
import java.util.List;

import com.copyandpaste.exam.participants.model.BusinessCard;
import com.copyandpaste.exam.participants.model.InfoOutDto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface ParticipantsService {
	public BusinessCard getById(String icd, String businessCode)
			throws JsonParseException, JsonMappingException, IOException;

	public List<InfoOutDto> searchByName(String name) throws JsonParseException, JsonMappingException, IOException;

	public BusinessCard getByName(String name) throws JsonParseException, JsonMappingException, IOException;
}
