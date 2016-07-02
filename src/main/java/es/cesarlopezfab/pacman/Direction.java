package es.cesarlopezfab.pacman;

import java.util.HashMap;
import java.util.Map;

public enum Direction {
	
	EAST("E"), SOUTH("S"), WEST("W"), NORTH("N");
	
	final String value;
	
	Direction(String value) {
		this.value = value;
	}
	
	static final Map<Direction, Direction> OPPOSITES = new HashMap<Direction, Direction>();
	
	static {
		OPPOSITES.put(EAST, WEST);
		OPPOSITES.put(WEST, EAST);
		OPPOSITES.put(NORTH, SOUTH);
		OPPOSITES.put(SOUTH, NORTH);
	}

	public Direction opposite() {
		return OPPOSITES.get(this);
	}

}
