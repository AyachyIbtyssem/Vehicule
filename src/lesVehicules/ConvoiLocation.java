package lesVehicules;
import java.util.List;


public class ConvoiLocation {
	private List<VehiculeLouable> listeDesVehiculeLouable;
	
	public ConvoiLocation(List<VehiculeLouable> listeDesVehiculeLouable) {
		this.listeDesVehiculeLouable=listeDesVehiculeLouable;
	}
	
	public List<VehiculeLouable> getListeDesVehiculeLouable() {
		return this.listeDesVehiculeLouable;
	}
	
	public void ajouterVehicuALouer(VehiculeLouable vehiculeLouable) {
		listeDesVehiculeLouable.add(vehiculeLouable);
	}
	
	public double calculerCoutLocation(int d) {
		double coutTotal=0;
		for(VehiculeLouable vehicule:listeDesVehiculeLouable) {
			coutTotal+=vehicule.facturer(d);
		}
		return coutTotal;
	}

	public String getVehiculePlusLent() {
		VehiculeLouable vehiculePlusLent = null;
	    int vitesseMinimale = listeDesVehiculeLouable.get(0).getVitesseMoyenne();
	    for (VehiculeLouable vehicule : listeDesVehiculeLouable) {
	    	if (vehicule.getVitesseMoyenne() < vitesseMinimale) {
	    		vehiculePlusLent = vehicule;
	            vitesseMinimale = vehiculePlusLent.getVitesseMoyenne();
	        }
	    }
	    return vehiculePlusLent.getImmatriculation();
	}

}
