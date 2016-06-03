package com.arpan.decorator;

import java.util.List;

public class BaseBurrito implements BurritoMaker {

	@Override
	public Burrito getBurrito(List<String> ingredients) {
		Burrito burrito = new Burrito.BurritoBuilder().ingredients(ingredients).build();
		return burrito;
	}

	@Override
	public double getPrice() {
		return 4.00;
	}
}
