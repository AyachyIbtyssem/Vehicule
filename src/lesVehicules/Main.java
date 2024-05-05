package lesVehicules;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		CamionBaches cb1=new CamionBaches("146 tunisie 2345");
		PetitsBus pb1=new PetitsBus("150 tunisie 6790",10);
		PetitsBus pb2=new PetitsBus("170 tunisie 7390",16);
		PetitsBus pb3=new PetitsBus("180 tunisie 2391",9);
		PetitsBus pb4=new PetitsBus("230 tunisie 3615",17);
		
		System.out.println("voicie charge max de cette camion: "+cb1.getChargeMax()+"tonnes");
		System.out.println("saisie la charge qui tu veux la charge");
		System.out.println("voici vitesse max : "+cb1.calculerVitesseMaximale()+"km/h");
		cb1.charger(4);
		
		List<VehiculeLouable> listeDesVehiculeLouable = new ArrayList<VehiculeLouable>();
		listeDesVehiculeLouable.add(pb1);
		listeDesVehiculeLouable.add(pb2);
		listeDesVehiculeLouable.add(pb3);
		listeDesVehiculeLouable.add(pb4);
		
		ConvoiLocation cL = new ConvoiLocation(listeDesVehiculeLouable);
		System.out.println("voici le cout totale: "+cL.calculerCoutLocation(40)+"dt");
		System.out.println("voici la vehicule louable la plus lente : "+cL.getVehiculePlusLent());
	}

}
