package lesVehicules;

import java.util.Scanner;

public class CamionBaches extends Vehicule{
	
	private final int chargeMax=20;
	
	public CamionBaches(String immatriculation) {
		super(immatriculation,4);
	}
	
	public int getChargeMax() {
		return this.chargeMax;
	}
	
	public void charger(int poids) {
		if(poids <= chargeMax) 
			  System.out.println("Le camion bâché est chargé avec succès.");
    	else 
    		System.out.println("Impossible de charger le camion bâché. Le poids dépasse la charge maximale autorisée.");
	}
	
	Scanner input= new Scanner(System.in);
	public int calculerVitesseMaximale() {
		int charge=input.nextInt();
		if(charge<=chargeMax) {
			if(charge<=3)
				return 110;
			else
				return 80;
		}
		else
			return -1;
	}

}
