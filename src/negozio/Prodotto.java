package negozio;
import java.util.Random;
import java.util.Scanner;

public class Prodotto {
    
    Scanner scanner = new Scanner(System.in);

    private int code;
    private String name;
    private String brand;
    private double price;
    private double iva;

    public Prodotto (Scanner scanner) {
        calcolaCodice();
        System.out.println("Inserisci nome prodotto");
        this.name = scanner.nextLine();
        System.out.println("Inserisci la marca");
        this.brand = scanner.nextLine();
        System.out.println("Inserisci il prezzo senza IVA");
        this.price = scanner.nextInt();
        setIva(this.price);
    }
 

    @Override
    public String toString() {
        return "Codice prodotto: " + code + ", " 
                + "Nome prodotto: " + name + ", " 
                + "Marca : " + brand + ", "
                + "Prezzo senza iva: " + price 
                + "Prezzo finale" + iva + ", ";
    }

    //metodo per dare un codice random//
    public void calcolaCodice(){
    Random random = new Random();
    this.code = random.nextInt(1000); 
    }

    //ritorna codice//
    public int getCode() {
        return code;
    }


    //ritorna nome//
    public String getName() {
        return name;
    }

    //imposta nuovo nome//
    public void setName(String name) {
        this.name = name;
    }

    //ritorna brand//
    public String getBrand() {
        return brand;
    }

    //imposta nuova marca//
    public void setBrand(String brand) {
        this.brand = brand;
    }

    //ritorna prezzo senza iva//
    public double getPrice() {
        return price;
    }

    //imposta nuovo prezzo//
    public void setPrice(double price) {
        this.price = price;
    }

    //ritorna prezzo ivato//
    public double getIva() {
        return iva;
    }

    //imposta nuova iva// 
    public void setIva(double price) {
        iva = this.price * 1.22;
    }


}
