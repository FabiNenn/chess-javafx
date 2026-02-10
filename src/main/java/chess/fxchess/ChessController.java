package chess.fxchess;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.pieces.Piece;
import model.pieces.enums.Color;
import model.pieces.enums.PieceType;

public class ChessController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Piece meh = new Piece(PieceType.PAWN, Color.WHITE);
        System.out.println(meh.pieceType.getMoveStrategy());
    }

    public void initialize() {

    }
}
