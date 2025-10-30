package projekat2;

public class Enemy extends GameObject {
    private int damage;
    private int health;

    public Enemy(String type, int x, int y, int width, int height, int damage) {
        super(type, x, y, width, height);
        setDamage(damage);
        setHealth(60); // default health for enemy
    }

    public int getDamage() { return damage; }

    public void setDamage(int damage) {
        if (damage < 0) this.damage = 0;
        else if (damage > 100) this.damage = 100;
        else this.damage = damage;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, Math.min(100, health)); }

    @Override
    public String toString() {
        return "Enemy[" + getType() + "] (" + getX() + "," + getY() + ") " +
            getWidth() + "x" + getHeight() +
            " DMG=" + getDamage() + " HP=" + getHealth();
    }
}

