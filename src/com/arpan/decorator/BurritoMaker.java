package com.arpan.decorator;

import java.util.List;

public interface BurritoMaker {

	Burrito getBurrito(List<String> ingredients);

	double getPrice();
}
