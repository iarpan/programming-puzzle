package com.arpan.decorator;

import java.util.List;

public class BurritoDecorator implements BurritoMaker {

	BurritoMaker burritoMaker;

	public BurritoDecorator(BurritoMaker burritoMaker) {
		super();
		this.burritoMaker = burritoMaker;
	}

	@Override
	public Burrito getBurrito(List<String> ingredients) {
		return burritoMaker.getBurrito(ingredients);
	}

	@Override
	public double getPrice() {
		return burritoMaker.getPrice();
	}

}
