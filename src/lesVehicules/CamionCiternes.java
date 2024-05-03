package lesVehicules;

public class CamionCiternes extends Vehicule{
	private int chargeMax=10;
	private int chargeActuelle;
	public CamionCiternes(String immatriculation,int poidsAvide,int nombrePlaces) {
		super(immatriculation,3,nombrePlaces);
		//la charge actuelle initialisee par la valeur de poids a vide
		this.chargeActuelle=3;
	}
	public int getChargeMax() {
		return this.chargeMax;
	}
	public void charger(int poids) {
		if(chargeActuelle+poids<this.chargeMax) {
			this.chargeActuelle+=poids;
		}
		else 
			System.out.println("on ne peut pas charger");
	}	
	public int calculerVitesseMaximale() {
		if(this.chargeActuelle<=7)
			return 120;
		else
			return 90;
	}

}
