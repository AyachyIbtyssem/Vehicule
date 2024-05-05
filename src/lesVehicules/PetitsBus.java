package lesVehicules;

import java.util.Scanner;

public class PetitsBus extends Vehicule implements VehiculeLouable{
	private int vitesseMoyenne;
	private int nombrePlaces;
	Scanner input= new Scanner(System.in);
	public PetitsBus(String immatriculation,int nombrePlaces) {
		super(immatriculation,4);
		this.nombrePlaces = nombrePlaces;
		do {
            System.out.print("Entrez la vitesse moyenne : ");
            vitesseMoyenne = input.nextInt();
            
            if (vitesseMoyenne <= 0) {
                System.out.println("La vitesse doit être supérieure à zéro.");
            } else if (vitesseMoyenne > calculerVitesseMaximale() ) {
                System.out.println("La vitesse est trop élevée. La vitesse maximale est " + calculerVitesseMaximale()  + ".");
            }
        } while (vitesseMoyenne <= 0 || vitesseMoyenne > calculerVitesseMaximale() );

        System.out.println("Vitesse moyenne: " + vitesseMoyenne);
	}
    

	public int getVitesseMoyenne() {
		return this.vitesseMoyenne;
	}
	public void setVitesseMoyenne(int vitesseMoyenne) {
		this.vitesseMoyenne=vitesseMoyenne;
	}

	public int getNombrePlaces() {
		return this.nombrePlaces;
	}
	public int calculerVitesseMaximale() {
		return 150;
	}
	
	public double facturer(int d) {
		double dureeTrajet = (double)d/calculerVitesseMaximale();
		return dureeTrajet * 200;
	}
	



	

}
