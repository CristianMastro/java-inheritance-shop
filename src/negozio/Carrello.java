package negozio;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aggiungi un prodotto al carrello, cosa vuoi aggiongere? (Smartphone, Televisori, Cuffie)");
        String scelta = scanner.nextLine().trim().toLowerCase();

        if (scelta.equals("smartphone")) {
            
            SmartPhone smartPhone1 = new SmartPhone(scanner);

            System.out.println(smartPhone1.toString());
            
            

            
        }
    }
    
}
