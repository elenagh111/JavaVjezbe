package vjezbebr8zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Smjena {
    private String datum;
    private double pocetak;
    private double kraj;
    private String tipSmjene;
    private List<Zaposleni> zaposleni;

    public Smjena(String datum, double pocetak, double kraj, String tipSmjene) {
        this.datum = datum;
        this.pocetak = pocetak;
        this.kraj = kraj;
        this.tipSmjene = tipSmjene;
        this.zaposleni = new ArrayList<>();
    }

    public void dodajZaposlenog(Zaposleni z) {
        zaposleni.add(z);
    }

    public void obracunSati() {
        double satiSmjene = kraj - pocetak;
        for (Zaposleni z : zaposleni) {
            z.setUkupanBrojSati(z.getUkupanBrojSati() + satiSmjene);
        }
    }

    public String getDatum() { return datum; }
    public String getTipSmjene() { return tipSmjene; }
}
