package es.cesarlopezfab.board;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static es.cesarlopezfab.pacman.Direction.NORTH;
import static es.cesarlopezfab.pacman.Direction.SOUTH;
import static es.cesarlopezfab.pacman.Direction.WEST;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.CellFactory;

public class Size2ThreeDotsBoard implements Board {
	
	private final Cell leftLower;

	public Size2ThreeDotsBoard() {
		leftLower = CellFactory.empty();
		Cell leftHigher = CellFactory.dot();
		Cell rightLower = CellFactory.dot();;
		Cell rightHigher = CellFactory.dot();;
		
		leftLower.connect(EAST, rightLower);
		rightLower.connect(NORTH, rightHigher);
		rightHigher.connect(WEST, leftHigher);
		leftHigher.connect(SOUTH, leftLower);
	}

	public Cell start() {
		return leftLower;
	}

	public int startingDots() {
		return 3;
	}
	
}
