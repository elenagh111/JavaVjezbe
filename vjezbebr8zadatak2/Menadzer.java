package vjezbebr8zadatak2;

public class Menadzer extends Zaposleni {
    private double bonus;
    
    public double getBonus() {
		return bonus;
	}

    public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
        super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
        this.bonus = bonus;
    }

    @Override
    public double izracunajPlatu() {
    	return 1300 + 4 * getUkupanBrojSati() * getPlataPoSatu() + bonus;
    }
}
