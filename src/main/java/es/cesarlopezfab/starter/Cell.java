package es.cesarlopezfab.starter;

public class Cell {

	private Cell south;
	private Cell north;

	public boolean isEmpty() {
		return true;
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

	public Cell southCell() {
		return south;
	}

	public Cell northCell() {
		return north;
	}

}
