package com.springinaction.spingidol.performers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.springinaction.spingidol.performers.instrument.Instrument;
import com.springinaction.spingidol.util.PerformanceException;

public class OneManBandWithName implements Performer {

	private Map<String, Instrument> instruments;
	private String someValue = "SomeValue";

	public OneManBandWithName() {
		this.instruments = new HashMap<>();
	}

	@Override
	public void perform() throws PerformanceException {
		System.out.println("Some Value == null? " + (someValue == null));
		for (Entry<String, Instrument> entrySet : instruments.entrySet()) {
			System.out.print("Playign: " + entrySet.getKey() + " ");
			entrySet.getValue().play();
		}
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	public void setSomeValue(String someValue) {
		this.someValue = someValue;
	}
}
