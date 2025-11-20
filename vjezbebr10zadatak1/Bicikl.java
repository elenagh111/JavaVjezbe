package vjezbebr10zadatak1;

class Bicikl extends Vozilo implements Ekonomican {

    public Bicikl(String id) {
        super(id, 25);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / getMaxBrzina();
    }

    @Override
    public double potrosnjaPoKm() {
        return 0;
    }
}
