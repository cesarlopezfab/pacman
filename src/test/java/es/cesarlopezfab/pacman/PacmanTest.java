package es.cesarlopezfab.pacman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.CellFactory;

public class PacmanTest {
	
	@Test
	public void pacmanMovesEastThroughCells() {
		Cell position = CellFactory.withPacman();
		Pacman pacman = new Pacman(position, Direction.EAST);
		
		pacman.tick();
		
		assertEquals(position.east(), pacman.position());
	}

}
