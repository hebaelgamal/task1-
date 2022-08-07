/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task872022q3;
import java.util.Scanner;
/**
 *
 * @author max
 */
public class Task872022Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 Scanner input=new Scanner(System.in);
   //Write a program and ask the user to enter an English word.
   //Count the number of vowels (a, e, o, u, i) in the word. So,
   //if the user enters "inadequate", the program should display 6 on the console
   
      System.out.println("Enter a word :");
       int count = 0;
     
      String word = input.nextLine();

      for (int i=0 ; i<word.length(); i++){
         char ch = word.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count ++;
         }
      }
               System.out.println("Number of vowels in the word is "+count);
        // TODO code application logic here
    }
    
}

