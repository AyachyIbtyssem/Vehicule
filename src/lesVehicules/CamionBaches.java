package lesVehicules;

import java.util.Scanner;

public class CamionBaches extends VehiculeCharge{
	
	public CamionBaches(String immatriculation) {
		super(immatriculation,4,20);
	}

	public void charger(int poids) {
		if(poids <= getChargeMax()) 
			  System.out.println("Le camion bâché est chargé avec succès.");
    	else 
    		System.out.println("Impossible de charger le camion bâché. Le poids dépasse la charge maximale autorisée.");
	}
	
	Scanner input= new Scanner(System.in);
	public int calculerVitesseMaximale() {
		int charge=input.nextInt();
		if(charge<=getChargeMax()) {
			if(charge<=3)
				return 110;
			else
				return 80;
		}
		else
			return -1;
	}

}
