package src.game;

public class EmptyTile extends Tile {
    public EmptyTile(Vector2 location) {
        super(location);
    }

    @Override
    public String toString() {
        return "empty_tile" + super.toString();
    }
}
