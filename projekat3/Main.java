package projekat2;

public class Main {
    public static void main(String[] args) {
        Player p = new Player("Luka Carapic", 10, 5, 32, 32, 85);
        Game game = new Game(p);

        Enemy e1 = new MeleeEnemy("Orc", 12, 5, 16, 16, 20);
        game.addEnemy(e1);

        Enemy e2 = new BossEnemy("Goblin", 12, 5, 16, 16, 20);
        game.addEnemy(e2);

        System.out.println("Lista neprijatelja:");
        game.printEnemies();

        System.out.println("Pretraga po tipu 'gob':");
        for (Enemy e : game.findByType("gob")) System.out.println(e);

        System.out.println("Stanje igrača prije kolizije:");
        System.out.println(p);

        game.resolveCollisions();

        System.out.println("Stanje igrača poslije kolizije:");
        System.out.println(p);

        System.out.println("Event log:");
        game.showEventLog();
    }
}


