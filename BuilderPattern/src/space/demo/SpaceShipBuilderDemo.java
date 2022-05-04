package space.demo;

import space.SpaceShip;
import space.SpaceShipBuilder;

public class SpaceShipBuilderDemo {
	
	public static void main(String[] args) {
		SpaceShip ship01 = new SpaceShipBuilder()
				.withName("ship01")
				.withCargo("Tomatoes")
				.withCrew(100)
				.withFuel(90.0)
				.withDestination("Mars")
				.build();
		
		SpaceShip ship02 = new SpaceShipBuilder()
				.withName("ship02").build();
		
		System.out.println("Look at my spaceship " + ship01);
		System.out.println("Look at my spaceship " + ship02);
	}

}
