/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package orszagok.model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OrszagokModel {
    private Path myPath = Paths.get("Orszagok.txt");
    private ArrayList<Orszag> adatok = new ArrayList<>();
    public OrszagokModel(){
        try {
            beolvas(myPath);
        } catch (IOException ex) {
            Logger.getLogger(OrszagokModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void beolvas(Path txt) throws IOException {
        List<String> myFile = Files.readAllLines(txt);
        
        for (int i = 0; i < myFile.size(); i += 3) {
            adatok.add(new Orszag(myFile.get(i), Integer.parseInt(myFile.get(i+1)), myFile.get(i+2)));
        }
    }

    public int atlagNepesseg() {
        int sum = 0;
        for (Orszag orszag : adatok) {
            sum += orszag.getNepesseg();
        }
        return sum/adatok.size();
    }

    public Orszag legkisebbOrszag() {
        Orszag legkisebb = adatok.get(0);
        for (Orszag orszag : adatok) {
            if (legkisebb.getNepesseg() > orszag.getNepesseg()) {
                legkisebb = orszag;
            }
        }
        return legkisebb;
    }

    public Orszag legnagyobbOrszag() {
        Orszag legnagyobb = adatok.get(0);
        for (Orszag orszag : adatok) {
            if (legnagyobb.getNepesseg() < orszag.getNepesseg()) {
                legnagyobb = orszag;
            }
        }
        return legnagyobb;
    }

    public ArrayList<Orszag> getByFoldresz(String foldresz) {
        ArrayList<Orszag> szurt = new ArrayList<>();
        for (Orszag orszag : adatok) {
            if (orszag.getFoldresz().equals(foldresz)) {
                szurt.add(orszag);
            }
        }
        
        
        return szurt;
    }

    public ArrayList<Orszag> kisebbMint(int integer) {
        ArrayList<Orszag> szurt = new ArrayList<>();
        for (Orszag orszag : adatok) {
            if (orszag.getNepesseg() < integer) {
                szurt.add(orszag);
            }
        }
        
        
        return szurt;
    }

    public ArrayList<Orszag> nagyobbMint(int integer) {
        ArrayList<Orszag> szurt = new ArrayList<>();
        for (Orszag orszag : adatok) {
            if (orszag.getNepesseg() > integer) {
                szurt.add(orszag);
            }
        }
        return szurt;
    }
    
    
}
