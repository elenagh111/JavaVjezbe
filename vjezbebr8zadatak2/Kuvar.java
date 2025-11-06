package vjezbebr8zadatak2;

public class Kuvar extends Zaposleni {
	public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	}

	@Override
	public double izracunajPlatu() {
		return 1500 + 4 * getUkupanBrojSati() * getPlataPoSatu();
    }
}
