package es.cesarlopezfab.pacman;

import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.Content;

public class Pacman implements Content {

	private Cell position;
	private Direction direction;

	public Pacman(Cell position, Direction direction) {
		this.position = position;
		this.direction = direction;

		this.position.content(this);
	}

	public Cell position() {
		return position;
	}

	public void face(Direction direction) {
		this.direction = direction;
	}

	public Direction direction() {
		return direction;
	}

	public void position(Cell position) {
		this.position = position;

	}

}
