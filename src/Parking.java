import java.util.*;
/**
 * Module 633-1-Programmation - TP3 - Parking - Application parking silo -
 *
 * Modélisation du parking. Un parking est composé d'étages
 * Mémoriasation de la liste des référence sur des objets de classe Etage
 *
 * @author VOTRE NOM
*/
public class Parking {
		
    private ArrayList etages;

    /* Constructeur */ 
    public Parking() {
        etages = new ArrayList();
    }

    /* Accesseurs */ 
    public Etage getEtage(int noEtage) {
        int pos = etages.indexOf(new Etage(noEtage));
        return pos < 0 ? null : (Etage)etages.get(pos);
    }

    /* Ajoute un étage */
    public void add(Etage etage) {etages.add(etage);}

    /* Retourne le nombre de véhicules (somme de tous les types de véhicules de l'étage) */ 
    public int getNbVehicules() {

        /***** À COMPLÉTER *****/ 

        return -1;
    }

    /* Retourne le montant(sommes des montants de tous les types de véhicules de l'étage) */ 
    public double getMontant() {

        /***** À COMPLÉTER *****/ 

        return -0.0;
    }

    /* Supprime le box contenant la voiture désignée par son IdVehicule
     * Tester tous les étages jusqu'à trouver le box contenant le véhicule
     * Retourne vrai si l'opération s'est bien déroulée, faux sinon
    */	
    public boolean removeVehicule(String idVehicule) {

        /***** À COMPLÉTER *****/ 

        return false;
    }

    public String toString() { String str=""; for (int i=0; i<etages.size(); i++) { str += etages.get(i); } return str; }
}