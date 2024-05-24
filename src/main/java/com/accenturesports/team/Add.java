package com.accenturesports.team;

public class Add {
	private String name;
	private String id;
	private String role;
	
	public Add(String name,String id,String role) {
		this.name = name;
		this.id = id;
		this.role = role;
	}
	
	public String details() {
		return "Player name : "+name+" Id : "+id+" Role : "+role;
	}
}
