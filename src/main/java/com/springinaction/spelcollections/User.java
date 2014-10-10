package com.springinaction.spelcollections;

public class User{
	private City profileCity;
	private List<String> bigCityNames;
	
	public void setProfileCity(City city){
		this.profileCity = city;
	}
	
	public City getProfileCity(){
		return profileCity;
	}
	
	public void setBigCityNames(List<String> bigCityNames){
		this.bigCityNames = bigCityNames;
	}
	
	public List<String> getBigCityNames(){
		return bigCityNames;
	}
}