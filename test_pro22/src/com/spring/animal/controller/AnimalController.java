package com.spring.animal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface AnimalController {
	public ModelAndView listAnimals(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
