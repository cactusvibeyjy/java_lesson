package com.spring.animal.vo;

public class AnimalVO {
	// DB에서 받아온 데이터를 각 파일별로 전달하기 위한 폼
	private String id;
	private String name;
	private String local;
	
	public AnimalVO() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	


}
