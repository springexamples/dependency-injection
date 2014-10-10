package com.springinaction.spingidol.performers;

import com.springinaction.spingidol.performers.instrument.Instrument;
import com.springinaction.spingidol.util.PerformanceException;

public class OneManBand implements Performer {

	private Instrument[] instruments;

	public OneManBand() {
		this.instruments = new Instrument[] {};
	}

	@Override
	public void perform() throws PerformanceException {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Instrument[] instruments) {
		this.instruments = instruments;
	}

}
