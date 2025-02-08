package negozio;

import java.util.Scanner;

public class SmartPhone extends Prodotto {
    
    private String imeiCode;
    private int memory;

    public SmartPhone(Scanner scanner) {
        super(scanner);
        scanner.nextLine();
        System.out.println("Inserisci il codice IMEI");
        this.imeiCode = scanner.nextLine();
        System.out.println("Inserisci quanta memoria ha il telefono");
        this.memory = scanner.nextInt();
        scanner.nextLine();
    }

    

    @Override
    public String toString() {
        return super.toString() 
        + "Codice IMEI: " + imeiCode + ", "
        + "Memoria telefono: " + memory + "GB";
    }



    //ritorna il codice imei//
    public String getImeiCode() {
        return imeiCode;
    }

    //setta codice imei//
    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    //ritorna la memoria//
    public int getMemory() {
        return memory;
    }

    //setta la memoria//
    public void setMemory(int memory) {
        this.memory = memory;
    }
    
    
    
}
