package vjezbebr8zadatak2;

public class Konobar extends Zaposleni {
	private double prekovremeniSati;
	
	public double getPrekovremeniSati() {
		return prekovremeniSati;
	}

	public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double prekovremeniSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
		this.prekovremeniSati = prekovremeniSati;
	}

	@Override
 	public double izracunajPlatu() {
		double plataSedmicno = (getUkupanBrojSati() * getPlataPoSatu()) + (prekovremeniSati * getPlataPoSatu() * 1.2);
        return plataSedmicno * 4;
	}
}