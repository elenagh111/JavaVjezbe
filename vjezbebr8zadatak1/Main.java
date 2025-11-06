package vjezbebr8zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EProizvod> proizvodi = new ArrayList<>();
        int izbor = -1;

        System.out.println("UREDJAJI");

        while (izbor != 0) {
            System.out.println("1. Unos uredjaja");
            System.out.println("2. Pregled svih uredjaja sa maloprodajnom cijenom");
            System.out.println("3. Pregled uredjaja odredjenog tipa");
            System.out.println("0. Izlaz");
            System.out.print("Izaberite opciju: ");
            izbor = sc.nextInt();
            sc.nextLine();

            if (izbor == 1) {
                System.out.print("Koliko uredjaja želite unijeti? ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {
                    System.out.print("Unesite šifru uredjaja (RA/TE/TV): ");
                    String sifra = sc.nextLine();
                    System.out.print("Unesite opis: ");
                    String opis = sc.nextLine();
                    System.out.print("Unesite uvoznu cijenu: ");
                    double cijena = sc.nextDouble();
                    sc.nextLine();

                    if (sifra.startsWith("RA")) {
                        System.out.print("Procesor: ");
                        String procesor = sc.nextLine();
                        System.out.print("Memorija (GB): ");
                        int memorija = sc.nextInt();
                        sc.nextLine();
                        proizvodi.add(new Racunar(opis, sifra, cijena, procesor, memorija));

                    } else if (sifra.startsWith("TE")) {
                        System.out.print("Operativni sistem: ");
                        String os = sc.nextLine();
                        System.out.print("Veličina ekrana (inči): ");
                        double ekran = sc.nextDouble();
                        sc.nextLine();
                        proizvodi.add(new Telefon(opis, sifra, cijena, os, ekran));

                    } else if (sifra.startsWith("TV")) {
                        System.out.print("Veličina ekrana (inči): ");
                        double ekran = sc.nextDouble();
                        sc.nextLine();
                        proizvodi.add(new TV(opis, sifra, cijena, ekran));

                    } else {
                        System.out.println("Nepoznata šifra, uredjaj se preskače!");
                    }
                }

            } else if (izbor == 2) {
                System.out.println("SVI UREDJAJI");
                for (EProizvod p : proizvodi) {
                	System.out.println(p + ", Maloprodajna cijena: " + Math.round(p.izracunajMaloprodajnuCijenu() * 100.0) / 100.0);
                }

            } else if (izbor == 3) {
                System.out.print("Unesite tip uređaja koji želite prikazati (RA/TE/TV): ");
                String tip = sc.nextLine();
                System.out.println("Uređaji tipa " + tip + ":");
                for (EProizvod p : proizvodi) {
                    if (p.getSifra().startsWith(tip)) {
                    	System.out.println(p + ", Maloprodajna cijena: " + (Math.round(p.izracunajMaloprodajnuCijenu() * 100.0) / 100.0));
                    }
                }

            } else if (izbor == 0) {
                System.out.println("Kraj programa.");

            } else {
                System.out.println("Pogrešan izbor, pokušajte ponovo!");
            }
        }

        sc.close();
    }
}