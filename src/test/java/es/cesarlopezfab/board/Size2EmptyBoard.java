package es.cesarlopezfab.board;

public class Size2EmptyBoard extends Size2SameContentBoard {
	
	protected Cell cell() {
		return CellFactory.empty();
	}
	
	public int startingDots() {
		return 0;
	}
	

}
