package lesVehicules;
import java.util.List;


public class ConvoiLocation {
	private List<VehiculeLouable> listeVehiculesLouables;
	
	public ConvoiLocation(List<VehiculeLouable> listeVehiculesLouables) {
		this.listeVehiculesLouables=listeVehiculesLouables;
	}
	
	public List<VehiculeLouable> getListeVehiculesLouables() {
		return this.listeVehiculesLouables;
	}

	public void setListeVehiculesLouables(List<VehiculeLouable> listeVehiculesLouables) {
		this.listeVehiculesLouables=listeVehiculesLouables;
	}
	
	public double calculerCoutLocation(int d) {
		double coutTotal=0;
		for(VehiculeLouable vehicule:listeVehiculesLouables) {
			coutTotal+=vehicule.facturer(d);
		}
		return coutTotal;
	}

	public VehiculeLouable getVehiculePlusLent() {
		VehiculeLouable vehiculePlusLent = listeVehiculesLouables.get(0);
	    int vitesseMax = vehiculePlusLent.calculerVitesseMaximale();
	    for (VehiculeLouable vehicule : listeVehiculesLouables) {
	    	if (vehicule.calculerVitesseMaximale() < vitesseMax) {
	    		vehiculePlusLent = vehicule;
	            vitesseMax = vehiculePlusLent.calculerVitesseMaximale();
	        }
	    }
	    return vehiculePlusLent;
	}

}
