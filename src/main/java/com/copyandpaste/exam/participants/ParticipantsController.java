package com.copyandpaste.exam.participants;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.copyandpaste.exam.participants.model.BusinessCard;
import com.copyandpaste.exam.participants.model.InfoOutDto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class ParticipantsController {
	@Autowired
	ParticipantsService participants;

	@PostMapping("/getById")
	@ResponseBody
	public BusinessCard getById(@RequestParam("icd") String icd, @RequestParam("businessCode") String businessCode)
			throws JsonParseException, JsonMappingException, IOException {
		BusinessCard result = participants.getById(icd, businessCode);
		return result;
	}

	@PostMapping("/searchByName")
	@ResponseBody
	public List<InfoOutDto> searchByName(@RequestParam("name") String name)
			throws JsonParseException, JsonMappingException, IOException {
		List<InfoOutDto> result = participants.searchByName(name);
		return result;
	}

	@PostMapping("/getByName")
	@ResponseBody
	public BusinessCard getByName(@RequestParam("name") String name)
			throws JsonParseException, JsonMappingException, IOException {
		BusinessCard result = participants.getByName(name);
		return result;
	}
}
