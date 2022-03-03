package src.game;

public abstract class Tile {
    private Vector2 location;

    public Tile(Vector2 location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return  ":" + location.toString();
    }
}
