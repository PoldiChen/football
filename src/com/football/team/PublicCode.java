package com.football.team;

public enum PublicCode {
	
	OK (0, "ok");
	
	private PublicCode(int code, String description) {
		this.code = code;
		this.description = description;
	}
	
	private int code;
	private String description;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
