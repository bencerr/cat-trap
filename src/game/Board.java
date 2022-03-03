package src.game;

public class Board {
    private Tile[][] board;

    public Board(int size) {
        board = new EmptyTile[size][size];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (Tile[] row : this.board) {
            for (Tile column : row) {
                str.append(column.toString() + " ");
            }
            str.append("\n");
        }

        return str.toString();
    }
}
