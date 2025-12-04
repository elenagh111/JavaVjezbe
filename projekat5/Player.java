package projekat5;

public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int health, int x, int y, Collidable collider) {
        super(x, y, collider);
        setName(name);
        setHealth(health);
    }

    public String getName() { return name; }
    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Name cannot be null");
        name = name.trim();
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be empty");
        name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        this.name = name;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) {
        if (health < 0 || health > 100) throw new IllegalArgumentException("Health must be between 0 and 100");
        this.health = health;
    }

    @Override
    public String getDisplayName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player[name=" + name + ", health=" + health + ", x=" + getX() + ", y=" + getY() + ","
        		+ " collider=" + getCollider() + "]";
    }
}
