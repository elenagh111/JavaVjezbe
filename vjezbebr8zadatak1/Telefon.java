package vjezbebr8zadatak1;

public class Telefon extends EProizvod {
    private String operativniSistem;
    private double velicinaEkrana;

    public Telefon(String opis, String sifra, double uvoznaCijena, String operativniSistem, double velicinaEkrana) {
        super(opis, sifra, uvoznaCijena);
        this.operativniSistem = operativniSistem;
        this.velicinaEkrana = velicinaEkrana;
    }

    @Override
    public double izracunajMaloprodajnuCijenu() {
        double cijena = super.izracunajMaloprodajnuCijenu();
        if (velicinaEkrana > 6.0) {
            cijena *= 1.03;
        }
        return cijena;
    }

    @Override
    public String toString() {
        return "Telefon [" + super.toString() + ", OS: " + operativniSistem + ", Ekran: " + velicinaEkrana + "\"]";
    }
}