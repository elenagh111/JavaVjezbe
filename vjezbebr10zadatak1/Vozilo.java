package vjezbebr10zadatak1;

abstract class Vozilo {
    private String id;
    private double maxBrzina;

    public Vozilo(String id, double maxBrzina) {
        this.id = id;
        this.maxBrzina = maxBrzina;
    }

    public void info() {
        System.out.println("ID: " + id);
        System.out.println("Max brzina: " + maxBrzina + " km/h");
    }

    public String getId() {
        return id;
    }
    public double getMaxBrzina() {
        return maxBrzina;
    }

    public abstract double izracunajVrijemeDostave(double udaljenostKm);
}