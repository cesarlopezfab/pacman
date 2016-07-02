package es.cesarlopezfab.board;

import java.util.HashMap;
import java.util.Map;

import es.cesarlopezfab.pacman.Direction;

public class Cell {

	private Content content;

	private final Map<Direction, Cell> links = new HashMap<Direction, Cell>();

	public Cell(Content content) {
		this.content = content;
	}

	void connect(Direction direction, Cell cell) {
		if (links.get(direction) == null) {
			links.put(direction, cell);
			cell.connect(direction.opposite(), this);
		}
	}

	public Cell at(Direction direction) {
		return links.get(direction);
	}

	public Content content() {
		return content;
	}

	// FIXME: probably this should be set from someone inside same package.
	public void content(Content content) {
		this.content = content;
	}

}
