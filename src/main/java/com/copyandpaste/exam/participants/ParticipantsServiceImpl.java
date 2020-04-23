package com.copyandpaste.exam.participants;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.copyandpaste.exam.participants.model.BusinessCard;
import com.copyandpaste.exam.participants.model.BusinessCards;
import com.copyandpaste.exam.participants.model.InfoOutDto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Service
public class ParticipantsServiceImpl implements ParticipantsService {

	@Override
	public BusinessCard getById(String icd, String businessCode)
			throws JsonParseException, JsonMappingException, IOException {
		List<BusinessCard> cards = getBusinessCardList().getCards();
		Optional<BusinessCard> resultCard = cards.stream()
				.filter(card -> card.getParticipant().getValue().contains(icd + ":" + businessCode)).findFirst();

		BusinessCard result = new BusinessCard();
		if (resultCard.isPresent()) {
			result = resultCard.get();
		}

		return result;
	}

	@Override
	public List<InfoOutDto> searchByName(String name) throws JsonParseException, JsonMappingException, IOException {
		List<BusinessCard> cards = getBusinessCardList().getCards();
		List<InfoOutDto> result = new ArrayList<>();
		cards.stream().forEach(card -> {
			InfoOutDto dto = new InfoOutDto();
			card.getEntitiesByName(name).stream().forEach(entity -> {
				dto.setName(entity.getName().getNameVal());
				dto.setCountryCode(entity.getCountrycode());
				dto.setEnterpriseNumber(card.getParticipant().getValue().split(":")[1]);
				result.add(dto);
			});
		});
		return result.stream().distinct().collect(Collectors.toList());
	}

	@Override
	public BusinessCard getByName(String name) throws JsonParseException, JsonMappingException, IOException {
		List<BusinessCard> cards = getBusinessCardList().getCards();
		Optional<BusinessCard> resultCard = cards.stream().filter(card -> card.entityNameExists(name)).findFirst();

		BusinessCard result = new BusinessCard();
		if (resultCard.isPresent()) {
			result = resultCard.get();
		}

		return result;
	}

	private BusinessCards getBusinessCardList() throws JsonParseException, JsonMappingException, IOException {
		File dataSource = new File(
				"src/main/resources/static/datasets/directory-export-business-cards-no-doc-types.xml");
		XmlMapper xmlMapper = new XmlMapper();
		xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

		BusinessCards businessCards = xmlMapper.readValue(dataSource, BusinessCards.class);

		return businessCards;
	}

}
