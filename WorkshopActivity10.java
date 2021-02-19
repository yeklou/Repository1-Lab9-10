/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshopactivity10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author National Pawn
 */
public class WorkshopActivity10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here

        copyFile("english.txt", "copy.txt");
       
    }
    public static void copyFile(String fileName, String fileName2){
  // pass the path to the file as a parameter 
         File file = new File("english.txt");
        try {
           Scanner sc = new Scanner(file);
           while (sc.hasNextLine()) 
                 fileName = sc.nextLine();
              System.out.println(fileName); 

          } catch (FileNotFoundException ex){
          System.out.println("The file cannot be found.");
        }
  
  }
    
}

    


    

