package vjezbebr10zadatak2;

import java.util.Scanner;

public class Cijena{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cijena = 0.0;
        boolean validanUnos = false;

        while (!validanUnos) {
            System.out.print("Unesite cijenu proizvoda (pozitivan broj): ");
            String unos = scanner.nextLine();

            try {
                cijena = Double.parseDouble(unos);

                if (cijena <= 0) {
                    throw new IllegalArgumentException("Cijena mora biti veća od nule!");
                }

                validanUnos = true;
            } catch (NumberFormatException e) {
                System.out.println("Greška: Unesite brojčanu vrijednost!");
            } catch (IllegalArgumentException e) {
                System.out.println("Greška: " + e.getMessage());
            }
        }

        System.out.println("Unijeli ste validnu cijenu: " + cijena);
        scanner.close();
    }
}
