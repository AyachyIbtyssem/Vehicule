package lesVehicules;

public abstract class Vehicule {
	private String immatriculation;
	private int poidsAvide;
	private int nombrePlaces;
	
	
	public Vehicule(String immatriculation,int poidsAvide,int nombrePlaces) {
		this.immatriculation=immatriculation;
		this.poidsAvide=poidsAvide;
		this.nombrePlaces=nombrePlaces;
	}
	public String getImmatriculation() {
		return this.immatriculation;
	}
	
	public int getPoidAvide() {
		return this.poidsAvide;
	}
	
	public void setPoidAvide(int poidsAvide) {
		this.poidsAvide=poidsAvide;
	}
	
	public int getNombrePlaces() {
		return this.nombrePlaces;
	}
	
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces=nombrePlaces;
	}
	
	public abstract int calculerVitesseMaximale();
	
	public double facturer(int d) {
		double dureeTrajet = (double)d/ (double) calculerVitesseMaximale();
		double prix= dureeTrajet * 200;
		return prix;
	}



}
