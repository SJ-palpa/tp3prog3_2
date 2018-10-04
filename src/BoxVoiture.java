import gestionparking.Vehicule;

public class BoxVoiture extends Box implements intPrix{
    private static final double PRIX_VOITURE = 3.00;

    public BoxVoiture(int no, Vehicule vehicule) {
        super(no, vehicule);
    }

    public BoxVoiture(int no) {this(no, null);} /* Pour la recherche */

    public double getPirx()
    {
        return super.getNbQuartHeures() * PRIX_VOITURE;
    }

}
