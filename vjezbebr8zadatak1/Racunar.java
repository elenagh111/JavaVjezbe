package vjezbebr8zadatak1;

public class Racunar extends EProizvod {
    private String procesor;
    private int memorija;

    public Racunar(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
        super(opis, sifra, uvoznaCijena);
        this.procesor = procesor;
        this.memorija = memorija;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        double cijena = super.izracunajMaloprodajnuCijenu();
        cijena *= 1.05;
        return cijena;
    }

    @Override
    public String toString() {
        return "Računar [" + super.toString() + ", Procesor: " + procesor + ", Memorija: " + memorija + " GB]";
    }
}
