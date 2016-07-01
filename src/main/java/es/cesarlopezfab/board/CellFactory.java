package es.cesarlopezfab.board;

public class CellFactory {

	public static Cell empty() {
		return new Cell(Content.EMPTY);
	}

	public static Cell withPacman() {
		return new Cell(null);
	}
	
}
