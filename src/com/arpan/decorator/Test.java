package com.arpan.decorator;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> ingredients = new ArrayList<>();
		ingredients.add("Chicken");
		ingredients.add("salasa");
		BurritoMaker burrito = new TwoIngredientBurrito(new BaseBurrito());
		System.out.println(burrito.getBurrito(ingredients));
		System.out.println(burrito.getPrice());
	}
}
