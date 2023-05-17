/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orszagok;

import java.io.IOException;
import java.util.ArrayList;
import orszagok.model.Orszag;
import orszagok.model.OrszagokModel;

/**
 *
 * @author g
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        OrszagokModel myModel = new OrszagokModel();
        System.out.println("Átlag npsg: "+ myModel.atlagNepesseg()+" fő");
        System.out.println("Legnagyobb: "+ myModel.legnagyobbOrszag().getNev());
        System.out.println("Legkisebb: "+ myModel.legkisebbOrszag().getNev());
        ArrayList<Orszag> europa = myModel.getByFoldresz("Európa");
        for (Orszag orszag : europa) {
            System.out.println(orszag.getNev());
        }
        
    }
    
}
