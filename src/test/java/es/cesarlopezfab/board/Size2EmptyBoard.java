package es.cesarlopezfab.board;

public class Size2EmptyBoard implements Board {
	
	private Cell start;
	
	public Size2EmptyBoard() {
		start = CellFactory.empty();
		Cell east = CellFactory.empty();
		Cell west = CellFactory.empty();
		Cell south = CellFactory.empty();
		
		start.connectEast(east);
		start.connectWest(west);
		start.connectSouth(south);
	}

	public Cell start() {
		return start;
	}

}
