package com.arpan.decorator;

import java.util.List;

public class TwoIngredientBurrito extends BurritoDecorator{

	public TwoIngredientBurrito(BurritoMaker burritoMaker) {
		super(burritoMaker);
	}

	@Override
	public Burrito getBurrito(List<String> ingredients) {
		return burritoMaker.getBurrito(ingredients);
	}

	@Override
	public double getPrice() {
		return burritoMaker.getPrice() + 0.99;
	}
}
