package es.cesarlopezfab.pacman;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.Content;

public class Game {

	private int currentDots;
	private final Pacman pacman;

	public Game(Board board) {
		this.pacman = new Pacman(board.start(), Direction.EAST);
		this.currentDots = board.startingDots();

		board.start().content(pacman);
	}

	public boolean won() {
		return currentDots == 0;
	}

	public void tick() {
		Direction direction = pacman.direction();
		Cell pacmanCurrent = pacman.position();
		Cell pacmanNextPosition = pacmanCurrent.at(direction);

		if (isADot(pacmanNextPosition)) {
			currentDots--;
		}

		pacmanCurrent.content(Content.EMPTY);
		pacman.position(pacmanNextPosition);
		pacmanNextPosition.content(pacman);

	}

	private boolean isADot(Cell cell) {
		return cell.content().equals(Content.DOT);
	}

	public Pacman pacman() {
		return pacman;
	}

}
