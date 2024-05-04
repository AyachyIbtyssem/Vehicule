package lesVehicules;
import java.util.Scanner;

public class CamionCiternes extends Vehicule{
	
	private final int chargeMax=10;
	Scanner input= new Scanner(System.in);
	
	public CamionCiternes(String immatriculation) {
		super(immatriculation,3);
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

	public int calculerVitesseMaximale() {
		int charge=input.nextInt();
		if(charge<chargeMax) {
			if(charge<4)
				return 120;
			else
				return 90;
		}
		else return -1;
	}

}
