package boardgame;

public class Piece {

  protected Position position;
  private Board board;

  //constructors
  public Piece(Board board) {
    this.board = board;
    this.position = null;
  }

  //getters and setters
  protected Board getBoard() {
    return board;
  } 
}
