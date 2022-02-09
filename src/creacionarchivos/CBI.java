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
public class CBI {
    public void creacionCbi(){
        //creación del archivo
        try{
            File arc = new File("cbi.dat");
            if (arc.createNewFile()){
                System.out.println("The file: " + arc.getName() + "has been created");
            }else{
                System.out.println("The file already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        
        //escritura en el archivo
        try{
           FileWriter esc = new FileWriter("cbi.dat");
           for(int i = 1; i < 4; i++){
                if(i%2 == 0){
                    esc.write("TCB " + i + ",Autor " + i + ",Apellido " + i + ",CL45" + (i+29) + ",10" + ",Sí\n");
                }
                else{
                    esc.write("TCB " + i + ",Autor " + i + ",Apellido " + i + ",CL45" + (i+27) + ",10" + ",No\n");
                }
            }
           esc.close();
            System.out.println("The filed has been written successfully.");
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    
    
    public void creacionArt(){
        //creación del archivo
        try{
            File arc = new File("art.dat");
            if (arc.createNewFile()){
                System.out.println("The file: " + arc.getName() + "has been created");
            }else{
                System.out.println("The file already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        
        //escritura en el archivo
        try{
           FileWriter esc = new FileWriter("art.dat");
           for(int i = 1; i < 4; i++){
                if(i%2 == 0){
                    esc.write("TA " + i + ",Autor " + i + ",Apellido " + i + ",CL46" + (i+40) + ",10" + ",Sí\n");
                }
                else{
                    esc.write("TA " + i + ",Autor " + i + ",Apellido " + i + ",CL46" + (i+45) + ",10" + ",No\n");
                }
            }
           esc.close();
            System.out.println("The filed has been written successfully.");
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    
    
    public void creacionCs(){
        //creación del archivo
        try{
            File arc = new File("cs.dat");
            if (arc.createNewFile()){
                System.out.println("The file: " + arc.getName() + "has been created");
            }else{
                System.out.println("The file already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
        
        //escritura en el archivo
        try{
           FileWriter esc = new FileWriter("cs.dat");
           for(int i = 1; i < 4; i++){
                if(i%2 == 0){
                    esc.write("TCS " + i + ",Autor " + i + ",Apellido " + i + ",CL47" + (i+57) + ",10" + ",Sí\n");
                }
                else{
                    esc.write("TCS " + i + ",Autor " + i + ",Apellido " + i + ",CL47" + (i+62) + ",10" + ",No\n");
                }
            }
           esc.close();
            System.out.println("The filed has been written successfully.");
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
