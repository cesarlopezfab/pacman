package es.cesarlopezfab.pacman;

import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.Content;

public class Pacman implements Content {

	private Cell position;
	private Direction direction;

	public Pacman(Cell position, Direction direction) {
		this.position = position;
		this.direction = direction;
	}

	Cell position() {
		return position;
	}

	void face(Direction direction) {
		this.direction = direction;
	}

	Direction direction() {
		return direction;
	}

	void position(Cell position) {
		this.position = position;

	}

}
