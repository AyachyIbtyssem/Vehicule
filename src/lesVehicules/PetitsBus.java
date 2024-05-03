package lesVehicules;

public class PetitsBus extends Vehicule{
	public PetitsBus(String immatriculation,int poidsAvide,int nombrePlaces) {
		super(immatriculation,4,nombrePlaces);
	}
	public int calculerVitesseMaximale() {
		return 150;
	}
	public double facturer(int d) {
		double dureeTrajet = (double)d/ (double) calculerVitesseMaximale();
		double prix= dureeTrajet * 200;
		return prix;
	}

	

}
