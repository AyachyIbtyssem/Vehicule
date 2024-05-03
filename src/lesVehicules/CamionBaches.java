package lesVehicules;

public class CamionBaches extends Vehicule{
	private int chargeMax=20;
	private int chargeActuelle;
	public CamionBaches(String immatriculation,int poidsAvide,int nombrePlaces) {
		super(immatriculation,4,nombrePlaces);
		//la charge actuelle initialisee par la valeur de poids a vide
		this.chargeActuelle=4; 
	}
	public int getChargeMax() {
		return this.chargeMax;
	}
	public void charger(int poids) {
		if(chargeActuelle+poids<this.chargeMax) {
			chargeActuelle+=poids;
		}
		else 
			System.out.println("on ne peut pas charger");
	}
	public int calculerVitesseMaximale() {
		if(this.chargeActuelle<=7)
			return 110;
		else
			return 80;
	}

}
