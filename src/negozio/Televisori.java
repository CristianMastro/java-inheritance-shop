package negozio;

import java.util.Scanner;

public class Televisori extends Prodotto {

    private double dimension;
    private boolean smart;
    
    public Televisori(Scanner scanner) {
        super(scanner);
        System.out.println("Inserisci le dimensioni");
        this.dimension = scanner.nextInt();
        System.out.println("E' smart? (true/false)");
        this.smart = Boolean.parseBoolean(scanner.nextLine());    
    }

    @Override
    public String toString() {
        return super.toString() + "," 
        + "Dimensione: " + dimension + ","
        + getSmart();
    } 
        
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
    public void isSmart(boolean smart) {
        this.smart = smart;
    }

    
}
