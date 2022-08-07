/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task872022q2;
import java.util.Scanner;
/**
 *
 * @author max
 */
public class Task872022Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        // TODO code application logic here
        //Write a program and ask the user to enter a number.
          //Compute the factorial of the number and print it on the console.
          //For example, if the user enters 5,
        //the program should calculate 5 x 4 x 3 x 2 x 1 and display it as 5! = 120
         System.out.print("enter num ");
        int num=input.nextInt();
        int i;
                int fact=1;
                for(i=1;i<=num;i++)
                {
                    fact=fact*i;
                            
                }
                System.out.println(num +" is " +fact);
                        
    }
    
}
