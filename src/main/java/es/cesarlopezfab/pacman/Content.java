package es.cesarlopezfab.pacman;

public interface Content {

	class Empty implements Content {

	}

	static final Content EMPTY = new Empty();

}
