package model.pieces.enums;

import model.pieces.moveStrategies.*;

public enum PieceType {

    KING(new KingMoves()),
    QUEEN(new QueenMoves()),
    BISHOP(new BishopMoves()),
    KNIGHT(new KnightMoves()),
    ROOK(new RookMoves()),
    PAWN(new PawnMoves());

    private final MoveStrategy moveStrategy;

    PieceType(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public MoveStrategy getMoveStrategy() {
        return this.moveStrategy;
    }
}
