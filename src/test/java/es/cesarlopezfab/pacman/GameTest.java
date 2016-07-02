package es.cesarlopezfab.pacman;

import static es.cesarlopezfab.pacman.Direction.EAST;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.Content;
import es.cesarlopezfab.board.Size2EmptyBoard;
import es.cesarlopezfab.board.Size2ThreeDotsBoard;

public class GameTest {
	
	@Test
	public void pacmanMovesEastThroughCells() {
		Board board = new Size2EmptyBoard();
		Game game = new Game(board);
		Pacman pacman = game.pacman();
		Cell start = board.start();

		game.tick();

		assertEquals(start.at(EAST), pacman.position());
		assertEquals(Content.EMPTY, start.content());
		assertEquals(pacman, pacman.position().content());
	}
	
	@Test
	public void pacmanEatsAllDotsAndUserWins() {
		Game game = new Game(new Size2ThreeDotsBoard());
		Pacman pacman = game.pacman();
		game.tick();
		pacman.face(Direction.NORTH);
		game.tick();
		pacman.face(Direction.WEST);
		game.tick();
		
		assertTrue(game.won());
	}

}
