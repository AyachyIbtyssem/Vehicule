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

	public String getVehiculePlusLent() {
		VehiculeLouable vehiculePlusLent = null;
	    int vitesseMinimale = listeVehiculesLouable.get(0).getVitesseMoyenne();
	    for (VehiculeLouable vehicule : listeVehiculesLouable) {
	    	if (vehicule.getVitesseMoyenne() < vitesseMinimale) {
	    		vehiculePlusLent = vehicule;
	            vitesseMinimale = vehiculePlusLent.getVitesseMoyenne();
	        }
	    }
	    return vehiculePlusLent.getImmatriculation();
	}

}
