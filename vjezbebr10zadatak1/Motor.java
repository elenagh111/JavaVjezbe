package vjezbebr10zadatak1;

class Motor extends Vozilo implements Ekonomican {
    private double potrosnja;

    public Motor(String id, double maxBrzina, double potrosnja) {
        super(id, maxBrzina);
        this.potrosnja = potrosnja;
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / getMaxBrzina();
    }

    @Override
    public double potrosnjaPoKm() {
        return potrosnja;
    }
}

