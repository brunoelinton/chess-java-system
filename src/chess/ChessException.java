package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
	
	// ID SERIAL VERSION
	private static final long serialVersionUID = 1L;

	// CONSTRUCTOR
	public ChessException(String msg) {
		super(msg);
	}
}
