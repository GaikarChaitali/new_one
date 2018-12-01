package com.chaitali.assignment;

public class Movie_Details {
	String mov_name,lead_actor,lead_actress;

	public Movie_Details(String mov_name,String lead_actor,String lead_actress) {
		this.lead_actor=lead_actor;
		this.lead_actress=lead_actress;
		this.mov_name=mov_name;
	}

	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

}
