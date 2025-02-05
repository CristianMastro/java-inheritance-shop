package negozio;

public class Televisori extends Prodotto {
    
    private double dimension;
    private boolean smart;

    //ritorna dimensioni//
    public double getDimension() {
        return dimension;
    }

    //setta dimensioni//
    public void setDimension(double dimension) {
        this.dimension = dimension;
    }

    //ritorna se il televisore è smart//
    public boolean getSmart() {
        if (this.smart) {
            System.out.println("La tv è smart");
        } else {
            System.out.println("Le tv non è smart");
        }
        return smart;
    }

    //set se il televisore è smart//
    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    
}
