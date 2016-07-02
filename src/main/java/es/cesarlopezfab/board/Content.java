package es.cesarlopezfab.board;

public interface Content {

	class Empty implements Content {

	}

	class Dot implements Content {
	}

	static final Content EMPTY = new Empty();
	static final Content DOT = new Dot();

}
