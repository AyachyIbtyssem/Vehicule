package lesVehicules;

public abstract class Vehicule {
	private String immatriculation;
	private int poidsAvide;
	
	
	public Vehicule(String immatriculation,int poidsAvide) {
		this.immatriculation=immatriculation;
		this.poidsAvide=poidsAvide;
	}
	public String getImmatriculation() {
		return this.immatriculation;
	}
	
	public int getPoidAvide() {
		return this.poidsAvide;
	}
	
	
	
	public abstract int calculerVitesseMaximale();
	



}
