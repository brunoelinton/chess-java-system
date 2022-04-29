package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	// CONSTRUCTOR
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	
	// ABSTRACT METHOD TO FIND THE POSSIBLE MOVEMENTS OF A PART
	public abstract boolean[][] possibleMoves();
	
	// // ABSTRACT METHOD TO FIND THE POSSIBLE MOVEMENTS OF A PART
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	// CHECKS IF THERE IS AT LEAST ONE POSSIBLE MOVEMENT
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
