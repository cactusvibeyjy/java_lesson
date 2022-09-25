package com.spring.animal.service;


import java.util.List;

import org.springframework.dao.DataAccessException;

public interface AnimalService {
	public List listAnimals() throws DataAccessException;
}
