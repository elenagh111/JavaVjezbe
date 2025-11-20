package vjezbebr10zadatak1;

class Automobil extends Vozilo {
    public Automobil(String id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / getMaxBrzina();
    }
}