package individualniprojekat;

public class Vozilo {
	private String proizvodjac;
	private int godinaProizvodnje;
	private int kubikaza;
	private String boja;
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}

	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public int getKubikaza() {
		return kubikaza;
	}
	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}

	public double izracunajCijenuRegistracije() {
        double cijena = 100;
        if (godinaProizvodnje < 2010)
            cijena += 30;
        if (kubikaza > 2000)
            cijena += 50;
        return cijena;
    }

	public void prikaziInformacije() {
        System.out.println("Proizvođač: " + proizvodjac);
        System.out.println("Godina proizvodnje: " + godinaProizvodnje);
        System.out.println("Kubikaža: " + kubikaza);
        System.out.println("Boja: " + boja);
    }

	class Automobil extends Vozilo {
	    private int brojVrata;
	    private String tipMotora;

	public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojVrata,
				String tipMotora) {
			super(proizvodjac, godinaProizvodnje, kubikaza, boja);
			this.brojVrata = brojVrata;
			this.tipMotora = tipMotora;
		}
	
	public int getBrojVrata() {
		return brojVrata;
	}
	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	public String getTipMotora() {
		return tipMotora;
	}
	public void setTipMotora(String tipMotora) {
		this.tipMotora = tipMotora;
	}

	@Override
    public double izracunajCijenuRegistracije() {
        double cijena = super.izracunajCijenuRegistracije();
        if (tipMotora.equalsIgnoreCase("dizel"))
            cijena += 20;
        return cijena;
    }
	
	@Override
    public void prikaziInformacije() {
        super.prikaziInformacije();
        System.out.println("Broj vrata: " + brojVrata);
        System.out.println("Tip motora: " + tipMotora);
        System.out.println("Ukupna cijena registracije: " + izracunajCijenuRegistracije() + " EUR\n");
    }
	
	class Kamion extends Vozilo {
		private double kapacitetTereta;
		private boolean prikolica;
	
	public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, double kapacitetTereta,
			boolean prikolica) {
			super(proizvodjac, godinaProizvodnje, kubikaza, boja);
			this.kapacitetTereta = kapacitetTereta;
			this.prikolica = prikolica;
		}
	
	public double getKapacitetTereta() {
		return kapacitetTereta;
	}
	public void setKapacitetTereta(double kapacitetTereta) {
		this.kapacitetTereta = kapacitetTereta;
	}
	public boolean isPrikolica() {
		return prikolica;
	}
	public void setPrikolica(boolean prikolica) {
		this.prikolica = prikolica;
	}

	@Override
	public double izracunajCijenuRegistracije() {
		double cijena = super.izracunajCijenuRegistracije();
        if (prikolica)
            cijena += 50;
        return cijena;
    }
	
	@Override
    public void prikaziInformacije() {
        super.prikaziInformacije();
        System.out.println("Kapacitet tereta: " + kapacitetTereta + " t");
        System.out.println("Prikolica: " + (prikolica ? "da" : "ne"));
        System.out.println("Ukupna cijena registracije: " + izracunajCijenuRegistracije() + " EUR\n");
    }
	
	class Kombi extends Vozilo {
		private int kapacitetPutnika;

	public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		this.kapacitetPutnika = kapacitetPutnika;
	}

	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}
	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}

	@Override
    public double izracunajCijenuRegistracije() {
        double cijena = super.izracunajCijenuRegistracije();
        if (kapacitetPutnika > 8)
            cijena += 30;
        return cijena;
    }

    @Override
    public void prikaziInformacije() {
        super.prikaziInformacije();
        System.out.println("Kapacitet putnika: " + kapacitetPutnika);
        System.out.println("Ukupna cijena registracije: " + izracunajCijenuRegistracije() + " EUR\n");
    }
}

public class Main {
	public static void main(String[] args) {
	    Automobil a = new Automobil("Renault", 2014, 2500, "Siva", 4, "Dizel");
        Kamion k = new Kamion("CAT", 2010, 5000, "Bijela", 10, true);
        Kombi ko = new Kombi("Mercedes", 2012, 2200, "Crna", 9);

        a.prikaziInformacije();
        k.prikaziInformacije();
        ko.prikaziInformacije();
    }
}
