package vjezbebr11zadatak1;

import javax.swing.JOptionPane;

public class Mail {

    public static void main(String[] args) {

        String ime = JOptionPane.showInputDialog("Unesite ime:");
        String prezime = JOptionPane.showInputDialog("Unesite prezime:");
        String godiste = JOptionPane.showInputDialog("Unesite godinu rođenja:");
        
        int godinaRodjenja = Integer.parseInt(godiste);
        
        String confirmationMessage = "Pregled podataka:\n\n" + "Ime: " + ime + "\n" + "Prezime: " + prezime + "\n"
							   + "Godina rođenja: " + godinaRodjenja + "\n\n" + "Da li su uneseni podaci tačni?";
        
        int dugme = JOptionPane.showConfirmDialog(null, confirmationMessage, "Pregled i potvrda unosa",
        		JOptionPane.YES_NO_OPTION);
        
        if (dugme == JOptionPane.YES_OPTION) {
        	String email = ime + prezime + godinaRodjenja + "@kompanija.me";
        	JOptionPane.showMessageDialog(null, "Vasa email adresa je: " + email, "Email", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Otkazano.", "Email", JOptionPane.INFORMATION_MESSAGE);
		}
    }
}
