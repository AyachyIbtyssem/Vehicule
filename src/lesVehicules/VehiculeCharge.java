package lesVehicules;

public abstract class VehiculeCharge extends Vehicule {
	
	private int chargeMax;
	public VehiculeCharge(String immatriculation,int poidsAvide,int chargeMax) {
		super(immatriculation,poidsAvide);
		this.chargeMax=chargeMax;
	}
	
	public int getChargeMax() {
		return this.chargeMax;
	}
	abstract void charger(int poids);
	

}
