package boardgame;

public abstract class Piece {

  protected Position position;
  private Board board;

  //constructors
  public Piece(Board board) {
    this.board = board;
    this.position = null;
  }

  //methods 
  public abstract boolean[][] possibleMoves();

  public boolean possibleMove(Position position) {
    return possibleMoves()[position.getRow()][position.getColumn()];
  }

  public boolean isThereAnyPossibleMove() {
    boolean[][] mat = possibleMoves();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat.length; j++) {
        if (mat[i][j]) {
          return true;
        }
      }
    }
    return false;
  }

  //getters and setters
  protected Board getBoard() {
    return board;
  } 
}
