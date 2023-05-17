
package orszagok.model;


public class Orszag {
    private String nev;
    private int nepesseg;
    private String foldresz;

    public Orszag(String nev, int nepesseg, String foldresz) {
        this.nev = nev;
        this.nepesseg = nepesseg;
        this.foldresz = foldresz;
    }

    public String getNev() {
        return nev;
    }

    public int getNepesseg() {
        return nepesseg;
    }

    public String getFoldresz() {
        return foldresz;
    }
    
}
