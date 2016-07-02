package es.cesarlopezfab.board;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static es.cesarlopezfab.pacman.Direction.NORTH;
import static es.cesarlopezfab.pacman.Direction.SOUTH;
import static es.cesarlopezfab.pacman.Direction.WEST;

public abstract class Size2SameContentBoard implements Board {

	private Cell leftLower;

	protected Size2SameContentBoard() {
		leftLower = CellFactory.empty();
		Cell rightLower = cell();
		Cell rightHigher = cell();
		Cell leftHigher = cell();

		leftLower.connect(EAST, rightLower);
		rightLower.connect(NORTH, rightHigher);
		rightHigher.connect(WEST, leftHigher);
		leftHigher.connect(SOUTH, leftLower);
	}

	protected abstract Cell cell();
	
	public Cell start() {
		return leftLower;
	}

}
