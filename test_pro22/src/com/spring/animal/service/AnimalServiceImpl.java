package com.spring.animal.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.animal.dao.AnimalDAO;

public class AnimalServiceImpl implements AnimalService {
	private AnimalDAO animalDAO;

	public void setAnimalDAO(AnimalDAO animalDAO) {
		this.animalDAO = animalDAO;
	}

	@Override
	public List listAnimals() throws DataAccessException {
		List animalsList = null;
		animalsList = animalDAO.selectAllAnimals();
		return animalsList;
	}

}
