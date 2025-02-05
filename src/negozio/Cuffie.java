package negozio;

public class Cuffie extends Prodotto {
    
    private String color;
    private boolean connection;

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
    public void setConnection(boolean connection) {
        this.connection = connection;
    }

    
}
