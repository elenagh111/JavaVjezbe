package vjezbebr8zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Restoran {
    private String naziv;
    private String adresa;
    private String pib;
    private List<Zaposleni> zaposleni;

    public Restoran(String naziv, String adresa, String pib) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.pib = pib;
        this.zaposleni = new ArrayList<>();
    }

    public void dodajZaposlenog(Zaposleni z) {
        zaposleni.add(z);
    }

    public boolean ukloniZaposlenog(int id) {
        return zaposleni.removeIf(z -> z.getId() == id);
    }

    public Zaposleni nadjiZaposlenog(int id) {
        for (Zaposleni z : zaposleni) {
            if (z.getId() == id) return z;
        }
        return null;
    }
    
    public void obracunPlata() {
        System.out.println("=== Obračun plata ===");
        double ukupno = 0;

        for (Zaposleni z : zaposleni) {
            double plata = z.izracunajPlatu();
            ukupno += plata;

            System.out.println("ID: " + z.getId());
            System.out.println("Ime: " + z.getIme() + " " + z.getPrezime());
            System.out.println("Tip: " + z.getClass().getSimpleName());
            System.out.println("Sati: " + z.getUkupanBrojSati());

            if (z instanceof Konobar) {
                System.out.println("Prekovremeni sati: " + ((Konobar) z).getPrekovremeniSati());
            } else if (z instanceof Menadzer) {
                System.out.println("Bonus: " + ((Menadzer) z).getBonus());
            }

            System.out.println("Plata: " + plata + " EUR");
            System.out.println("----------------");
        }

        System.out.println("Ukupan trošak plata: " + ukupno + " EUR");
    }
}
