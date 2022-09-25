package com.spring.animal.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.spring.animal.vo.AnimalVO;


public interface AnimalDAO {
	public List selectAllAnimals() throws DataAccessException ;
	public int addAnimal(AnimalVO animalVO) throws DataAccessException ;

}
