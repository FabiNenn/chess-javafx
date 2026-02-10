package model.pieces;

import model.pieces.enums.Color;
import model.pieces.enums.PieceType;

public class Piece {

    public final PieceType pieceType;
    public final Color color;


    public Piece(PieceType pieceType, Color color) {
        this.pieceType = pieceType;
        this.color = color;
    }
}
