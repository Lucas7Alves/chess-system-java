package boardgame;

public class Board {

  private int rows;
  private int column;
  private Piece[][] pieces;

  //constructors
  public Board(int rows, int column) {
    this.rows = rows;
    this.column = column;
    pieces = new Piece[rows][column];
  }

  //methods
  public Piece piece(int row, int column) {
    return pieces[row][column];
  }

  public void placePice(Piece piece, Position position) {
    pieces[position.getRow()][position.getColumn()] = piece;
    piece.position = position;
  }


  //getters and setters
  public int getRows() {
    return rows;
  }
  public void setRows(int rows) {
    this.rows = rows;
  }
  public int getColumn() {
    return column;
  }
  public void setColumn(int column) {
    this.column = column;
  }
}
