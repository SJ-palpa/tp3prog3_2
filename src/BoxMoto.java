import gestionparking.Vehicule;

public class BoxMoto extends Box implements intPrix{

    private static final double PRIX_MOTO = 0.75;

    public BoxMoto(int no, Vehicule vehicule) {
        super(no, vehicule);
    }

    public BoxMoto(int no) {this(no, null);} /* Pour la recherche */

    public double getPirx()
    {
        return super.getNbQuartHeures() * PRIX_MOTO;
    }
}
