package com.copyandpaste.exam.participants;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BusinessCard {
	private int icd;
	private String businessCode;
	private String businessName;
	private LocalDate regDate;
}
