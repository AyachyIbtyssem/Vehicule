package lesVehicules;
import java.util.List;


public class ConvoiLocation {
	private List<VehiculeLouable> listeVehiculesLouable;
	
	public ConvoiLocation(List<VehiculeLouable> listeVehiculesLouable) {
		this.listeVehiculesLouable=listeVehiculesLouable;
	}
	
	public List<VehiculeLouable> getListeVehiculesLouable() {
		return this.listeVehiculesLouable;
	}

	public double calculerCoutLocation(int d) {
		double coutTotal=0;
		for(VehiculeLouable vehicule:listeVehiculesLouable) {
			coutTotal+=vehicule.facturer(d);
		}
		return coutTotal;
	}

	public VehiculeLouable getVehiculePlusLent() {
		VehiculeLouable vehiculePlusLent = listeVehiculesLouable.get(0);
	    int vitesseMax = vehiculePlusLent.calculerVitesseMaximale();
	    for (VehiculeLouable vehicule : listeVehiculesLouable) {
	    	if (vehicule.calculerVitesseMaximale() < vitesseMax) {
	    		vehiculePlusLent = vehicule;
	            vitesseMax = vehiculePlusLent.calculerVitesseMaximale();
	        }
	    }
	    return vehiculePlusLent;
	}

}
