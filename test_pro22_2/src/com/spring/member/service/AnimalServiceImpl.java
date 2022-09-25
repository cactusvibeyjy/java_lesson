package com.spring.member.service;

import java.util.List;


import org.springframework.dao.DataAccessException;

import com.spring.member.dao.AnimalDAO;
/*import com.spring.member.dao.MemberDAO;*/

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
