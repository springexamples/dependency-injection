package com.springinaction.spingidol.performers;

import com.springinaction.spingidol.util.PerformanceException;

public class Juggler implements Performer {

	private int beanBags = 3;

	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS!");
	}

}
