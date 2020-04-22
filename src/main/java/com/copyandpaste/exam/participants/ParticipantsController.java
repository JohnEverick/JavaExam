package com.copyandpaste.exam.participants;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class ParticipantsController {
	@Autowired
	ParticipantsDAO participants;

	@GetMapping("/getById")
	public BusinessCard getById(String icd, String businessCode) throws JsonParseException, JsonMappingException, IOException {
		BusinessCard result = participants.getById(icd, businessCode);
		return result;
	}
}
