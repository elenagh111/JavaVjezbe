package vjezbebr8zadatak2;

public class Zaposleni {
	private int id;
	private String ime;
	private String prezime;
	private double plataPoSatu;
	private double ukupanBrojSati;

	public int getId() {
		return id;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public double getPlataPoSatu() {
		return plataPoSatu;
	}
	public double getUkupanBrojSati() {
		return ukupanBrojSati;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public void setPlataPoSatu(double plataPoSatu) {
		this.plataPoSatu = plataPoSatu;
	}
	public void setUkupanBrojSati(double ukupanBrojSati) {
		this.ukupanBrojSati = ukupanBrojSati;
	}
	
	public Zaposleni(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.plataPoSatu = plataPoSatu;
     	this.ukupanBrojSati = ukupanBrojSati;
	}

	public double izracunajPlatu() {
		return 0;
	}
}
