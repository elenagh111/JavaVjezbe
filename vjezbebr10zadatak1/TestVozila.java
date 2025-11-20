package vjezbebr10zadatak1;

import java.util.ArrayList;

public class TestVozila {
    public static void main(String[] args) {
        ArrayList<Vozilo> vozila = new ArrayList<>();
        vozila.add(new Bicikl("B01"));
        vozila.add(new Bicikl("B02"));
        vozila.add(new Motor("M01", 80, 0.2));
        vozila.add(new Motor("M02", 60, 0.1));
        vozila.add(new Automobil("A01", 120));
        vozila.add(new Automobil("A02", 150));

        double udaljenostKm = 10;

        for (Vozilo v : vozila) {
            v.info();
            System.out.println("Vrijeme dostave: " + v.izracunajVrijemeDostave(udaljenostKm) + " sati");

            if (v instanceof Ekonomican) {
                System.out.println("Vozilo je ekonomicno.");
                System.out.println("Potrosnja na " + udaljenostKm + " km je " +
                ((Ekonomican) v).potrosnjaPoKm() * udaljenostKm + " litar.");
            } else {
                System.out.println("Vozilo nije ekonomicno.");
            }
            System.out.println();
        }

        System.out.println("Bicikl: spor, potpuno ekonomican.");
        System.out.println("Motor: brzi od bicikla, ekonomican.");
        System.out.println("Automobil: najbrzi, ali nije ekonomican.");
    }
}
