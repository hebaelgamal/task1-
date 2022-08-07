/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg8.pkg7.pkg2022;
import java.util.Scanner;
/**
 *
 * @author max
 */
public class Task872022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         //Write a program and ask the user to enter the width and height of an image.
//Then tell if the image is landscape or portrai
          System.out.print("enter width ");
        int width =input.nextInt();
        System.out.print("enter height ");
        int height =input.nextInt();
        if(width < height){
              System.out.print(" portrai");
              
        }
        else
        {
           System.out.print("landscape "); 
        }
    }
    


    
}
