package com.springinaction.spingidol.util;

public class Stage {

	private String name = "Stage 1";
	
	private Stage() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private static class StageSingletoneHolder {
		private static Stage INSTANCE = new Stage();
	}

	public static Stage getInstance() {
		return StageSingletoneHolder.INSTANCE;
	}

}
