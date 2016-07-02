package es.cesarlopezfab.pacman;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Size2ThreeDotsBoard;

public class GameTest {
	
	@Test
	public void a() {
		Board board = new Size2ThreeDotsBoard();
		Pacman pacman = new Pacman(board.start(), Direction.EAST);
		Game game = new Game(board, pacman);
		
		game.tick();
		pacman.face(Direction.NORTH);
		game.tick();
		pacman.face(Direction.WEST);
		game.tick();
		
		
		assertTrue(game.won());
	}

}
