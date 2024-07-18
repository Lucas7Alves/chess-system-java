package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
  private Color color;
  private int moveCount;

  //constructors
  public ChessPiece(Board board, Color color) {
    super(board);
    this.color = color;
  }

  //methods
  protected boolean isThereOppentenPiece(Position position) {
    ChessPiece p = (ChessPiece) getBoard().piece(position);
    return p != null && p.getColor() != color; 
  }

  public ChessPosition getChessPosition() {
    return ChessPosition.fromPosition(position);
  }

  protected int increaseMoveCount() {
    return moveCount++;
  }

  protected int decreaseMoveCount() {
    return moveCount--;
  }

  //
  
  public Color getColor() {
    return color;
  }
  
  public int getMoveCount() {
    return moveCount;
  }
}
