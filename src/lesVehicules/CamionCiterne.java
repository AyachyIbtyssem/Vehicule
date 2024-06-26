package lesVehicules;
import java.util.Scanner;

public class CamionCiterne extends VehiculeCharge{
	
	public CamionCiterne(String immatriculation) {
		super(immatriculation,3,10);
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
		if(charge<getChargeMax()) {
			if(charge<4)
				return 120;
			else
				return 90;
		}
		else return -1;
	}

}
