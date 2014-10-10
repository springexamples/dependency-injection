package com.springinaction.spingidol.performers;

import com.springinaction.spingidol.performers.instrument.Instrument;
import com.springinaction.spingidol.util.PerformanceException;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	public Instrumentalist() {
		this.instrument = () -> {
		};
	}

	public void perform() throws PerformanceException {
		System.out.println("Singing song: " + song);
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
