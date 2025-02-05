package negozio;
/*
Un prodotto è caratterizzato da:
codice (numero intero)
nome
marca
prezzo
iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
il codice prodotto sia accessibile solo in lettura
gli altri attributi siano accessibili sia in lettura che in scrittura
Lo shop gestisce diversi tipi di prodotto:
Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
Cuffie, caratterizzate dal colore e se sono wireless o cablate
Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
 */

public class Negozio {
    public static void main(String[] args) {
       
        SmartPhone telefono1 = new SmartPhone();

        telefono1.calcolaCodice();
        telefono1.setBrand("Nokia");
        telefono1.setName("3310");
        telefono1.setPrice(99);
        telefono1.setMemory(1000);
        telefono1.setImeiCode("12ab45gh678zv");
        telefono1.setIva(telefono1.getPrice());

        System.out.println(telefono1.getCode());
        System.out.println(telefono1.getBrand());
        System.out.println(telefono1.getName());
        System.out.println(telefono1.getPrice());
        System.out.println(telefono1.getMemory());
        System.out.println(telefono1.getImeiCode());
        System.out.println(telefono1.getIva());

        Televisori tv1 = new Televisori();
        tv1.calcolaCodice();
        tv1.setBrand("Philips");;
        tv1.setName("Oled");
        tv1.setPrice(799);
        tv1.setDimension(65);
        tv1.setSmart(true);
        tv1.setIva(tv1.getPrice());

        System.out.println(tv1.getCode());
        System.out.println(tv1.getBrand());
        System.out.println(tv1.getName());
        System.out.println(tv1.getPrice());
        System.out.println(tv1.getDimension());
        System.out.println(tv1.getSmart());
        System.out.println(tv1.getIva());

        Cuffie cuffia1 = new Cuffie();
        cuffia1.calcolaCodice();
        cuffia1.setBrand("Trust");;
        cuffia1.setName("Audio 3d");
        cuffia1.setPrice(49);
        cuffia1.setColor("Black");
        cuffia1.setConnection(false);
        cuffia1.setIva(tv1.getPrice());
       
        System.out.println(cuffia1.getCode());
        System.out.println(cuffia1.getBrand());
        System.out.println(cuffia1.getName());
        System.out.println(cuffia1.getPrice());
        System.out.println(cuffia1.getColor());
        System.out.println(cuffia1.getConnection());
        System.out.println(cuffia1.getIva());


    }
}
