/**
 * THIS CLASS CONTAINS THE PIECE'S POSITION ON THE BOARD. 
 */

package boardgame;

public class Position {

	// POSITION IN THE MATRIX
	private int row;
	private int column;
	
	// CONSTRUCTOR
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	// GETTERS AND SETTERS
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
