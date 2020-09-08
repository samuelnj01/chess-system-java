package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;// não precisaria pois o java já atribui valor nulo
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
