package com.arpan.decorator;

import java.util.List;

public class Burrito {

	private final List<String> ingredients;

	private Burrito(BurritoBuilder burritoBuilder) {
		super();
		this.ingredients = burritoBuilder.ingredients;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public static class BurritoBuilder {
		private List<String> ingredients;

		public BurritoBuilder ingredients(List<String> ingredients) {
			this.ingredients = ingredients;
			return this;
		}

		public Burrito build() {
			return new Burrito(this);
		}
	}

	@Override
	public String toString() {
		return "Burrito [ingredients=" + ingredients + "]";
	}
}
