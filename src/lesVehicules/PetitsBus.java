package lesVehicules;

import java.util.Scanner;

public class PetitsBus extends Vehicule implements VehiculeLouable{
	private int nombrePlaces;
	Scanner input= new Scanner(System.in);
	public PetitsBus(String immatriculation,int nombrePlaces) {
		super(immatriculation,4);
		this.nombrePlaces=nombrePlaces;
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
