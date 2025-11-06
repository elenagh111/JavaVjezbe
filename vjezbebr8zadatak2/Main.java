package vjezbebr8zadatak2;

public class Main {
    public static void main(String[] args) {
        Restoran restoran = new Restoran("Elenin Restoran", "Bulevar 111", "111111");

        Konobar konobar1 = new Konobar(1, "Luka", "Carapic", 10, 40, 5);
        Kuvar kuvar1 = new Kuvar(2, "Vojo", "Boricic", 15, 40);
        Menadzer menadzer1 = new Menadzer(3, "David", "Kankaras", 20, 40, 200);
        Konobar konobar2 = new Konobar(4, "Ruzica", "Pipovic", 12, 36, 2);
        Kuvar kuvar2 = new Kuvar(5, "Adnel", "Sylvia", 16, 40);

        restoran.dodajZaposlenog(konobar1);
        restoran.dodajZaposlenog(kuvar1);
        restoran.dodajZaposlenog(menadzer1);
        restoran.dodajZaposlenog(konobar2);
        restoran.dodajZaposlenog(kuvar2);

        Smjena smjena1 = new Smjena("2025-11-06", 7.0, 15.0, "prva");
        smjena1.dodajZaposlenog(konobar1);
        smjena1.dodajZaposlenog(kuvar1);

        Smjena smjena2 = new Smjena("2025-11-06", 15.0, 23.0, "druga");
        smjena2.dodajZaposlenog(konobar2);
        smjena2.dodajZaposlenog(kuvar2);
        smjena2.dodajZaposlenog(menadzer1);

        smjena1.obracunSati();
        smjena2.obracunSati();
        
        restoran.obracunPlata();
    }
}
