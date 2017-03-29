package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Husky husky = new Husky("Dubs");
		husky.bark();
		// Dog v1 = new Husky();
		// Husky v2 = new Dog();
		// Huggable v3 = new Husky();
		Huggable v4 = new TeddyBear();
		// Husky v5 = new TeddyBear();
		GiftBox<Husky> huskyGift = new GiftBox(husky);
	}
}
