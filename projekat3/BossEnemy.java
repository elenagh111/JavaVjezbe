package projekat2;

public class BossEnemy extends Enemy {

    public BossEnemy(String type, int x, int y, int width, int height, int damage) {
        super(type, x, y, width, height, damage);
    }

    @Override
    public int getDamage() {
        return super.getDamage() * 2;
    }

    @Override
    public String toString() {
        return "BossEnemy[" + getType() + "] (" + getX() + "," + getY() + ") " +
            getWidth() + "x" + getHeight() + " HP=" + getHealth();
    }
}