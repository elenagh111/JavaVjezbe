package projekat2;

import java.util.ArrayList;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        int oldHealth = p.getHealth();
        int damage = e.getDamage();
        if (e instanceof BossEnemy) damage = ((BossEnemy) e).getDamage();
        int newHealth = oldHealth - damage;
        if (newHealth < 0) newHealth = 0;
        p.setHealth(newHealth);
        eventLog.add("HIT: Player by " + e.getType() + " for " + damage + " - HP " + oldHealth + " -> " + newHealth);
    }

    public void addEnemy(Enemy e) {
        enemies.add(e);
        eventLog.add("ADDED: " + e.getType());
    }

    public ArrayList<Enemy> findByType(String query) {
        ArrayList<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(query.toLowerCase())) result.add(e);
        }
        return result;
    }

    public ArrayList<Enemy> collidingWithPlayer() {
        ArrayList<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) result.add(e);
        }
        return result;
    }

    public void resolveCollisions() {
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) decreaseHealth(player, e);
        }
    }

    public void printEnemies() {
        for (Enemy e : enemies) System.out.println(e);
    }

    public void showEventLog() {
        for (String log : eventLog) System.out.println(log);
    }
}

