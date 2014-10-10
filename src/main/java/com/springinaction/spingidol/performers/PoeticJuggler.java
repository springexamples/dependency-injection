package com.springinaction.spingidol.performers;

import com.springinaction.spingidol.performers.poem.Poem;
import com.springinaction.spingidol.util.PerformanceException;

public class PoeticJuggler extends Juggler {

	private Poem poem;

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}

	public PoeticJuggler(int beanBag, Poem poem) {
		super(beanBag);
		this.poem = poem;
	}

	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While recriting...");
		poem.recite();
	}

}
