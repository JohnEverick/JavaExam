package com.copyandpaste.exam.participants;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface ParticipantsDAO {
	public BusinessCard getById(String icd, String businessCode)
			throws JsonParseException, JsonMappingException, IOException;

//	public BusinessInfoDTO searchByName(String name) throws JsonParseException, JsonMappingException, IOException;
}
