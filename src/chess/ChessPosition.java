package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;
	
	// CONSTRUCTOR
	public ChessPosition(char column, int row) {
		if(column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instatiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	// GETTERS
	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	// CONVERTS A POSITION ON THE BOARD CHESS TO A POSITION ON THE MATRIX
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	// CONVERTS A MATRIX POSITION TO A CHESSBOARD POSITION
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
}
