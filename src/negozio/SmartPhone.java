package negozio;

public class SmartPhone extends Prodotto {

    private String imeiCode;
    private int memory;

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
