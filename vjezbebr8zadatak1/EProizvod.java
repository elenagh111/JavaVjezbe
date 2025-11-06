package vjezbebr8zadatak1;

public class EProizvod {
    private String opis;
    private String sifra;
    private double uvoznaCijena;

    public EProizvod(String opis, String sifra, double uvoznaCijena) {
        this.opis = opis;
        this.sifra = sifra;
        this.uvoznaCijena = uvoznaCijena;
    }

    public String getOpis() {
        return opis;
    }
    public String getSifra() {
        return sifra;
    }
    public double getUvoznaCijena() {
        return uvoznaCijena;
    }
    
    public double izracunajMaloprodajnuCijenu() {
        return uvoznaCijena * 1.05;
    }

    @Override
    public String toString() {
        return "Opis: " + opis + ", Šifra: " + sifra + ", Uvozna cijena: " + uvoznaCijena;
    }
}
