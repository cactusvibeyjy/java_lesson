package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface AnimalController {
	//인터페이스 -> 구현 해야하는 메서드 명세표 (확인 색인, 목차)
	//추상메서드 -> 일반 메서드와 비교, 구현제가 없음.
	//재정의한 클래스를 무조건 정희된 추상 메서드를 재구현 해야 함. 의무성!
	public ModelAndView listAnimals(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
