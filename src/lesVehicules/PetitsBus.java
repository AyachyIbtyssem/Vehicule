package lesVehicules;

import java.util.Scanner;

public class PetitsBus extends Vehicule implements VehiculeLouable{
	private final int vitesseMaximale = 150;
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
            } else if (vitesseMoyenne > vitesseMaximale) {
                System.out.println("La vitesse est trop élevée. La vitesse maximale est " + vitesseMaximale + ".");
            }
        } while (vitesseMoyenne <= 0 || vitesseMoyenne > vitesseMaximale);

        System.out.println("Vitesse moyenne: " + vitesseMoyenne);
	}
    

	public int getNombrePlaces() {
		return this.nombrePlaces;
	}
	public int calculerVitesseMaximale() {
		return vitesseMaximale;
	}
	
	public double facturer(int d) {
		double dureeTrajet = (double)d/calculerVitesseMaximale();
		return dureeTrajet * 200;
	}
	
	public int getVitesseMoyenne() {
		return this.vitesseMoyenne;
	}
	public void setVitesseMoyenne(int vitesseMoyenne) {
		this.vitesseMoyenne=vitesseMoyenne;
	}



	

}
