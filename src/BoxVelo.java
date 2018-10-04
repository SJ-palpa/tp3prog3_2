import gestionparking.Vehicule;

public class BoxVelo extends Box implements intPrix {

    private static final double PRIX_VELO = 0.25;

    public BoxVelo(int no, Vehicule vehicule) {
        super(no, vehicule);
    }

    public BoxVelo(int no) {this(no, null);} /* Pour la recherche */

    public double getPirx()
    {
        return super.getNbQuartHeures() * PRIX_VELO;
    }



}
