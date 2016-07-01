package es.cesarlopezfab.board;

public interface Content {

	class Empty implements Content {

	}

	static final Content EMPTY = new Empty();

}
