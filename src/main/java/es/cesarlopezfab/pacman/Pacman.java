package es.cesarlopezfab.pacman;

import es.cesarlopezfab.board.Cell;

public class Pacman {

	private Cell position;
	private Direction direction;

	public Pacman(Cell position, Direction direction) {
		this.position = position;
		this.direction = direction;
	}

	public Cell position() {
		return position;
	}

	public void tick() {
		this.position.east();
	}

}
