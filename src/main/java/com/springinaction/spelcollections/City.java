package com.springinaction.spelcollections;

public class City{
	private String name;
	private String state;
	private long population;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public long getPopulation(){
		return population;
	}
	
	@Override
	public String toString(){
		return this.name + " " + this.state;
	}
}