package es.cesarlopezfab.pacman;

public class Cell {

	private Cell south;
	private Cell north;
	private Cell east;
	private Cell west;
	
	private Content content;

	
	public Cell(Content content) {
		this.content = content;
	}

	void connectSouth(Cell cell) {
		if (south == null) {
			south = cell;
			south.connectNorth(this);	
		}
	}

	void connectNorth(Cell cell) {
		if (north == null) {
			north = cell;
			cell.connectSouth(this);
		}
	}

	void connectWest(Cell cell) {
		if (west == null) {
			west = cell;
			cell.connectEast(this);
		}
	}

	void connectEast(Cell cell) {
		if (east == null) {
			east = cell;
			cell.connectWest(this);
		}
	}

	public Cell south() {
		return south;
	}

	public Cell north() {
		return north;
	}

	public Cell west() {
		return west;
	}

	public Cell east() {
		return east;
	}

	public Content content() {
		return content;
	}

}
