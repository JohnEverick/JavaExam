package com.copyandpaste.exam.participants;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Component
public class ParticipantsDAOImpl implements ParticipantsDAO {

	@Override
	public BusinessCard getById(String icd, String businessCode)
			throws JsonParseException, JsonMappingException, IOException {
		List<BusinessCard> cards = getBusinessCardList().getCards();
		String id = icd + ":" + businessCode;

		Optional<BusinessCard> result = cards.stream()
				.filter(card -> card.getParticipant().getValue().contentEquals(id)).findFirst();

		return result.get();
	}

//	@Override
//	public BusinessInfoDTO searchByName(String name) throws JsonParseException, JsonMappingException, IOException {
//		List<Entity> entityList = getEntityList().getList().stream()
//				.filter(entity -> entity.getName().toString().contains(name)).collect(Collectors.toList());
//		List<BusinessInfoDTO> outDto = new ArrayList<>();
//		
//		entityList.stream().map(entity -> pushToDtoList(entity,outDto));
//		return entityList;
//	}

	private BusinessCards getBusinessCardList() throws JsonParseException, JsonMappingException, IOException {
		File dataSource = new File(
				"src/main/java/com/copyandpaste/exam/datasets/directory-export-business-cards-no-doc-types.xml");
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		BusinessCards businessCards = xmlMapper.readValue(dataSource, BusinessCards.class);

		return businessCards;
	}

	private Entities getEntityList() throws JsonParseException, JsonMappingException, IOException {
		File dataSource = new File(
				"src/main/java/com/copyandpaste/exam/datasets/directory-export-business-cards-no-doc-types.xml");
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		Entities entityLlist = xmlMapper.readValue(dataSource, Entities.class);

		return entityLlist;
	}

}
