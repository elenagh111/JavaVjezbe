package projekat5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies = new ArrayList<>();
    private ArrayList<String> log = new ArrayList<>();

    public Game() {}

    public Player getPlayer() { return player; }
    public void setPlayer(Player player) { this.player = player; }

    public List<Enemy> getEnemies() { return enemies; }
    public List<String> getLog() { return log; }

    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        int dmg = e.getEffectiveDamage();
        int before = p.getHealth();
        int after = Math.max(0, before - dmg);
        p.setHealth(after);
        log.add("Player '" + p.getName() + "' took " + dmg + " damage from " + e.getType() + " (hp " + before + " -> " + after + ")");
	}
    public void addEnemy(Enemy e) {
        enemies.add(e);
        log.add("Added enemy: " + e.getType());
    }

    public List<Enemy> findByType(String query) {
        List<Enemy> res = new ArrayList<>();
        if (query == null) return res;
        String q = query.toLowerCase();
        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(q)) res.add(e);
        }
        return res;
    }

    public List<Enemy> collidingWithPlayer() {
        List<Enemy> res = new ArrayList<>();
        if (player == null) return res;
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) res.add(e);
        }
        return res;
    }

    public void resolveCollisions() {
        if (player == null) return;
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                decreaseHealth(player, e);
            }
        }
    }

    public static List<Enemy> loadEnemiesFromCSV(String filePath) throws Exception {
        ArrayList<Enemy> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String header = br.readLine();
            String line;
            int lineNo = 1;
            while ((line = br.readLine()) != null) {
                lineNo++;
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(",", -1);


                if (parts.length < 10) throw new IllegalArgumentException("Invalid CSV format at line " + lineNo);
                String type = parts[0].trim();
                String cls = parts[1].trim().toLowerCase();
                int damage = Integer.parseInt(parts[2].trim());
                int health = Integer.parseInt(parts[3].trim());
                int x = Integer.parseInt(parts[4].trim());
                int y = Integer.parseInt(parts[5].trim());
                String shape = parts[6].trim().toLowerCase();
                String widthStr = parts[7].trim();
                String heightStr = parts[8].trim();
                String radiusStr = parts[9].trim();

                Collidable collider;
                if (shape.equals("rectangle")) {
                    int w = Integer.parseInt(widthStr);
                    int h = Integer.parseInt(heightStr);
                    collider = new RectangleCollider(x, y, w, h);
                } else if (shape.equals("circle")) {
                    int r = Integer.parseInt(radiusStr);
                    collider = new CircleCollider(x, y, r);
                } else {
                    throw new IllegalArgumentException("Unknown shape '" + shape + "' at line " + lineNo);
                }

                Enemy e;
                if (cls.equals("melee")) {
                    e = new MeleeEnemy(type, damage, health, x, y, collider);
                } else if (cls.equals("boss")) {
                    e = new BossEnemy(type, damage, health, x, y, collider);
                } else {
                    throw new IllegalArgumentException("Unknown class '" + cls + "' at line " + lineNo);
                }

                list.add(e);
            }
        }
        return list;
    }
}