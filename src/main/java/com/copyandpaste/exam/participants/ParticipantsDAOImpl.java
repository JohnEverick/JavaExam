package com.copyandpaste.exam.participants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class ParticipantsDAOImpl implements ParticipantsDAO {

	@Override
	public BusinessCard getEntityById(int icd, String businessCode) throws JsonParseException, JsonMappingException, IOException {
		File dataSource = new File("src/main/java/com/copyandpaste/exam/datasets/directory-export-business-cards.xml");
		XmlMapper xmlMapper = new XmlMapper();
		List <BusinessCard> businessCards= (List<BusinessCard>) xmlMapper.readValue(dataSource, BusinessCard.class);
		System.out.println("test ->>" + businessCards.get(0).getBusinessCode());
		return null;
	}

}
