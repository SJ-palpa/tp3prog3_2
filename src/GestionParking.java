import gestionparking.Vehicule;

import java.util.*;
import gestionparking.*;
/**
 * Module 633-1-Programmation - TP3 - Parking - Application parking silo -
 *
 * Gestion du parking silo : 
 *	mémorisation des données;
 *	présentation du rapport;
 *	retirer un ensemble de véhicules;
 *	présentation du nouveau rapport.
 *
 * @author VOTRE NOM														 
*/
public class GestionParking {
		
    /* Liste des délimiteurs */
    private static final String DELIM_ETAGE = "\r\n";
    private static final String DELIM_CHAMP = ";";
    private static final String DELIM_NO_BOX = "-";


    private static final int VELO = 0;
    private static final int MOTO = 1;
    private static final int VOITURE = 2;

    /* Le parking */
    private static Parking parking; 

    /* Méthodes de service */
    private static int str2int(String s) {return Integer.parseInt(s);} 

    /* Mémorise les données du parking */
    private static void memoriseParking(String donneesParking) {
        parking = new Parking(); 
        StringTokenizer st =new StringTokenizer(donneesParking,DELIM_ETAGE);
        while(st.hasMoreTokens())
        {
            StringTokenizer stC = new StringTokenizer(st.nextToken(), DELIM_CHAMP);
            while(stC.hasMoreTokens())
            {
                StringTokenizer stT = new StringTokenizer(stC.nextToken(),DELIM_NO_BOX);
                int etage = str2int(stT.nextToken());
                int box = str2int(stT.nextToken());

                int typeVeh = str2int(stC.nextToken());
                int temsp = str2int(stC.nextToken());
                String nom = stC.nextToken();
                String prenom = stC.nextToken();
                String immatriculation = stC.nextToken();

                Etage et =  parking.getEtage(etage);
                if(et == null)
                    et = new Etage(etage);

                Box bx = et.getBox(box);
                if(bx == null)
                {
                   // bx = creationVehBox(bx,box,immatriculation,nom,prenom,typeVeh,temsp);
                }
            }
        }
    }


    private Box creationVehBox(Box bx,int box, int immatri, String nom, String prenom, int type, int temsp)
    {
        if( type == VELO)
        {
            bx = new BoxVelo(box,)
            {

            };
        }
        else if (type == MOTO)
        {

        }
        else if( type == VOITURE)
        {

        }
    }



    /* Prépare et affiche le rapport */
    private static void afficheRapport() {
        System.out.println("Rapport parking");

        /***** À COMPLÉTER *****/ 

        System.out.println("----------------------------------------------------------");
        System.out.println("Liste des véhicules dans le parking :"); System.out.println(parking);
    }

    /* VOUS NE DEVEZ PAS MODIFIER LE CODE DE CETTE METHODE */
    private static void recuperationVehicules() {
        System.out.println("----------------------------------------------------------");
        parking.removeVehicule("GE657665");
        parking.removeVehicule("NE342078");
        parking.removeVehicule("AG456");
        parking.removeVehicule("BE87350");
        parking.removeVehicule("NE563458");
        parking.removeVehicule("GE356");

        System.out.println("Les véhicules suivants ont été récupérés (supprimés) :");
        System.out.println("	 GE657665, NE342078, AG456, BE87350, NE563458 et GE356");
        System.out.println("----------------------------------------------------------");
    }

    public static void main (String[] args) {

            System.out.println("Mémorisation du parking (fichier : ");
            System.out.println("----------------------------------------------------------");
            memoriseParking(outils.FileToStr.read("parking.txt"));
            afficheRapport();
            recuperationVehicules();
            afficheRapport();

    }
}