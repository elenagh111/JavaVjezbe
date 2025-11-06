package vjezbebr8zadatak1;

public class TV extends EProizvod {
    private double velicinaEkrana;

    public TV(String opis, String sifra, double uvoznaCijena, double velicinaEkrana) {
        super(opis, sifra, uvoznaCijena);
        this.velicinaEkrana = velicinaEkrana;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        double cijena = super.izracunajMaloprodajnuCijenu();
        if (velicinaEkrana > 65) {
            cijena *= 1.10;
        }
        return cijena;
    }

    @Override
    public String toString() {
        return "TV [" + super.toString() + ", Ekran: " + velicinaEkrana + "\"]";
    }
}
