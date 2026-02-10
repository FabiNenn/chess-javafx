package model.locations;

import model.pieces.Piece;

public record Move(Position moveFrom, Position moveTo, Piece movedPiece, Piece capturedPiece) {
    //move methods create a list of all legal moves
    //if a move is chosen, it also saves the position from where it came and, if so, the captured piece
    //to make it possible to undo moves and to review the game after

}
