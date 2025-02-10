package negozio;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        Prodotto[] carrello = new Prodotto [10];
        int prodottoInserito = 0;
        boolean continua = true; 

        while (continua) {

            System.out.println("Quale prodotto vuoi aggiungere? (Smartphone, Televisori, Cuffie)");
            String scelta = scanner.nextLine().trim().toLowerCase();

            Prodotto prodotto = null;

            if (scelta.equals("smartphone")) {
                prodotto = new SmartPhone(scanner);
            } else if (scelta.equals("televisori")) {
                prodotto = new Televisori(scanner);
            } else if (scelta.equals("cuffie")) {
                prodotto = new Cuffie(scanner);
            } else {
                System.out.println("Il prodotto inserito non è valido, riprova.");
                continue;
            }

            carrello[prodottoInserito] = prodotto; 
            prodottoInserito++; 
            System.out.println("Prodotto inserito nel carrello");

            if (prodottoInserito >= carrello.length) {
                System.out.println("Il carrello è pieno! Vai in cassa.");
                break;
            }

            System.out.println("Vuoi inserire un altro prodotto? (si/no)");
            String nuovaScelta = scanner.nextLine().trim().toLowerCase();

            if (nuovaScelta.equals("no")) {
                System.out.println("Vai in cassa");
                continua = false;
            }
        }

        System.out.println("Prodotti presenti nel carrello");
        if (prodottoInserito == 0) {
            System.out.println("Il carrello è vuoto.");
        } else {
            for (int i = 0; i < prodottoInserito; i++) {
                System.out.println(carrello[i].toString());
            }
        }
    }        
}

