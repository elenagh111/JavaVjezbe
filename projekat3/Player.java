//Elena Kankaraš 22/104 FIST
//Luka Čarapić 22/094 FIST
// Aleksandr Kireev 23/008 FIST
package projekat2;


public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {
        super("Player", x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            String[] words = name.trim().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1).toLowerCase())
                  .append(" ");
            }
            this.name = sb.toString().trim();
        }
    }

    public int getHealth() { return health; }

    public void setHealth(int health) {
        if (health < 0) this.health = 0;
        else if (health > 100) this.health = 100;
        else this.health = health;
    }

    @Override
    public String toString() {
        return "Player(" + getName() + ") (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " HP=" + getHealth();
    }
}

