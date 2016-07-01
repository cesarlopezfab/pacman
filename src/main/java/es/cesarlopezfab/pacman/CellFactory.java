package es.cesarlopezfab.pacman;

public class CellFactory {

	static Cell empty() {
		return new Cell(Content.EMPTY);
	}

	public static Cell withPacman() {
		return new Cell(null);
	}
	
}
