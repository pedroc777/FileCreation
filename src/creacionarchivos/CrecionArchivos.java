/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crecionarchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pedro
 */
public class CrecionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CBI c = new CBI();
        c.creacionCbi();
        c.creacionArt();
        c.creacionCs();
    }
    
}
