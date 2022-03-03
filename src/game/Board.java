package src.game;

public class Board {
    private Tile[][] board;

    public Board(int size) {
        board = new EmptyTile[size][size];
        for (int x=0; x<size; x++) {
            for (int y=0;y<size; y++) {
                board[x][y] = new EmptyTile(new Vector2(x, y));
            }
        }
    }

    public Tile getTile(Vector2 pos) {
        return board[pos.getX()][pos.getY()];
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
