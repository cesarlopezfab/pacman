package es.cesarlopezfab.board;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static es.cesarlopezfab.pacman.Direction.SOUTH;
import static es.cesarlopezfab.pacman.Direction.WEST;
import static es.cesarlopezfab.pacman.Direction.NORTH;

public class Size2EmptyBoard implements Board {
	
	private Cell leftLower;
	
	public Size2EmptyBoard() {
		leftLower = CellFactory.empty();
		Cell rightLower = CellFactory.empty();
		Cell rightHigher = CellFactory.empty();
		Cell leftHigher = CellFactory.empty();
		
		leftLower.connect(EAST, rightLower);
		rightLower.connect(NORTH, rightHigher);
		rightHigher.connect(WEST, leftHigher);
		leftHigher.connect(SOUTH, leftLower);
	}

	public Cell start() {
		return leftLower;
	}

	public int startingDots() {
		return 0;
	}

}