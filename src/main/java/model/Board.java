package model;

import model.locations.Move;
import model.pieces.Piece;
import model.pieces.enums.Color;
import model.pieces.enums.PieceType;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private Piece[][] gameBoard;
    private List<Move> pastMoves;
    private final int BOARD_SIZE_Y = 8;
    private final int BOARD_SIZE_X = 8;

    public Board() {

        this.pastMoves = new ArrayList<>();
        this.initializeBoard();
    }


    //initializes a new board with the standard piece set; is called in the constructor
    public void initializeBoard() {
        this.gameBoard = new Piece[this.BOARD_SIZE_Y][this.BOARD_SIZE_X];

        for(int x = 0; x < gameBoard[1].length; x++) {
            this.placeNewPiece(PieceType.PAWN, Color.BLACK, x, 1);
        }

        for(int x = 0; x < gameBoard[7].length; x++) {
            this.placeNewPiece(PieceType.PAWN, Color.WHITE, x, 6);
        }

        this.placeNewPiece(PieceType.ROOK, Color.BLACK, 0, 0);
        this.placeNewPiece(PieceType.ROOK, Color.BLACK, 7, 0);

        this.placeNewPiece(PieceType.KNIGHT, Color.BLACK, 1, 0);
        this.placeNewPiece(PieceType.KNIGHT, Color.BLACK, 6, 0);

        this.placeNewPiece(PieceType.BISHOP, Color.BLACK, 2, 0);
        this.placeNewPiece(PieceType.BISHOP, Color.BLACK, 5, 0);

        this.placeNewPiece(PieceType.KING, Color.BLACK, 4, 0);
        this.placeNewPiece(PieceType.QUEEN, Color.BLACK, 3, 0);

        this.placeNewPiece(PieceType.ROOK, Color.WHITE, 0, 7);
        this.placeNewPiece(PieceType.ROOK, Color.WHITE, 7, 7);

        this.placeNewPiece(PieceType.KNIGHT, Color.WHITE, 1, 7);
        this.placeNewPiece(PieceType.KNIGHT, Color.WHITE, 6, 7);

        this.placeNewPiece(PieceType.BISHOP, Color.WHITE, 2, 7);
        this.placeNewPiece(PieceType.BISHOP, Color.WHITE, 5, 7);

        this.placeNewPiece(PieceType.KING, Color.WHITE, 4, 7);
        this.placeNewPiece(PieceType.QUEEN, Color.WHITE, 3, 7);
    }

    //returns new piece; type and color given by parameters
    public Piece createPiece(PieceType pieceType, Color color) {
        return new Piece(pieceType, color);
    }

    //places a new piece on the given x and y coordinates
    public void placeNewPiece(PieceType pieceType, Color color, int x, int y) {
        this.gameBoard[y][x] = this.createPiece(pieceType, color);
    }

    public Piece getPieceOnField(int x, int y) {
        try {
            return this.gameBoard[y][x];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid board size");
        } return null;
    }

}
