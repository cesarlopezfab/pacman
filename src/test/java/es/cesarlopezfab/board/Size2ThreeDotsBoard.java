package es.cesarlopezfab.board;

public class Size2ThreeDotsBoard extends Size2SameContentBoard {
	
	public Cell cell() {
		return CellFactory.dot();
	}

	public int startingDots() {
		return 3;
	}
	
}
