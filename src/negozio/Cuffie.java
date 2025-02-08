package negozio;

import java.util.Scanner;

public class Cuffie extends Prodotto {

    private String color;
    private boolean connection;

    public Cuffie(Scanner scanner) {
        super(scanner);
        System.out.println("Inserisci il colore");
        this.color = scanner.nextLine();
        scanner.nextLine();
        System.out.println("E' wireless? (true/false) ");
        this.connection = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()
        + "Colore: " + color + ","
        + "Le cuffie sono wirless: " + connection;
    }    

    //ritorna il colore//
    public String getColor() {
        return color;
    }

    // setta il colore//
    public void setColor(String color) {
        this.color = color;
    }

    //ritorna il metodo di collegamento//
    public boolean getConnection() {
        if (this.connection) {
            System.out.println("Le cuffie sono wirless");
        } else {
            System.out.println("Le cuffie sono cablate");
        }
        return connection;
    }

    //setta il metodo di collegamento
    public void isConnection(boolean connection) {
        this.connection = connection;
    }

    
}
