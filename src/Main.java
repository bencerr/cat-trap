package src;

import src.game.*;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(4);
        System.out.println(board);
        System.out.println(board.getTile(new Vector2(0, 1)));
    }
}
