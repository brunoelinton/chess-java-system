package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	// RETURNS A POSITION ON THE MATRIX FROM A POSITION ON THE BOARD
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	// CHECK IF THERE IS AN OPPONENT PART IN THE POSSIBLE PATHS
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}	
}
