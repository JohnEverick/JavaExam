package com.copyandpaste.exam.participants;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface ParticipantsDAO {
	public BusinessCard getEntityById(int icd, String businessCode) throws JsonParseException, JsonMappingException, IOException;
}
