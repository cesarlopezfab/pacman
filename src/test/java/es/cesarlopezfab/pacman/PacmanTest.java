package es.cesarlopezfab.pacman;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.CellFactory;
import es.cesarlopezfab.board.Content;
import es.cesarlopezfab.board.Size2EmptyBoard;

public class PacmanTest {

	@Test
	public void pacmanMovesEastThroughCells() {
		Board board = new Size2EmptyBoard();
		Cell start = board.start();
		Pacman pacman = new Pacman(start, Direction.EAST);
		Game game = new Game(board, pacman);

		game.tick();

		assertEquals(start.at(EAST), pacman.position());
		assertEquals(Content.EMPTY, start.content());
		assertEquals(pacman, pacman.position().content());
	}

	@Test
	public void cellReturnsPacmanIsInIt() {
		Cell position = CellFactory.empty();
		Pacman pacman = new Pacman(position, Direction.EAST);

		assertEquals(pacman, position.content());
	}

}
