package es.cesarlopezfab.pacman;

import es.cesarlopezfab.board.Board;
import es.cesarlopezfab.board.Cell;
import es.cesarlopezfab.board.Content;

public class Game {

	private int currentDots;
	private final Pacman pacman;

	public Game(Board board, Pacman pacman) {
		this.pacman = pacman;
		this.currentDots = board.startingDots();
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

}
