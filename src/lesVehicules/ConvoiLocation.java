package lesVehicules;
import java.util.List;
import java.util.ArrayList;
public class ConvoiLocation {
	private List<Vehicule> listeDesVehiculesLouees;
	
	public ConvoiLocation(List<Vehicule> listeDesVehiculesLouees) {
		this.listeDesVehiculesLouees=listeDesVehiculesLouees;
	}
	
	public List<Vehicule> getListeDesVehiculesLouees() {
		return this.listeDesVehiculesLouees;
	}
	
	public void ajouterVehicuALouer(Vehicule vehicuALouer) {
		listeDesVehiculesLouees.add(vehicuALouer);
	}
	
	public double calculerCoutLocation(int d) {
		double coutTotal=0;
		for(Vehicule vehicule:listeDesVehiculesLouees) {
			coutTotal+=vehicule.facturer(d);
		}
		return coutTotal;
	}

	public Vehicule getVéhiculePlusLent(List<Vehicule> listeDesVehiculesLouees) {
		List<Integer> listeDesVitessesMax = new ArrayList<Integer>();
		for(Vehicule vehicule : listeDesVehiculesLouees) {
			listeDesVitessesMax.add(vehicule.calculerVitesseMaximale());
		}
		int minIndex=0;
		int min=listeDesVitessesMax.get(0);
		for(int i=1;i<listeDesVitessesMax.size();i++) {
			if(listeDesVitessesMax.get(i)<min) {
				min=listeDesVitessesMax.get(i);
				minIndex=i;
			}
		}
		return listeDesVehiculesLouees.get(minIndex);
	}

}
