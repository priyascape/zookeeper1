package com.codingdojo.java.zookeeper1;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("The gorilla has thrown a thing at you!");
		displayEnergy();
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla ate a banana and became happier.");
		displayEnergy();
	}
	public void climb() {
		energyLevel -= 10;
		System.out.println("The gorilla climbed a tree, and has spent its energy.");
		displayEnergy();
	}
}