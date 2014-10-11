package com.springinaction.spelcollections;

import java.util.List;
import com.springinaction.spingidol.performers.Instrumentalist;

public class User{
	private City profileCity;
	private List<String> bigCityNames;
	private long id;
	private Instrumentalist instrumentalist;
		
	public User(){
	}
	
	public User(City city){
		this.profileCity = city;
	}
	
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
	
	public void setId(long id){
		this.id = id;
	}
	
	public long getId(){
		return id;
	}
	
	public void setInstrumentalist(Instrumentalist instrumentalist){
		this.instrumentalist = instrumentalist;
	}
	
	public Instrumentalist getInstrumentalist(){
		return instrumentalist;
	}
}