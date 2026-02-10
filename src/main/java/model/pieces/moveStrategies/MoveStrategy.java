package model.pieces.moveStrategies;

import model.locations.Move;

import java.util.List;

public interface MoveStrategy {

    //defines a move strategy every piece has on its own
    List<Move> calculateLegalMoves();
}
