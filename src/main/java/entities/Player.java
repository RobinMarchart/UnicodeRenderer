package entities;

import rendering.DisplayObjects;

public class Player extends Entity {

    private int hp;
    private final int maxHp;

    public Player(int[] pos, DisplayObjects[][] charRepresentation, int[] bounds, int maxHp, int frequency) {
        super(pos, charRepresentation, bounds, frequency);
        this.maxHp = maxHp;
        hp = maxHp;
    }

    /**
     * Moves the player up (Warning! Does not account for bounds!)
     */
    public void moveUp() {
        pos[1]--;
    }

    /**
     * Moves the player down (Warning! Does not account for bounds!)
     */
    public void moveDown() {
        pos[1]++;
    }

    /**
     * Moves the player left (Warning! Does not account for bounds!)
     */
    public void moveLeft() {
        pos[0]--;
    }

    /**
     * Moves the player right (Warning! Does not account for bounds!)
     */
    public void moveRight() {
        pos[0]++;
    }

    @Override
    protected void move(int[] newPos) {
        pos[0] = newPos[0];
        pos[1] = newPos[1];
    }

    @Override
    public void updateInner() {

    }
}
